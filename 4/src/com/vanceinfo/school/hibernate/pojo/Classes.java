package com.vanceinfo.school.hibernate.pojo;

import java.io.Serializable;
import java.util.Set;

/************************
 *@Class        班级bean
 * id           班级编号
 * name         班级名称
 **********************/

//班级  课程    1：n      一对多
//班级  老师    n:n       多对多 
public class Classes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String classesNo;
	private Set<Student> students;
	private Professions professions;
 
	
	public String getClassesNo() {
		return classesNo;
	}
	public void setClassesNo(String classesNo) {
		this.classesNo = classesNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	public Professions getProfessions() {
		return professions;
	}
	public void setProfessions(Professions professions) {
		this.professions = professions;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
 
	 
 
 
}
