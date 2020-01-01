package com.vanceinfo.school.junit;



import junit.framework.TestCase;

public class GradeTest extends TestCase {
	
   //给学生打分
/*	public void testAddClasses(){
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			Grade grade = new Grade();
			grade.setId(1); 
			grade.setStudent((Student)session.get(Student.class, 1));  //给学号为4B051111的学生  打分
			grade.setCourse((Course)session.get(Course.class, 2));     //给Java程序设计 打分
			grade.setGrade(82);   //80分
			
			grade.setTeacher((Teacher)session.get(Teacher.class, 1));

			
			
			
			session.update(grade);
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
