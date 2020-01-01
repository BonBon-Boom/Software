<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link rel="stylesheet" href="image/style.css" type="text/css">

		<script> 
</script>
	</head>
	<body bgcolor="#39867b">
		<td width="910">
			<table width="100%" height="20" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td height="20" class="title_s">
						<font color="white"><b>添加管理员</b>
						</font>
					</td>
				</tr>
				<tr>
					<td height="3" bgcolor="#A3BED9"></td>
				</tr> 
			</table>
		</td>

        <p><p>
		<table width="100%" border="0" align="center" cellpadding="3"
			cellspacing="1" bgcolor="#FFFFFF">
			<form method="POST" action="add.do" >
				 
			<tr bgcolor="c6ebde">
				<td width="30%" height="26" align="right">
					用户名：
				</td>
				<td width="" bgcolor="c6ebde">
					<input name="name" type="text" size="25">&nbsp<font color=red>*不能为空</font>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width=" " height="26" align="right">
					密&nbsp&nbsp码：
				</td>
				<td width=" " bgcolor="c6ebde">
					<input name="psw" type="password" size="27">
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td height="26" align="right">
					<div align="center"></div>
				</td>
				<td bgcolor="c6ebde">
					<input type="submit" value="提交" name="B1">&nbsp;&nbsp;&nbsp;
					<input type="reset" value="取消" name="B1">
				</td>
			</tr>
		</table>
	</body>
</html>
