package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PhyAckVwise {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private String wbvname;   
	private Long ackcount; 
	private Long ekycfarmercount;
	private String wbdcode; 
	private String wbmcode;
	private String wbdname;
	private String wbmname;
	public PhyAckVwise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhyAckVwise(String wbvname, Long ackcount, Long ekycfarmercount, String wbdcode, String wbmcode,
			String wbdname, String wbmname) {
		super();
		this.wbvname = wbvname;
		this.ackcount = ackcount;
		this.ekycfarmercount = ekycfarmercount;
		this.wbdcode = wbdcode;
		this.wbmcode = wbmcode;
		this.wbdname = wbdname;
		this.wbmname = wbmname;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public Long getAckcount() {
		return ackcount;
	}
	public void setAckcount(Long ackcount) {
		this.ackcount = ackcount;
	}
	public Long getEkycfarmercount() {
		return ekycfarmercount;
	}
	public void setEkycfarmercount(Long ekycfarmercount) {
		this.ekycfarmercount = ekycfarmercount;
	}
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
	public String getWbdname() {
		return wbdname;
	}
	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}
	public String getWbmname() {
		return wbmname;
	}
	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}
	@Override
	public String toString() {
		return "PhyAckVwise [wbvname=" + wbvname + ", ackcount=" + ackcount + ", ekycfarmercount=" + ekycfarmercount
				+ ", wbdcode=" + wbdcode + ", wbmcode=" + wbmcode + ", wbdname=" + wbdname + ", wbmname=" + wbmname
				+ "]";
	}

	
}
