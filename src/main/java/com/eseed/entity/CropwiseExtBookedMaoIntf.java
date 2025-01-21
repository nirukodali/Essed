package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class CropwiseExtBookedMaoIntf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbvname;
	private BigDecimal totext;
	private Integer wbvcode;
	
	public CropwiseExtBookedMaoIntf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropwiseExtBookedMaoIntf(String wbvname, BigDecimal totext, Integer wbvcode) {
		super();
		this.wbvname = wbvname;
		this.totext = totext;
		this.wbvcode = wbvcode;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public BigDecimal getTotext() {
		return totext;
	}
	public void setTotext(BigDecimal totext) {
		this.totext = totext;
	}
	public Integer getWbvcode() {
		return wbvcode;
	}
	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}
	@Override
	public String toString() {
		return "CropwiseExtBookedMaoIntf [wbvname=" + wbvname + ", totext=" + totext + ", wbvcode=" + wbvcode + "]";
	}
	
	

}
