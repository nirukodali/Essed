package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StateWiseCropIrriAbsIntf {
	
	private BigDecimal totext;
	@ Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer  cr_vcode;
	private String  dname;
	private String  mname;
	private String  wbvname;
	public StateWiseCropIrriAbsIntf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StateWiseCropIrriAbsIntf(BigDecimal totext, Integer cr_vcode, String dname, String mname, String wbvname) {
		super();
		this.totext = totext;
		this.cr_vcode = cr_vcode;
		this.dname = dname;
		this.mname = mname;
		this.wbvname = wbvname;
	}
	public BigDecimal getTotext() {
		return totext;
	}
	public void setTotext(BigDecimal totext) {
		this.totext = totext;
	}
	public Integer getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(Integer cr_vcode) {
		this.cr_vcode = cr_vcode;
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
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	@Override
	public String toString() {
		return "StateWiseCropIrriAbsIntf [totext=" + totext + ", cr_vcode=" + cr_vcode + ", dname=" + dname + ", mname="
				+ mname + ", wbvname=" + wbvname + "]";
	}
	
	
}
