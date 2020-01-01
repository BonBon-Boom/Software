package com.vanceinfo.school.dao;

import java.util.List;
 
import com.vanceinfo.school.hibernate.pojo.Teacher;
 

public interface TeacherDao {
	
	public boolean updateTeacher(Teacher teacher) throws Exception; // 修改老师信息

	public boolean addTeacher(Teacher teacher) throws Exception; // 增加老师

	public boolean delTeacher(Teacher teacher) throws Exception; // 删除老师

	public List<Teacher> queryAllTeacher() throws Exception; // 列出全部的老师

	public List<Teacher> Query_one(String sql) throws Exception; // 条件查询
	
	public Teacher findTeacher(int id) throws Exception; // 根据学生教师ID找到teacher对象
 

}

