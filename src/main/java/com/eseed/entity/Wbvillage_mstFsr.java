package com.eseed.entity;

import javax.persistence.Entity; 
import javax.persistence.Id;

@Entity
public class Wbvillage_mstFsr {
	
	@Id
	private String wbdcode;
	private String wbmcode;
	private String wbvcode;
	public String getWbdcode() {
		return wbdcode;
	}
	public void setWbdcode(String wbdcode) {
		this.wbdcode = wbdcode;
	}
	public String getWbmcode() {
		return wbmcode;
	}
	public void setWbmcode(String wbmcode) {
		this.wbmcode = wbmcode;
	}
	public String getWbvcode() {
		return wbvcode;
	}
	public void setWbvcode(String wbvcode) {
		this.wbvcode = wbvcode;
	}
	
	
}
