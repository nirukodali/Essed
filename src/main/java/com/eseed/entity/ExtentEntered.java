package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ExtentEntered {
	private String wbedname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Number context;
	
	public ExtentEntered() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExtentEntered(String wbedname, Number context) {
		super();
		this.wbedname = wbedname;
		this.context = context;
	}

	public String getWbedname() {
		return wbedname;
	}

	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}

	public Number getContext() {
		return context;
	}

	public void setContext(Number context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "ExtentEntered [wbedname=" + wbedname + ", context=" + context + "]";
	}
	

}
