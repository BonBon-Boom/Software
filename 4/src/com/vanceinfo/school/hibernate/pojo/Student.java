package com.vanceinfo.school.hibernate.pojo;

import java.io.Serializable;
import java.util.*;

/************************
 *@Students      学生bean
 * id            学生ID
 * name          姓名
 * studentNo     学号
 * psw           登陆密码 
 * sex           性别
 * born          出生年月 
 * addr          籍贯
 * tel           联系电话
 * email         Email
 * hobby         爱好
 * certid        身份证号
 * politics      政治面貌(中共党员、共青团员、民主党派、无党派人士、群众)
 * entertime     入校时间
 **********************/ 

public class Student implements Serializable  {
	 
	private static final long serialVersionUID = 1L;
	private int id;     
	private String name;   
	private String studentNo;   
	private String psw;   
	private String born;     
	private String sex;     
	private String tel;
	private String email;
	private String addr;
	private String hobby;
	private String certid;
	private String politics;
	private String schooltime;
	private Classes classes; 
	private Set<Score> score;
	
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	} 
	public String getBorn() {
		return born;
	}
	public void setBorn(String born) {
		this.born = born;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	} 
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getCertid() {
		return certid;
	}
	public void setCertid(String certid) {
		this.certid = certid;
	}
	public String getPolitics() {
		return politics;
	}
	public void setPolitics(String politics) {
		this.politics = politics;
	}  
	public String getSchooltime() {
		return schooltime;
	}
	public void setSchooltime(String schooltime) {
		this.schooltime = schooltime;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public Set<Score> getScore() {
		return score;
	}
	public void setScore(Set<Score> score) {
		this.score = score;
	} 
}
