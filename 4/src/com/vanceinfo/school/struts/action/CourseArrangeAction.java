package com.vanceinfo.school.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.vanceinfo.school.dao.impl.CourseArrangeImpl;
import com.vanceinfo.school.dao.impl.StudentImpl;
import com.vanceinfo.school.hibernate.pojo.CourseArrange;

public class CourseArrangeAction extends MappingDispatchAction {

	// 显示所有课程表   教师和管理员对所有课程信息都能查看，而学员只能看到自己班级的 
	public ActionForward listCourseArrange(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		CourseArrangeImpl courseArrangeCourseImpl = new CourseArrangeImpl();
		List<CourseArrange> lists = courseArrangeCourseImpl.Query_all();
		List<CourseArrange> lists1=new ArrayList<CourseArrange>();
		@SuppressWarnings("unused")
		List<CourseArrange> lists2=new ArrayList<CourseArrange>();
		if (request.getSession().getAttribute("type").equals("admin")||request.getSession().getAttribute("type").equals("teacher")) {
			request.setAttribute("courseArrangelist", lists);
		} 
//		else if(request.getSession().getAttribute("type").equals("teacher")){
//			Integer teacherId=Integer.valueOf(request.getSession().getAttribute("id").toString());
//			List<Course> listCourse=new CourseImpl().getCourse(teacherId);
//			for(int j=0;j<lists.size();j++){
//				for(int k=0;k<listCourse.size();k++){
//					if(lists.get(j).getCourseName().equals(listCourse.get(k).getName())){
//						lists2.add(lists.get(j));
//					}
//				}
//			}
//			request.setAttribute("courseArrangelist", lists2);
//		}	
		
		else {
			Integer stuId = Integer.valueOf(request.getSession().getAttribute(
					"id").toString());
			String classesNo = new StudentImpl().getClassesNo(stuId);
			for(int i=0;i<lists.size();i++){
				if(lists.get(i).getClassesNo().equals(classesNo)){
					lists1.add(lists.get(i));
				}
			}
			request.setAttribute("courseArrangelist", lists1);
		}

		return mapping.findForward("list");
	}

}
