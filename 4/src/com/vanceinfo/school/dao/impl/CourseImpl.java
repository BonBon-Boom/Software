package com.vanceinfo.school.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.vanceinfo.school.dao.CourseDao;
import com.vanceinfo.school.hibernate.pojo.Course;
import com.vanceinfo.school.untils.HibernateUtils;

public class CourseImpl implements CourseDao {

	// 查询所有课程
	@SuppressWarnings("unchecked")
	public List<Course> Query_all() throws Exception {
		List<Course> list = new ArrayList<Course>();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			String sql = "FROM Course";
			Query q = session.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			return null;
		} finally {
			// HibernateUtils.closeSession(session);
		}
		return list;
	}

	public List<Course> Query_one(Course course) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> Query_one(String sql) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	// 添加课程
	public boolean addCourse(Course course) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(course);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
			// HibernateUtils.closeSession(session);
		}
		return flag;
	}

	// 删除课程
	public boolean delCourse(int id) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			Course course = (Course) session.get(Course.class, id);
			session.delete(course);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
			// HibernateUtils.closeSession(session);
		}
		return flag;
	}

	// 根据Id找到Course对象
	public Course findCourse(int id) throws Exception {
		Session session = null;
		Course course = null;
		Transaction ts = null;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			course = (Course) session.get(Course.class, id);
			session.update(course);
			ts.commit();
		} catch (HibernateException e) {
			ts.rollback();
		} finally {
			// HibernateUtils.closeSession(session);
		}
		return course;
	}

	// 更新课程信息
	public boolean updateCourse(Course course) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.update(course);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
		} finally {
			// HibernateUtils.closeSession(session);
		}
		return flag;
	}

	// 删除课程
	public boolean del(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		Course course = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			course = (Course) session.get(Course.class, id);
			ts = session.beginTransaction();
			session.delete(course);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
			// HibernateUtils.closeSession(session);
		}
		return flag;
	}

	// 通过教师的ID查询到所有他带的课
	public List<Course> getCourse(Integer teacherId) throws Exception {
		List<Course> list = new ArrayList<Course>();
		List<Course> courseList = new CourseImpl().Query_all();
		for (int i = 0; i < courseList.size(); i++) {
			if (teacherId.equals(courseList.get(i).getTeacher().getId())) {
				list.add(courseList.get(i));
			}
		}
		return list;
	}
	
	public static void main(String[] args) throws Exception {
		List<Course> list=new CourseImpl().getCourse(2);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName());
		}
	
	}

}
