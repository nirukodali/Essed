package com.eseed.entity;

import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CrBookingAbsIntf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String mname;
	private BigDecimal totext;
	private String totnormalarea;
	private String dcode;
	private String mcode;
	private String wbvname;
	public CrBookingAbsIntf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CrBookingAbsIntf(String dname, String mname, BigDecimal totext, String totnormalarea, String dcode,
			String mcode, String wbvname) {
		super();
		this.dname = dname;
		this.mname = mname;
		this.totext = totext;
		this.totnormalarea = totnormalarea;
		this.dcode = dcode;
		this.mcode = mcode;
		this.wbvname = wbvname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public BigDecimal getTotext() {
		return totext;
	}
	public void setTotext(BigDecimal totext) {
		this.totext = totext;
	}
	public String getTotnormalarea() {
		return totnormalarea;
	}
	public void setTotnormalarea(String totnormalarea) {
		this.totnormalarea = totnormalarea;
	}
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	public String getMcode() {
		return mcode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	@Override
	public String toString() {
		return "CrBookingAbsIntf [dname=" + dname + ", mname=" + mname + ", totext=" + totext + ", totnormalarea="
				+ totnormalarea + ", dcode=" + dcode + ", mcode=" + mcode + ", wbvname=" + wbvname + "]";
	}
	

	
	
}
