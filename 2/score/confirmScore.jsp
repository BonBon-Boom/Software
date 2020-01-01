<%@ page language="java" import="java.util.*" pageEncoding="gbk"
	contentType="text/html; charset=gbk"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
						<font color="white"><b>对学员进行评分</b>
						</font>
					</td>
				</tr>
				<tr>
					<td height="20" class="title_s">
						<font color=pink size=2>请您先下载插件，<a href="<%=basePath %>\do_download.jsp?filename=RSA_Teacher.jar&filepath=plugin">点击下载</a>
						然后使用插件对分数及教师公钥加密，并填入以下文本框</font>
					</td>
				</tr>
				<tr>
					<td height="3" bgcolor="#A3BED9"></td>
				</tr> 
			</table>
		</td>

        <p><p>
	<html:form action="/score/confirmScore" method="post">
		<table width="100%" border="0" align="center" cellpadding="3"
			cellspacing="1" bgcolor="#FFFFFF">
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="center"> 
					分数 
				</td>
				
				<td width="71%" bgcolor="c6ebde">
					<html:text property="score" disabled="true"></html:text>
					<font color='red'>请复制此成绩使用插件加密</font>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="center"> 
					加密分数 
				</td>
				
				<td width="71%" bgcolor="c6ebde">
					<input type="text" name="enScore" />
					<%--<html:text property="enScore" value=""></html:text>--%>
					<font color='red'>加密后分数填入</font>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="center">
					CA公钥
				</td>
				<td width="71%" bgcolor="c6ebde">
					
					<html:text property="publicCAKey" disabled="true"></html:text>
					<font color='red'>复制此文本框内容对公钥加密</font>
				</td>
			</tr>
			
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="center">
					密文教师公钥
				</td>
				<td width="71%" bgcolor="c6ebde">
					<input type="text" name="enCodeP_key" />
					<%--<html:text property="enCodeP_key"></html:text>--%>
					<font color='red'>加密后公钥填入</font>
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
