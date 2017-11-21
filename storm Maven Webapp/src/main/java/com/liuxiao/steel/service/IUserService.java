package com.liuxiao.steel.service;

import com.liuxiao.steel.pojo.User;



public interface IUserService {
	public User getUserById(int userId);
	
	void regist(User user);
	
	String login(User user);
}
