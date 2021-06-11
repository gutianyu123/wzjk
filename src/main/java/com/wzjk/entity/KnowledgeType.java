package com.wzjk.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="knowledgeType",description= "知识类型表")
public class KnowledgeType {

    @ApiModelProperty(value = "知识类型ID")
    private Integer id;

    @ApiModelProperty(value = "知识类别")
    private String zslb;
}