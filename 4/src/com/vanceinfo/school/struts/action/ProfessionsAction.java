package com.vanceinfo.school.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction; 
import com.vanceinfo.school.dao.impl.*;
import com.vanceinfo.school.hibernate.pojo.*;

public class ProfessionsAction extends MappingDispatchAction {

	// 显示所有专业
	public ActionForward listProfessions(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ProfessionsImpl professionsImpl = new ProfessionsImpl();
		List<Professions> lists = professionsImpl.Query_all();
		System.out.println(lists.size());
		for(int i=0;i<lists.size();i++){
			//System.out.println(lists.get(i).getCollage().getName());
		}
		System.out.println();
		request.setAttribute("professionslist", lists);
		System.out.println("迭代所有专业");
		// System.out.printlsts.get(0).getCollage().getName());
		return mapping.findForward("list");
	}

	// 添加专业
	public ActionForward addProfessions(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MyForm f = (MyForm) form;
		Professions professions = new Professions();
		f.toBean(professions);
		ProfessionsImpl professionsImpl = new ProfessionsImpl();
	    professionsImpl.Add(professions);
		System.out.println(professions.getId());
		System.out.println(professions.getName());
		System.out.println(professions.getCollage().getName());
		return mapping.findForward("add");
	}
	
	public ActionForward toAdd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CollageImpl collageImpl=new CollageImpl();
		List<Collage> collages=collageImpl.queryAllCollage();
		request.setAttribute("collages", collages);
		return mapping.findForward("ok");
	}
	
	//删除专业
	public ActionForward deleteProfessions(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Integer id= Integer.valueOf(request.getParameter("id"));
		new ProfessionsImpl().del(id);
		return mapping.findForward("delete");
	}
	

}
