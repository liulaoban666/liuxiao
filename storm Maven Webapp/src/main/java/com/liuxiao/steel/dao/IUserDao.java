package com.liuxiao.steel.dao;

import java.util.List;

import com.liuxiao.steel.pojo.User;



public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);
    
    List<User> list(User user);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}