package com.eseed.entity;

import javax.persistence.Entity;  
import javax.persistence.Id;

@Entity
public class Wbvillage_mstFfekyc {
	
	@Id
	private String mname;
	private String wbdname;
	public Wbvillage_mstFfekyc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wbvillage_mstFfekyc(String mname, String wbdname) {
		super();
		this.mname = mname;
		this.wbdname = wbdname;
	}
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
	@Override
	public String toString() {
		return "Wbvillage_mstFfekyc [mname=" + mname + ", wbdname=" + wbdname + "]";
	}
	
	
}
