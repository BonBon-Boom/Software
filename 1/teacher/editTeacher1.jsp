<%@ page language="java" import="java.util.*" pageEncoding="gbk"
	contentType="text/html; charset=gbk"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


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
					<font color="white"><b>��ʦ���������޸�</b> </font>
				</td>
			</tr>
			<tr>
				<td height="3" bgcolor="#A3BED9"></td>
			</tr>
		</table>
	</td>

	<p>
	<p>
		<html:form action="/teacher/edit1" method="post">
			<table width="100%" border="0" align="center" cellpadding="3"
				cellspacing="1" bgcolor="#FFFFFF">
				<tr bgcolor="c6ebde">
					<td   align="right">
						��ʦ���:
					</td>
					<td   bgcolor="c6ebde">
						<html:text property="teacherNo" readonly="true"></html:text>
					</td>
				</tr>

				<tr bgcolor="c6ebde">
					<td  align="right">
						��&nbsp;&nbsp;&nbsp;����
					</td>
					<td  bgcolor="c6ebde">
						<html:text property="name"></html:text>
					</td>
				</tr>
				<tr>
					<td width="29%" height="26" bgcolor="c6ebde" align="right">
						<div align="right">
							��&nbsp;&nbsp;&nbsp;��
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



				<tr bgcolor="c6ebde">
					<td   height="23" align="right">
						��&nbsp;&nbsp;&nbsp;&nbsp;��:
					</td>
					<td  bgcolor="c6ebde">
						<html:text property="psw"></html:text>
						<font color='red'>&nbsp*������������������</font>
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
                       <html:text property="born"></html:text>
						<script src="../SelectDate/calendar.js"></script>
						<a
							onClick="fPopUpDlg('../SelectDate/calendar.htm',document.all.born, 'winpop', 172, 210);"><img
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
					   	<html:text property="entertime"></html:text>
						<script src="../SelectDate/calendar.js"></script>
						<a
							onClick="fPopUpDlg('../SelectDate/calendar.htm',document.all.entertime, 'winpop', 172, 210);"><img
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
						<html:text property="tel"></html:text>
					</td>
				</tr>
				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							�������䣺
						</div>
					</td>
					<td bgcolor="c6ebde">
						<html:text property="email"></html:text>
					</td>
				</tr>
				<tr>
					<td height="23" bgcolor="c6ebde">
						<div align="right">
							���֤�ţ�
						</div>
					</td>
					<td bgcolor="c6ebde">
						<html:text property="certid"></html:text>
					</td>
				</tr>
				<tr>
					<td bgcolor="c6ebde">
						<div align="right">
							��&nbsp;&nbsp;&nbsp;&nbsp;ע��
						</div>
					</td>
					<td bgcolor="c6ebde">
						<html:text property="content"></html:text>
					</td>
				</tr>
				<tr bgcolor="c6ebde">
					<td height="26" align="right">
						<div align="center"></div>
					</td>
					<td bgcolor="c6ebde">
						<html:submit>ȷ���޸�</html:submit>
						&nbsp;&nbsp;&nbsp;
					</td>
				</tr>
			</table>
		</html:form>
</body>
</html:html>
