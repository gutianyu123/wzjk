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
@ApiModel(value="user",description= "用户表")
public class User {

    @ApiModelProperty(value = "用户ID")
    private Integer id;

    @ApiModelProperty(value = "手机号")
    private String sjh;

    @ApiModelProperty(value = "工号")
    private String gh;

    @ApiModelProperty(value = "邮箱")
    private String yx;

    @ApiModelProperty(value = "密码")
    private String mm;

    @ApiModelProperty(value = "企业ID")
    private Integer qyid;

    @ApiModelProperty(value = "头像")
    private String tx;

    @ApiModelProperty(value = "昵称")
    private String nc;

    @ApiModelProperty(value = "姓名")
    private String xm;

    @ApiModelProperty(value = "出身日期")
    private Date csrq;

    @ApiModelProperty(value = "性别 1-男 2-女")
    private Integer xb;

    @ApiModelProperty(value = "婚否 1-已婚 2-未婚")
    private Integer hf;

    @ApiModelProperty(value = "是否有孩子 1-没有 2-有")
    private Integer sfsy;

    @ApiModelProperty(value = "组织id")
    private Integer zzid;

    @ApiModelProperty(value = "状态 1-启用 2-停用")
    private Integer zt;

    @ApiModelProperty(value = "微信号")
    private String wxh;
}