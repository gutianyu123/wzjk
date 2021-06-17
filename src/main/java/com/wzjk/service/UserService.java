package com.wzjk.service;

import com.wzjk.entity.User;
import com.wzjk.request.LoginReq;
import com.wzjk.request.UserReq;
import com.wzjk.utils.ResultDto;

public interface UserService {
    ResultDto<User> zhLogin(LoginReq loginReq);

    ResultDto<User> wxLogin(LoginReq loginReq);

    ResultDto<User> sjyzLogin(LoginReq loginReq);

    ResultDto<User> wxsqRegist(UserReq userReq);

    ResultDto<Integer> reSetMm(User user);

    ResultDto<User> updateManInfor(User user);

    ResultDto<User> manInfor(Integer id);
}
