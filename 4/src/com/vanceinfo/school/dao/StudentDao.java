package com.vanceinfo.school.dao;

import java.util.List;

import com.vanceinfo.school.hibernate.pojo.Student;

public interface StudentDao {

	public boolean addStudent(Student student) throws Exception; // 添加学生

	public boolean delStudent(Student student) throws Exception; // 删除学生

	public boolean updateStudent(Student student) throws Exception; // 更新学生信息

	public List<Student> queryAll() throws Exception; // 查询学生信息 
	
	public Student findStudent(int id) throws Exception; // 根据学生Id找到student对象
	
	public String getClassesNo(Integer stuId);   //通过学生的id能查到所在的班级
 
}
