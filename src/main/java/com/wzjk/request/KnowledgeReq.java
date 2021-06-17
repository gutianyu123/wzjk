package com.wzjk.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="knowledgeReq",description= "知识Req，分页查询入参")
public class KnowledgeReq {

    @ApiModelProperty(value = "每页记录数")
    private Integer pageSize;

    @ApiModelProperty(value = "当前页")
    private Integer currentPage;

    @ApiModelProperty(value = "类别id")
    private Integer lbid;
}
