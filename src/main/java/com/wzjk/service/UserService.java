package com.wzjk.service;

import com.wzjk.entity.User;
import com.wzjk.request.LoginReq;
import com.wzjk.request.UserReq;
import com.wzjk.utils.ResultDto;

public interface UserService {
    ResultDto<User> zhLogin(String loginName,String mm);

    ResultDto<User> wxLogin(String wxh,String sjh);

    ResultDto<User> sjyzLogin(String sjh);

    ResultDto<User> wxsqRegist(UserReq userReq);

    ResultDto<Integer> reSetMm(String sjh,String mm);

    ResultDto<User> updateManInfor(User user);

    ResultDto<User> manInfor(Integer id);
}
