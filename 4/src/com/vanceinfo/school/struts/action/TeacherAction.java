package com.vanceinfo.school.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction; 
import com.vanceinfo.school.dao.impl.TeacherImpl; 
import com.vanceinfo.school.hibernate.pojo.Teacher;

public class TeacherAction extends MappingDispatchAction {

	// 显示所有老师
	public ActionForward listTeacher(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TeacherImpl teacherImpl = new TeacherImpl();
		List<Teacher> lists = teacherImpl.queryAllTeacher();
		request.setAttribute("teacherlist", lists);
		return mapping.findForward("list");
	}

	// 添加老师
	public ActionForward addTeacher(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MyForm f = (MyForm) form;
		Teacher teacher = new Teacher();
		f.toBean(teacher);
		TeacherImpl teacherImpl = new TeacherImpl();
		teacherImpl.addTeacher(teacher);
		System.out.println("添加老师" + teacher.getName());
		return mapping.findForward("add");
	}

	
	// 根据传递过来的教师Id找到对应的教师对象
	public ActionForward toEdit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		TeacherImpl teacherImpl = new TeacherImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		Teacher teacher = teacherImpl.findTeacher(id);
		MyForm f = new MyForm();
		f.fromBean(teacher);
		request.setAttribute("teacherUpdateForm", f);
		request.getSession().setAttribute("teacher", teacher);
		return mapping.findForward("ok");
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
	
	
	// 老师修改修改密码
	@SuppressWarnings("unchecked")
	public ActionForward changePsw1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TeacherImpl teacherImp = new TeacherImpl();
		List<Teacher> lists = teacherImp.queryAllTeacher();
		List list2 = new ArrayList();
		for (int i = 0; i < lists.size(); i++) {

			if ((lists.get(i).getTeacherNo().trim().toString()).equals(request
					.getSession().getAttribute("teacherNo").toString().trim())) {
				list2.add(lists.get(i));
			}
		}
		request.setAttribute("changePsw1", list2);
		return mapping.findForward("changePsw1");
	}
	//删除老师
	public ActionForward deleteTeacher(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Integer id= Integer.valueOf(request.getParameter("id"));
		new TeacherImpl().del(id);
		return mapping.findForward("delete");
	}
	
	// 根据传递过来的教师Id找到对应的教师对象
	public ActionForward toEdit1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		TeacherImpl teacherImpl = new TeacherImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		Teacher teacher = teacherImpl.findTeacher(id);
		MyForm f = new MyForm();
		f.fromBean(teacher);
		request.setAttribute("teacherUpdateForm1", f);
		request.getSession().setAttribute("teacher", teacher);
		return mapping.findForward("ok1");
	}

	// 更新学员信息
	public ActionForward editTeacher1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		TeacherImpl teacherImpl = new TeacherImpl();
		MyForm f = (MyForm) form;
		Teacher teacher = (Teacher) f.toBean(request.getSession().getAttribute(
				"teacher"));
		teacherImpl.updateTeacher(teacher);
		request.getSession().removeAttribute("teacher");
		return mapping.findForward("edit1");
	}
	
	
	

}
