package com.vanceinfo.school.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vanceinfo.school.dao.CollageDao; 
import com.vanceinfo.school.hibernate.pojo.Collage;
import com.vanceinfo.school.hibernate.pojo.Professions;
import com.vanceinfo.school.untils.HibernateUtils;

public class CollageImpl implements CollageDao {

	//条件查询
	@SuppressWarnings("unchecked")
	public List<Collage> Query_one(String sql) throws Exception {
		List<Collage> list = new ArrayList<Collage>();
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

	//添加学院
	public boolean addCollage(Collage collage) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(collage);
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

	
	//删除学院
	public boolean delCollage(int id) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			Collage collage = (Collage)session.get(Collage.class, id); 
			session.delete(collage);
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
	
	//更新学院信息
	public boolean updateCollage(Collage collage) throws Exception {
		Session session = null; 
		Transaction ts = null; 
		boolean flag=false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction(); 
			session.update(collage);
			ts.commit(); 
			flag=true;
		} catch (HibernateException e) {
			ts.rollback(); 
		} finally {
			HibernateUtils.closeSession(session);
		}
		return flag;
	}

	
	
	//根据学院Id找到该Collage对象
	public Collage findCollage(int id) throws Exception {
		Session session = null;
		Collage collage=null;
		Transaction ts = null; 
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			collage = (Collage)session.get(Collage.class, id);
			session.update(collage);
			ts.commit(); 
		} catch (HibernateException e) {
			ts.rollback(); 
		} finally {
			HibernateUtils.closeSession(session);
		}
		return collage;
	}

	
	//查询所有学院信息
	@SuppressWarnings("unchecked")
	public List<Collage> queryAllCollage() throws Exception {
		List<Collage> list = new ArrayList<Collage>();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			String sql = "FROM Collage";
			Query q = session.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			return null;
		} finally {
			HibernateUtils.closeSession(session);
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		try {
			List<Collage> list=new CollageImpl().queryAllCollage();
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i).getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//向下 得到该学院下的所有专业Set集合
	public Set<Professions> down(Collage collage)throws Exception {
		Set<Professions> professionsSet=collage.getProfessions();
		return professionsSet;
	}

 

}
