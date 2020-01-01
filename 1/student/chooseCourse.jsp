<%@ page language="java"
	import="java.util.*,com.vanceinfo.school.dao.impl.*,com.vanceinfo.school.hibernate.pojo.*"
	pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
		<html:form action="/student/add" method="post">

			<tr>
				<td width="30%" height="23" bgcolor="c6ebde">
					<div align="right">
						学&nbsp&nbsp&nbsp&nbsp生：
					</div>
				</td>
				<td width="381" bgcolor="c6ebde">
					<label>
						<select name="student.class">
							<%
								StudentImpl p = new StudentImpl();
										List<Student> list = p.queryAll();
							%>
							<%
								for (int i = 0; i < list.size(); i++) {
							%>
							<option>
								<%
									out.print(list.get(i).getName());
								%>
							</option>
							<%
								}
							%>

						</select>
					</label>
					&nbsp&nbsp*从数据库中检索
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
						<select name="student.class">
							<%
								CourseImpl p1 = new CourseImpl();
							    List<Course> list1 = p1.Query_all();
							%>
							<%
								for (int i = 0; i < list1.size(); i++) {
							%>
							<option>
								<%
									out.print(list1.get(i).getName());
								%>
							</option>
							<%
								}
							%>

						</select>
					</label>
					&nbsp&nbsp*从数据库中检索
				</td>
			</tr>
	       




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
