package com.wzjk.controller;

import com.wzjk.entity.Carousel;
import com.wzjk.service.CarouselService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carousel")
@Api(value = "轮播图管理", tags = {"轮播图管理"})
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    @ApiOperation(value = "获取轮播图")
    @GetMapping(value = "/selectCarousel")
    public ResultDto<List<Carousel>> selectCarousel() {
        return carouselService.selectCarousel();

    }
}
