package com.vanceinfo.school.hibernate.pojo;

import java.io.Serializable;


/************************
 *@              课表bean
 * id            安排ID
 * classesNo     班级编号
 * courseName    课程名称
 * dateTime      上课时期
 * banci         上课班次
 * content       备注
 *      
 **********************/

public class CourseArrange implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	private int id;
	private String classesNo;
	private String courseName; 
	private String dateTime;
	private String banci; 
	private String content; 
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassesNo() {
		return classesNo;
	}
	public void setClassesNo(String classesNo) {
		this.classesNo = classesNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getBanci() {
		return banci;
	}
	public void setBanci(String banci) {
		this.banci = banci;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	 
	 
	 

}
