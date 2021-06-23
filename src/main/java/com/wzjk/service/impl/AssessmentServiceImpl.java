package com.wzjk.service.impl;

import com.wzjk.entity.AssessmentResult;
import com.wzjk.entity.User;
import com.wzjk.mapper.*;
import com.wzjk.response.AssessmentOptionResp;
import com.wzjk.response.AssessmentResp;
import com.wzjk.response.AssessmentResultResp;
import com.wzjk.response.AssessmentTypeResp;
import com.wzjk.service.AssessmentService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AssessmentServiceImpl implements AssessmentService {

    @Autowired
    private AssessmentMapper assessmentMapper;

    @Autowired
    private AssessmentTypeMapper assessmentTypeMapper;

    @Autowired
    private AssessmentOptionMapper assessmentOptionMapper;

    @Autowired
    private AssessmentResultMapper assessmentResultMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultDto<List<AssessmentTypeResp>> selectAssessment() {
        //获取题目大类
        List<AssessmentTypeResp> list=assessmentTypeMapper.getType();
        list.forEach(x->{
            //获取大类下的题目
            List<AssessmentResp> listAss=assessmentMapper.selectAssessment(x.getId());
            listAss.forEach(y->{
                //获取题目下的选项
                List<AssessmentOptionResp> listOp=assessmentOptionMapper.getOption(y.getId());
                y.setList(listOp);
            });
            x.setList(listAss);
        });
        return RestResult.getSuccessResult(list);
    }

    @Override
    public ResultDto<Integer> saveAssessmentResult(AssessmentResult assessmentResult) {
        Integer zf=assessmentResult.getJsll()+assessmentResult.getShxg()+assessmentResult.getSsyy()+
                assessmentResult.getYddl()+assessmentResult.getZjjk();
        assessmentResult.setSj(new Date());
        assessmentResult.setZf(zf);
        assessmentResultMapper.insertSelective(assessmentResult);
        return RestResult.getSuccessResult(1);
    }

    @Override
    public ResultDto<List<AssessmentResultResp>> getAssessmentResult(Integer yhid) {
        List<AssessmentResultResp> list=assessmentResultMapper.getAssessmentResult(yhid);
        list.forEach(x->{
            User user=userMapper.selectByPrimaryKey(x.getYhid());
            if(user!=null){
                x.setYhm(user.getXm());
                x.setWjmc("评估数据");
            }
        });
        return RestResult.getSuccessResult(list);
    }

    @Override
    public ResultDto<AssessmentResultResp> getAssessmentResultDetail(Integer id) {
        AssessmentResult assessmentResult=assessmentResultMapper.selectByPrimaryKey(id);
        AssessmentResultResp assessmentResultResp=new AssessmentResultResp();
        BeanUtils.copyProperties(assessmentResult,assessmentResultResp);
        User user=userMapper.selectByPrimaryKey(assessmentResult.getYhid());
        if(user!=null){
            assessmentResultResp.setYhm(user.getXm());
            assessmentResultResp.setWjmc("评估数据");
        }
        return RestResult.getSuccessResult(assessmentResultResp);
    }
}
