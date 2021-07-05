package com.wzjk.controller;

import com.wzjk.entity.User;
import com.wzjk.response.AssessmentTypeResp;
import com.wzjk.service.UserService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@Api(value = "用户管理", tags = {"用户管理"})
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "保存身高体重")
    @PostMapping(value = "/updateUser")
    public ResultDto<User> updateUser(@RequestBody User user) {
        return userService.updateUser(user);

    }
}
