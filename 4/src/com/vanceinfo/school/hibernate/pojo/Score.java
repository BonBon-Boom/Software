package com.vanceinfo.school.hibernate.pojo;

import java.io.Serializable;

public class Score implements Serializable  {
	 
	private static final long serialVersionUID = 1L;
	private int id;
	private int score;         //成绩表   分数
	private Student student;   //成绩表   人员
	private Course course;     //成绩表   课程
	private int state;         //成绩表   状态(对于学生选完课之后老师需要进行审核，state=1表示审核通过，state=0表示教师已签名)
	private String enScore;    //成绩表   教师签名后成绩  
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getEnScore() {
		return enScore;
	}
	public void setEnScore(String enScore) {
		this.enScore = enScore;
	}

}
