package com.vanceinfo.school.junit;

 
 

import org.hibernate.Session;

import com.vanceinfo.school.hibernate.pojo.Admin;
import com.vanceinfo.school.untils.HibernateUtils;

import junit.framework.TestCase;

public class AdminTest extends TestCase {
  
 
	
	
	// 添加管理员admin
 	public void testAddAdmin() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Admin admin =new Admin();
			admin.setId(1); // 添加的时候可要可不要
			admin.setName("admin1");
			admin.setPsw("admin1");
			session.save(admin);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	// 管理员修改个人资料
/*	public void testUpdateCollage() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Admin admin = new Admin();
			admin.setId(1); // 添加的时候可要可不要 
			admin.setName("李定坤");
			admin.setPsw("520");
			session.update(admin);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}*/

}
