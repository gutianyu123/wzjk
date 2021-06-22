package com.wzjk.response;

import com.wzjk.entity.Assessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="assessmentResp",description= "题目查询结果")
public class AssessmentResp extends Assessment {

    @ApiModelProperty(value = "题目选项list")
    private List<AssessmentOptionResp> list;
}
