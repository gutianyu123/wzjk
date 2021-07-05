package com.wzjk.service.impl;

import com.wzjk.entity.Company;
import com.wzjk.entity.User;
import com.wzjk.mapper.CompanyMapper;
import com.wzjk.mapper.UserMapper;
import com.wzjk.request.UserReq;
import com.wzjk.response.WxResp;
import com.wzjk.service.UserService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

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
    public ResultDto<Integer> reSetMm(String sjh,String mm) {
        User us = userMapper.selectBySjh(sjh);
        if (us != null) {
            us.setMm(mm);
            userMapper.updateByPrimaryKeySelective(us);
            return RestResult.getSuccessResult(us.getId());
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

    @Override
    public ResultDto<Company> getCompany(Integer userId) {
        Company company=userMapper.getCompany(userId);
        return RestResult.getSuccessResult(company);
    }

    @Override
    public ResultDto<WxResp> getWxyz(String code) throws Exception {
        OkHttpClient client = new OkHttpClient();
        String url="https://api.weixin.qq.com/sns/jscode2session?appid=wx31d813b294f45764&secret=5efa90ef7042be9826a2c2474b713d1c&js_code="+code;
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Response response = client.newCall(request).execute();
        InputStream is = response.body().byteStream();//从服务器得到输入流对象
        byte[] b = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int len = 0;
        while (true) {
            len = is.read(b);
            if (len == -1) {
                break;
            }
            byteArrayOutputStream.write(b, 0, len);
        }
        String result = byteArrayOutputStream.toString();
        WxResp wxResp=JSON.parseObject(result, WxResp.class);
        return RestResult.getSuccessResult(wxResp);
    }

    @Override
    public ResultDto<User> updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return RestResult.getSuccessResult(userMapper.selectByPrimaryKey(user.getId()));
    }


}
