package com.eseed.entity;

import javax.persistence.Entity; 
import javax.persistence.Id;
@Entity
public class Wbvillage_mstFfekycm {
	
	@Id
	private String mname;
	private String wbdname;
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getWbdname() {
		return wbdname;
	}
	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}
	
}
