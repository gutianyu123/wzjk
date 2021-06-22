package com.wzjk.service.impl;

import com.wzjk.entity.Carousel;
import com.wzjk.mapper.CarouselMapper;
import com.wzjk.service.CarouselService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;

    @Override
    public ResultDto<List<Carousel>> selectCarousel() {
        return RestResult.getSuccessResult(carouselMapper.selectCarousel());
    }
}
