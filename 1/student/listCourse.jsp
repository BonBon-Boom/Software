<%@ page language="java"
	import="java.util.*,com.vanceinfo.school.dao.impl.*,com.vanceinfo.school.hibernate.pojo.*"
	pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html:html lang="true">
<head>
	<html:base />

	<title>styde.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="img/style.css" type="text/css">
	 

</head>

<body bgcolor="#39867b">
	<td width="910">
		<table width="100%" height="20" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td height="20" class="title_s">
					<font color="white"><b>学生选课</b> </font>
				</td>
			</tr>
			<tr>
				<td height="3" bgcolor="#A3BED9"></td>
			</tr>
		</table>
	</td>
	<p>
	</p>
	<table width="100%" border="0" align="center" cellpadding="3"
		cellspacing="1" bgcolor="#FFFFFF">
		<html:form action="/student/choose" method="post">

			<tr>
				<td width="30%" height="23" bgcolor="c6ebde">
					<div align="right">
						当前学生：
					</div>
				</td>
				<td width="381" bgcolor="c6ebde">
					<label>
						<font color="red"> <%
 	if (session.getAttribute("user") == null) {
 				out.println("尚未");
 			} else
 				session.setAttribute("user", session
 						.getAttribute("user"));
 			out.print(session.getAttribute("user"));
 %> </font>
					</label>

				</td>
			</tr>

			<tr>
				<td width="30%" height="23" bgcolor="c6ebde">
					<div align="right">
						选择课程：
					</div>
				</td>
				<td width="381" bgcolor="c6ebde">
					<label>
						<%
							CourseImpl p1 = new CourseImpl();
									List<Course> list1 = p1.Query_all();
						%>
						<option name="courseId" id="courseId">
						<%
							for (int i = 0; i < list1.size(); i++) {
						%>
						
							<input type="checkbox" id="checkbox_" name="checkbox_" checked="true"
	 
								value=<%=list1.get(i).getId()%>
>
							<% out.print(list1.get(i).getName()); %><br>
						
						<%
				 }
						%>
						</option>
					</label>

				</td>
			</tr>
	 
			<tr>
			<tr bgcolor="c6ebde">
				<td height="26" align="right">
					<div align="center"></div>
				</td>
				<td bgcolor="c6ebde">
					<html:submit>确定</html:submit>
					<html:reset>取消</html:reset>
				</td>
			</tr>

		</html:form>
	</table>


</body>
</html:html>
