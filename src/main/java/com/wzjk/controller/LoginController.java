package com.wzjk.controller;

import com.wzjk.entity.Company;
import com.wzjk.entity.User;
import com.wzjk.request.UserReq;
import com.wzjk.response.WxResp;
import com.wzjk.service.UserService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@Api(value = "登录管理", tags = {"登录"})
public class LoginController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "账号登录")
    @GetMapping(value = "/zhLogin")
    public ResultDto<User> zhLogin(String loginName,String mm) {
        return userService.zhLogin(loginName,mm);
    }

    @ApiOperation(value = "微信登录")
    @GetMapping(value = "/wxLogin")
    public ResultDto<User> wxLogin(String wxh,String sjh) {
        return userService.wxLogin(wxh,sjh);
    }

    @ApiOperation(value = "手机验证登录")
    @GetMapping(value = "/sjyzLogin")
    public ResultDto<User> sjyzLogin(String sjh) {
        return userService.sjyzLogin(sjh);
    }

    @ApiOperation(value = "微信授权&&快速注册")
    @PostMapping(value = "/wxsqRegist")
    public ResultDto<User> wxsqRegist(@RequestBody UserReq userReq) {
        return userService.wxsqRegist(userReq);
    }

    @ApiOperation(value = "重置密码")
    @GetMapping(value = "/reSetMm")
    public ResultDto<Integer> reSetMm(String sjh,String mm) {
        return userService.reSetMm(sjh,mm);
    }

    @ApiOperation(value = "个人信息是否完善")
    @GetMapping(value = "/manInfor")
    public ResultDto<User> manInfor(Integer id) {
        return userService.manInfor(id);
    }

    @ApiOperation(value = "完善个人信息")
    @PostMapping(value = "/updateManInfor")
    public ResultDto<User> updateManInfor(@RequestBody User user) {
        return userService.updateManInfor(user);
    }

    @ApiOperation(value = "获取公司信息")
    @GetMapping(value = "/getCompany")
    public ResultDto<Company> getCompany(Integer userId) {
        return userService.getCompany(userId);
    }

    @ApiOperation(value = "获取微信验证")
    @GetMapping(value = "/getWxyz")
    public ResultDto<WxResp> getWxyz(String code) throws Exception {
        return userService.getWxyz(code);
    }
}

