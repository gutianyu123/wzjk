package com.wzjk.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="productReq",description= "服务产品Req，分页查询入参")
public class ProductReq {

    @ApiModelProperty(value = "每页记录数")
    private Integer pageSize;

    @ApiModelProperty(value = "当前页")
    private Integer currentPage;
}
