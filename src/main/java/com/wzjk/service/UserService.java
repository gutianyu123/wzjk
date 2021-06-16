package com.wzjk.service;

import com.wzjk.entity.User;
import com.wzjk.request.LoginReq;
import com.wzjk.utils.ResultDto;

public interface UserService {
    ResultDto<User> zhLogin(LoginReq loginReq);

    ResultDto<User> wxLogin(LoginReq loginReq);
}
