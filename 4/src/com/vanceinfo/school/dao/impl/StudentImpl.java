package com.vanceinfo.school.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vanceinfo.school.dao.StudentDao;
import com.vanceinfo.school.hibernate.pojo.Classes; 
import com.vanceinfo.school.hibernate.pojo.Course;
import com.vanceinfo.school.hibernate.pojo.Score;
import com.vanceinfo.school.hibernate.pojo.Student;
import com.vanceinfo.school.untils.HibernateUtils;

public class StudentImpl implements StudentDao {

	// 学生注册
	public boolean addStudent(Student student) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(student);
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

	// 删除学生
	public boolean delStudent(Student student) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.delete(student);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
			//HibernateUtils.closeSession(session);
		}
		return flag;

	}

	// 查询所有学生
	@SuppressWarnings("unchecked")
	public List<Student> queryAll() throws Exception {
		List<Student> list = new ArrayList<Student>();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			String sql = "FROM Student";
			Query q = session.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			return null;
		} finally {
			//HibernateUtils.closeSession(session);
		}
		return list;
	}

	// 修改学生信息
	public boolean updateStudent(Student student) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.update(student);
			ts.commit();
			flag = true;
		} catch (HibernateException e) {
			ts.rollback();
			return false;
		} finally {
			//HibernateUtils.closeSession(session);
		}
		return flag;

	}

	// 查看学生是哪个班级的
	public Classes up(Student student) throws Exception {
		Classes classes = student.getClasses();
		return classes;
	}

	// 学生选课
	public boolean chooseCourse(Student student, List<Course> courseList)
			throws Exception {
		Session session = HibernateUtils.getSession();
		boolean flag = false;
		try {
			session.beginTransaction();
			for (int i = 0; i < courseList.size(); i++) {
				Score scorei = new Score();
				scorei.setStudent(student);
				scorei.setCourse(courseList.get(i));
				session.save(scorei);
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			//HibernateUtils.closeSession(session);
		}
		return flag;
	}

	
	// 查看学生的得分集合Set  进而得到具体的科目和得分情况
	public Set<Score> showChooseCourse(Student student, List<Course> courseList)
			throws Exception {
		Session session = HibernateUtils.getSession();
		Set<Score> scoresSet=null;
		 
		try {
			Set<Score> scoreSet=student.getScore();
			Iterator<Score> iterator = scoreSet.iterator(); 
			while(iterator.hasNext()){
				Score score= iterator.next(); 
				scoresSet=score.getCourse().getScore();
			/*	System.out.println(set);
				Iterator<Score> iterator1 = set.iterator(); 
				while(iterator1.hasNext()){
					Score score1= iterator.next();
					System.out.println(score1.getCourse().getName()+score1.getScore());
				}*/
			}
			  
			session.getTransaction().commit(); 
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			//HibernateUtils.closeSession(session);
		}
		return scoresSet;
	}

	//通过学生ID找到学生对象
	public Student findStudent(int id) throws Exception {
		Session session = null;
		Student student=null;
		Transaction ts = null; 
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			student = (Student)session.get(Student.class, id);
			session.update(student);
			ts.commit(); 
		} catch (HibernateException e) {
			ts.rollback(); 
		} finally {
			HibernateUtils.closeSession(session);
		}
		return student; 
	}

	 //通过学生的id能查到所在的班级
	public String getClassesNo(Integer stuId) {
		Session session = HibernateUtils.getSession();
		Student student = (Student) session.get(Student.class, stuId); // 为学生选课
		String classesNo= student.getClasses().getClassesNo();
		return classesNo;
	}
	

	
	
	// 删除学生
	public boolean del(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		Student student=null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			student = (Student) session.get(Student.class, id);  
			ts = session.beginTransaction();
			session.delete(student);
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
	
	
	 
}
