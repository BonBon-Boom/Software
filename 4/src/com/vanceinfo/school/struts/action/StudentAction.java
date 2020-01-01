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

import com.vanceinfo.school.dao.impl.*;
import com.vanceinfo.school.hibernate.pojo.*;
import com.vanceinfo.school.untils.HibernateUtils;

public class StudentAction extends MappingDispatchAction {

	// 显示所有学生
	public ActionForward listStudent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		StudentImpl studentImpl = new StudentImpl();
		List<Student> lists = studentImpl.queryAll();
		request.setAttribute("studentlist", lists);
		System.out.println("迭代所有学生");
		return mapping.findForward("list");
	}

	// 学生修改密码
	@SuppressWarnings("unchecked")
	public ActionForward changePsw(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		StudentImpl studentImpl = new StudentImpl();
		List<Student> lists = studentImpl.queryAll();
		List list2 = new ArrayList();
		for (int i = 0; i < lists.size(); i++) {

			if ((lists.get(i).getStudentNo().trim().toString()).equals(request
					.getSession().getAttribute("studentNo").toString().trim())) {
				list2.add(lists.get(i));
			}
		}
		request.setAttribute("changePsw", list2);
		return mapping.findForward("changePsw");
	}

	
	// 添加学生
	public ActionForward addStudent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MyForm f = (MyForm) form;
		Student student = new Student();
		f.toBean(student);
		StudentImpl studentImpl = new StudentImpl();
		studentImpl.addStudent(student);
		return mapping.findForward("add");
	}

	public ActionForward toAdd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ClassesImpl classesImpl = new ClassesImpl();
		List<Classes> classes = classesImpl.queryAllClasses();
		request.setAttribute("classes", classes);
		return mapping.findForward("ok");
	}

	// 根据传递过来的学生Id找到对应的管理员对象
	public ActionForward toEdit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		StudentImpl adminImpl = new StudentImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		Student student = adminImpl.findStudent(id);
		System.out.println(student.getName());
		MyForm f = new MyForm();
		f.fromBean(student);
		request.setAttribute("studentUpdateForm", f);
		request.getSession().setAttribute("student", student);
		return mapping.findForward("ok");
	}

	// 更新学员信息
	public ActionForward editStudent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		StudentImpl adminImpl = new StudentImpl();
		MyForm f = (MyForm) form;
		Student student = (Student) f.toBean(request.getSession().getAttribute(
				"student"));
		adminImpl.updateStudent(student);
		request.getSession().removeAttribute("student");
		System.out.println("更新学员:" + student.getName());
		return mapping.findForward("edit");
	}

	

	// 学生选课
	public ActionForward choose(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String str[] = request.getParameterValues("checkbox_");
		System.out.println("*********str:" + str);
		Integer stuId = Integer.valueOf(request.getSession().getAttribute("id")
				.toString());
		Session session = HibernateUtils.getSession();
		ScoreImpl impl = new ScoreImpl();
		impl.delCourse(stuId);    //在学员选课之前,先将该学员的所有选课记录去掉
		try {
			session.beginTransaction();

			Student student = (Student) session.get(Student.class, stuId); // 为学生选课
			//request.getSession().setAttribute("stuId", stuId); // 保存学生id供查询个人成绩
			Score score1;
			for (int i = 0; i < str.length; i++) {
				System.out.println("str:" + str[i]);
				Integer courseId = Integer.valueOf(str[i].toString());
				Course course1 = (Course) session.get(Course.class, courseId);
				score1 = new Score();
				score1.setStudent(student);
				score1.setCourse(course1);
				score1.setScore(-1);
				score1.setState(-1);
				session.save("" + i, score1);
				System.out.println("*********str:" + str + course1.getName());
			}

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			//HibernateUtils.closeSession(session);
		}

		return mapping.findForward("choose");
	}
	
	
	//删除学生
	public ActionForward deleteStudent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Integer id= Integer.valueOf(request.getParameter("id"));
		Student student=new StudentImpl().findStudent(id);
		@SuppressWarnings("unused")
		boolean flag= new StudentImpl().delStudent(student);
		return mapping.findForward("delete");
	}

	//更新个人资料
	// 根据传递过来的学生Id找到对应的对象
	public ActionForward toEdit1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		StudentImpl adminImpl = new StudentImpl();
		String getId = request.getParameter("id");
		int id = Integer.parseInt(getId);
		Student student = adminImpl.findStudent(id);
		System.out.println(student.getName());
		MyForm f = new MyForm();
		f.fromBean(student);
		request.setAttribute("studentUpdateForm1", f);
		request.getSession().setAttribute("student", student);
		return mapping.findForward("ok1");
	}

	// 更新学员信息
	public ActionForward editStudent1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
        String classesNo=request.getParameter("classesNo").toString();
        List<Classes> lists = new ClassesImpl().queryAllClasses();
		Integer classesId=0;
		for(int i=0;i<lists.size();i++){
			if(lists.get(i).getClassesNo().equals(classesNo)){
				System.out.println("班级Id为"+lists.get(i).getId());
				classesId=lists.get(i).getId();
			}
		}
        
		StudentImpl adminImpl = new StudentImpl();
		MyForm f = (MyForm) form;
		Student student = (Student) f.toBean(request.getSession().getAttribute(
				"student"));
		student.setClasses(new ClassesImpl().findClasses(Integer.valueOf(classesId).intValue()));
		adminImpl.updateStudent(student);
		request.getSession().removeAttribute("student");
		return mapping.findForward("edit1");
	}
	
	
	
	
}
