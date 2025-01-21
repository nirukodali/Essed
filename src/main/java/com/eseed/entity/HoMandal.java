package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "mandal_2011_cs")
public class HoMandal {
	
	@Id
	private Integer mcode;
	
	private String mname;
	
	private Integer dcode;
	
	private Integer wbmcode;

	public Integer getMcode() {
		return mcode;
	}

	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public Integer getWbmcode() {
		return wbmcode;
	}

	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}

	@Override
	public String toString() {
		return "HoMandal [mcode=" + mcode + ", mname=" + mname + ", dcode=" + dcode + ", wbmcode=" + wbmcode + "]";
	}
	
	
	
	
}
