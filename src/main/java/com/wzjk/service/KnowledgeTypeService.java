package com.wzjk.service;

import com.wzjk.response.KnowledgeTypeResp;
import com.wzjk.utils.ResultDto;
import java.util.List;

public interface KnowledgeTypeService {

    public ResultDto<List<KnowledgeTypeResp>> selectKnowledgeTypeList();
}
