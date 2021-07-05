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
@ApiModel(value="assessmentResult",description= "测评结果表")
public class AssessmentResult {

    @ApiModelProperty(value = "结果ID")
    private Integer id;

    @ApiModelProperty(value = "用户id")
    private Integer yhid;

    @ApiModelProperty(value = "直系病史")
    private String zxbs;

    @ApiModelProperty(value = "既往病史")
    private String jwbs;

    @ApiModelProperty(value = "膳食营养")
    private Integer ssyy;

    @ApiModelProperty(value = "自觉健康")
    private Integer zjjk;

    @ApiModelProperty(value = "生活习惯")
    private Integer shxg;

    @ApiModelProperty(value = "运动锻炼")
    private Integer yddl;

    @ApiModelProperty(value = "精神力量")
    private Integer jsll;

    @ApiModelProperty(value = "总分")
    private Integer zf;

    @ApiModelProperty(value = "测评日期")
    private Date sj;

    @ApiModelProperty(value = "bni")
    private String bni;
}