<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>main.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#39867b">
   <h2 align="center"><B>学生成绩管理系统功能简介：</B></h2>
   &nbsp;&nbsp;该系统分三种角色：
      系统管理员、学生、老师三种角色<br>
     &nbsp;<B> 1.系统管理员：</B><br>
     &nbsp;&nbsp;&nbsp;&nbsp;a.维护好组织机构关系基础数据(如一个学院下包含多个系，一个系包含多个专业，一个专业包含多个班等)<br>
     &nbsp;&nbsp;&nbsp;&nbsp;b.将用户的资料维护到系统中(包括老师、学生用户、课程信息录入系统)，以保证用户能正常登录系统<br>
     &nbsp;&nbsp;&nbsp;&nbsp;c.根据需要随时更新公告，具有对自己用户密码重置的功能<br>
     &nbsp;&nbsp;&nbsp;&nbsp;d.能查询到所有的课程表相关信息并进行维护更新<br>
     &nbsp;&nbsp;&nbsp;&nbsp;e.能更新维护管理员、学生和老师用户的个人资料<br>
     
     <br>&nbsp;<B> 2.学生：</B><br>
     &nbsp;&nbsp;&nbsp;&nbsp;a.登录系统后查询机构组织信息(包含学院、专业、班级信息、哪门课是哪位老师上等信息的查询)<br>
     &nbsp;&nbsp;&nbsp;&nbsp;b.学生选课，之后可随时查询老师针对所选自己选的课审核情况<B><注意只能查看自己的选课考核情况></B><br>
     &nbsp;&nbsp;&nbsp;&nbsp;c.针对老师审核通过的课程，老师会针对学生的表现进行打分，学生可随时查询自己的得分情况<B><注意只能查看自己的课程信息></B><br>
     &nbsp;&nbsp;&nbsp;&nbsp;d.系统登录密码重置功能<br>
     &nbsp;&nbsp;&nbsp;&nbsp;e.能查询到所有的课程表相关信息<B><注意只能查看自己所在班级的课表></B><br>
     <br>&nbsp;<B> 3.老师：</B><br>
     &nbsp;&nbsp;&nbsp;&nbsp;a.登录系统后查询机构组织信息(包含学院、专业、班级信息、哪门课是哪位老师上等信息的查询)<br>
     &nbsp;&nbsp;&nbsp;&nbsp;b.学生选课，对所选课程进行审核<br>
     &nbsp;&nbsp;&nbsp;&nbsp;c.审核学员通过的课程，方可进行打分，能查询所有学生的选课情况和学科得分情况<br>
     &nbsp;&nbsp;&nbsp;&nbsp;d.系统登录密码重置功能<br>
     &nbsp;&nbsp;&nbsp;&nbsp;e.能查询到所有的课程表相关信息并进行更新维护<br>
   
  </body>
</html:html>
