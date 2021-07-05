package com.wzjk.controller;


import com.wzjk.entity.AssessmentResult;
import com.wzjk.response.AssessmentResultResp;
import com.wzjk.response.AssessmentTypeResp;
import com.wzjk.service.AssessmentService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assessment")
@Api(value = "问卷调查管理", tags = {"问卷调查管理"})
public class AssessmentController {

    @Autowired
    private AssessmentService assessmentService;

    @ApiOperation(value = "获取题目类型和题目")
    @GetMapping(value = "/selectAssessment")
    public ResultDto<List<AssessmentTypeResp>> selectAssessment() {
        return assessmentService.selectAssessment();

    }


    @ApiOperation(value = "保存问卷调查")
    @PostMapping(value = "/saveAssessmentResult")
    public ResultDto<Integer> saveAssessmentResult(@RequestBody AssessmentResult assessmentResult) {
        return assessmentService.saveAssessmentResult(assessmentResult);

    }


    @ApiOperation(value = "查询问卷调查结果")
    @GetMapping(value = "/getAssessmentResult")
    public ResultDto<List<AssessmentResultResp>> getAssessmentResult(Integer yhid) {
        return assessmentService.getAssessmentResult(yhid);

    }

    @ApiOperation(value = "查询问卷调查结果详情")
    @GetMapping(value = "/getAssessmentResultDetail")
    public ResultDto<AssessmentResultResp> getAssessmentResultDetail(Integer id) {
        return assessmentService.getAssessmentResultDetail(id);

    }

}
