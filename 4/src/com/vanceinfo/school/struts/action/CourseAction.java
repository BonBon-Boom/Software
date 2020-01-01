package com.vanceinfo.school.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import org.hibernate.Session;
import com.vanceinfo.school.dao.impl.CourseArrangeImpl;
import com.vanceinfo.school.dao.impl.CourseImpl;
import com.vanceinfo.school.dao.impl.TeacherImpl;
import com.vanceinfo.school.hibernate.pojo.Course;
import com.vanceinfo.school.hibernate.pojo.CourseArrange;
import com.vanceinfo.school.hibernate.pojo.Teacher;
import com.vanceinfo.school.untils.HibernateUtils;

public class CourseAction extends MappingDispatchAction {
	// 显示所有课程
	public ActionForward listCourse(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CourseImpl courseImpl = new CourseImpl();
		List<Course> lists = courseImpl.Query_all();
		request.setAttribute("courselist", lists);
		System.out.println("迭代所有课程");
		return mapping.findForward("list");
	}

	// 添加课程
	public ActionForward addCourse(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MyForm f = (MyForm) form;
		Course course = new Course();
		f.toBean(course);
		CourseImpl courseImpl = new CourseImpl();
		courseImpl.addCourse(course);
		return mapping.findForward("add");
	}

	public ActionForward toAdd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TeacherImpl teacherImpl = new TeacherImpl();
		List<Teacher> teachers = teacherImpl.queryAllTeacher();
		request.setAttribute("teachers", teachers);
		return mapping.findForward("ok");
	}
	
	
	
	// 安排课程表
	public ActionForward addCourseArrange(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
 
		String classesNo=request.getParameter("classesNo");
		String courseName=request.getParameter("courseName");
		String dateTime=request.getParameter("dateTime").toString();
		String banci=request.getParameter("banci");
		String content=request.getParameter("content");
		//System.out.println("classesNo::"+classesNo+" courseName::"+courseName+" dateTime::"+dateTime+" banci::"+banci+" content::"+content);
		Session session = HibernateUtils.getSession();
		CourseArrange courseArrange = null;
		try {
			session.beginTransaction();
			courseArrange = new CourseArrange();
			courseArrange.setClassesNo(classesNo);
			courseArrange.setCourseName(courseName);
			courseArrange.setDateTime(dateTime);
			courseArrange.setBanci(banci);
			courseArrange.setContent(content);
			session.save(courseArrange);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
		return mapping.findForward("addCourseArrange");
	}
	

	// 修改课程表
	public ActionForward toEdit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
        System.out.println("ID::"+request.getParameter("id"));
        
		CourseArrange courseArrange=new CourseArrangeImpl().getCourseArrange(Integer.valueOf(request.getParameter("id")));
		request.getSession().setAttribute("courseArrangeId", request.getParameter("id"));
		request.getSession().setAttribute("classesNo", courseArrange.getClassesNo());
		request.getSession().setAttribute("dateTime", courseArrange.getDateTime());
		request.getSession().setAttribute("banci", courseArrange.getBanci());
		request.getSession().setAttribute("dateTime", courseArrange.getDateTime());
		request.getSession().setAttribute("courseName", courseArrange.getCourseName());
		request.getSession().setAttribute("content", courseArrange.getContent());
		return mapping.findForward("toEdit");
	}

	// 更新课表
	public ActionForward editCourseArrange(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String classesNo=request.getParameter("classesNo");
		String courseName=request.getParameter("courseName");
		String dateTime=request.getParameter("dateTime").toString();
		String banci=request.getParameter("banci");
		String content=request.getParameter("content");
		System.out.println("classesNo::"+classesNo+" courseName::"+courseName+" dateTime::"+dateTime+" banci::"+banci+" content::"+content);
		Session session = HibernateUtils.getSession();
		CourseArrange courseArrange=new CourseArrangeImpl().getCourseArrange(Integer.valueOf(request.getSession().getAttribute("courseArrangeId").toString()));
		try {
			session.beginTransaction();
			courseArrange.setClassesNo(classesNo);
			courseArrange.setCourseName(courseName);
			courseArrange.setDateTime(dateTime);
			courseArrange.setBanci(banci);
			courseArrange.setContent(content);
			session.update(courseArrange);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtils.closeSession(session);
		}
		return mapping.findForward("editCourseArrange");
	}

	// 删除课程表
	public ActionForward delCourseArrange(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	    new CourseArrangeImpl().delCourseArrange(Integer.valueOf(request.getParameter("id")));
		return mapping.findForward("delCourseArrange");
	}
	
	
	//删除课程
	public ActionForward deleteCourse(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Integer id= Integer.valueOf(request.getParameter("id"));
		new CourseImpl().del(id);
		return mapping.findForward("delete");
	}
	
	
 
}
