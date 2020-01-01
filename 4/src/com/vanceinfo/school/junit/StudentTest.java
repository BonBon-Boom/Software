package com.vanceinfo.school.junit;
 

import org.hibernate.Session;

import com.vanceinfo.school.hibernate.pojo.*;
import com.vanceinfo.school.untils.HibernateUtils;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

	//学生先注册   没问题
 /* public void testRegeditStudent() {
		 Session session = HibernateUtils.getSession();
		 try {
		 session.beginTransaction();
		 Student student = new Student();
		 student.setName("李定坤");  //李定坤  笨小孩   Cody  benxiaohai
		 student.setStudentNo("4B051111");
		 student.setAddr("湖北黄冈");
		 student.setPsw("1314520");
		 student.setCertid("421127198612312571");
		 student.setEmail("lovingroses@163.com");
		 student.setSchooltime("2005-09-01");
		 student.setBorn("2005-09-01");
		 student.setHobby("足球");
		 student.setSex("男");
		 student.setPolitics("团员");
		 student.setTel("13484603471");
		 student.setClasses((Classes)session.get(Classes.class, 5));   //添加到班级中
		 
		 session.save(student);
		 session.getTransaction().commit();
		 } catch (Exception e) {
		 e.printStackTrace();
		 session.getTransaction().rollback();
		 } finally {
		 HibernateUtils.closeSession(session);
		 }
		 }
*/
	
	//学生注册完之后可以选课    没问题
  public void testDelStudent() {
		 Session session = HibernateUtils.getSession();
		 try {
		 session.beginTransaction();
		 Student student = (Student)session.get(Student.class, new Integer(2));     //为学生选课
		 
		 Course course1=(Course)session.get(Course.class, new Integer(2));
		 Score score1=new Score(); 
		 score1.setStudent(student);
	 	 score1.setCourse(course1);
	 //	 score1.setScore(-1);
		 session.save(score1);  
		 Course course2=(Course)session.get(Course.class, new Integer(3));
		 Score score2=new Score(); 
		 score2.setStudent(student);
	 	 score2.setCourse(course2);
	 //	 score2.setScore(-1);
		 session.save(score2);  
		 
		 session.getTransaction().commit();
		 } catch (Exception e) {
		 e.printStackTrace();
		 session.getTransaction().rollback();
		 } finally {
		 HibernateUtils.closeSession(session);
		 }
		 }
	 
	 //查看学生信息student  查看所属哪个班级  选了什么课程(课程得分情况)
//	public void testQueryCollage()throws NoSuchElementException {
//		Session session = HibernateUtils.getSession();
//		try {
//			session.beginTransaction();
//			Student student = (Student) session.get(Student.class, 2);
//			System.out.println("----------------"+student.getName()+"--------信息如下：-----------");
//			System.out.println("学生名称：" + student.getName()); 
//			// 向上查询
//			// 查询该学生是哪个班级的
//			System.out.println("所属班级：" + student.getClasses().getClassesNo());
//			
//			//向下查询
//			Set<Score> scoreSet=student.getScore();
//			Iterator<Score> iterator = scoreSet.iterator(); 
//			while(iterator.hasNext()){
//				Score score= iterator.next(); 
//				Set<Score> set=score.getCourse().getScore();
//				System.out.println(set);
//				Iterator<Score> iterator1 = set.iterator(); 
//				while(iterator1.hasNext()){
//					Score score1= iterator.next();
//					System.out.println(score1.getCourse().getName()+score1.getScore());
//				}
//			}
//			 
//			session.getTransaction().commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			session.getTransaction().rollback();
//		} finally {
//			HibernateUtils.closeSession(session);
//		}
//	}

}
