package com.vanceinfo.school.hibernate.pojo;

import java.io.Serializable;
import java.util.Set;

/************************
 *@Profession   专业bean
 * id           专业(系)ID
 * name         专业名称
 **********************/

//专业  班级    1：n    一对多

public class Professions implements Serializable  {
	 
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Collage collage;
	private Set<Classes> classes;
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
	public Collage getCollage() {
		return collage;
	}
	public void setCollage(Collage collage) {
		this.collage = collage;
	}
	public Set<Classes> getClasses() {
		return classes;
	}
	public void setClasses(Set<Classes> classes) {
		this.classes = classes;
	}
 
	

}
