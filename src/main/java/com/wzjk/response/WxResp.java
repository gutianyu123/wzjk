package com.wzjk.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="wxResp",description= "微信验证结果")
public class WxResp {

    @ApiModelProperty(value = "session_key")
    private String session_key;

    @ApiModelProperty(value = "openid")
    private String openid;
}
