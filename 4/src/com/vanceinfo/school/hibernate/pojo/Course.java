package com.vanceinfo.school.hibernate.pojo;

import java.io.Serializable;
import java.util.Set;


/************************
 *@Courses       课程bean
 * id            课程ID 
 * name          课程名
 **********************/
//课程  老师    n:n   多对多
//课程  学生    n:n   多对多  

public class Course implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	private int id;
	private String name; 
	private Teacher teacher;
	private Set<Score> score;
 
 
	public String getName() {
		return name;
	}
	public void setName(String courseName) {
		this.name = courseName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Score> getScore() {
		return score;
	}
	public void setScore(Set<Score> score) {
		this.score = score;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	} 
	 
	
}
