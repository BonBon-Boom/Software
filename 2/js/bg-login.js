
function redirect(){
	window.location.href='../pages/index.htm'
}


function showLoginPanel() {
	Ext.QuickTips.init();
	Ext.form.Field.prototype.msgTarget = "side";
	Ext.lib.Ajax.defaultPostHeader += ";charset=utf-8";
	Ext.state.Manager.setProvider(new Ext.state.CookieProvider());
	var loginform = new Ext.FormPanel({
		defaultType : "textfield",
		bodyStyle : "padding:10 0 5 0",
		labelWidth : 50,
		labelAlign : "right",
		style : "background:#ffffff;padding:25px 35px 30px 16px;",
		region : "center",
		defaults : {
			allowBlank : false,
			vtype : "alphanum",
			width : 120,
			minLength : 6,
			maxLength : 12
		},
		waitMsgTarget : true,
		items : [{
			fieldLabel : "\u8d26 \u53f7",
			name : "name",
			id:'name',
			blankText : '账号不能为空'
		}, {
			fieldLabel : "\u5bc6 \u7801",
			name : "psw",
			id:'psw',
			inputType : "password",
			blankText : '密码不能为空'
		}],
		buttons : [{
			text : "\u767b  \u5f55",
			handler : function() {;
				var confirmBut = this;

				if (!loginform.getForm().isValid()) { 
					return;
				} else {
					var loginForm = loginform.form;
					loginForm.doAction('submit', {
						url : "checkLogin!loginCheck",
						method : 'post',
						waitMsg : '正在提交，请稍等...',
						success : function(form, action) {
//							if (action.result.msg == 'ok') {
							   
								Ext.MessageBox.alert('登录成功', '恭喜您，登录成功！');
								redirect();
//							}					
//						else if (action.result.msg == 'error'){
//							Ext.Msg.alert('登陆失败', "用户名或密码错误！");
//							Ext.getCmp('account').setValue('');
//							Ext.getCmp('password').setValue('');
//								
//							}
						},
						failure : function(form, action) {
//							Ext.MessageBox.alert('对不起', '系统忙，后台服务器正在启动,请稍后...');
//							confirmBut.setText("登录");
//							confirmBut.disabled = false;
 							Ext.MessageBox.alert('登陆失败', '网络繁忙...！');
						}
					});
				}
			}
		}, {
			text : "\u53d6 \u6d88",
			handler : function() {
				loginform.getForm().reset();
			}
		}]
	});
	var panel = new Ext.Panel({
		renderTo : "sysloginpanel",
		layout : "border",
		width : 525,
		height : 290,
		defaults : {
			border : false
		},
		items : [{
			region : "north",
			height : 56,
			html : "<img src=\"../images/system/head.gif\"/>"
		}, {
			region : "south",
			height : 56,
			html : "<img src=\"../images/system/foot.gif\"/>"
		}, {
			region : "west",
			width : 253,
			html : "<img src=\"../images/system/left.gif\"/>"
		}, loginform]
	});
}
Ext.onReady(showLoginPanel);
