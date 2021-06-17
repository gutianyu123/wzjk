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
@ApiModel(value="knowledge",description= "知识表")
public class Knowledge {

    @ApiModelProperty(value = "知识ID")
    private Integer id;

    @ApiModelProperty(value = "标题")
    private String bt;

    @ApiModelProperty(value = "图片")
    private String tp;

    @ApiModelProperty(value = "星级")
    private String xj;

    @ApiModelProperty(value = "时间")
    private Date sj;

    @ApiModelProperty(value = "内容")
    private String nr;

    @ApiModelProperty(value = "类别id")
    private Integer lbid;
}