<%@ page language="java" import="java.util.*,com.vanceinfo.school.dao.impl.*,com.vanceinfo.school.hibernate.pojo.*" pageEncoding="gbk"
	contentType="text/html; charset=gbk"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<meta http-equiv="cache-control" content="no-cache" />
		<link rel="stylesheet" href="img/style.css" type="text/css">
		<script language="JavaScript">
<!--
function formcheck()
{
if( form1.NewPassword.value =="" ) {
alert("\������������ !!")
document.form1.NewPassword.focus();
return false;
}
if( form1.ReNewPassword.value =="" ) {
alert("\������ȷ������ !!")
document.form1.ReNewPassword.focus();
return false;
}
if( form1.NewPassword.value != form1.ReNewPassword.value ) {
alert("\�����������벻һ�� !!")
document.form1.NewPassword.value="";
document.form1.ReNewPassword.value="";
document.form1.NewPassword.focus();
return false;
}
return (true);
}
// -->

</script>
	</head>
	<body bgcolor=#39867b>

		<td width="910">
			<table width="100%" height="20" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td height="20" class="title_s">
						<font color="white"><b>�α����</b> </font>
					</td>
				</tr>
				<tr>
					<td height="3" bgcolor="#A3BED9"></td>
				</tr>
			</table>
		</td>
		<form name="form1" method="post"
			action="addCourseArrange.do" />
			<table width="100%" border="0" align="center" cellpadding="3"
				cellspacing="1" bgcolor="#FFFFFF">

				 

				<tr>
					<td width="30%" height="23" bgcolor="c6ebde">
						<div align="right">
							�Ͽΰ༶��
						</div>
					</td>
					<td width="381" bgcolor="c6ebde">
						<label>
							<select name="classesNo">
							
								<%
									ClassesImpl p = new ClassesImpl();
									List<Classes> list = p.queryAllClasses();
								%>
								<%
									for (int i = 0; i < list.size(); i++) {
								%>
								<option>
									<%
									     
										out.print(list.get(i).getClassesNo());
									%>
								</option>
								<%
									}
								%>

							</select>
						</label>&nbsp&nbsp*�����ݿ��м���
					</td>
				</tr>
				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							�Ͽ����ڣ�
						</div>
					</td>
					<td bgcolor="c6ebde">
						<input name="dateTime" type="text" size="24" id="dateTime"
							readonly>
						<script src="../SelectDate/calendar.js"></script>
						<a
							onClick="fPopUpDlg('../SelectDate/calendar.htm',document.all.dateTime, 'winpop', 172, 210);"><img
								src="../SelectDate/datetime.gif" border=0 width="16" height="16"
								style="cursor: hand"> </a>
					</td>
				</tr>
				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							�Ͽ�ʱ�䣺
						</div>
					</td>
					
					<td bgcolor="c6ebde">
						<label>
							<select name="banci">
					
								<option>
									��һ��(8:00-10:00)
								</option>
								<option>
									�ڶ���(10:20-12:00)
								</option>
								<option>
									������(12:00-16:00)
								</option>
								<option>
									���Ľ�(16:20-18:00)
								</option>
							</select>
						</label>
					</td>
				</tr>
					<tr>
				<td width="30%" height="23" bgcolor="c6ebde">
					<div align="right">
						ѡ��γ̣�
					</div>
				</td>
				<td width="381" height="23" bgcolor="c6ebde">
					<label>
					<select name="courseName">
					
						<%
							CourseImpl p1 = new CourseImpl();
									List<Course> list1 = p1.Query_all();
						%>
						
						<%
							for (int i = 0; i < list1.size(); i++) {
						%>
						
						 <option name="courseName" id="courseName">
 
							<%
							 
							 out.print(list1.get(i).getName()); %><br>
						<%
				 }
						%>
						</option>
						</select>
					</label>
				</td>
			</tr>

				<tr>
					<td bgcolor="c6ebde">
						<div align="right">
							��&nbsp;&nbsp;&nbsp;&nbsp;ע��
						</div>
					</td>
					<td bgcolor="c6ebde">
						<textarea name="content" cols="34" rows="3"></textarea>
					</td>
				</tr>
				<tr>
					<td height="26" bgcolor="c6ebde">
						&nbsp;
					</td>
					<td height="26" bgcolor="c6ebde">
						<input type="submit" value="�ύ" name="B1" class=input>
						<input type="reset" name="Submit" value="����">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
