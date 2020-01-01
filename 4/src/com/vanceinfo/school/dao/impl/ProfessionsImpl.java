package com.vanceinfo.school.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set; 
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vanceinfo.school.dao.ProfessionsDao;
import com.vanceinfo.school.hibernate.pojo.Classes;
import com.vanceinfo.school.hibernate.pojo.Collage;
import com.vanceinfo.school.hibernate.pojo.Professions;
import com.vanceinfo.school.untils.HibernateUtils;

public class ProfessionsImpl implements ProfessionsDao {

	//查询所有专业
	@SuppressWarnings("unchecked")
	public List<Professions> Query_all() throws Exception {
		List<Professions> list = new ArrayList<Professions>();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			String sql = "FROM Professions";
			Query q = session.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			return null;
		} finally {
//			HibernateUtils.closeSession(session);
		}
		return list;
	}

	//查询一个专业下有多少个班级
	public Set<Classes> hasClasses(Professions professions)
			throws Exception {
		// TODO Auto-generated method stub
		Set<Classes> classesSet=professions.getClasses();
		return classesSet;
	}

	
	//条件查询
	@SuppressWarnings("unchecked")
	public List<Professions> Query_one(String sql) throws Exception {
		List<Professions> list = new ArrayList<Professions>();
		Session se = null;
		try {
			se = HibernateUtils.getSession();
			Query q = se.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
//			HibernateUtils.closeSession(se);
		}
		return list;
	}

	//向学院中添加专业
	public boolean addProfessions(Professions professions,Collage collage) throws Exception {
		boolean flag=false;
		Session session=HibernateUtils.getSession();
    	try{
    		session.beginTransaction(); 
    		professions.setCollage(collage);    
    		session.save(professions);
    		session.getTransaction().commit();
    		flag=true;
    		System.out.println("ok!");
    	}catch(Exception e){
    		 e.printStackTrace();
    		 session.getTransaction().rollback();
    	}finally{
//    		HibernateUtils.closeSession(session);
    	}
		return flag;
	}
	

	//删除专业
	public boolean delProfessions(Professions professions) throws Exception {
		boolean flag=false;
		Session session=HibernateUtils.getSession();
    	try{
    		session.beginTransaction();  
    		session.delete(professions);
    		flag=true;
    	}catch(Exception e){
    		 e.printStackTrace();
    		 session.getTransaction().rollback();
    	}finally{
//    		HibernateUtils.closeSession(session);
    	}
		return flag;
	}

	//更新学院信息
	public boolean updateProfessions(Professions professions, Collage collage)
			throws Exception {
		boolean flag=false;
		Session session=HibernateUtils.getSession();
    	try{
    		session.beginTransaction();  
    		session.update(professions);
    		flag=true;
    	}catch(Exception e){
    		 e.printStackTrace();
    		 session.getTransaction().rollback();
    	}finally{
//    		HibernateUtils.closeSession(session);
    	}
		return flag;
	}
	
	//向上查询  得到该专业是属于那个学院的
	public Collage up(Professions professions)throws Exception{
		Collage collage=professions.getCollage();
		return collage;
	}
	
	//向下查询  一个专业下面有多少个班级
	public Set<Classes>  down(Professions professions)throws Exception{
		Set<Classes> classes=professions.getClasses();
		return  classes;
	}

	//添加专业
	public void Add(Professions professions) {
		
		Session session = null;
		Transaction ts = null;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(professions);
			ts.commit();
		} catch (HibernateException e) {
			ts.rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	
	//更新专业信息
	public void updateProfessions(Professions professions) {
		Session session = null;
		Transaction ts = null;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(professions);
			ts.commit();
		} catch (HibernateException e) {
			ts.rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	

	//通过ID找到对象
	public Professions findProfessions(Integer id) throws Exception {
		Session session = null;
		Professions professions=null;
		Transaction ts = null; 
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			professions = (Professions)session.get(Professions.class, id);
		} catch (HibernateException e) {
			ts.rollback(); 
		} finally {
			HibernateUtils.closeSession(session);
		}
		return professions; 
	}
	 
	
	// 删除专业
	public boolean del(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		Professions professions=null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			professions = (Professions) session.get(Professions.class, id);  
			ts = session.beginTransaction();
			session.delete(professions);
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
