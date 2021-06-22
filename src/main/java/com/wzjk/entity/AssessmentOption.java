package com.wzjk.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="assessmentOption",description= "题目选项表")
public class AssessmentOption {

    @ApiModelProperty(value = "题目选项ID")
    private Integer id;

    @ApiModelProperty(value = "题目id")
    private Integer pgld;

    @ApiModelProperty(value = "选项名称")
    private String xxmr;

    @ApiModelProperty(value = "分数")
    private Integer fs;
}