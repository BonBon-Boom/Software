package com.vanceinfo.school.dao;

import java.util.List; 
import com.vanceinfo.school.hibernate.pojo.Course;

public interface CourseDao {

	public boolean addCourse(Course course) throws Exception; // 添加课程

	public boolean delCourse(int id) throws Exception; // 删除课程

	public boolean updateCourse(Course course) throws Exception; // 更新课程信息

	public Course findCourse(int id) throws Exception; // 根据学院Id找到Course对象

	public List<Course> Query_all() throws Exception; // 遍历查询

	public List<Course> Query_one(Course course) throws Exception; // 条件查询

	public List<Course> Query_one(String sql) throws Exception; // sql查询
	
	public boolean del(Integer id) throws Exception; // 删除课程

}
