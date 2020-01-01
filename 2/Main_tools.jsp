<%@ page language="java" import="java.util.*,com.vanceinfo.school.dao.impl.*,com.vanceinfo.school.hibernate.pojo.*"  pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<TITLE>工具栏</TITLE>
		<META name=GENERATOR content="MSHTML 8.00.6001.18372">
		<META name=CODE_LANGUAGE content=C#>
		<META content="text/html; charset=utf-8" http-equiv=Content-Type>
		<META name=vs_defaultClientScript content=JavaScript>
		<META name=vs_targetSchema
			content=http://schemas.microsoft.com/intellisense/ie5>

		<SCRIPT language=javascript src="img/Main_tools.js"></SCRIPT>
	</head>

	<BODY ondragstart=window.event.returnValue=false
		oncontextmenu=window.event.returnValue=false
		onselectstart=window.event.returnValue=false
		background=img/Buttonback.jpg leftMargin=0 topMargin=0
		onsource="window.event.returnValue=false">
		<TABLE id=menu border=0 cellSpacing=0 cellPadding=0 width="100%"
			height=20 state="">
			<TBODY>
				<TR height=20>
					<TD width=120 align=left>
						<TABLE border=0 cellSpacing=0 cellPadding=0 height=20>
							<TBODY>
								<TR>
									<TD id=W width=50 align=middle>
										<IMG id=PW title=隐藏主控菜单 onclick=onhide1(this) border=0
											src="img/push.jpg" state="0" tag="push">
									</TD>
									<TD id=W width=70 align=middle>
										<IMG id=PU title="" onclick=onhide2(this) border=0
											src="img/blank.jpg" state="0" tag="">
									</TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
					<TD height=20 vAlign=center width="100%" align=middle>
						<MARQUEE style="WIDTH: 100%" id=theInfo onmouseover=this.stop()
							onmouseout=this.start() height=17 scrollAmount=1 scrollDelay=10>
							<a href="./notice/list.do" target="right" 
								style="cursor: hands; font-size: 12px; text-decoration: none; marks: inherit">
								<%
									NoticeImpl p = new NoticeImpl();
									List<Notice> list = p.queryAllNotice();
									list.get(list.size()-1).getTitle();
									
								%>
								<font color="#9966FF"><%out.print(list.get(list.size()-1).getTitle()); %>：</font>
								<%out.print(list.get(list.size()-1).getContent());%>
								</MARUEE>
					</TD>
					<TD vAlign=top noWrap align=right>
						<TABLE border=0 cellSpacing=0 cellPadding=0 width=296>
							<TBODY>
								<TR>
									<!--td><img src='../images/_menu/B1.gif' border=0></td-->
									<TD align=middle>
										<IMG id=T6 onmouseover=DoMouse(this) title=首页
											onmouseout=DoMouse(this)
											onclick="openWinHome('../','winHome',790,425)" border=0
											alt=back src="img/home.jpg" state="0">
									</TD>
									<TD align=middle>
										<IMG id=T1 onmouseover=DoMouse(this) title=后退
											onmouseout=DoMouse(this)
											onclick=try{parent.frmbody.frmMain.history.go(-1)}catch(goErr){}
											border=0 alt=back src="img/back.jpg" state="0">
									</TD>
									<!--td align=center> 
<img id=T2 src='../images/_menu/forward.gif' border=0 state='0' alt='forward' title='前进'
onmouseover=DoMouse(this) onmouseout=DoMouse(this) onclick="try{parent.frmbody.frmMain.history.go(1)}catch(goErr){}"></td-->
									<TD align=middle>
										<IMG id=T3 onmouseover=DoMouse(this) title=刷新
											onmouseout=DoMouse(this) onclick=Fresh() border=0 alt=fresh
											src="img/fresh.jpg" state="0">
									</TD>
									<TD align=middle>
										<IMG id=T4 onmouseover=DoMouse(this) title=帮助
											onmouseout=DoMouse(this) onclick=Help() border=0 alt=help
											src="img/help.jpg" state="0"
											onmouseover="this.style.paddingleft = '15px'; this.style.paddingright = '5px'; this.style.border = '1px solid #468BC7'; this.style.backgroundColor = '#C0D8EE'; this.style.font = '8pt Tahoma'; this.style.color = '#295E8C'; this.style.cursor = 'hand';"
											height=20>
									</TD>
									<TD align=middle>
										<IMG accessKey=c id=T5 onmouseover=DoMouse(this) title=注销
											onmouseout=DoMouse(this) onclick=LogOut(); border=0 alt=close
											src="img/close.jpg" state="0" value="">
									</TD>
									<!--td ><img src=../images/_menu/B3.gif></td-->
								</TR>
							</TBODY>
						</TABLE>
						<IFRAME style="DISPLAY: none" src="about:blank" frameBorder=0
							name=Rpt></IFRAME>
						<INPUT value=STU000 type=hidden name=typeName>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		<SCRIPT language=javascript>
try{if(window.screen.width>800) 
document.all.theInfo.width=window.screen.width-350;
}catch(err){}
function Help()
{
	var TypeName="";
	TypeName=document.all.typeName.value;
	TypeName=TypeName.substring(0,3);
	//alert(TypeName);
	if(TypeName=="ADM")
	  openWinX('../help.jsp',437,543);
	else if(TypeName=="SYS")
	  openWinX('../_help/admin/index.htm',437,543);
	else if(TypeName=="TEA")
	  openWinX('../_help/teacher/index.htm',437,543);
	else if(TypeName=="STU")
	  openWinX('help.jsp',437,543);
}
</SCRIPT>
	</BODY>
</html>