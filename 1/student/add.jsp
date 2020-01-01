<%@ page language="java" pageEncoding="gbk"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>add.jsp</title>

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
					<font color="white"><b>添加学生</b> </font>
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
		 
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					选择班级：
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:select property="classes.id">
						<html:optionsCollection name="classes" value="id" label="name"/>
					</html:select>
					*从数据库中检索
					<br>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					专业名称：
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="name"></html:text>
					<font color=red>*不能为空</font>
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
