package com.wzjk.service;

import com.github.pagehelper.PageInfo;
import com.wzjk.request.KnowledgeReq;
import com.wzjk.response.KnowledgeResp;
import com.wzjk.utils.ResultDto;

public interface KnowledgeService {

    public ResultDto<PageInfo<KnowledgeResp>> selectKnowledgePage(KnowledgeReq knowledgeReq);

    public ResultDto<KnowledgeResp> selectKnowledgeDetail(Integer id);
}
