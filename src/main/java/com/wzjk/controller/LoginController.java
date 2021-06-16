package com.wzjk.controller;

import com.wzjk.entity.User;
import com.wzjk.request.LoginReq;
import com.wzjk.service.UserService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@Api(value = "登录管理", tags = {"登录"})
public class LoginController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "账号登录")
    @PostMapping(value = "/zhLogin")
    public ResultDto<User> zhLogin(@RequestBody LoginReq loginReq) {
        return userService.zhLogin(loginReq);
    }

    @ApiOperation(value = "微信登录")
    @PostMapping(value = "/wxLogin")
    public ResultDto<User> wxLogin(@RequestBody LoginReq loginReq) {
        return userService.wxLogin(loginReq);
    }
}
