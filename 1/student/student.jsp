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
					<font color="white"><b>���ѧ��</b> </font>
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
					ѧ����ţ�
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="studentNo"></html:text>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					ѧ��������
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="name"></html:text>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					��½���룺
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:password property="psw"></html:password>
				</td>
			</tr>
			<tr>
				<td width="" height="23" bgcolor="c6ebde">
					<div align="right">
						��&nbsp;&nbsp;&nbsp;&nbsp;��
					</div>
				</td>
				<td width="381" bgcolor="c6ebde">
					<html:select property="sex">
						<html:option value="��">��</html:option>
						<html:option value="Ů">Ů</html:option>
					</html:select>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					ѡ��༶��
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:select property="classes.id">
						<html:optionsCollection name="classes" value="id"
							label="classesNo" />
					</html:select>
					*�����ݿ��м���
					<br>
				</td>
			</tr>
			<tr>
				<td width="" height="23" bgcolor="c6ebde">
					<div align="right">
						��&nbsp;&nbsp;&nbsp;&nbsp;�壺
					</div>
				</td>
				<td width="381" bgcolor="c6ebde">
					<html:select property="addr">
						<html:option value="����">
								����
							</html:option>
						<html:option value="�ɹ���">
								�ɹ���
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="׳��">
								׳��
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="��������">
								��������
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="���">
								���
							</html:option>
						<html:option value="��ɽ��">
								��ɽ��
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="ˮ��">
								ˮ��
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="�¶�������">
								�¶�������
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="���ڶ���">
								���ڶ���
							</html:option>
						<html:option value="Ǽ��">
								Ǽ��
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="ë����">
								ë����
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="��������">
								��������
							</html:option>
						<html:option value="ŭ��">
								ŭ��
							</html:option>
						<html:option value="���α����">
								���α����
							</html:option>
						<html:option value="����˹��">
								����˹��
							</html:option>
						<html:option value="���¿���">
								���¿���
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="ԣ����">
								ԣ����
							</html:option>
						<html:option value="����">
								����
							</html:option>
						<html:option value="ά�����">
								ά�����
							</html:option>
						<html:option value="��������">
								��������
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="���״���">
								���״���
							</html:option>
						<html:option value="������">
								������
							</html:option>
						<html:option value="�Ű���">
								�Ű���
							</html:option>
						<html:option value="�����">
								�����
							</html:option>
						<html:option value="��ŵ��">
								��ŵ��
							</html:option>
					</html:select>
				</td>
			</tr>

			<tr>
				<td height="23" bgcolor="c6ebde">
					<div align="right">
						������ò��
					</div>
				</td>
				<td bgcolor="c6ebde">

					<html:select property="politics">
						<html:option value="�й���Ա">
								�й���Ա
							</html:option>
						<html:option value="������Ա">
								������Ա
							</html:option>
						<html:option value="�޵�����ʿ">
								�޵�����ʿ
							</html:option>
						<html:option value="Ⱥ��">
								Ⱥ��
							</html:option>
					</html:select>
				</td>
			</tr>

			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					��ϵ�绰��
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="tel"></html:text>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					�������䣺
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="email"></html:text>
				</td>
			</tr>
			<tr bgcolor="c6ebde">
				<td width="29%" height="26" align="right">
					���֤�ţ�
				</td>
				<td width="71%" bgcolor="c6ebde">
					<html:text property="certid"></html:text>
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
						��ѧʱ�䣺
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
						��&nbsp;&nbsp;&nbsp;&nbsp;ע��
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
					<html:submit>ȷ��</html:submit>
					<html:reset>ȡ��</html:reset>
				</td>
			</tr>

		</html:form>
	</table>


</body>
</html:html>
