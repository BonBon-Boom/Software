package com.vanceinfo.school.struts.action;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.validator.LazyValidatorForm;

public class MyForm extends LazyValidatorForm {

  
	private static final long serialVersionUID = 1L;

	public Object toBean(Object obj) {
		try {
			BeanUtils.copyProperties(obj, this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	public MyForm fromBean(Object obj) {
		try {
			BeanUtils.copyProperties(this, obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

}
