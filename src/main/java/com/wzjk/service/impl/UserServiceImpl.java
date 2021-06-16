package com.wzjk.service.impl;

import com.wzjk.entity.User;
import com.wzjk.mapper.UserMapper;
import com.wzjk.request.LoginReq;
import com.wzjk.service.UserService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultDto<User> zhLogin(LoginReq loginReq) {
        if (loginReq != null) {
            User us = userMapper.selectByLoginName(loginReq.getLoginName());
            if (us != null) {
                if (loginReq.getMm().equals(us.getMm())) {
                    return  RestResult.getSuccessResult(us);
                }
                return RestResult.getFailResult("用户密码不正确");
            }
            return RestResult.getFailResult("登录账号不存在");
        }
        return RestResult.getFailResult("账号和密码不能为空");
    }

    @Override
    public ResultDto<User> wxLogin(LoginReq loginReq) {
        if (loginReq != null) {
            User us = userMapper.selectByWxhOrSjh(loginReq.getWxh(), loginReq.getSjh());
            if (us != null) {
                return RestResult.getSuccessResult(us);
            }
            return RestResult.getFailResult("微信信息不能为空");

        }
        return RestResult.getFailResult("微信信息不能为空");
    }
}
