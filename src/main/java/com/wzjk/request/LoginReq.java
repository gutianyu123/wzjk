package com.wzjk.request;

import com.wzjk.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="loginReq",description= "登录Req，登录信息")
public class LoginReq extends User {

    @ApiModelProperty(value = "登录账号")
    private String loginName;

    @ApiModelProperty(value = "微信号")
    private String wxh;

    @ApiModelProperty(value = "手机号")
    private String sjh;

}
