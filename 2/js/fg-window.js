function showAffAdvWin(affid) {
	var lawAffWin = new Ext.Window({
		title : "书 城 公 告",
		width : 350,
		height : 250,
		resizable : false,
		maximizable : true,
		autoLoad : {
			url : "afficheAction!afficheSelectOneHead?id="+affid+"",
			scripts : true
		},
		autoScroll : true
	});

	lawAffWin.show();
}

function showRegWin() {
	var regWin = new Ext.Window({
		title : "用 户 注 册",
		width : 400,
		height : 300,
		resizable : false,
		maximizable : true,
		autoLoad : {
			url : "../pages/fg-memberRegister.jsp",
			scripts : true
		},
		autoScroll : true
	});
	regWin.show();
}

function showFindPass() {
	var findPassPan= new Ext.Window({
		title : "找 回 密 码",
		width : 300,
		height : 200,
		resizable : false,
		maximizable : true,
		autoLoad : {
			url : "../pages/fg-One.jsp",
			scripts : true
		},
		autoScroll : true
	});
	findPassPan.show();
}

function showOneBook(bookid) {
	var bookPan= new Ext.Window({
		title : "图 书 详 细 信 息",
		width : 400,
		height : 250,
		resizable : false,
		maximizable : true,
		autoLoad : {
			url : "goodsAction!goodSelectOneHead?id="+bookid+"",
			scripts : true
		},
		autoScroll : true
	});
	bookPan.show();
}