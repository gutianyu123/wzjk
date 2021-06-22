package com.wzjk.mapper;

import com.wzjk.entity.Assessment;
import com.wzjk.response.AssessmentResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssessmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Assessment record);

    int insertSelective(Assessment record);

    Assessment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Assessment record);

    int updateByPrimaryKey(Assessment record);

    List<AssessmentResp> selectAssessment(@Param("pglxid") Integer pglxid);
}