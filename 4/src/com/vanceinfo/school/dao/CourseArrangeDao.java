package com.vanceinfo.school.dao;

import java.util.List; 
 
import com.vanceinfo.school.hibernate.pojo.CourseArrange;

public interface CourseArrangeDao {

	 
	public List<CourseArrange> Query_all() throws Exception; // 遍历查询
	
	public boolean addCourseArrange(CourseArrange courseArrange) throws Exception; // 添加课程
	 
	public CourseArrange getCourseArrange(Integer id);     //通过ID返回得到CourseArrange对象
	
	public boolean updateCourseArrange(CourseArrange courseArrange) throws Exception ;  //更新课表
	
	public boolean delCourseArrange(Integer courseArrangeId) throws Exception;  //删除课表安排

}
