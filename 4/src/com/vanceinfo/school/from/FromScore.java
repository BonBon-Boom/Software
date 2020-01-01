package com.vanceinfo.school.from;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class FromScore extends ActionForm{
	private int ID ;
	private String  source;
	public int getID() {
		return ID;
	}
	public void setID(int id) {
		ID = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
