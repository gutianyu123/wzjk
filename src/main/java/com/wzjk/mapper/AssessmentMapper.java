package com.wzjk.mapper;

import com.wzjk.entity.Assessment;

public interface AssessmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Assessment record);

    int insertSelective(Assessment record);

    Assessment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Assessment record);

    int updateByPrimaryKey(Assessment record);
}