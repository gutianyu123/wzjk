package com.wzjk.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="city",description= "地区表")
public class City {

    @ApiModelProperty(value = "地区ID")
    private Integer id;

    @ApiModelProperty(value = "地区名称")
    private String zzmc;

    @ApiModelProperty(value = "上级地区")
    private Integer sjzz;
}