package com.liuxiao.steel.dao;

import java.util.List;

import com.liuxiao.steel.pojo.Girls;


public interface GirlsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Girls record);

    int insertSelective(Girls record);

    Girls selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Girls record);

    int updateByPrimaryKey(Girls record);

	List<Girls> getAll();

	Girls toUpdateByid(Integer sid);

	int doUpdateByid(Girls g);   
}