package com.vanceinfo.school.dao.impl;

 
import java.util.ArrayList;
import java.util.List; 
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction; 
import com.vanceinfo.school.dao.NoticeDao;  
import com.vanceinfo.school.hibernate.pojo.Notice;
import com.vanceinfo.school.untils.HibernateUtils;

public class NoticeImpl implements NoticeDao {

	//添加公告
	public boolean addNotice(Notice notice) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			session.save(notice);
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
 
	//删除公告
	public boolean delNotice(int id) throws Exception {
		Session session = null;
		Transaction ts = null;
		boolean flag = false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			Notice notice = (Notice)session.get(Notice.class, id); 
			session.delete(notice);
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

	//根据公告ID返回一公告对象
	public Notice findNotice(int id) throws Exception {
		Session session = null;
		Notice notice=null;
		Transaction ts = null; 
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction();
			notice = (Notice)session.get(Notice.class, id);
			session.update(notice);
			ts.commit(); 
		} catch (HibernateException e) {
			ts.rollback(); 
		} finally {
			HibernateUtils.closeSession(session);
		}
		return notice;
	}

	//查找所有
	@SuppressWarnings("unchecked")
	public List<Notice> queryAllNotice() throws Exception {
		List<Notice> list = new ArrayList<Notice>();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			String sql = "FROM Notice";
			Query q = session.createQuery(sql);
			list = q.list();
		} catch (HibernateException e) {
			return null;
		} finally {
			HibernateUtils.closeSession(session);
		}
		return list;
	}

	//更新公告信息
	public boolean updateNotice(Notice notice) throws Exception {
		Session session = null; 
		Transaction ts = null; 
		boolean flag=false;
		try {
			session = HibernateUtils.getSession();
			ts = session.beginTransaction(); 
			session.update(notice);
			ts.commit(); 
			flag=true;
		} catch (HibernateException e) {
			ts.rollback(); 
		} finally {
			HibernateUtils.closeSession(session);
		}
		return flag;
	}

	 
	 
	 
}
