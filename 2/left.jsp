<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<style >
body  
{ background:#39867b; margin:0px; font:9pt 宋体;}
table
{ border:0px;}
td
{ font:normal 12px 宋体;
}
img
{ vertical-align:bottom; border:0px;}
a
{ font:normal 12px 宋体; color:#000000; text-decoration:none;}
a:hover
{ color:#428EFF; text-decoration:underline;}
.sec_menu {
	BORDER-RIGHT: white 1px solid; BACKGROUND: #c6ebde; OVERFLOW: hidden; BORDER-LEFT: white 1px solid; BORDER-BOTTOM: white 1px solid
}
.menu_title SPAN {
	FONT-WEIGHT: bold; LEFT: 8px; COLOR: #39867b; POSITION: relative; TOP: 2px
}
.menu_title2 span
{ position:relative; top:2px; left:8px; color:#428EFF; font-weight:bold;cursor:hand}
</style>
<SCRIPT language=javascript1.2>
<!---禁止鼠标右键-->
ifNN4=(navigator.appName=="Netscape"&&parseInt(navigator.appVersion)==4);
ifNN6=(navigator.appName=="Netscape"&&parseInt(navigator.appVersion)==5);
ifIE=(navigator.appName=="Microsoft Internet Explorer");
function noRight(eventObject)
{
	if(ifIE)
	{
	if(event.button==2)
	alert("本站禁止右键下载!");
	}
	else if(ifNN4)
	{
	if(eventObject.which==3)
	alert("本站禁止右键下载!");
	}
	else if(ifNN6)
	{
	if(eventObject.button==2)
	alert("本站禁止右键下载!");
	}
}
if(ifNN4||ifNN6)
document.captureEvents(Event.MOUSEDOWN);
document.onmousedown=noRight;



function showsubmenu(sid)
{
	whichEl = eval("submenu" + sid);
	
	if(whichEl.style.display == "none")
	{
			eval("submenu" + sid + ".style.display=\"\";");
	}
	else
	{
			eval("submenu" + sid + ".style.display=\"none\";");
	}
}
</SCRIPT>
<title>管理页面</title>
<BODY leftmargin="0" topmargin="0" marginheight="0" marginwidth="0">


<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=42 valign=bottom><img src="img/manage_title.gif" width=158 height=39> </td>
  </tr>
</table>
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background=img/title_bg_quit.gif >&nbsp;<font color="red">
    <%if(session.getAttribute("user")==null){out.println("尚未");} else  out.print(
    session.getAttribute("user")); %></font>成功登陆&nbsp;|&nbsp;<a href="login.jsp" target=_parent>注销</a></td>
  </tr>
</table>
<!------------------------学院管理------------------------------------>
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(0)"><b><font color="#3366CC">&nbsp;学院管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu0'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block">
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./collage/list.do" target="right" >管理学院</a></td>
          </tr>
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="collage/addCollage.jsp" target="right">添加学院</a></td>
          </tr>  
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>

<!------------------------------专业管理----------------------------------------->
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(1)"><b><font color="#3366CC">&nbsp;专业管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu1'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block">
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./professions/list.do" target="right" >管理专业</a></td>
          </tr>
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./professions/toAdd.do" target="right">添加专业</a></td>
          </tr>  
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>
<!------------------------------班级管理----------------------------------------->
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(2)"><b><font color="#3366CC">&nbsp;班级管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu2'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block">
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./classes/list.do" target="right" >管理班级</a></td>
          </tr>
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./classes/toAdd.do" target="right">添加班级</a></td>
          </tr> 
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>

<!------------------------------课程管理----------------------------------------->
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(22)"><b><font color="#3366CC">&nbsp;课程管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu22'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block">
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./course/list.do" target="right" >管理课程</a></td>
          </tr>
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./course/toAdd.do" target="right">安排课程</a></td>
          </tr> 
           <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="course/addCourseArrange.jsp" target="right">课程表编排</a></td>
          </tr> 
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./courseArrange/list.do" target="right">课程表管理</a></td>
          </tr> 
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>

<!------------------------------成绩管理----------------------------------------->
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(222)"><b><font color="#3366CC">&nbsp;成绩管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu222'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block">
          
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./score/list.do" target="right" >选课审核</a></td>
          </tr>
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./score/pinfen.do" target="right" >课程打分</a></td>
          </tr>
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./course/list.do" target="right" class="link"><span
										class="fill"></span>查询课程信息</a></td>
          </tr>
          							 
           
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>
<!------------------------------老师管理----------------------------------------->
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(3)"><b><font color="#3366CC">&nbsp;教师管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu3'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block">
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./teacher/list.do" target="right" >管理教师</a></td>
          </tr>
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="teacher/addTeacher.jsp" target="right">添加教师</a></td>
          </tr>  
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>
<!------------------------------学生管理----------------------------------------->
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(4)"><b><font color="#3366CC">&nbsp;学生管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu4'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block"> 
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./student/list.do" target="right">管理学生</a></td>
          </tr>
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./student/toAdd.do" target="right">添加学生</a></td>
          </tr> 
    	
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>
<!------------------------------公告管理----------------------------------------->
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(5)"><b><font color="#3366CC">&nbsp;公告管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu5'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block">
         <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./notice/list.do" target="right" >管理公告</a></td>
          </tr>
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="notice/addNotice.jsp" target="right">添加公告</a></td>
          </tr>  
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>
<!------------------------------管理员管理----------------------------------------->
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(6)"><b><font color="#3366CC">&nbsp;管理员管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu6'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block">
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./admin/list.do" target="right" >管理管理员</a></td>
          </tr>
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="admin/addAdmin.jsp" target="right">添加管理员</a></td>
          </tr> 
          
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>
<table cellpadding=0 cellspacing=0 width=158 align=center>
  <tr>
    <td height=25 class=menu_title onmouseover=this.className='menu_title2'; onmouseout=this.className='menu_title'; background="img/manage_left_9.gif" id=menuTitle1 onClick="showsubmenu(7)"><b><font color="#3366CC">&nbsp;管理员CA管理</font></b></td>
  </tr>
  <tr>
    <td style="display:none" id='submenu7'><div class=sec_menu style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135 >
          <td style="DISPLAY: block">
          <tr >
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./admin/toCreateCA.do?id=${id }" target="right" >管理员CA生成</a></td>
          </tr>
          <tr>
            <td height=20 style="BORDER-BOTTOM: white 1px solid"><a href="./admin/listAdminCA.do?id=${id }" target="right" >管理员CA查看</a></td>
          </tr>
          
        </table>
      </div>
      <div  style="width:158">
        <table cellpadding=0 cellspacing=0 align=center width=135>
          <tr>
            <td height=20></td>
          </tr>
        </table>
      </div></td>
  </tr>
</table>
 
