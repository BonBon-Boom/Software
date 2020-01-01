package com.vanceinfo.school.struts.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction; 
import com.vanceinfo.school.dao.impl.ClassesImpl;  
import com.vanceinfo.school.dao.impl.ProfessionsImpl;
import com.vanceinfo.school.hibernate.pojo.Classes;  
import com.vanceinfo.school.hibernate.pojo.Professions;
public class ClassesAction extends MappingDispatchAction {

	// 显示所有班级
	public ActionForward listClasses(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
 		List<Classes> lists = new ClassesImpl().queryAllClasses();
 		request.setAttribute("classeslist", lists);
		return mapping.findForward("list");
	}
	
	
	// 添加班级
	public ActionForward addClasses(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception { 
		MyForm f = (MyForm) form;
		Classes  classes = new Classes();
		f.toBean(classes);
		ClassesImpl classesImpl = new ClassesImpl();
	    classesImpl.addClasses(classes); 
		return mapping.findForward("add");
	}
	
	public ActionForward toAdd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ProfessionsImpl professionsImpl=new ProfessionsImpl();
		List<Professions> proList=professionsImpl.Query_all();
		request.setAttribute("professions", proList);
		return mapping.findForward("ok");
	}

	//删除班级
	public ActionForward deleteClasses(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Integer id= Integer.valueOf(request.getParameter("id"));
		new ClassesImpl().del(id);
		return mapping.findForward("delete");
	}
	

}
