package com.wzjk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzjk.entity.Knowledge;
import com.wzjk.mapper.KnowledgeMapper;
import com.wzjk.request.KnowledgeReq;
import com.wzjk.response.KnowledgeResp;
import com.wzjk.service.KnowledgeService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeServiceImpl implements KnowledgeService {

    @Autowired
    private KnowledgeMapper knowledgeMapper;

    @Override
    public ResultDto<PageInfo<KnowledgeResp>> selectKnowledgePage(KnowledgeReq knowledgeReq) {
        PageHelper.startPage(knowledgeReq.getCurrentPage(), knowledgeReq.getPageSize());
        List<KnowledgeResp> list = knowledgeMapper.selectKnowledgePage(knowledgeReq);
        return RestResult.getSuccessResult(new PageInfo<>(list));
    }

    @Override
    public ResultDto<KnowledgeResp> selectKnowledgeDetail(Integer id) {
        Knowledge knowledge=knowledgeMapper.selectByPrimaryKey(id);
        KnowledgeResp knowledgeResp=new KnowledgeResp();
        BeanUtils.copyProperties(knowledge,knowledgeResp);
        return RestResult.getSuccessResult(knowledgeResp);
    }
}
