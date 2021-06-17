package com.wzjk.service.impl;

import com.wzjk.mapper.KnowledgeTypeMapper;
import com.wzjk.response.KnowledgeTypeResp;
import com.wzjk.service.KnowledgeTypeService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeTypeServiceImpl implements KnowledgeTypeService {

    @Autowired
    private KnowledgeTypeMapper knowledgeTypeMapper;

    @Override
    public ResultDto<List<KnowledgeTypeResp>> selectKnowledgeTypeList() {
        return RestResult.getSuccessResult(knowledgeTypeMapper.selectKnowledgeTypeList());
    }
}
