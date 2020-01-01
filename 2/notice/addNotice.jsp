<%@ page language="java" import="java.util.*" pageEncoding="gbk"
	contentType="text/html; charset=gbk"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link rel="stylesheet" href="image/style.css" type="text/css">

		<script>
function formcheck()
{
  if (regstep1.qy_name.value.length < 1)
  {
    alert("请填写区域名称！");
	document.regstep1.qy_name.focus();
    return false;
  }
 return true;
}
</script>
	</head>
	<body bgcolor=#39867b>
		<td width="910">
			<table width="100%" height="20" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td height="20" class="title_s">
						<font color="white"><b>添加公告</b>
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
			<form method="POST" action="add.do" name="regstep1"
				onsubmit="if (!formcheck()) return false;">
			<tr bgcolor="c6ebde">
				<td width="30%"   align="right">
					公告标题:
				</td>
				<td width="70%" bgcolor="c6ebde">
					<input name="title" type="text" size="25"><font color=red>&nbsp*不能为空</font>
				</td>
			
			</tr>
			
			<tr bgcolor="c6ebde">
				<td width="30%" height="26" align="right">
					公告内容:
				</td>
				<td width="70%" bgcolor="c6ebde">
					<textarea name="content" cols="50" rows="3"></textarea>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td height="26" align="right">
					<div align="center"></div>
				</td>
				<td bgcolor="c6ebde">
					<input type="submit" value="提交" name="B1">
					&nbsp;&nbsp;&nbsp;
					<input type="reset" value="取消" name="B1">
				</td>
			</tr>
		</table>
	</body>
</html>
