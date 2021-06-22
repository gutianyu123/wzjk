package com.wzjk.response;


import com.wzjk.entity.AssessmentOption;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="assessmentOptionResp",description= "题目选项查询结果")
public class AssessmentOptionResp extends AssessmentOption{
}
