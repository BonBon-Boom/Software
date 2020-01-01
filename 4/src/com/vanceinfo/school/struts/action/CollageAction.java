package com.vanceinfo.school.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import com.vanceinfo.school.dao.impl.CollageImpl;
import com.vanceinfo.school.hibernate.pojo.Collage;

public class CollageAction extends MappingDispatchAction {
	// 显示所有学院
	public ActionForward listCollage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CollageImpl academyService = new CollageImpl();
		List<Collage> lists = academyService.queryAllCollage();
		request.setAttribute("collagelist", lists);
		System.out.println("迭代所有学院");
		return mapping.findForward("list");
	}

	// 添加学院
	public ActionForward addCollage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MyForm f = (MyForm) form;
		Collage collage = new Collage();
		f.toBean(collage);
		CollageImpl collageImpl = new CollageImpl();
		collageImpl.addCollage(collage);
		System.out.println("添加学院" + collage.getName());
		return mapping.findForward("add");
	}

	// 删除学院
	public ActionForward deleteCollage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CollageImpl collageImpl = new CollageImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		collageImpl.delCollage(id);
		System.out.println("删除学院的Id为：" + id);
		return mapping.findForward("delete");
	}

	// 根据传递过来的学院Id找到对应的学院对象
	public ActionForward toEditCollage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		CollageImpl collageImpl = new CollageImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		Collage collage = collageImpl.findCollage(id);
		System.out.println(collage.getName());
		MyForm f = new MyForm();
		f.fromBean(collage);
		request.setAttribute("collageUpdateForm", f);
		request.getSession().setAttribute("collage", collage);
		return mapping.findForward("ok");
	}

	// 更新学院信息
	public ActionForward editCollage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		CollageImpl collageImpl = new CollageImpl();
		MyForm f = (MyForm) form;
		Collage collage = (Collage) f.toBean(request.getSession().getAttribute(
				"collage"));
		collageImpl.updateCollage(collage);
		request.getSession().removeAttribute("collage");
		System.out.println("更新学院:" + collage.getName());
		return mapping.findForward("edit");
	}

}
