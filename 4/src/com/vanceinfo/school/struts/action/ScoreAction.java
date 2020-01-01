package com.vanceinfo.school.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import org.hibernate.Session;

import com.vanceinfo.school.dao.impl.AdminImpl;
import com.vanceinfo.school.dao.impl.CourseImpl;
import com.vanceinfo.school.dao.impl.ScoreImpl;
import com.vanceinfo.school.dao.impl.TeacherImpl;
import com.vanceinfo.school.hibernate.pojo.Course;
import com.vanceinfo.school.hibernate.pojo.Score;
import com.vanceinfo.school.hibernate.pojo.Student;
import com.vanceinfo.school.hibernate.pojo.Teacher;
import com.vanceinfo.school.untils.HibernateUtils;

public class ScoreAction extends MappingDispatchAction {

	// 显示所有  老师用来查询所有学生学科成绩
	public ActionForward listScore(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ScoreImpl scoreImpl = new ScoreImpl();
		List<Score> lists = scoreImpl.Query_all();
		List<Score> lists1=new ArrayList<Score>();
		if (request.getSession().getAttribute("type").equals("admin")) {
			request.setAttribute("scorelist", lists);
		} else if(request.getSession().getAttribute("type").equals("teacher")){
			Integer teacherId=Integer.valueOf(request.getSession().getAttribute("id").toString());
			List<Course> listCourse=new CourseImpl().getCourse(teacherId);
			for(int i=0;i<lists.size();i++){
				for(int j=0;j<listCourse.size();j++){
					if(listCourse.get(j).getId()==lists.get(i).getCourse().getId()){
						lists1.add(lists.get(i));
					}
				}
			}
			request.setAttribute("scorelist", lists1);
		}
		return mapping.findForward("list");
	}
	
	
	//显示个人  学员用来查看自己选择的课程当前老师的审核状态
	public ActionForward listSelfScore1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("test99:"
				+ request.getSession().getAttribute("id"));
		ScoreImpl scoreImpl = new ScoreImpl();
		List<Score> lists = scoreImpl.Query_all();
		List<Score> lists1=new ArrayList<Score>();
		for(int i=0;i<lists.size();i++){
			if(request.getSession().getAttribute("id").equals(lists.get(i).getStudent().getId())){
				lists1.add(lists.get(i));
			}
		}
		request.setAttribute("scorelist1", lists1);
		System.out.println("迭代成绩表");
		return mapping.findForward("listSelf1");
	}

	
	

	//显示个人  学员用来查看自己选择的课程的得分
	public ActionForward listSelfScore(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("test99:"
				+ request.getSession().getAttribute("id"));
		ScoreImpl scoreImpl = new ScoreImpl();
		List<Score> lists = scoreImpl.Query_all();
		List<Score> lists1=new ArrayList<Score>();
		for(int i=0;i<lists.size();i++){
			if(request.getSession().getAttribute("id").equals(lists.get(i).getStudent().getId())&&(lists.get(i).getState()==1)){
				lists1.add(lists.get(i));
			}
		}
		request.setAttribute("scorelist", lists1);
		System.out.println("迭代成绩表");
		return mapping.findForward("listSelf");
	}

	//老师对学生选课进行审核
	public ActionForward shenhe(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
        Integer stuId=Integer.valueOf(request.getParameter("stuId"));
        Integer courseId=Integer.valueOf(request.getParameter("courseId"));
        int state=Integer.valueOf(request.getParameter("state")).intValue();
        System.out.println("stuId:"+stuId+" courseId:"+courseId+" state:"+state);
        Session session = HibernateUtils.getSession();
        try {
			session.beginTransaction();
			session.flush();
			Course course = (Course) session.get(Course.class, courseId);
	        Student student = (Student) session.get(Student.class, stuId);
	        Score score=new Score();
	        score.setCourse(course);
	        score.setStudent(student);
	        if(state==1){
	        	score.setState(-1);
	        }else{
	        	score.setState(1);
	        }
	        score.setScore(-1);
	        session.merge(score);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
		return mapping.findForward("shenhe");
	}

	//老师对学员的课程进行评分
	public ActionForward pinfen(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ScoreImpl scoreImpl = new ScoreImpl();
		List<Score> lists = scoreImpl.Query_all();
		List<Score> lists1=new ArrayList<Score>();
		//保证只有针对已经审核通过的课程才能进行打分
		for(int i=0;i<lists.size();i++){
			if(lists.get(i).getState()==1){
				if (request.getSession().getAttribute("type").equals("admin")){
				  lists1.add(lists.get(i));}
				else if(request.getSession().getAttribute("type").equals("teacher")&&lists.get(i).getState()!=0){
					Integer teacherId=Integer.valueOf(request.getSession().getAttribute("id").toString());
					List<Course> listCourse=new CourseImpl().getCourse(teacherId);
						for(int k=0;k<listCourse.size();k++){
							if(lists.get(i).getCourse().getId()==listCourse.get(k).getId()){
								lists1.add(lists.get(i));
							}
					}
				}
			}
		}
		request.setAttribute("scorelist", lists1);
		return mapping.findForward("pinfen");
	}
	
	
	//学员查看老师给自己的评分
	public ActionForward pinfen1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ScoreImpl scoreImpl = new ScoreImpl();
		List<Score> lists = scoreImpl.Query_all();
		List<Score> lists1=new ArrayList<Score>();
		//保证只有针对已经审核通过的课程才能进行打分
		for(int i=0;i<lists.size();i++){
			if(request.getSession().getAttribute("id").equals(lists.get(i).getStudent().getId())&&(lists.get(i).getState()==2)&&(lists.get(i).getScore()!=-1)){
				lists1.add(lists.get(i));
			}
		}
		request.setAttribute("scorelist1", lists1);
		return mapping.findForward("pinfen1");
	}
	
	
	
	// 根据传递过来的教师Id找到对应的教师对象
	public ActionForward toEdit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		@SuppressWarnings("unused")
		ScoreImpl teacherImpl = new ScoreImpl();
		Integer stuId = Integer.valueOf(request.getParameter("stuId").toString());
	 	Integer courseId=Integer.valueOf(request.getParameter("courseId"));
	 	Integer state=Integer.valueOf(request.getParameter("state"));
	 	Integer score=Integer.valueOf(request.getParameter("score"));
		System.out.println("stuId::"+stuId+" courseId::"+courseId+" state::"+state+" score::"+score);
		Score  score1=new ScoreImpl().getScore(stuId, courseId, state, score);
 		MyForm f = new MyForm();
 		f.fromBean(score1);
 		request.setAttribute("scoreUpdateForm", f);
 		request.getSession().setAttribute("score", score1);
		return mapping.findForward("ok");
	}
	//签名确认成绩！
	public ActionForward toConfirmScore(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		@SuppressWarnings("unused")
		AdminImpl adminImpl = new AdminImpl();
		if(adminImpl.findAdmin(1).getPublicKey()==null||adminImpl.findAdmin(1).getPublicKey().length()<3)
		{
			request.setAttribute("errorMsg", "对不去管理员还没用生成CA公钥，请联系管理员。");
			return mapping.findForward("error");
			
		}else{
			Integer stuId = Integer.valueOf(request.getParameter("stuId").toString());
		 	Integer courseId=Integer.valueOf(request.getParameter("courseId"));
		 	Integer state=Integer.valueOf(request.getParameter("state"));
		 	Integer score=Integer.valueOf(request.getParameter("score"));
			System.out.println("stuId::"+stuId+" courseId::"+courseId+" state::"+state+" score::"+score);
			Score  score1=new ScoreImpl().getScore(stuId, courseId, state, score);
			
			
	 		MyForm f = new MyForm();
	 		f.fromBean(score1);
	 		f.set("publicCAKey", adminImpl.findAdmin(1).getPublicKey());
	 		request.setAttribute("scoreUpdateForm", f);
	 		request.getSession().setAttribute("score", score1);
			return mapping.findForward("ok");
		}
	}
	
	public ActionForward confirmScore(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
        System.out.println("admin123:"+request.getParameter("enScore"));
        String enScore=request.getParameter("enScore");
        String enCodeP_key=request.getParameter("enCodeP_key");
        
        Session session = HibernateUtils.getSession();
        Score score=(Score)request.getSession().getAttribute("score");
        Course course=score.getCourse();
        Teacher teacher=course.getTeacher();
        TeacherImpl timpl=new TeacherImpl();
        try {
        	if(enScore.length()<10||enCodeP_key.length()<10)
        		throw new Exception("加密成绩或加密公钥出错！");
			session.beginTransaction();
			session.flush();
			score.setState(0);
			score.setEnScore(enScore);
			teacher.setEnCodeP_key(enCodeP_key);
			teacher.setIsDeCode(1);
			timpl.updateTeacher(teacher);
			course.setTeacher(teacher);
			
			session.merge(score);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
        request.getSession().removeAttribute("score");
		return mapping.findForward("edit");
	}
	//给学员评分 
	public ActionForward editScore(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
        System.out.println("admin123:"+request.getParameter("score"));
        Session session = HibernateUtils.getSession();
        Score score=(Score)request.getSession().getAttribute("score");
        try {
			session.beginTransaction();
			session.flush();
			score.setScore(Integer.valueOf(request.getParameter("score")));
			session.merge(score);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
        
        
        
      
		request.getSession().removeAttribute("score");
		return mapping.findForward("edit");
	}
	
	
	
	
	
	// 更新学员信息
	public ActionForward editTeacher(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		TeacherImpl teacherImpl = new TeacherImpl();
		MyForm f = (MyForm) form;
		Teacher teacher = (Teacher) f.toBean(request.getSession().getAttribute(
				"teacher"));
		teacherImpl.updateTeacher(teacher);
		request.getSession().removeAttribute("teacher");
		return mapping.findForward("edit");
	}
	
	
	
	
	
}
