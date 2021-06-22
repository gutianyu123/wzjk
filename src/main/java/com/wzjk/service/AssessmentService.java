package com.wzjk.service;

import com.wzjk.entity.AssessmentResult;
import com.wzjk.response.AssessmentResultResp;
import com.wzjk.response.AssessmentTypeResp;
import com.wzjk.utils.ResultDto;

import java.util.List;

public interface AssessmentService {

    public ResultDto<List<AssessmentTypeResp>> selectAssessment();

    public ResultDto<Integer> saveAssessmentResult(AssessmentResult assessmentResult);

    public ResultDto<List<AssessmentResultResp>> getAssessmentResult(Integer yhid);
}
