<%@ page language="java" pageEncoding="UTF-8"%>
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
		<TITLE></TITLE>
		<META content="text/html; charset=gb2312" http-equiv=Content-Type>
		<META name=GENERATOR content="MSHTML 8.00.6001.18372">
		<META name=CODE_LANGUAGE content=C#>
		<META name=vs_defaultClientScript content=JavaScript>
		<META name=vs_targetSchema
			content=http://schemas.microsoft.com/intellisense/ie5>
		<BGSOUND id=bgmid loop=infinite src="" tag="">
		<BGSOUND id=bgwav loop=0 src="" tag="">
		<script>
		function showImg()
{
myTime=new Date();
var imageArray=new Array(10);
for(i=0;i<10;i++)
imageArray[i]=new Image();
imageArray[0].src="images/0.gif";
imageArray[1].src="images/1.gif";
imageArray[2].src="images/2.gif";
imageArray[3].src="images/3.gif";
imageArray[4].src="images/4.gif";
imageArray[5].src="images/5.gif";
imageArray[6].src="images/6.gif";
imageArray[7].src="images/7.gif";
imageArray[8].src="images/8.gif";
imageArray[9].src="images/9.gif";
year=myTime.getYear();
month=myTime.getMonth()+1;
date=myTime.getDate();
hours=myTime.getHours();
minutes=myTime.getMinutes();
seconds=myTime.getSeconds();
if(year<100)
year="19"+year;
if(month<10)
month="0"+month;
if(date<10)
date="0"+date;
if(hours<=9)
hours="0"+hours;
if(minutes<=9)
minutes="0"+minutes;
if(seconds<=9)
seconds="0"+seconds;
theString=""+year+month+date+hours+minutes+seconds;
//对相应图片位指定相应图片
IMG0.src=imageArray[theString.charAt(0)].src;
IMG1.src=imageArray[theString.charAt(1)].src;
IMG2.src=imageArray[theString.charAt(2)].src;
IMG3.src=imageArray[theString.charAt(3)].src;
IMG4.src=imageArray[theString.charAt(4)].src;
IMG5.src=imageArray[theString.charAt(5)].src;
IMG6.src=imageArray[theString.charAt(6)].src;
IMG7.src=imageArray[theString.charAt(7)].src;
IMG8.src=imageArray[theString.charAt(8)].src;
IMG9.src=imageArray[theString.charAt(9)].src;
IMG10.src=imageArray[theString.charAt(10)].src;
IMG11.src=imageArray[theString.charAt(11)].src;
IMG12.src=imageArray[theString.charAt(12)].src;
IMG13.src=imageArray[theString.charAt(13)].src;
setTimeout("showImg()",1000);
}
 
</script>

	</head>

	<BODY onload="showImg()" ondragstart=window.event.returnValue=false
		oncontextmenu=window.event.returnValue=false
		onselectstart=window.event.returnValue=false leftMargin=0 topMargin=0
		onsource="window.event.returnValue=false">
		<DIV
			style="Z-INDEX: -1; POSITION: absolute; WIDTH: 100px; HEIGHT: 7px; VISIBILITY: hidden; TOP: 0px; LEFT: 0px"></DIV>
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" height=82>
			<!-- BANNER区 -->
			<TBODY>
				<TR>
					<TD vAlign=top background=img/banner1.gif width="100%" align=middle>
						<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%"
							height="100%">
							<TBODY>
								<TR>
									<TD vAlign=center width="20%" align=middle>
										<BR>
									</TD>
									<TD vAlign=center width="60%" align=middle></TD>
									<TD vAlign=center width="20%" align=right>
										<TABLE border=0 cellSpacing=0 cellPadding=0 width=200
											height="100%">
											<TBODY>
												<TR>
													<TD vAlign=bottom align=right>
														<BR>
													</TD>
												</TR> 
												<TR>
													<TD noWrap align=right valign_="bottom">
														<SPAN style="COLOR: white; FONT-SIZE: 9pt">2015学年第<font
															color="red">一</font>学期&nbsp;<br> <!-- <div id="showTime"></div>  -->

															<img id=IMG0>
															<img id=IMG1>
															<img id=IMG2>
															<img id=IMG3>年<img id=IMG4>
															<img id=IMG5>月<img id=IMG6>
															<img id=IMG7>日<img id=IMG8>
															<img id=IMG9>点
															<img id=IMG10>
															<img id=IMG11>分
															<img id=IMG12>
															<img id=IMG13>秒 </SPAN>
													</TD>
												</TR>
											</TBODY>
										</TABLE>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		<IFRAME style="DISPLAY: none" src="about:blank" frameBorder=0 name=frm></IFRAME>
		<SCRIPT language=javascript>
			 
		</SCRIPT>
	</BODY>
</html>