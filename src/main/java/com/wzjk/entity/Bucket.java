package com.wzjk.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="bucket",description= "轮斗表")
public class Bucket {

    @ApiModelProperty(value = "轮斗ID")
    private String buId;

    @ApiModelProperty(value = "轮斗名称")
    private String buName;

    @ApiModelProperty(value = "创建日期")
    private Date createTime;
}