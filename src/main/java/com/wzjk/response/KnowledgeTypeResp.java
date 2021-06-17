package com.wzjk.response;

import com.wzjk.entity.KnowledgeType;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="knowledgeTypeResp",description= "知识类型查询结果")
public class KnowledgeTypeResp extends KnowledgeType {
}
