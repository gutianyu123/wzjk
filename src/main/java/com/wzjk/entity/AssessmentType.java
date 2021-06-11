package com.wzjk.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="assessmentType",description= "测评类型表")
public class AssessmentType {

    @ApiModelProperty(value = "类型ID")
    private Integer id;

    @ApiModelProperty(value = "类型名称")
    private String mc;
}