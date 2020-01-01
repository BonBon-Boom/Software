package com.vanceinfo.school.junit;

 
 
import org.hibernate.Session;
 
import com.vanceinfo.school.hibernate.pojo.Professions;
import com.vanceinfo.school.untils.HibernateUtils;

import junit.framework.TestCase;

public class ProfessionsTest extends TestCase{
	
	
	//向学院里面 添加专业
/* public void testAddProfession(){
	    	Session session=HibernateUtils.getSession();
	    	try{
	    		session.beginTransaction();
	    		Professions professions=new Professions();
	    		professions.setId(1);
	    		professions.setName("电子系");  // 日语系   法语系   计算机系
	    		professions.setCollage((Collage)session.get(Collage.class, 16));   //讲电子系添加到  信息工程学院
	    		session.save(professions);
	    		session.getTransaction().commit();
	    		
	    	}catch(Exception e){
	    		 e.printStackTrace();
	    		 session.getTransaction().rollback();
	    	}finally{
	    		HibernateUtils.closeSession(session);
	    	}
	    	
	    }*/
	 
	
	
	//修改专业信息
	/*public void testUpdateProfession(){
    	Session session=HibernateUtils.getSession();
    	try{
    		session.beginTransaction();  
    		Professions professions=(Professions)session.get(Professions.class, 1) ;
    		professions.setName("英语专业");
    		session.update(professions);
    		session.getTransaction().commit();
    		
    	}catch(Exception e){
    		 e.printStackTrace();
    		 session.getTransaction().rollback();
    	}finally{
    		HibernateUtils.closeSession(session);
    	}
    	
    }
    */
	
	
	
	
	
	
	 /*
	  * 删除一个专业：
	  *        该专业下的班级  班级下的学生所有的记录都被删除(注意：删除的时候，老师不能被删掉)
	  */
	  /*public void testDelProfession(){
	    	Session session=HibernateUtils.getSession();
	    	try{
	    		session.beginTransaction();  
	    		session.delete((Professions)session.get(Professions.class, 2)) ;
	    		session.getTransaction().commit();
	    		
	    	}catch(Exception e){
	    		 e.printStackTrace();
	    		 session.getTransaction().rollback();
	    	}finally{
	    		HibernateUtils.closeSession(session);
	    	}
	    	
	    }*/
	
	
	
	
	
	
	/**
	 *@查看专业信息：
	 *  该专业输入哪个系  collage
	 *  该专业下面有几个班级 classes
	 */	 
	public void testname() throws Exception {
		Session session=HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Professions pro = (Professions)session.get(Professions.class, 3); 
			System.out.println("专业名称："+pro.getName()); 
			System.out.println(pro.getCollage().getName());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	/*public void testQueryCollage() {
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Professions pro = (Professions)session.get(Professions.class, 3); 
			System.out.println("专业名称："+pro.getName());  
			
			
			//向下查询   该专业下面有多少个班级
			Set<Classes> classes=pro.getClasses();
			Iterator<Classes> iterator = classes.iterator();
			System.out.println("------------------------"+pro.getName()+"有如下班级："+"------------------------");
			while(iterator.hasNext()){
				Classes c = iterator.next(); 
				System.out.println("班级名称："+c.getClassesNo()); 
			}
			  
			//向上查询   该专业属于哪个学院的
			System.out.println(pro.getName()+"属于："+pro.getCollage().getName());
			
			
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
