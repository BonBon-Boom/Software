package com.vanceinfo.school.untils;

import org.hibernate.Session;

import com.vanceinfo.school.hibernate.pojo.Admin;
import com.vanceinfo.school.hibernate.pojo.Classes;
import com.vanceinfo.school.hibernate.pojo.Collage;
import com.vanceinfo.school.hibernate.pojo.Course;
import com.vanceinfo.school.hibernate.pojo.CourseArrange;
import com.vanceinfo.school.hibernate.pojo.Notice;
import com.vanceinfo.school.hibernate.pojo.Professions;
import com.vanceinfo.school.hibernate.pojo.Score;
import com.vanceinfo.school.hibernate.pojo.Student;
import com.vanceinfo.school.hibernate.pojo.Teacher;

public class InitData {
	
	public InitData(){
		initData();              //管理员和公告
		initCollage();           //学院
		initProfessions();       //专业
		initClasses();           //实验室
		initTeachers();          //老师
		initStudent();           //学生
		initCourse();            //课程
		initChoose();            //选课
		initCourseArrange();     //课表安排
	}
	
	
	//初始化数据   管理员帐号和公告
	public void  initData(){
		
		Session session = HibernateUtils.getSession();
		Admin admin=null;
		Notice notice=null;
		try {
			session.beginTransaction();
		    admin=new Admin();
		    notice=new Notice();
		    admin.setName("admin");
		    admin.setPsw("admin");
		    notice.setTitle("公告");
		    notice.setContent("欢迎使用学生课绩管理系统！如有任何疑问请和系统管理员联系，QQ:307155597 Emai:lovingroses@163.com.");

            session.save(admin);
            session.save(notice);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
		
	}
	
	
	
	
	
	
	// 初始化数据 学院
	public void initCollage() {
		Session session = HibernateUtils.getSession();
		Collage collage1 = null;
		Collage collage2 = null;
		try {
			session.beginTransaction();
			collage1 = new Collage();
			collage2 = new Collage();
			collage1.setName("信息工程学院");
			collage1.setContent("这个学院包括计算机系、电子系");
			collage2.setName("外国语学院");
			collage2.setContent("这个学院包括中文系、法语系");
			session.save(collage1);
			session.save(collage2);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	
	// 初始化数据 专业
	public void initProfessions() {
		Session session = HibernateUtils.getSession();
		Professions professions1 = null;
		Professions professions2 = null;
		Professions professions3 = null;
		Professions professions4 = null;
		Collage collage1=null;
		Collage collage2=null;
		try {
			session.beginTransaction();
			professions1 = new Professions();
			professions2 = new Professions();
			professions1.setName("计算机系");
			collage1=(Collage)session.get(Collage.class, 1);
			professions1.setCollage(collage1);
			professions2.setName("电子系");
			professions2.setCollage(collage1);
			
			professions3 = new Professions();
			professions4 = new Professions();
			professions3.setName("中文系");
			collage2=(Collage)session.get(Collage.class, 2);
			professions3.setCollage(collage2);
			professions4.setName("法语系");
			professions4.setCollage(collage2);
			

			session.save(professions1);
			session.save(professions2);
			session.save(professions3);
			session.save(professions4);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}

	
	// 初始化数据 班级
	public void initClasses() {
		Session session = HibernateUtils.getSession();
		Professions professions1=null;
		Classes classes1 = null;
		Classes classes2=null;
		Classes classes3=null;
		try {
			session.beginTransaction();
			classes1=new Classes();
			classes2=new Classes();
			classes3=new Classes();
			professions1=(Professions)session.get(Professions.class, 1);
			classes1.setClassesNo("4B0511");
			classes2.setClassesNo("4B0512");
			classes3.setClassesNo("4B0513");
			classes1.setProfessions(professions1);
			classes2.setProfessions(professions1);
			classes3.setProfessions(professions1);
			session.save(classes1);
			session.save(classes2);
			session.save(classes3);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	
	// 初始化数据 老师用户
	public void initTeachers() {
		Session session = HibernateUtils.getSession();
		Teacher teacher1= null;
		Teacher teacher2= null;
		try {
			session.beginTransaction();
			teacher1=new Teacher();
			teacher1.setTeacherNo("T1001");
			teacher1.setName("张伟");
			teacher1.setPsw("1001");
			teacher1.setSex("男");
			teacher1.setBorn("1968-10-07");
			teacher1.setAddr("汉族");
			teacher1.setTel("13728793659");
			teacher1.setEmail("zhangwei@163.com");
			teacher1.setCertid("622827198312200632");
			teacher1.setPolitics("中共党员");
			teacher1.setPosition("教授");
			teacher1.setEntertime("2002-08-28");
			teacher1.setContent("计算机系老师");
			teacher2=new Teacher();
			teacher2.setTeacherNo("T1002");
			teacher2.setName("胡琴");
			teacher2.setPsw("1002");
			teacher2.setSex("女");
			teacher2.setBorn("1978-08-16");
			teacher2.setAddr("苗族");
			teacher2.setTel("13836893761");
			teacher2.setEmail("huqin@163.com");
			teacher2.setCertid("4231127197808160632");
			teacher2.setPolitics("民主党派");
			teacher2.setPosition("教授");
			teacher2.setEntertime("2005-02-18");
			teacher2.setContent("外国语学院的老师");
			session.save(teacher1);
			session.save(teacher2);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	
	// 初始化数据 老师用户
	public void initStudent() {
		Session session = HibernateUtils.getSession();
		Student student1= null;
		Classes classes1=null;
		Student student2= null;
		Student student3= null;
		Classes classes2=null;
		try {
			session.beginTransaction();
			classes1=(Classes)session.get(Classes.class, 1);
			student1=new Student();
			student1.setStudentNo("S1001");
			student1.setName("李明");
			student1.setPsw("1001");
			student1.setSex("男");
			student1.setBorn("1989-10-07");
			student1.setAddr("汉族");
			student1.setTel("13528793659");
			student1.setEmail("liming@163.com");
			student1.setCertid("422827198912200632");
			student1.setPolitics("共青团员");
		    student1.setSchooltime("2008-09-01");
		    student1.setHobby("足球、上网");
		    student1.setClasses(classes1);
		    
			student2=new Student();
			student2.setStudentNo("S1002");
			student2.setName("刘小慧");
			student2.setPsw("1002");
			student2.setSex("男");
			student2.setBorn("1990-10-07");
			student2.setAddr("土家族");
			student2.setTel("13625693888");
			student2.setEmail("xiaohui@163.com");
			student2.setCertid("622827199012200632");
			student2.setPolitics("中共党员");
		    student2.setSchooltime("2008-09-01");
		    student2.setHobby("上网、音乐");
		    student2.setClasses(classes1);
		    
			classes2=(Classes)session.get(Classes.class, 2);
			student3=new Student();
			student3.setStudentNo("S1003");
			student3.setName("黄亮");
			student3.setPsw("1003");
			student3.setSex("男");
			student3.setBorn("1990-10-07");
			student3.setAddr("汉族");
			student3.setTel("13478789873");
			student3.setEmail("huangliang@163.com");
			student3.setCertid("422827199010070632");
			student3.setPolitics("共青团员");
		    student3.setSchooltime("2008-09-01");
		    student3.setHobby("吉他、上网");
		    student3.setClasses(classes2);
		    
		    session.save(student1);
		    session.save(student2);
		    session.save(student3);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	
	
	// 初始化数据 课题
	public void initCourse() {
		Session session = HibernateUtils.getSession();
		Teacher teacher = null;
		Teacher teacher1 = null;
		Course course1 = null;
		Course course2 = null;
		Course course3 = null; 
		Course course4 = null; 
		Course course5=null;
		try {
			session.beginTransaction();
			course1 = new Course(); 
			course1.setName("Java程序设计");
			teacher=(Teacher)session.get(Teacher.class, 1);
			course1.setTeacher(teacher);
			course2 = new Course(); 
			course2.setName("C++程序设计");
			teacher=(Teacher)session.get(Teacher.class, 1);
			course2.setTeacher(teacher);
			course3 = new Course(); 
			course3.setName("C语言程序设计");
			teacher=(Teacher)session.get(Teacher.class, 1);
			course3.setTeacher(teacher);
			course4 = new Course(); 
			course4.setName("大学英语");
			teacher1=(Teacher)session.get(Teacher.class, 2);
			course4.setTeacher(teacher1);
			course5 = new Course(); 
			course5.setName("法语");
			course5.setTeacher(teacher1);
            session.save(course1);
            session.save(course2);
            session.save(course3);
            session.save(course4);
            session.save(course5);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	
	
	

	// 初始化数据 选课
	public void initChoose() {
		Session session = HibernateUtils.getSession();
		Score score1=null;
		Score score2=null;
		Score score3=null;
		Score score4=null;
		try {
			session.beginTransaction();
			score1=new Score();
			score2=new Score();
			score3=new Score();
			score4=new Score();
			Student student1=(Student)session.get(Student.class, 1);
			Student student2=(Student)session.get(Student.class, 2);
			Course course1=(Course)session.get(Course.class, 1);
			Course course2=(Course)session.get(Course.class, 2);
			Course course3=(Course)session.get(Course.class, 3);
			Course course4=(Course)session.get(Course.class, 4);
			score1.setStudent(student1);
			score1.setCourse(course1);
			score1.setScore(89);
			score1.setState(1);
			
			score2.setStudent(student1);
			score2.setCourse(course2);
			score2.setScore(-1);
			score2.setState(-1);
			
			score3.setStudent(student2);
			score3.setCourse(course3);
			score3.setScore(-1);
			score3.setState(1);
			
			score4.setStudent(student2);
			score4.setCourse(course4);
			score4.setScore(-1);
			score4.setState(-1);
			
			
			session.save(score1);
			session.save(score2);
			session.save(score3);
			session.save(score4);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	// 初始化数据 课表
	public void initCourseArrange() {
		Session session = HibernateUtils.getSession();
		CourseArrange courseArrange1=null;
		CourseArrange courseArrange2=null;
		CourseArrange courseArrange3=null;
		try {
			session.beginTransaction();
			courseArrange1=new CourseArrange();
			courseArrange2=new CourseArrange();
			courseArrange3=new CourseArrange();
			courseArrange1.setClassesNo("4B0511");
			courseArrange1.setCourseName("C语言程序设计");
			courseArrange1.setDateTime("2010-10-08");
			courseArrange1.setBanci("第一节(8:00-10:00)");
			courseArrange1.setContent("C语言课");
			courseArrange2.setClassesNo("4B0511");
			courseArrange2.setCourseName("Java程序设计");
			courseArrange2.setDateTime("2010-10-08");
			courseArrange2.setBanci("第二节(10:20-12:00)");
			courseArrange2.setContent("Java课");
			courseArrange3.setClassesNo("4B0512");
			courseArrange3.setCourseName("大学英语");
			courseArrange3.setDateTime("2010-10-08");
			courseArrange3.setBanci("第三节(12:00-16:00)");
			courseArrange3.setContent("英语课");
			
			session.save(courseArrange1);
			session.save(courseArrange2);
			session.save(courseArrange3);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	
	
	
	
	

}
