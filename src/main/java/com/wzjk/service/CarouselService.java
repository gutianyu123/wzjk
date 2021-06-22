package com.wzjk.service;

import com.wzjk.entity.Carousel;
import com.wzjk.utils.ResultDto;

import java.util.List;

public interface CarouselService {

    public ResultDto<List<Carousel>> selectCarousel();
}
