package com.wzjk.service;


import com.wzjk.response.CityResp;
import com.wzjk.utils.ResultDto;

public interface CityService {

    public ResultDto<CityResp> selectCity();
}
