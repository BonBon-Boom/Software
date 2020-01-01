<%@ page language="java" import="java.util.*" pageEncoding="gbk"
	contentType="text/html; charset=gbk"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gbk">
	<link rel="stylesheet" href="image/style.css" type="text/css">

	<script>
 
</script>
</head>
<body bgcolor=#39867b>

	<td width="910">
			<table width="100%" height="20" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td height="20" class="title_s">
						<font color="white"><b>管理员CA生成</b>
						</font>
					</td>
				</tr>
				<tr>
					<td height="20" class="title_s">
						<font color=pink size=2>请您先下载插件，<a href="<%=basePath %>\do_download.jsp?filename=RSA_Admin.jar&filepath=plugin">点击下载</a> 
						然后使用插件生成CA公钥，并填入以下文本框，私钥保存。</font>
					</td>
				</tr>
				<tr>
					<td height="3" bgcolor="#A3BED9"></td>
				</tr> 
			</table>
		</td>

        <p><p>
	<html:form action="/admin/createCA" method="post">
		<table width="100%" border="0" align="center" cellpadding="3"
			cellspacing="1" bgcolor="#FFFFFF">

 
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="center">CA公钥 
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="publicKey"  value="" ></html:text>
					<font color='red'>请您确认无误后再提交</font>
				</td>
				
			</tr>
			<tr bgcolor="c6ebde">
				<td height="26" align="right">
					<div align="center"></div>
				</td>
				<td bgcolor="c6ebde">
					<html:submit>确定修改</html:submit>
					&nbsp;&nbsp;&nbsp;
				</td>
			</tr>
		</table>
	</html:form>
</body>
</html:html>
