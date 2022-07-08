package com.oc.tuto.demo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Amazing")
public class AmazingBean {
	
	private String info="Ca va?";

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}	

}
