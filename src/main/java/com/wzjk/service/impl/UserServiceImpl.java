package com.wzjk.service.impl;

import com.wzjk.entity.Company;
import com.wzjk.entity.User;
import com.wzjk.mapper.CompanyMapper;
import com.wzjk.mapper.UserMapper;
import com.wzjk.request.LoginReq;
import com.wzjk.request.UserReq;
import com.wzjk.service.UserService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public ResultDto<User> zhLogin(String loginName,String mm) {
        if (loginName != null && mm != null) {
            User us = userMapper.selectByLoginName(loginName);
            if (us != null) {
                if (mm.equals(us.getMm())) {
                    return  RestResult.getSuccessResult(us);
                }
                return RestResult.getFailResult("用户密码不正确");
            }
            return RestResult.getFailResult("登录账号不存在");
        }
        return RestResult.getFailResult("账号和密码不能为空");
    }

    @Override
    public ResultDto<User> wxLogin(String wxh,String sjh) {
        if (wxh != null && sjh != null) {
            User us = userMapper.selectByWxhOrSjh(wxh, sjh);
            if (us != null) {
                return RestResult.getSuccessResult(us);
            }
            return RestResult.getFailResult("微信信息不能为空");

        }
        return RestResult.getFailResult("微信信息不能为空");
    }

    @Override
    public ResultDto<User> sjyzLogin(String sjh) {
        User us = userMapper.selectBySjh(sjh);
        if (us != null){
            return RestResult.getSuccessResult(us);
        }
        return RestResult.getFailResult("账号不存在");
    }

    @Override
    public ResultDto<User> wxsqRegist(UserReq userReq) {
        User us = userMapper.selectBySjh(userReq.getSjh());
        if (us != null) {
            return RestResult.getFailResult("账号已存在");
        }
        Company company = companyMapper.selectByQyyqm(userReq.getQyyqm());
        User user = new User();
        if (company != null){
            BeanUtils.copyProperties(userReq,user);
            user.setZt(1);
            user.setQyid(company.getId());
            userMapper.insertSelective(user);
            return RestResult.getSuccessResult(user);
        }
        return RestResult.getFailResult("企业邀请码不存在");
    }

    @Override
    public ResultDto<Integer> reSetMm(String sjh,String mm,Integer id) {
        User us = userMapper.selectBySjh(sjh);
        if (us != null) {
            us.setMm(mm);
            us.setId(id);
            userMapper.updateByPrimaryKeySelective(us);
            return RestResult.getSuccessResult(id);
        }
        return RestResult.getFailResult("账号不存在");
    }

    @Override
    public ResultDto<User> updateManInfor(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return RestResult.getSuccessResult(user);
    }

    @Override
    public ResultDto<User> manInfor(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        if (user.getXm() != null){
            return RestResult.getSuccessResult(user);
        }
        return RestResult.getFailResult("请完善个人信息");
    }

}
