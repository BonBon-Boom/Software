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
alert("\������������ !!")
document.form1.NewPassword.focus();
return false;
}
if( form1.ReNewPassword.value =="" ) {
alert("\������ȷ������ !!")
document.form1.ReNewPassword.focus();
return false;
}
if( form1.NewPassword.value != form1.ReNewPassword.value ) {
alert("\�����������벻һ�� !!")
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
						<font color="white"><b>��ӽ�ʦ</b> </font>
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
							��ʦ��ţ�
						</div>
					</td>
					<td width="381" bgcolor="c6ebde">
						<input name="teacherNo" type="text" value="" size="24" />
					</td>
				</tr>
				<tr>
					<td width="" height="23" bgcolor="c6ebde">
						<div align="right">
							��&nbsp;&nbsp;&nbsp;&nbsp;����
						</div>
					</td>
					<td width="381" bgcolor="c6ebde">
						<input class="test1" name="name" type="text" value="" size="24" />
					</td>
				</tr>
				<tr>
					<td width="" height="23" bgcolor="c6ebde">
						<div align="right">
							��&nbsp;&nbsp;&nbsp;&nbsp;�룺
						</div>
					</td>
					<td width="381" bgcolor="c6ebde">
						<input name="psw" type="password" value="" size="26" />
					</td>
				</tr>
				<tr>
					<td width="" height="23" bgcolor="c6ebde">
						<div align="right">
							��&nbsp;&nbsp;&nbsp;&nbsp;��
						</div>
					</td>
					<td width="381" bgcolor="c6ebde">
						<label>
							<select name="sex">
								<option>
									��
								</option>
								<option>
									Ů
								</option>
							</select>
						</label>
					</td>
				</tr>

				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							��&nbsp;&nbsp;&nbsp;&nbsp;�壺
						</div>
					</td>
					<TD bgcolor="c6ebde">
						<select name="addr">
							<option value="����">
								����
							</option>
							<option value="�ɹ���">
								�ɹ���
							</option>
							<option value="����">
								����
							</option>
							<option value="����">
								����
							</option>
							<option value="����">
								����
							</option>
							<option value="����">
								����
							</option>
							<option value="׳��">
								׳��
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="����">
								����
							</option>
							<option value="����">
								����
							</option>
							<option value="����">
								����
							</option>
							<option value="����">
								����
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="��������">
								��������
							</option>
							<option value="����">
								����
							</option>
							<option value="����">
								����
							</option>
							<option value="������">
								������
							</option>
							<option value="����">
								����
							</option>
							<option value="���">
								���
							</option>
							<option value="��ɽ��">
								��ɽ��
							</option>
							<option value="������">
								������
							</option>
							<option value="ˮ��">
								ˮ��
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="�¶�������">
								�¶�������
							</option>
							<option value="����">
								����
							</option>
							<option value="���ڶ���">
								���ڶ���
							</option>
							<option value="Ǽ��">
								Ǽ��
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="ë����">
								ë����
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="��������">
								��������
							</option>
							<option value="ŭ��">
								ŭ��
							</option>
							<option value="���α����">
								���α����
							</option>
							<option value="����˹��">
								����˹��
							</option>
							<option value="���¿���">
								���¿���
							</option>
							<option value="������">
								������
							</option>
							<option value="������">
								������
							</option>
							<option value="ԣ����">
								ԣ����
							</option>
							<option value="����">
								����
							</option>
							<option value="ά�����">
								ά�����
							</option>
							<option value="��������">
								��������
							</option>
							<option value="������">
								������
							</option>
							<option value="���״���">
								���״���
							</option>
							<option value="������">
								������
							</option>
							<option value="�Ű���">
								�Ű���
							</option>
							<option value="�����">
								�����
							</option>
							<option value="��ŵ��">
								��ŵ��
							</option>
							<option value="����">
								����
							</option>
						</SELECT>
					</TD>
				</TR>

				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							������ò��
						</div>
					</td>
					<td bgcolor="c6ebde">
						<label>
							<select name="politics">
								<option>
									�й���Ա
								</option>
								<option>
									������Ա
								</option>
								<option>
									�޵�����ʿ
								</option>
								<option>
									Ⱥ��
								</option>
							</select>
						</label>
					</td>
				</tr>

				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							ְ&nbsp;&nbsp;&nbsp;&nbsp;�ƣ�
						</div>
					</td>
					<td bgcolor="c6ebde">
						<label>
							<select name="position">
								<option>
									��ͨ��ʦ
								</option>
								<option>
									����
								</option>
								<option>
									��ʿ
								</option>
							</select>
						</label>
					</td>
				</tr>
				
				<tr>
					<td width="" height="23" bgcolor="c6ebde">
						<div align="right">
							�������£�
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
							���ʱ�䣺
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
							��ϵ�绰��
						</div>
					</td>
					<td bgcolor="c6ebde">
						<input name="tel" type="text" size="24" value="" />
					</td>
				</tr>
				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							�������䣺
						</div>
					</td>
					<td bgcolor="c6ebde">
						<input name="email" type="text" size="24" value="">
					</td>
				</tr>
				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							���֤�ţ�
						</div>
					</td>
					<td bgcolor="c6ebde">
						<input name="certid" type="text" size="24" value="">
					</td>
				</tr>
				<tr>
					<td bgcolor="c6ebde">
						<div align="right">
							��&nbsp;&nbsp;&nbsp;&nbsp;ע��
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
						<input type="submit" value="�ύ" name="B1" class=input>
						<input type="reset" name="Submit" value="����">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
