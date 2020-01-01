<%@ page language="java"
	import="java.util.*,com.vanceinfo.school.dao.impl.*,com.vanceinfo.school.hibernate.pojo.*"
	pageEncoding="gbk" contentType="text/html; charset=gbk"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<meta http-equiv="cache-control" content="no-cache" />
		<link rel="stylesheet" href="img/style.css" type="text/css">
		<script language="JavaScript">
<!--
function formcheck()
{
if( form1.NewPassword.value =="" ) {
alert("\请输入新密码 !!")
document.form1.NewPassword.focus();
return false;
}
if( form1.ReNewPassword.value =="" ) {
alert("\请输入确认密码 !!")
document.form1.ReNewPassword.focus();
return false;
}
if( form1.NewPassword.value != form1.ReNewPassword.value ) {
alert("\两次密码输入不一致 !!")
document.form1.NewPassword.value="";
document.form1.ReNewPassword.value="";
document.form1.NewPassword.focus();
return false;
}
return (true);
}
// -->

</script>
	</head>
	<body bgcolor=#39867b>

		<td width="910">
			<table width="100%" height="20" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td height="20" class="title_s">
						<font color="white"><b>添加教师</b> </font>
					</td>
				</tr>
				<tr>
					<td height="3" bgcolor="#A3BED9"></td>
				</tr>
			</table>
		</td>
		<form name="form1" method="post" action="add.do" />
			<table width="100%" border="0" align="center" cellpadding="3"
				cellspacing="1" bgcolor="#FFFFFF">

				<tr>
					<td width="26%" height="23" bgcolor="#c6ebde">
						<div align="right">
							教师编号：
						</div>
					</td>
					<td width="381" bgcolor="c6ebde">
						<input name="teacherNo" type="text" value="" size="24" />
					</td>
				</tr>
				<tr>
					<td width="" height="23" bgcolor="c6ebde">
						<div align="right">
							姓&nbsp;&nbsp;&nbsp;&nbsp;名：
						</div>
					</td>
					<td width="381" bgcolor="c6ebde">
						<input class="test1" name="name" type="text" value="" size="24" />
					</td>
				</tr>
				<tr>
					<td width="" height="23" bgcolor="c6ebde">
						<div align="right">
							密&nbsp;&nbsp;&nbsp;&nbsp;码：
						</div>
					</td>
					<td width="381" bgcolor="c6ebde">
						<input name="psw" type="password" value="" size="26" />
					</td>
				</tr>
				<tr>
					<td width="" height="23" bgcolor="c6ebde">
						<div align="right">
							性&nbsp;&nbsp;&nbsp;&nbsp;别：
						</div>
					</td>
					<td width="381" bgcolor="c6ebde">
						<label>
							<select name="sex">
								<option>
									男
								</option>
								<option>
									女
								</option>
							</select>
						</label>
					</td>
				</tr>

				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							民&nbsp;&nbsp;&nbsp;&nbsp;族：
						</div>
					</td>
					<TD bgcolor="c6ebde">
						<select name="addr">
							<option value="汉族">
								汉族
							</option>
							<option value="蒙古族">
								蒙古族
							</option>
							<option value="回族">
								回族
							</option>
							<option value="藏族">
								藏族
							</option>
							<option value="苗族">
								苗族
							</option>
							<option value="彝族">
								彝族
							</option>
							<option value="壮族">
								壮族
							</option>
							<option value="布依族">
								布依族
							</option>
							<option value="朝鲜族">
								朝鲜族
							</option>
							<option value="满族">
								满族
							</option>
							<option value="侗族">
								侗族
							</option>
							<option value="瑶族">
								瑶族
							</option>
							<option value="白族">
								白族
							</option>
							<option value="土家族">
								土家族
							</option>
							<option value="哈尼族">
								哈尼族
							</option>
							<option value="哈萨克族">
								哈萨克族
							</option>
							<option value="傣族">
								傣族
							</option>
							<option value="黎族">
								黎族
							</option>
							<option value="傈僳族">
								傈僳族
							</option>
							<option value="佤族">
								佤族
							</option>
							<option value="畲族">
								畲族
							</option>
							<option value="高山族">
								高山族
							</option>
							<option value="拉祜族">
								拉祜族
							</option>
							<option value="水族">
								水族
							</option>
							<option value="东乡族">
								东乡族
							</option>
							<option value="纳西族">
								纳西族
							</option>
							<option value="景颇族">
								景颇族
							</option>
							<option value="柯尔克孜族">
								柯尔克孜族
							</option>
							<option value="土族">
								土族
							</option>
							<option value="达乌尔族">
								达乌尔族
							</option>
							<option value="羌族">
								羌族
							</option>
							<option value="仫佬族">
								仫佬族
							</option>
							<option value="布朗族">
								布朗族
							</option>
							<option value="撒拉族">
								撒拉族
							</option>
							<option value="毛难族">
								毛难族
							</option>
							<option value="仡佬族">
								仡佬族
							</option>
							<option value="锡伯族">
								锡伯族
							</option>
							<option value="阿昌族">
								阿昌族
							</option>
							<option value="普米族">
								普米族
							</option>
							<option value="塔吉克族">
								塔吉克族
							</option>
							<option value="怒族">
								怒族
							</option>
							<option value="乌孜别克族">
								乌孜别克族
							</option>
							<option value="俄罗斯族">
								俄罗斯族
							</option>
							<option value="鄂温克族">
								鄂温克族
							</option>
							<option value="崩龙族">
								崩龙族
							</option>
							<option value="保安族">
								保安族
							</option>
							<option value="裕固族">
								裕固族
							</option>
							<option value="京族">
								京族
							</option>
							<option value="维吾尔族">
								维吾尔族
							</option>
							<option value="塔塔尔族">
								塔塔尔族
							</option>
							<option value="独龙族">
								独龙族
							</option>
							<option value="鄂伦春族">
								鄂伦春族
							</option>
							<option value="赫哲族">
								赫哲族
							</option>
							<option value="门巴族">
								门巴族
							</option>
							<option value="珞巴族">
								珞巴族
							</option>
							<option value="基诺族">
								基诺族
							</option>
							<option value="其他">
								其他
							</option>
						</SELECT>
					</TD>
				</TR>

				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							政治面貌：
						</div>
					</td>
					<td bgcolor="c6ebde">
						<label>
							<select name="politics">
								<option>
									中共党员
								</option>
								<option>
									共青团员
								</option>
								<option>
									无党派人士
								</option>
								<option>
									群众
								</option>
							</select>
						</label>
					</td>
				</tr>

				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							职&nbsp;&nbsp;&nbsp;&nbsp;称：
						</div>
					</td>
					<td bgcolor="c6ebde">
						<label>
							<select name="position">
								<option>
									普通教师
								</option>
								<option>
									教授
								</option>
								<option>
									博士
								</option>
							</select>
						</label>
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
							入教时间：
						</div>
					</td>
					<td bgcolor="c6ebde">
						<input name="entertime" type="text" size="24" id="schooltime"
							readonly>
						<script src="../SelectDate/calendar.js"></script>
						<a
							onClick="fPopUpDlg('../SelectDate/calendar.htm',document.all.schooltime, 'winpop', 172, 210);"><img
								src="../SelectDate/datetime.gif" border=0 width="16" height="16"
								style="cursor: hand"> </a>
					</td>
				</tr>
				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							联系电话：
						</div>
					</td>
					<td bgcolor="c6ebde">
						<input name="tel" type="text" size="24" value="" />
					</td>
				</tr>
				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							电子邮箱：
						</div>
					</td>
					<td bgcolor="c6ebde">
						<input name="email" type="text" size="24" value="">
					</td>
				</tr>
				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							身份证号：
						</div>
					</td>
					<td bgcolor="c6ebde">
						<input name="certid" type="text" size="24" value="">
					</td>
				</tr>
				<tr>
					<td bgcolor="c6ebde">
						<div align="right">
							备&nbsp;&nbsp;&nbsp;&nbsp;注：
						</div>
					</td>
					<td bgcolor="c6ebde">
						<textarea name="content" cols="34" rows="3"></textarea>
					</td>
				</tr>
				<tr>
					<td height="26" bgcolor="c6ebde">
						&nbsp;
					</td>
					<td height="26" bgcolor="c6ebde">
						<input type="submit" value="提交" name="B1" class=input>
						<input type="reset" name="Submit" value="重置">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
