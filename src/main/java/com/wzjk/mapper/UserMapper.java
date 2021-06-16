package com.wzjk.mapper;

import com.wzjk.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByLoginName(@Param("loginName") String loginName);

    User selectByWxhOrSjh(@Param("wxh") String wxh, @Param("sjh") String sjh);
}