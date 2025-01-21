package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PhysicalAck {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer wbdcode;
	private String dname;
	private Integer ekycfarmercount;
	private Integer fcount;
	
	
	public PhysicalAck() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PhysicalAck(Integer wbdcode, String dname, Integer ekycfarmercount, Integer fcount) {
		super();
		this.wbdcode = wbdcode;
		this.dname = dname;
		this.ekycfarmercount = ekycfarmercount;
		this.fcount = fcount;
	}


	public Integer getWbdcode() {
		return wbdcode;
	}


	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Integer getEkycfarmercount() {
		return ekycfarmercount;
	}


	public void setEkycfarmercount(Integer ekycfarmercount) {
		this.ekycfarmercount = ekycfarmercount;
	}


	public Integer getFcount() {
		return fcount;
	}


	public void setFcount(Integer fcount) {
		this.fcount = fcount;
	}


	@Override
	public String toString() {
		return "PhysicalAck [wbdcode=" + wbdcode + ", dname=" + dname + ", ekycfarmercount=" + ekycfarmercount
				+ ", fcount=" + fcount + "]";
	}
	
	

}
