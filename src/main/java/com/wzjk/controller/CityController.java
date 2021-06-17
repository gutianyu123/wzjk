package com.wzjk.controller;

import com.wzjk.response.CityResp;
import com.wzjk.service.CityService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/city")
@Api(value = "地区管理", tags = {"地区管理"})
public class CityController {

    @Autowired
    private CityService cityService;


    @ApiOperation(value = "获取地区下拉选择")
    @GetMapping(value = "/selectCity")
    public ResultDto<CityResp> selectCity() {
        return cityService.selectCity();

    }
}
