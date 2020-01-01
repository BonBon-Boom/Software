<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>styde.jsp</title>

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
					学生编号：
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="studentNo"></html:text>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					学生姓名：
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="name"></html:text>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					登陆密码：
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:password property="psw"></html:password>
				</td>
			</tr>
			<tr>
				<td width="" height="23" bgcolor="c6ebde">
					<div align="right">
						性&nbsp;&nbsp;&nbsp;&nbsp;别：
					</div>
				</td>
				<td width="381" bgcolor="c6ebde">
					<html:select property="sex">
						<html:option value="男">男</html:option>
						<html:option value="女">女</html:option>
					</html:select>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					选择班级：
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:select property="classes.id">
						<html:optionsCollection name="classes" value="id"
							label="classesNo" />
					</html:select>
					*从数据库中检索
					<br>
				</td>
			</tr>
			<tr>
				<td width="" height="23" bgcolor="c6ebde">
					<div align="right">
						民&nbsp;&nbsp;&nbsp;&nbsp;族：
					</div>
				</td>
				<td width="381" bgcolor="c6ebde">
					<html:select property="addr">
						<html:option value="汉族">
								汉族
							</html:option>
						<html:option value="蒙古族">
								蒙古族
							</html:option>
						<html:option value="回族">
								回族
							</html:option>
						<html:option value="藏族">
								藏族
							</html:option>
						<html:option value="苗族">
								苗族
							</html:option>
						<html:option value="彝族">
								彝族
							</html:option>
						<html:option value="壮族">
								壮族
							</html:option>
						<html:option value="布依族">
								布依族
							</html:option>
						<html:option value="朝鲜族">
								朝鲜族
							</html:option>
						<html:option value="满族">
								满族
							</html:option>
						<html:option value="侗族">
								侗族
							</html:option>
						<html:option value="瑶族">
								瑶族
							</html:option>
						<html:option value="白族">
								白族
							</html:option>
						<html:option value="土家族">
								土家族
							</html:option>
						<html:option value="哈尼族">
								哈尼族
							</html:option>
						<html:option value="哈萨克族">
								哈萨克族
							</html:option>
						<html:option value="傣族">
								傣族
							</html:option>
						<html:option value="黎族">
								黎族
							</html:option>
						<html:option value="傈僳族">
								傈僳族
							</html:option>
						<html:option value="佤族">
								佤族
							</html:option>
						<html:option value="畲族">
								畲族
							</html:option>
						<html:option value="高山族">
								高山族
							</html:option>
						<html:option value="拉祜族">
								拉祜族
							</html:option>
						<html:option value="水族">
								水族
							</html:option>
						<html:option value="东乡族">
								东乡族
							</html:option>
						<html:option value="纳西族">
								纳西族
							</html:option>
						<html:option value="景颇族">
								景颇族
							</html:option>
						<html:option value="柯尔克孜族">
								柯尔克孜族
							</html:option>
						<html:option value="土族">
								土族
							</html:option>
						<html:option value="达乌尔族">
								达乌尔族
							</html:option>
						<html:option value="羌族">
								羌族
							</html:option>
						<html:option value="仫佬族">
								仫佬族
							</html:option>
						<html:option value="布朗族">
								布朗族
							</html:option>
						<html:option value="撒拉族">
								撒拉族
							</html:option>
						<html:option value="毛难族">
								毛难族
							</html:option>
						<html:option value="仡佬族">
								仡佬族
							</html:option>
						<html:option value="锡伯族">
								锡伯族
							</html:option>
						<html:option value="阿昌族">
								阿昌族
							</html:option>
						<html:option value="普米族">
								普米族
							</html:option>
						<html:option value="塔吉克族">
								塔吉克族
							</html:option>
						<html:option value="怒族">
								怒族
							</html:option>
						<html:option value="乌孜别克族">
								乌孜别克族
							</html:option>
						<html:option value="俄罗斯族">
								俄罗斯族
							</html:option>
						<html:option value="鄂温克族">
								鄂温克族
							</html:option>
						<html:option value="崩龙族">
								崩龙族
							</html:option>
						<html:option value="保安族">
								保安族
							</html:option>
						<html:option value="裕固族">
								裕固族
							</html:option>
						<html:option value="京族">
								京族
							</html:option>
						<html:option value="维吾尔族">
								维吾尔族
							</html:option>
						<html:option value="塔塔尔族">
								塔塔尔族
							</html:option>
						<html:option value="独龙族">
								独龙族
							</html:option>
						<html:option value="鄂伦春族">
								鄂伦春族
							</html:option>
						<html:option value="赫哲族">
								赫哲族
							</html:option>
						<html:option value="门巴族">
								门巴族
							</html:option>
						<html:option value="珞巴族">
								珞巴族
							</html:option>
						<html:option value="基诺族">
								基诺族
							</html:option>
					</html:select>
				</td>
			</tr>

			<tr>
				<td height="23" bgcolor="c6ebde">
					<div align="right">
						政治面貌：
					</div>
				</td>
				<td bgcolor="c6ebde">

					<html:select property="politics">
						<html:option value="中共党员">
								中共党员
							</html:option>
						<html:option value="共青团员">
								共青团员
							</html:option>
						<html:option value="无党派人士">
								无党派人士
							</html:option>
						<html:option value="群众">
								群众
							</html:option>
					</html:select>
				</td>
			</tr>

			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					联系电话：
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="tel"></html:text>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					电子邮箱：
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="email"></html:text>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					身份证号：
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="certid"></html:text>
				</td>
			</tr>
			<tr>
				<td width="" height="23" bgcolor="c6ebde">
					<div align="right">
						出生年月：
					</div>
				</td>
				<td width="381" bgcolor="c6ebde">
					<input name="born" type="text" size="24" id="birth" readonly>

					<script src="../SelectDate/calendar.js"></script>
					<a
						onClick="fPopUpDlg('../SelectDate/calendar.htm',document.all.birth, 'winpop', 172, 210);"><img
							src="../SelectDate/datetime.gif" border=0 width="16" height="16"
							style="cursor: hand"> </a>
				</td>
			</tr>
			<tr>
				<td height="23" bgcolor="c6ebde">
					<div align="right">
						入学时间：
					</div>
				</td>
				<td bgcolor="c6ebde">
					<input name="schooltime" type="text" size="24" id="schooltime"
						readonly>
					<script src="../SelectDate/calendar.js"></script>
					<a
						onClick="fPopUpDlg('../SelectDate/calendar.htm',document.all.schooltime, 'winpop', 172, 210);"><img
							src="../SelectDate/datetime.gif" border=0 width="16" height="16"
							style="cursor: hand"> </a>
				</td>
			</tr>
			<tr>
				<td bgcolor="c6ebde">
					<div align="right">
						备&nbsp;&nbsp;&nbsp;&nbsp;注：
					</div>
				</td>
				<td bgcolor="c6ebde">
					<html:textarea property="hobby" cols="34" rows="3"></html:textarea>
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
