package com.vanceinfo.school.dao;

import java.util.List;
import com.vanceinfo.school.hibernate.pojo.Classes; 

public interface ClassesDao {

	public boolean addClasses(Classes classes) throws Exception; // 增加班级

	public boolean delClasses(Classes classes) throws Exception; // 删除班级

	public boolean updateClasses(Classes classes) throws Exception; // 修改班级信息
	
	public Classes findClasses(int id) throws Exception; // 根据学院Id找到collage对象

	public List<Classes> queryAllClasses() throws Exception; // 列出班级相关信息

	public List<Classes> Query_one(String sql) throws Exception; // 条件查询

	public boolean del(Integer id) throws Exception ;  	// 删除专业
	
}
