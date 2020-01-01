<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>欢迎登陆学生成绩后台管理系统<</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<script language="JavaScript">
 var msg  = "欢迎光临学生成绩管理系统，有什么问题请及时联系网站管理员Cody..." ;
var interval = 100
var subLen=0;
function Scroll() 
{
len = msg.length;
window.status = msg.substring(0, subLen);
subLen++;
	if ( subLen > len ) 
	{ 
	subLen = 1; 
	window.status = '';
	window.setTimeout("Scroll()", interval );
	}
	else
	window.setTimeout("Scroll()", interval );
} 
Scroll();
</script>
	</head>

	<FRAMESET frameSpacing=0 name=mfrRows frameBorder=0 rows="82,20,*,25">
		<FRAME noResize marginHeight=0 src="Main_banner1.jsp" frameBorder=0
			name=banner marginWidth=0 scrolling=no framspacing="0" />
		<FRAME noResize src="Main_tools.jsp" frameBorder=0 name=menu
			scrolling=no framspacing="0" />
		<FRAMESET name=mfr cols="180,*">
			<FRAME noResize src="leftLink.jsp" frameBorder=0 name=frmMenu
				scrolling="auto" target="frmMain" framspacing="0" />
			<FRAME src="main.jsp" frameBorder=0 name="right" scrolling="auto"
				framspacing="0" />
		</FRAMESET>
		<FRAME noResize src="foot.jsp" frameBorder=0 name=frmFoot scrolling=no
			framspacing="0" />
		<NOFRAMES></NOFRAMES>
	</FRAMESET>
</html>
