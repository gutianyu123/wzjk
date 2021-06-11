package com.wzjk.mapper;

import com.wzjk.entity.KnowledgeType;

public interface KnowledgeTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KnowledgeType record);

    int insertSelective(KnowledgeType record);

    KnowledgeType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KnowledgeType record);

    int updateByPrimaryKey(KnowledgeType record);
}