package com.wzjk.service.impl;

import com.wzjk.mapper.CityMapper;
import com.wzjk.response.CityResp;
import com.wzjk.service.CityService;
import com.wzjk.utils.CityTreeUtils;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public ResultDto<CityResp> selectCity() {
        List<CityResp> list=cityMapper.selectCity();
        CityResp city= CityTreeUtils.buildTree(list);
        return RestResult.getSuccessResult(city);
    }


}
