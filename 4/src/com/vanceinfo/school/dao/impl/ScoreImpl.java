package com.vanceinfo.school.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.vanceinfo.school.dao.ScoreDao;
import com.vanceinfo.school.hibernate.pojo.Course;
import com.vanceinfo.school.hibernate.pojo.Score;
import com.vanceinfo.school.hibernate.pojo.Student;
import com.vanceinfo.school.untils.HibernateUtils;
import com.vanceinfo.school.untils.DBCon;

public class ScoreImpl implements ScoreDao {

	//每次选课时，先清楚该学生的选课记录
	public void delCourse(Integer stuid) {

//		 Session session = HibernateUtils.getSession();
//		 try {
//		 session.beginTransaction();
//		 String sqlString = "delete from t_score where studentid = " + stuid;
//		 session.createSQLQuery(sqlString);
//		 System.out.println("sqlString:" + sqlString);
//		 session.getTransaction().commit();
//		 session.clear();
//		 } catch (Exception e) {
//		 e.printStackTrace();
//		// session.getTransaction().rollback();
//		 } finally {
//		 HibernateUtils.closeSession(session);
//		 }

		Connection con = new DBCon().getConnection();
		String sql = "delete from t_score where studentid =" + stuid;
		try {
			Statement st = con.createStatement();
			@SuppressWarnings("unused")
			boolean falg = st.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void main(String args[]){
		new ScoreImpl().delCourse(1);
	}
	

	@SuppressWarnings("unchecked")
	public List<Score> Query_all() throws Exception {
		List<Score> list = new ArrayList<Score>();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			String sql = "FROM Score";
			Query q = session.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			return null;
		} finally {
			// HibernateUtils.closeSession(session);
		}
		return list;
	}

	public List<Score> Query_one(Score course) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Score> Query_one(String sql) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delCourse(Score course) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateScore(Score course) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	// 判断学员是否已选该门课程
	public boolean isExsit(Integer stuid, Integer courseId) {
		boolean flag = false;
		Connection con = new DBCon().getConnection();
		String sql = "select * from t_score where studentid = " + stuid
				+ "and courseid= " + courseId;
		System.out.println("sql968:" + sql);
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
     


	// 给学员打分
	public Score getScore(Integer stuId, Integer courseId, Integer state,
			Integer score) {

		Session session = HibernateUtils.getSession();
		Score score1 = null;
		try {
			session.beginTransaction();
			Student student = (Student) session.get(Student.class, stuId); // 返回得到学生对象
			Course course = (Course) session.get(Course.class, courseId); // 返回得到学生对象
			score1 = new Score();
			score1.setStudent(student);
			score1.setCourse(course);
			
			score1.setState(state);
			score1.setScore(score);
			session.merge(score1);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
		return score1;
	}
	//确认签名
	public Score getScore(Integer stuId, Integer courseId, Integer state,
			Integer score,String enScore) {

		Session session = HibernateUtils.getSession();
		Score score1 = null;
		try {
			session.beginTransaction();
			Student student = (Student) session.get(Student.class, stuId); // 返回得到学生对象
			Course course = (Course) session.get(Course.class, courseId); // 返回得到学生对象
			score1 = new Score();
			score1.setStudent(student);
			score1.setCourse(course);
			score1.setEnScore(enScore);
			score1.setState(state);
			score1.setScore(score);
			session.merge(score1);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
		return score1;
	}
}
