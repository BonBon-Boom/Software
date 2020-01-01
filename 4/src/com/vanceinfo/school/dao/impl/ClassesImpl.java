package com.vanceinfo.school.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.vanceinfo.school.dao.ClassesDao;
import com.vanceinfo.school.hibernate.pojo.Classes; 
import com.vanceinfo.school.hibernate.pojo.Professions;
import com.vanceinfo.school.hibernate.pojo.Student;
import com.vanceinfo.school.untils.HibernateUtils;

public class ClassesImpl implements ClassesDao {

	// 条件查询
	@SuppressWarnings("unchecked")
	public List<Classes> Query_one(String sql) throws Exception {
		// TODO Auto-generated method stub
		List<Classes> list = new ArrayList<Classes>();
		Session se = null;
		try {
			se = HibernateUtils.getSession();
			Query q = se.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
		//	HibernateUtils.closeSession(se);
		}
		return list;
	}

	// 添加班级
	public boolean addClasses(Classes classes) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(classes);
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

	// 删除班级
	public boolean delClasses(Classes classes) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.delete(classes);
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

	// 查询所有班级
	@SuppressWarnings("unchecked")
	public List<Classes> queryAllClasses() throws Exception {
		List<Classes> list = new ArrayList<Classes>();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			String sql = "FROM Classes";
			Query q = session.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			return null;
		} finally {
		//	HibernateUtils.closeSession(session);
		}
		return list;
	}

	// 更新班级信息
	public boolean updateClasses(Classes classes) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.update(classes);
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

	// 根据学院Id找到该Classes对象
	public Classes findClasses(int id) throws Exception {
		Session session = null;
		Classes classes = null;
		Transaction ts = null;
		try {
			session = HibernateUtils.getSession();
			classes = (Classes) session.get(Classes.class, id);

		} catch (HibernateException e) {
			ts.rollback();
		} finally {
		//	HibernateUtils.closeSession(session);
		}
		return classes;
	}

	// 向上 得到是哪个专业的
	public Professions up(Classes classes) throws Exception {
		Professions professions = classes.getProfessions();
		return professions;
	}

	// 向下 得到是所有的学生的Set集合
	public Set<Student> down(Classes classes) throws Exception {
		Set<Student> studnetSet = classes.getStudents();
		return studnetSet;
	}

	// 删除专业
	public boolean del(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		Classes classes=null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			classes = (Classes) session.get(Classes.class, id);  
			ts = session.beginTransaction();
			session.delete(classes);
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
