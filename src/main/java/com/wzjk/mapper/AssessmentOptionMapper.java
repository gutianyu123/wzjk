package com.wzjk.mapper;

import com.wzjk.entity.AssessmentOption;
import com.wzjk.response.AssessmentOptionResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssessmentOptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssessmentOption record);

    int insertSelective(AssessmentOption record);

    AssessmentOption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssessmentOption record);

    int updateByPrimaryKey(AssessmentOption record);

    List<AssessmentOptionResp> getOption(@Param("pgld") Integer pgld);
}