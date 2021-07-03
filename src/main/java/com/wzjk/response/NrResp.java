package com.wzjk.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="nrResp",description= "内容结果")
public class NrResp {

    @ApiModelProperty(value = "key")
    private String key;

    @ApiModelProperty(value = "content")
    private String content;
}
