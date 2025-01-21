package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PhyAckMwise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ackcount;
	private Long ekycfarmercount;
	private String wbdcode;
	private String wbmcode;
	private String wbdname;
	private String wbmname;

	public PhyAckMwise() {
		super();
	}

	public PhyAckMwise(Long ackcount, Long ekycfarmercount, String wbdcode, String wbmcode, String wbdname,
			String wbmname) {
		super();
		this.ackcount = ackcount;
		this.ekycfarmercount = ekycfarmercount;
		this.wbdcode = wbdcode;
		this.wbmcode = wbmcode;
		this.wbdname = wbdname;
		this.wbmname = wbmname;
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
		return "PhyAckVwise [ackcount=" + ackcount + ", ekycfarmercount=" + ekycfarmercount
				+ ", wbdcode=" + wbdcode + ", wbmcode=" + wbmcode + ", wbdname=" + wbdname + ", wbmname=" + wbmname
				+ "]";
	}

}
