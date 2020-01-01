package com.vanceinfo.school.struts.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.vanceinfo.school.dao.impl.AdminImpl;
import com.vanceinfo.school.dao.impl.StudentImpl;
import com.vanceinfo.school.dao.impl.TeacherImpl;
import com.vanceinfo.school.hibernate.pojo.Admin;
import com.vanceinfo.school.hibernate.pojo.Student;
import com.vanceinfo.school.hibernate.pojo.Teacher;

public class AdminAction extends MappingDispatchAction {
	// 显示所有管理员
	public ActionForward listAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AdminImpl adminImpl = new AdminImpl();
		List<Admin> lists = adminImpl.queryAllAdmin();
		request.setAttribute("adminlist", lists);
		return mapping.findForward("list");
	}

	// 添加管理员
	public ActionForward addAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MyForm f = (MyForm) form;
		Admin admin = new Admin();
		f.toBean(admin);
		AdminImpl adminImpl = new AdminImpl();
		adminImpl.addAdmin(admin);
		return mapping.findForward("add");
	}

	// 删除管理员
	public ActionForward deleteAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AdminImpl adminImpl = new AdminImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		adminImpl.delAdmin(id);
		return mapping.findForward("delete");
	}

	// 根据传递过来的管理员Id找到对应的管理员对象
	public ActionForward toEditAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		AdminImpl adminImpl = new AdminImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		Admin admin = adminImpl.findAdmin(id);
		System.out.println(admin.getName());
		MyForm f = new MyForm();
		f.fromBean(admin);
		request.setAttribute("adminUpdateForm", f);
		request.getSession().setAttribute("admin", admin);
		return mapping.findForward("ok");
	}
	//生成CA连接
	public ActionForward toCreateCA(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		AdminImpl adminImpl = new AdminImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		Admin admin = adminImpl.findAdmin(id);
		System.out.println(admin.getName()+":"+admin.getPublicKey());
		if(admin.getPublicKey()==null||admin.getPublicKey().length()<12)
		{
			MyForm f = new MyForm();
			f.fromBean(admin);
			request.setAttribute("adminUpdateForm", f);
			request.getSession().setAttribute("admin", admin);
		  return mapping.findForward("ok");
		}else
		{
			request.setAttribute("errorMsg", "您已经生成了CA公私钥对！不能重复生成！请使用插件选择私钥对成绩解密。");
			return mapping.findForward("error");
		}
	}
	//生成CA
	public ActionForward createCA(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		AdminImpl adminImpl = new AdminImpl();
		MyForm f = (MyForm) form;
		Admin admin=(Admin)request.getSession().getAttribute("admin");
		//Admin admin = (Admin) f.toBean(a);
		
		admin.setPublicKey(request.getParameter("publicKey"));
		if(adminImpl.updateAdmin(admin))
			{
			request.setAttribute("errorMsg", "公钥已经保存，请您下载插件解密。");
			request.getSession().removeAttribute("admin");
			return mapping.findForward("error");
			}else
			{
				request.setAttribute("errorMsg", "对不去程序出现错误，请联系管理员！");
				return mapping.findForward("error");
			}
			
	}
	//显示当前管理员CA
	public ActionForward listAdminCA(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		AdminImpl adminImpl = new AdminImpl();
		
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		Admin admin = adminImpl.findAdmin(id);
		List<Admin> lists = new ArrayList<Admin>();
		lists.add(admin);
		request.setAttribute("adminCAlist", lists);
		return mapping.findForward("list");
	}
	// 更新管理员信息
	public ActionForward editAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		AdminImpl adminImpl = new AdminImpl();
		MyForm f = (MyForm) form;
		
		
		Admin admin = (Admin) f.toBean(request.getSession().getAttribute(
				"admin"));
		adminImpl.updateAdmin(admin);
		request.getSession().removeAttribute("admin");
		return mapping.findForward("edit");
	}

	// 登录验证
	public ActionForward loginCheck(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String flag = "loginFailue";
		String message="用户名或密码错误！";
		String cname = request.getParameter("UserName");
		String cpass = request.getParameter("PWD");
		String type = request.getParameter("select");
		System.out.println(type);
		System.out.println(cname);
		System.out.println(cpass);

		if (type.equals("admin")) {
			AdminImpl adminImpl = new AdminImpl();
			List<Admin> list = new ArrayList<Admin>();
			list = adminImpl.queryAllAdmin();

			for (int i = 0; i < list.size(); i++) {
				Admin info = list.get(i);
				if (cname.trim().equals(info.getName())
						&& cpass.trim().equals(info.getPsw())) {
					flag = "loginSuccess";
					request.getSession().removeAttribute("type");
					request.getSession().setAttribute("user", cname);
					request.getSession().setAttribute("id", info.getId());
					request.getSession().setAttribute("type", "admin");
					System.out.println("登录成功！");
				} else {
					PrintWriter out = response.getWriter();
					out.print("<script>alert('ok');</script>");
				}

			}
		} else if (type.equals("teacher")) {
			TeacherImpl adminImpl = new TeacherImpl();
			List<Teacher> list = new ArrayList<Teacher>();
			list = adminImpl.queryAllTeacher();

			for (int i = 0; i < list.size(); i++) {
				Teacher info = list.get(i);
				if (cname.trim().equals(info.getTeacherNo())
						&& cpass.trim().equals(info.getPsw())) {
					flag = "teacherSuccess";
					request.getSession().removeAttribute("type");
					request.getSession().setAttribute("type", "teacher");
					request.getSession().setAttribute("id", info.getId());
					request.getSession().setAttribute("user", info.getName()); // 让登录的教师用户显示的是教师的姓名，而不是用户名
					request.getSession().setAttribute("teacherNo",
							info.getTeacherNo());
					System.out.println("登录成功！");
				}

			}
		} else if (type.equals("student")) {
			StudentImpl adminImpl = new StudentImpl();
			List<Student> list = new ArrayList<Student>();
			list = adminImpl.queryAll();
			for (int i = 0; i < list.size(); i++) {
				Student info = list.get(i);
				if (cname.trim().equals(info.getStudentNo())
						&& cpass.trim().equals(info.getPsw())) {
					flag = "studentSuccess";
					request.getSession().removeAttribute("type");
					request.getSession().setAttribute("type", "student");
					request.getSession().setAttribute("id", info.getId());
					request.getSession().setAttribute("user", info.getName()); // 让登录的教师用户显示的是学生的姓名，而不是用户名
					request.getSession().setAttribute("studentNo",
							info.getStudentNo());
					System.out.println("登录成功！");
				}

			}
		}
//
//		if (flag.equals("loginFailue")) { 
//			javax.swing.JOptionPane.getRootFrame().setAlwaysOnTop(true); 
//			JOptionPane.showMessageDialog(null, "用户名或密码错误，请重新输入！", "提示",
//					JOptionPane.ERROR_MESSAGE);
//		}
		System.out.println(flag);
		request.getSession().setAttribute("message", message);
		return mapping.findForward(flag);

	}

}
