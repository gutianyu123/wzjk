package com.wzjk.mapper;

import com.wzjk.entity.Company;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);

    Company selectByQyyqm(@Param("qyyqm") String qyyqm);
}