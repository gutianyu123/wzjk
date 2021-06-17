package com.wzjk.mapper;

import com.wzjk.entity.Knowledge;
import com.wzjk.request.KnowledgeReq;
import com.wzjk.response.KnowledgeResp;

import java.util.List;

public interface KnowledgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Knowledge record);

    int insertSelective(Knowledge record);

    Knowledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Knowledge record);

    int updateByPrimaryKey(Knowledge record);

    List<KnowledgeResp> selectKnowledgePage(KnowledgeReq knowledgeReq);
}