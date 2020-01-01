package com.vanceinfo.school.hibernate.pojo;

import java.io.Serializable;


/************************
 *@Admin         管理员bean
 * id            管理员ID
 * name          管理员用户名
 * psw           管理员密码    
 * publicKey     管理员CA公钥    
 **********************/

public class Admin implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String psw; 
	private String publicKey;
 
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	 

}
