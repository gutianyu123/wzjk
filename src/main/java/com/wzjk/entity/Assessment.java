package com.wzjk.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="assessment",description= "测评题目表")
public class Assessment {

    @ApiModelProperty(value = "题目ID")
    private Integer id;

    @ApiModelProperty(value = "题目类型ID")
    private Integer pglxid;

    @ApiModelProperty(value = "题目名称")
    private String tmmc;

    @ApiModelProperty(value = "题目类型 1-单选 2-多选")
    private Integer tmlx;
}