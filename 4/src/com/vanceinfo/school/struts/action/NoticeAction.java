package com.vanceinfo.school.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import com.vanceinfo.school.dao.impl.NoticeImpl;
import com.vanceinfo.school.hibernate.pojo.Notice;

public class NoticeAction extends MappingDispatchAction {
	// 显示所有公告
	public ActionForward listNotice(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		NoticeImpl academyService = new NoticeImpl();
		List<Notice> lists = academyService.queryAllNotice();
		request.setAttribute("noticelist", lists);
		System.out.println("迭代所有公告");
		return mapping.findForward("list");
	}

	// 添加公告
	public ActionForward addNotice(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MyForm f = (MyForm) form;
		Notice notice = new Notice();
		f.toBean(notice);
		NoticeImpl noticeImpl = new NoticeImpl();
		noticeImpl.addNotice(notice);
		System.out.println("添加公告" + notice.getContent());
		return mapping.findForward("add");
	}

	// 删除公告
	public ActionForward deleteNotice(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		NoticeImpl noticeImpl = new NoticeImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		noticeImpl.delNotice(id);
		System.out.println("删除公告的Id为：" + id);
		return mapping.findForward("delete");
	}

	// 根据传递过来的公告Id找到对应的公告对象
	public ActionForward toEditNotice(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		NoticeImpl noticeImpl = new NoticeImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		Notice notice = noticeImpl.findNotice(id);
		System.out.println(notice.getContent());
		MyForm f = new MyForm();
		f.fromBean(notice);
		request.setAttribute("noticeUpdateForm", f);
		request.getSession().setAttribute("notice", notice);
		return mapping.findForward("ok");
	}

	// 更新公告信息
	public ActionForward editNotice(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		NoticeImpl noticeImpl = new NoticeImpl();
		MyForm f = (MyForm) form;
		Notice notice = (Notice) f.toBean(request.getSession().getAttribute(
				"notice"));
		noticeImpl.updateNotice(notice);
		request.getSession().removeAttribute("notice");
		System.out.println("更新公告:" + notice.getContent());
		return mapping.findForward("edit");
	}

}
