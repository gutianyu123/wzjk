package com.wzjk.response;

import com.wzjk.entity.Knowledge;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="knowledgeResp",description= "知识查询结果")
public class KnowledgeResp extends Knowledge {

    private List<NrResp> list;
}
