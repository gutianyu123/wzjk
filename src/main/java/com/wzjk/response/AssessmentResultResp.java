package com.wzjk.response;

import com.wzjk.entity.AssessmentResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="assessmentResultResp",description= "问卷结果查询")
public class AssessmentResultResp extends AssessmentResult {


    @ApiModelProperty(value = "问卷名称")
    private String wjmc;

    @ApiModelProperty(value = "用户名称")
    private String yhm;
}
