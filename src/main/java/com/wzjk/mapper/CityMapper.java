package com.wzjk.mapper;

import com.wzjk.entity.City;
import com.wzjk.response.CityResp;

import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    List<CityResp> selectCity();
}