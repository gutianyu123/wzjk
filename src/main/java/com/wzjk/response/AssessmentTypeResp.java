package com.wzjk.response;

import com.wzjk.entity.AssessmentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="assessmentTypeResp",description= "题目类型查询结果")
public class AssessmentTypeResp extends AssessmentType {

    @ApiModelProperty(value = "题目list")
    private List<AssessmentResp> list;
}
