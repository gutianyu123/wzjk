package com.wzjk.mapper;

import com.wzjk.entity.AssessmentType;

public interface AssessmentTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssessmentType record);

    int insertSelective(AssessmentType record);

    AssessmentType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssessmentType record);

    int updateByPrimaryKey(AssessmentType record);
}