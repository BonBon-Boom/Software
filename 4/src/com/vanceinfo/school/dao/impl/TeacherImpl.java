package com.vanceinfo.school.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction; 
import com.vanceinfo.school.dao.TeacherDao; 
import com.vanceinfo.school.hibernate.pojo.Course;
import com.vanceinfo.school.hibernate.pojo.Score;
import com.vanceinfo.school.hibernate.pojo.Student;
import com.vanceinfo.school.hibernate.pojo.Teacher;
import com.vanceinfo.school.untils.HibernateUtils;

public class TeacherImpl implements TeacherDao {

	//条件查询
	@SuppressWarnings("unchecked")
	public List<Teacher> Query_one(String sql) throws Exception {
		List<Teacher> list = new ArrayList<Teacher>();
		Session se = null;
		try {
			se = HibernateUtils.getSession();
			Query q = se.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtils.closeSession(se);
		}
		return list;
	}
	

	//添加老师
	public boolean addTeacher(Teacher teacher) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(teacher);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
			HibernateUtils.closeSession(session);
		}
		return flag;
	}

	
	//删除老师
	public boolean delTeacher(Teacher teacher) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.delete(teacher);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
			HibernateUtils.closeSession(session);
		}
		return flag;
	}
 

	//查询所有老师
	@SuppressWarnings("unchecked")
	public List<Teacher> queryAllTeacher() throws Exception {
		List<Teacher> list = new ArrayList<Teacher>();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			String sql = "FROM Teacher";
			Query q = session.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			return null;
		} finally {
			HibernateUtils.closeSession(session);
		}
		return list;
	}

	//修改个人资料
	public boolean updateTeacher(Teacher teacher) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.update(teacher);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
			HibernateUtils.closeSession(session);
		}
		return flag;
	}

	//老师给学生打分
	public boolean giveScore(Teacher teacher,Student student,Course course,Score score)throws Exception{
		boolean flag=false;
		
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			 score.setStudent(student);
		 	 score.setCourse(course);
			 session.update(score);
			session.getTransaction().commit();
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
		return flag;
	}

	//通过老师ID找到老师对象
	public Teacher findTeacher(int id) throws Exception {
		Session session = null;
		Teacher teacher=null;
		Transaction ts = null; 
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			teacher = (Teacher)session.get(Teacher.class, id);
			session.update(teacher);
			ts.commit(); 
		} catch (HibernateException e) {
			ts.rollback(); 
		} finally {
			HibernateUtils.closeSession(session);
		}
		return teacher; 
	}

	// 删除老师
	public boolean del(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		Teacher teacher=null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			teacher = (Teacher) session.get(Teacher.class, id);  
			ts = session.beginTransaction();
			session.delete(teacher);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
	//		HibernateUtils.closeSession(session);
		}
		return flag;
	}
	 
	
}
