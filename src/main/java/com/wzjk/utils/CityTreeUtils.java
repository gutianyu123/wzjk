package com.wzjk.utils;

import com.wzjk.response.CityResp;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class CityTreeUtils {

    public static CityResp buildTree(List<CityResp> list) {
        CityResp city=new CityResp();
        for (CityResp cityResp : list) {
            Integer sjzz = cityResp.getSjzz();
            if (sjzz == 0) {
                BeanUtils.copyProperties(cityResp,city);
                build(cityResp, list, city);
            }
        }
        return city;
    }


    private static void build(CityResp cityResp, List<CityResp> list, CityResp city) {
        List<CityResp> childrens = getChildrens(cityResp, list);
        List<CityResp> childrenNodes = new ArrayList<CityResp>();

        // 1. 如果该book有叶子，则递归遍历叶子
        if (!childrens.isEmpty()) {
            for (CityResp child : childrens) {
                Integer childId = child.getId();

                CityResp cityTwo = new CityResp();
                cityTwo.setId(childId);
                cityTwo.setSjzz(child.getSjzz());
                childrenNodes.add(cityTwo);

                build(child, list, cityTwo);

                if (childrenNodes.size() != 0) {
                    city.setChildren(childrenNodes);
                }

            }
        }
    }


    private static List<CityResp> getChildrens(CityResp cityResp, List<CityResp> list) {
        List<CityResp> childrens = new ArrayList<>();
        Integer id = cityResp.getId();
        for (CityResp child : list) {
            // 如果遍历中的parentId和book的id相同，则是它的子节点
            if (child.getSjzz().equals(id)) {
                childrens.add(child);
            }
        }
        return childrens;
    }
}
