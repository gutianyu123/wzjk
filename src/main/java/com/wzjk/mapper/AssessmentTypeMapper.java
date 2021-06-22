package com.wzjk.mapper;

import com.wzjk.entity.AssessmentType;
import com.wzjk.response.AssessmentTypeResp;

import java.util.List;

public interface AssessmentTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssessmentType record);

    int insertSelective(AssessmentType record);

    AssessmentType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssessmentType record);

    int updateByPrimaryKey(AssessmentType record);

    List<AssessmentTypeResp> getType();
}