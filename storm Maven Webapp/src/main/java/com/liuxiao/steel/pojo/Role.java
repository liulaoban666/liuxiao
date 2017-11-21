package com.liuxiao.steel.pojo;

import java.util.Date;
/**
 * table name:  role
 * author name: paul
 * create time: 2017-11-17 10:19:24
 */ 
public class Role{

	private int roleId;
	private String roleName;
	private String roleType;
	private String desc;
	private Date createDate;
	private Date lastUpdateDate;

	public void setRoleId(int roleId){
		this.roleId=roleId;
	}
	public int getRoleId(){
		return roleId;
	}
	public void setRoleName(String roleName){
		this.roleName=roleName;
	}
	public String getRoleName(){
		return roleName;
	}
	public void setRoleType(String roleType){
		this.roleType=roleType;
	}
	public String getRoleType(){
		return roleType;
	}
	public void setDesc(String desc){
		this.desc=desc;
	}
	public String getDesc(){
		return desc;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return createDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate){
		this.lastUpdateDate=lastUpdateDate;
	}
	public Date getLastUpdateDate(){
		return lastUpdateDate;
	}
}

