package com.vanceinfo.school.dao.impl;

 
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example; 
import com.vanceinfo.school.dao.AdminDao;
import com.vanceinfo.school.hibernate.pojo.Admin;
import com.vanceinfo.school.untils.HibernateUtils;

public class AdminImpl implements AdminDao {

	//条件查询
	@SuppressWarnings("unchecked")
	public List<Admin> Query_one(String sql) throws Exception {
		List<Admin> list = new ArrayList<Admin>();
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
 
	
	// 添加管理员
	public boolean addAdmin(Admin admin) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(admin);
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
	//测试添加
	/*public static void main(String args[]){
	AdminImpl ai=new AdminImpl();
 Admin admin=new Admin();
	admin.setId(2);
	admin.setName("benxiaohai");
	admin.setPsw("adsf");
	try {
		ai.addAdmin(admin);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}*/

	// 删除管理员
	public boolean delAdmin(Admin admin) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.delete(admin);
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
	//测试删除
	/*public static void main(String args[]){
		AdminImpl ai=new AdminImpl();
	 Admin admin=new Admin();
		admin.setId(1);   
		try {
			ai.delAdmin(admin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	
	// 查询所有管理员
	@SuppressWarnings("unchecked")
	public List<Admin> queryAllAdmin() throws Exception {
		List<Admin> list = new ArrayList<Admin>();
		Session session = null; 
		try {
			session = HibernateUtils.getSession(); 
			String sql = "FROM Admin"; 
			Query q = session.createQuery(sql);
			list = q.list(); 
		} catch (HibernateException e) { 
			return null;
		} finally {
		//	HibernateUtils.closeSession(session);
		}
		return list;
	}
   //测试查询所有
/*	public static void main(String args[]){
		AdminImpl ai=new AdminImpl();
	   Admin admin=new Admin();
	   admin.setId(1);
	   try {
		List<Admin> list=ai.queryAllAdmin();
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName());
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
 */
   //更新信息
	public boolean updateAdmin(Admin admin) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.update(admin);
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
	//测试更新
	/*public static void main(String args[]){
	AdminImpl ai=new AdminImpl();
 Admin admin=new Admin();
	admin.setId(1);  
	admin.setName("李定坤");
	admin.setPsw("love123");
	try {
		ai.updateAdmin(admin);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}*/
	@SuppressWarnings("unchecked")
	public List<Admin> Query_one(Admin admin) {
		List<Admin> list = new ArrayList<Admin>();
		Session se = null;
		try {
			se = HibernateUtils.getSession();
			if(null!=admin){
				String sql = "FROM Admin where id=?";
				Query q = se.createQuery(sql);
				q.setInteger(0, admin.getId());
				list = q.list();
			}else{
              Criteria   criteria   = se.createCriteria(Admin.class).add(Example.create(admin));   
              list=   criteria.list(); 
			}
		} catch (HibernateException e) {
			return null;
		} finally {
			HibernateUtils.closeSession(se);
		}
		return list;
	}

    //判断管理员是否存在
	public boolean checkExit(Admin admin) throws Exception {
		 
		return false;
	}


	//删除管理员
	public boolean delAdmin(int id) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			Admin admin = (Admin)session.get(Admin.class, id);  
			session.delete(admin);
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


	//根据管理员id返回一个Admin对象
	public Admin findAdmin(int id) throws Exception {
		Session session = null;
		Admin admin=null;
		Transaction ts = null; 
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			admin = (Admin)session.get(Admin.class, id);
		} catch (HibernateException e) {
			ts.rollback(); 
		} finally {
			HibernateUtils.closeSession(session);
		}
		return admin; 
	}
	 
}
