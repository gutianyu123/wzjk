package com.wzjk.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="product",description= "产品表")
public class Product {

    @ApiModelProperty(value = "产品ID")
    private Integer id;

    @ApiModelProperty(value = "图片")
    private String tp;

    @ApiModelProperty(value = "名称")
    private String mc;

    @ApiModelProperty(value = "标题")
    private String bt;

    @ApiModelProperty(value = "评分")
    private String pf;

    @ApiModelProperty(value = "内容")
    private String nr;

}