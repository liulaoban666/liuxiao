package com.liuxiao.steel.pojo;

import java.util.Date;
/**
 * table name:  user_t
 * author name: paul
 * create time: 2017-11-17 10:19:24
 */ 
public class UserT{

	private int id;
	private String userName;
	private String password;
	private int age;

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}

