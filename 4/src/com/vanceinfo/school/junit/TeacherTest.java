package com.vanceinfo.school.junit;
 
import org.hibernate.Session;

import com.vanceinfo.school.hibernate.pojo.*;
import com.vanceinfo.school.untils.HibernateUtils;

import junit.framework.TestCase;

public class TeacherTest extends TestCase {

	//添加老师
/* public void testAddTeacher() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Teacher teacher = new Teacher();
			teacher.setId(2);
			teacher.setName("桂加国");   //桂加国   测试老师  易秀玲 
			teacher.setAddr("汉族");
			teacher.setBorn("1922-12-21");
			teacher.setCertid("1312132132132312332"); 
			teacher.setTeacherNo("24BAS");
			
			session.save(teacher);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}

	}
	 */
	
	//给学生打分
	public void testGetScore() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			 Student student = (Student)session.get(Student.class, 1);      
			 
			 Course course1=(Course)session.get(Course.class, 2);
		 
			 Score score=new Score(); 
			 score.setScore(12);
			 score.setStudent(student);
		 	 score.setCourse(course1);
			 session.update(score);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}

	}
	
	
	
	
	//删除老师
/*	public void testDelTeacher() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Teacher teacher =(Teacher)session.get(Teacher.class, 1);
			session.delete(teacher);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}

	}*/
	 
 
	
}
