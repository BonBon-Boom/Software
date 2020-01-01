<%@ page language="java" import="java.util.*,com.vanceinfo.school.dao.impl.*,com.vanceinfo.school.hibernate.pojo.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <script type="text/javascript" src="./js/ext/adapter/ext/ext-base.js">
        </script>
		<script type="text/javascript" src="./js/ext/ext-all.js">
        </script>
		<script type="text/javascript"
			src="./js/ext/build/locale/ext-lang-zh_CN-min.js">
        </script>
		<link rel="stylesheet" type="text/css"
			href="./js/ext/resources/css/ext-all.css" />

  </head>
  
  <body>
   <marquee direction="up" height="100"  onmouseout="this.start()"
			onmouseover="this.stop()" scrollAmount="1" scrollDelay="1">
			<%NoticeImpl p = new NoticeImpl();
									List<Notice> list = p.queryAllNotice();
									list.get(list.size()-1).getTitle();
									
								%>
								<font color="#9966FF"><%out.print(list.get(list.size()-1).getTitle()); %>：</font><br>
								<%out.print(list.get(list.size()-1).getContent());%>
			
		</marquee>
  </body>
</html>
