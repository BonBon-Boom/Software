package com.vanceinfo.school.junit;

import org.hibernate.Session;

import com.vanceinfo.school.hibernate.pojo.Collage;
import com.vanceinfo.school.untils.HibernateUtils;

import junit.framework.TestCase;

public class CollageTest extends TestCase {

	
	//添加学院
  public void testAddCollage(){
    	Session session=HibernateUtils.getSession();
    	try{
    		session.beginTransaction();
    		Collage collage=new Collage();
    		collage.setId(1);
    		collage.setName("测试学院");
    		collage.setContent("搞测试的多！");
    		session.save(collage);
    		session.getTransaction().commit();
    		
    	}catch(Exception e){
    		 e.printStackTrace();
    		 session.getTransaction().rollback();
    	}finally{
    		HibernateUtils.closeSession(session);
    	}
    	
    }
 
	
	 
	// 查看学院信息collage  该学院下有多少个专业
/*	public void testQueryCollage() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Collage collage = (Collage)session.get(Collage.class, 2); 
			System.out.println("学院名称："+collage.getName()); 
			System.out.println("学院备注："+collage.getContent());
			
			
			//下面是显示出 信息工程学院的所有专业(系)
			Set<Professions> professions=collage.getProfessions();
			Iterator<Professions> iterator = professions.iterator();
			System.out.println("------------------------"+collage.getName()+"有如下专业："+"------------------------");
			while(iterator.hasNext()){
				Professions profession = iterator.next(); 
				System.out.println("专业名称："+profession.getName()); 
			}
			 
			
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
	}*/
	
	
	//修改学院信息
	/*public void testUpdateCollage(){
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Collage collage = (Collage)session.get(Collage.class, 1);  
			collage.setContent("美女多，不错！");
			session.update(collage);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
		
	}*/
	  
	
	
	
	//删除学院  下面的专业    班级   学生  全删除了
 	/*public void testDelCollage() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Collage collage = (Collage)session.get(Collage.class, 1); 
			System.out.println("学院名称："+collage.getName()); 
			System.out.println("学院备注："+collage.getContent());
			session.delete(collage);
			
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
