
// 创建商城公告
function createAbffPan() {

	var affPanel = new Ext.FormPanel({
		height : 160,
		renderTo:'left',
		style : 'padding:5px 5px 0 5px',
		title : "最 新 公 告",
		draggable : true,
		iconCls : 'affiche',
		frame : true,
		collapsible : true,
		autoLoad : {
			url : 'notice.jsp',
			scripts : true
		}
	});

	return affPanel;
}





Ext.onReady(function() {
	Ext.QuickTips.init();// 开启表单提示
	Ext.form.Field.prototype.msgTarget = 'side';// 设置提示信息位置为边上
	Ext.BLANK_IMAGE_URL = '../js/ext/resources/images/default/s.gif';// 空白图片设置
	// 页面加载提醒
	var myMask = new Ext.LoadMask(Ext.getBody(), {
		msg : "页面加载中请稍后...",
		removeMask : true
	});
   createAbffPan();
});
