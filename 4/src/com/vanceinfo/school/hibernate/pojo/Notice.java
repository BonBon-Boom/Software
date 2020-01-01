package com.vanceinfo.school.hibernate.pojo;

public class Notice {

	/************************
	 *@Notice       公告bean
	 * id           公告Id
	 * content      公告内容
	 **********************/
	private int id;
	private String title;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
