<%@ taglib uri="http://www.extremecomponents.org" prefix="ec"%>
<%@ page language="java"
	import="java.util.*,com.vanceinfo.school.hibernate.pojo.*"
	pageEncoding="gbk"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.extremecomponents.org" prefix="ec"%>
<html>

	<head>
		<title>eXtremeTest</title>
		<link rel="stylesheet" type="text/css"
			href="/css/extremecomponents.css">
		<style type="text/css">
.eXtremeTable {
	margin: 0;
	padding: 0;
}

.eXtremeTable select {
	font-family: Verdana;
	font-size: 9px;
	border: solid 1px #EEE;
	width: 75px;
}

.eXtremeTable .tableRegion {
	border: 1px solid silver;
	padding: 2px;
	font-family: Verdana;
	font-size: 10px;
	margin-top: 7px;
}

.eXtremeTable .filter {
	background-color: #efefef;
}

.eXtremeTable .filter input {
	font-family: Verdana;
	font-size: 13px;
	width: 100%;
}

.eXtremeTable .filter select {
	font-family: Verdana;
	font-size: 9px;
	border: solid 1px #EEE;
	width: 100%;
}

.eXtremeTable .tableHeader {
	background-color: #308dbb;
	color: white;
	font-family: Verdana;
	font-size: 11px;
	font-weight: bold;
	text-align: left;
	padding-right: 3px;
	padding-left: 3px;
	padding-top: 4;
	padding-bottom: 4;
	margin: 0;
	border-right-style: solid;
	border-right-width: 1px;
	border-color: white;
}

.eXtremeTable .tableHeaderSort {
	background-color: #3a95c2;
	color: white;
	font-family: Verdana;
	font-size: 11px;
	font-weight: bold;
	text-align: left;
	padding-right: 3px;
	padding-left: 3px;
	padding-top: 4;
	padding-bottom: 4;
	border-right-style: solid;
	border-right-width: 1px;
	border-color: white;
}

.eXtremeTable .odd a,.even a {
	color: Black;
	text-decoration: none;
	font-size: 13px;
}

.eXtremeTable .odd td,.eXtremeTable .even td {
	padding-top: 2px;
	padding-right: 3px;
	padding-bottom: 2px;
	padding-left: 3px;
	vertical-align: middle;
	font-family: Verdana;
	font-size: 13px;
}

.eXtremeTable .odd {
	background-color: #FFFFFF;
}

.eXtremeTable .even {
	background-color: #dfe4e8;
}

.eXtremeTable .highlight td {
	color: black;
	font-size: 10px;
	padding-top: 2px;
	padding-right: 3px;
	padding-bottom: 2px;
	padding-left: 3px;
	vertical-align: middle;
	background-color: #fdecae;
}

.eXtremeTable .highlight a,.highlight a {
	color: black;
	font-size: 10px;
}

.eXtremeTable .toolbar {
	background-color: #F4F4F4;
	font-family: Verdana;
	font-size: 9px;
	margin-right: 1px;
	border-right: 1px solid silver;
	border-left: 1px solid silver;
	border-top: 1px solid silver;
	border-bottom: 1px solid silver;
}

.eXtremeTable .toolbar td {
	color: #444444;
	padding: 0px 3px 0px 3px;
	text-align: center;
}

.eXtremeTable .separator {
	width: 7px;
}

.eXtremeTable .statusBar {
	background-color: #F4F4F4;
	font-family: Verdana;
	font-size: 13px;
}

.eXtremeTable .filterButtons {
	background-color: #efefef;
	text-align: right;
}

.eXtremeTable .title {
	color: #444444;
	font-weight: bold;
	font-family: Verdana;
	font-size: 15px;
	vertical-align: middle;
}

.eXtremeTable .title span {
	margin-left: 7px;
}

.eXtremeTable .formButtons {
	display: block;
	margin-top: 10px;
	margin-left: 5px;
}

.eXtremeTable .formButton {
	cursor: pointer;
	font-family: Verdana;
	font-size: 10px;
	font-weight: bold;
	background-color: #308dbb;
	color: white;
	margin-top: 5px;
	border: outset 1px #333;
	vertical-align: middle;
}

.eXtremeTable .tableTotal {
	background-color: #FFFFFF;
	border-top: solid 1px Silver;
}

.eXtremeTable .tableTotalEmpty {
	background-color: #FFFFFF;
}
</style>

	</head>


	<body style="margin: 25px;" bgcolor=#39867b>
		
		<td width="500">
			<table width="100%" height="20" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td height="20" class="title_s">
						<font color="white"><b>课程打分管理</b> </font><font color=pink size=2>(说明：点击待评对学生评分，评分后如需要修改，请点击已评。
							如确认无误请点击成绩签名确认，签名后的成绩将是最总成绩，无法修改。)</font>
					</td>
				</tr>
				<tr>
					<td height="3" bgcolor="#A3BED9"></td>
				</tr>
			</table>
		
		<br>
		<ec:table items="scorelist"
			action="${pageContext.request.contextPath}/score/pinfen.do"
			imagePath="${pageContext.request.contextPath}/images/table/*.gif"   
			
			title="提示您：输入框输入数据可进行搜索查询" rowsDisplayed="10" var="score">
			<ec:exportXls fileName="score.xls" tooltip="Excel" />
			<ec:row>
			    <ec:column property="student.classes.professions.collage.name" title="所在学院" />
			    <ec:column property="student.classes.professions.name" title="所在专业" />
			    <ec:column property="student.classes.classesNo" title="所在班级" />
				<ec:column property="student.studentNo" title="学生编号" />
				<ec:column property="student.name" title="学生姓名" />
				<ec:column property="course.name" title="课程名称" />
				<ec:column property="score" title="分数" />
				<ec:column sortable="false" filterable="false" viewsDenied="xls"
					alias="id1" title="教师评分">
					<c:if test="${score.score!=0}"> 
						<html:link action="/score/toEdit?stuId=${score.student.id}&courseId=${score.course.id}&state=${score.state}&score=${score.score}" onclick="return confirm('确定对该学生进行评分吗？')">
							     <c:if test="${score.score==-1}"> 
								    <font style="color: red;">待评</font>
								 </c:if>
								 <c:if test="${score.score!=-1}"> 
								    <font style="color: black;"><font color="blue">已评</font></font>
								 </c:if>
								
						</html:link>
						 <c:if test="${score.score!=-1}"> 
							<html:link action="/score/toConfirmScore?stuId=${score.student.id}&courseId=${score.course.id}&state=${score.state}&score=${score.score}" onclick="return confirm('确定对该学生进行评分吗？')">
								 <font style="color: green;">签名确认</font>
							 </html:link>
						 </c:if>
					 </c:if>
					
				</ec:column>
				
			</ec:row>
		</ec:table>


	</body>
</html>