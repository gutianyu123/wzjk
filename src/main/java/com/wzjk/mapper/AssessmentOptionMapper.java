package com.wzjk.mapper;

import com.wzjk.entity.AssessmentOption;

public interface AssessmentOptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssessmentOption record);

    int insertSelective(AssessmentOption record);

    AssessmentOption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssessmentOption record);

    int updateByPrimaryKey(AssessmentOption record);
}