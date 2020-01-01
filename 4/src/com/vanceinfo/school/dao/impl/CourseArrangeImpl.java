package com.vanceinfo.school.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vanceinfo.school.dao.CourseArrangeDao;
import com.vanceinfo.school.hibernate.pojo.CourseArrange;
import com.vanceinfo.school.untils.HibernateUtils;

public class CourseArrangeImpl implements CourseArrangeDao {

	//查询所有课程表
	@SuppressWarnings("unchecked")
	public List<CourseArrange> Query_all() throws Exception {
		List<CourseArrange> list = new ArrayList<CourseArrange>();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			String sql = "FROM CourseArrange";
			Query q = session.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			return null;
		} finally {
		//	HibernateUtils.closeSession(session);
		}
		return list;
	}

	
   //安排课程表
	public boolean addCourseArrange(CourseArrange courseArrange)
			throws Exception {
	 
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(courseArrange);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
		//	HibernateUtils.closeSession(session);
		}
		return flag;
	}
	
	 
	  //得到CourseArrange对象
	public CourseArrange getCourseArrange(Integer id) {
	 
		Session session = null;
		CourseArrange courseArrange=null;
		@SuppressWarnings("unused")
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			courseArrange = (CourseArrange) session.get(CourseArrange.class, id); // 为学生选课
			flag = true;
		} catch (HibernateException e) {
			 e.printStackTrace();
		} finally {
		//	HibernateUtils.closeSession(session);
		}
		return courseArrange;
	}
	

	

	// 修改课表信息
	public boolean updateCourseArrange(CourseArrange courseArrange) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.update(courseArrange);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
			//HibernateUtils.closeSession(session);
		}
		return flag;

	}

	
	
	// 删除课表安排
	public boolean delCourseArrange(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		CourseArrange courseArrange=null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			courseArrange = (CourseArrange) session.get(CourseArrange.class, id);  
			ts = session.beginTransaction();
			session.delete(courseArrange);
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
