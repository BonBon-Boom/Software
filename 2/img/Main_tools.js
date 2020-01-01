
var ie6;
var ie = new Array();
ie[0] = "MSIE 7";
ie[1] = "MSIE 6";
for (var i = 0; i < ie.length; i++) {
	ie6 = window.navigator.userAgent.indexOf(ie[i]);
	if (ie6 > 0) {
		break;
	}
}
function openWinX(url, name, w, h) {
	var pop = window.open(url, name, "width=" + w + ",height=" + h + ",toolbar=no,menubar=no,scrollbars=yes,resizable=yes,location=no,status=no");
	pop.moveTo((screen.width - w) / 2, (screen.height - h) / 2);
}
function openWinHome(url, name, w, h) {
	var pop;
	if (window.screen.height > 600) {
		w += 100;
		h += 30;
		pop = window.open(url, name, "width=" + w + ",height=" + h + ",toolbar=no,menubar=no,scrollbars=no,resizable=yes,location=no,status=no");
		pop.moveTo((window.screen.width - w) / 2, (window.screen.height - h) / 2);
	} else {
		pop = window.open(url, name, "width=" + w + ",height=" + h + ",toolbar=no,menubar=no,scrollbars=no,resizable=yes,location=no,status=no");
		pop.moveTo(0, 20);
	}
}
function Fresh() {
	try {
		parent.frmbody.frmMain.history.go(0);
	}
	catch (e) {
	}
}
function Min() {
	try {
		hhctrl.Click();
	}
	catch (e) {
	}
}  
function LogOut() {
	try {//注锟斤拷锟斤拷确锟斤拷要注锟斤拷锟铰硷拷锟�
		var vU;
		if (!confirm("确定注销？")) {
			return false;
		}
		window.top.location.href ="login.jsp";
	}
	catch (e) {
	}
}
function Exit() {
	//if(window.event.button=="1"){
	//	alert(window.event.type);
	//	window.Rpt.location.href='../sys/Exit.aspx';
	//}
}
function DoMouse(theid) {
	var id;
	var imgSRC;
	id = theid.state;
	if (id == "1") {
		theid.state = "0";
		theid.style.cursor = "";
		imgSRC = "../images/_menu/" + theid.alt + ".gif";
	} else {
		theid.state = "1";
		theid.style.cursor = "hand";
		imgSRC = "../images/_menu/" + theid.alt + "2.gif";
	}
	//theid.src =imgSRC;
}
function onhide1(theID) {
	try {
		var objFrm;
		if (ie6 > 0) {
			objFrm = parent.frmbody.divTheMenu;
		} else {
			objFrm = parent.frmbody.frmMenu.divTheMenu;
		}
		if (objFrm.style.display == "none") {
			objFrm.style.display = "";
			theID.src = "../images/_menu/push.gif";
			theID.title = "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0632\u02f5\ufffd";
			if (document.all.PU.tag == "ok") {
				onhide2_Ex("down");
			}
			if (ie6 <= 0) {
				parent.frmbody.mfr.cols = "132,*";
			}
		} else {
			objFrm.style.display = "none";
			theID.src = "../images/_menu/pull.gif";
			theID.title = "\ufffd\ufffd\u02be\ufffd\ufffd\u0632\u02f5\ufffd";
			if (document.all.PU.tag == "ok") {
				document.all.PU.src = "../images/_menu/blank.gif";
				document.all.PU.title = "";
				if (ie6 <= 0) {
					parent.frmbody.mfr.cols = "0,*";
				}
			}
		}
	}
	catch (err) {
	}
}
function onhide2(theID) { //try{
	if (document.all.PU.title == "") {
		return false;
	}
	if (ie6 > 0) {
		var bHide = parent.frmbody.hideTheMenu("F");
	} else {
		var bHide = parent.frmbody.frmMenu.hideTheMenu("F");
	}
	if (!bHide) {
		return false;
	}
	onhide2_Ex("blank");
//}catch(e){}
}
function onhide2_Ex(pS) {
	try {
		if (pS == "down") {
			document.all.PU.tag = "ok";
			document.all.PU.src = "../images/_menu/down.gif";
			document.all.PU.title = "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0632\u02f5\ufffd";
		} else {
			if (pS == "blank") {
				document.all.PU.tag = "";
				document.all.PU.src = "../images/_menu/blank.gif";
				document.all.PU.title = "";
			}
		}
	}
	catch (e) {
	}
}
function MouseOver(spanId) {
	var objSpan = eval(spanId);
	if (objSpan.style.color == RGB_NONE) {
		objSpan.style.cursor = "";
		return false;
	}
	objSpan.style.cursor = "hand";
	if (objSpan.style.color != RGB_CHECK) {
		objSpan.style.color = RGB_OVER;
	}
}
function MouseOut(spanId) {
	var objSpan = eval(spanId);
	if (objSpan.style.color == RGB_NONE) {
		return false;
	}
	if (objSpan.style.color != RGB_CHECK) {
		objSpan.style.color = RGB_LINK;
	}
}

