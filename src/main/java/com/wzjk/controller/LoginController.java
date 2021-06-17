package com.wzjk.controller;

import com.wzjk.entity.User;
import com.wzjk.request.LoginReq;
import com.wzjk.request.UserReq;
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

    @ApiOperation(value = "手机验证登录")
    @PostMapping(value = "/sjyzLogin")
    public ResultDto<User> sjyzLogin(@RequestBody LoginReq loginReq) {
        return userService.sjyzLogin(loginReq);
    }

    @ApiOperation(value = "微信授权&&快速注册")
    @PostMapping(value = "/wxsqRegist")
    public ResultDto<User> wxsqRegist(@RequestBody UserReq userReq) {
        return userService.wxsqRegist(userReq);
    }

    @ApiOperation(value = "重置密码")
    @PostMapping(value = "/reSetMm")
    public ResultDto<Integer> reSetMm(@RequestBody User user) {
        return userService.reSetMm(user);
    }

    @ApiOperation(value = "个人信息是否完善")
    @PostMapping(value = "/manInfor")
    public ResultDto<User> manInfor(Integer id) {
        return userService.manInfor(id);
    }

    @ApiOperation(value = "完善个人信息")
    @PostMapping(value = "/updateManInfor")
    public ResultDto<User> updateManInfor(@RequestBody User user) {
        return userService.updateManInfor(user);
    }



}

