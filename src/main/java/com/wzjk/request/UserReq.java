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
@ApiModel(value="userReq",description= "用户注册信息")
public class UserReq extends User {
    @ApiModelProperty(value = "企业邀请码")
    private String qyyqm;
}
