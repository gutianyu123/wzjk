package com.wzjk.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="carousel",description= "轮播图")
public class Carousel {

    @ApiModelProperty(value = "轮播图ID")
    private Integer id;

    @ApiModelProperty(value = "地址")
    private String url;
}