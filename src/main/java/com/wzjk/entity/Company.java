package com.wzjk.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="company",description= "企业表")
public class Company {

    @ApiModelProperty(value = "企业ID")
    private Integer id;

    @ApiModelProperty(value = "企业名称")
    private String qymc;

    @ApiModelProperty(value = "企业邀请码")
    private String qyyqm;

    @ApiModelProperty(value = "企业口号")
    private String qykh;

    @ApiModelProperty(value = "联系方式")
    private String lxfs;
}