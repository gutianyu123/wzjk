package com.wzjk.mapper;

import com.wzjk.entity.KnowledgeType;
import com.wzjk.response.KnowledgeTypeResp;

import java.util.List;

public interface KnowledgeTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KnowledgeType record);

    int insertSelective(KnowledgeType record);

    KnowledgeType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KnowledgeType record);

    int updateByPrimaryKey(KnowledgeType record);

    List<KnowledgeTypeResp> selectKnowledgeTypeList();
}