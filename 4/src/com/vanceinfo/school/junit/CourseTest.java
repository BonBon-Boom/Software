package com.vanceinfo.school.junit;


import com.vanceinfo.school.hibernate.pojo.*;
import com.vanceinfo.school.untils.*;

import org.hibernate.*;

import junit.framework.TestCase;

public class CourseTest extends TestCase {
	
	//加入课程   没问题
	public void testAddCourse() {
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			 //大学英语  大学物理  数字电路  概率论  C语言程序  Java程序设计  VB程序设计  包泽东思想  
			//初级测试  中级测试 高级测试
			Course course1 = new Course();
			course1.setName("大学英语");
			session.save(course1);
			
			Course course2 = new Course();
			course2.setName("大学物理");
			session.save(course2);
			
			Course course3 = new Course();
			course3.setName(" 数字电路");
			session.save(course3);
			 
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
	}	
	
	
	
	
	//给课程安排老师   没问题
	/*public void testChooseTeacherForCourse() {
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			Course course1 =(Course)session.get(Course.class, 1);
			Course course2 = (Course)session.get(Course.class, 2);
			Course course3 = (Course)session.get(Course.class, 3);
			
			Set set=new HashSet();
			set.add(course1);
			set.add(course2);
			set.add(course3);
			
			Teacher teacher=(Teacher)session.get(Teacher.class, 3);
			
			teacher.setCourse(set);
			session.update(course1);
			session.update(course2);
			session.update(course3);
			 
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
	}
	*/
  
	//给学生的课程  评分
	/*public void testDelCourse() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
          
			Student student = (Student) session.get(Student.class, 2);       
			// 向下查询 他选了哪些课程
			Set<Course> course = student.getCourse();
			Iterator<Course> iterator = course.iterator(); 
			
			while (iterator.hasNext()) {
				Course course1 = iterator.next();
				System.out.println("所选课程有："+course1.getName() + " "); 
				 
			}
			
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}*/
	
	
	
 
	//删除课程编号为3的课程，删除对应的所有的学生记录
/*	public void testDelCourse() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
             
			session.delete((Course) session.get(Course.class, 3));
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
*/
}
