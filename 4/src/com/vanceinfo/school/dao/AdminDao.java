package com.vanceinfo.school.dao;

import java.util.List;

import com.vanceinfo.school.hibernate.pojo.Admin; 

public interface AdminDao {

	public boolean addAdmin(Admin admin) throws Exception; // 增加管理员

	public boolean delAdmin(int id) throws Exception; //根据管理员id删除管理员
	
	public Admin findAdmin(int id) throws Exception; // 根据学院Id找到admin对象

	public boolean updateAdmin(Admin admin) throws Exception; // 修改管理员信息
	
	public boolean checkExit(Admin admin)throws Exception; //判断管理员是否存在

	public List<Admin> queryAllAdmin() throws Exception; // 列出全部的管理员

	public List<Admin> Query_one(Admin admin);   //模糊查询
	
	public List<Admin> Query_one(String sql) throws Exception; // 条件查询 
	
	
}
