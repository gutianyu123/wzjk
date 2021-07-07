package com.wzjk.mapper;

import com.wzjk.entity.AssessmentResult;
import com.wzjk.response.AssessmentResultResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssessmentResultMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssessmentResult record);

    int insertSelective(AssessmentResult record);

    AssessmentResult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssessmentResult record);

    int updateByPrimaryKey(AssessmentResult record);

    List<AssessmentResultResp> getAssessmentResult(@Param("yhid") Integer yhid);

}