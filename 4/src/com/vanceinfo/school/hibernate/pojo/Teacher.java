package com.vanceinfo.school.hibernate.pojo;
 
import java.io.Serializable; 
import java.util.Set;
 
 

/************************
 *@Teacher       老师bean
 * id            老师ID
 * name          姓名
 * teacherNo     教师编号
 * psw           登陆密码 
 * sex           性别
 * born          出生年月 
 * addr          籍贯
 * tel           联系电话
 * email         Email 
 * certid        身份证号
 * politics      政治面貌(中共党员、共青团员、民主党派、无党派人士、群众)
 * position      职称(普通教师、教授、博士)
 * entertime     入校时间
 **********************/

//学生  班级     n:1   多对一
//学生  课程     n:n   多对多

public class Teacher implements Serializable   {
	 
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String teacherNo;
	private String psw;   
	private String born;     
	private String sex;     
	private String tel;
	private String email;
	private String addr; 
	private String certid;
	private String politics;
	private String position;
	private String entertime;
	private Classes classes;
	private String publicKey;
	public String enCodeP_key;
	private int isDeCode;
	private String content;
	private Set<Course> course;
	public Set<Course> getCourse() {
		return course;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
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
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	 
	public String getBorn() {
		return born;
	}
	public void setBorn(String born) {
		this.born = born;
	}
	public String getEntertime() {
		return entertime;
	}
	public void setEntertime(String entertime) {
		this.entertime = entertime;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getEnCodeP_key() {
		return enCodeP_key;
	}
	public void setEnCodeP_key(String enCodeP_key) {
		this.enCodeP_key = enCodeP_key;
	}
	public int getIsDeCode() {
		return isDeCode;
	}
	public void setIsDeCode(int isDeCode) {
		this.isDeCode = isDeCode;
	}
	
	 
}
