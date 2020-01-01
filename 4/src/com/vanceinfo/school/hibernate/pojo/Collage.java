package com.vanceinfo.school.hibernate.pojo;

import java.io.Serializable;
import java.util.Set;

/*******************************************************************************
 * @Collage 学院bean id 学院ID name 学院名称 content 学院简介
 ******************************************************************************/

// 学院 专业 1:n 一对多
public class Collage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String content;
	private Set<Professions> professions;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<Professions> getProfessions() {
		return professions;
	}

	public void setProfessions(Set<Professions> professions) {
		this.professions = professions;
	}

}
