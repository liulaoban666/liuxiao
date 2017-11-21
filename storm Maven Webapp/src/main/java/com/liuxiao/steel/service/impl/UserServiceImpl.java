package com.liuxiao.steel.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liuxiao.steel.dao.IUserDao;
import com.liuxiao.steel.pojo.User;
import com.liuxiao.steel.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	public void regist(User user) {
		userDao.insert(user);
		
	}
	public String login(User user) {
		List<User> list = userDao.list(user);
		if(list!=null && list.size()>0){
			return "success";
		}
		return "fail";
	}

}
