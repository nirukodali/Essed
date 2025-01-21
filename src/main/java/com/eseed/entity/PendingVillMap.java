package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PendingVillMap {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer wbdcode;
	private String wbdname;
	private Integer wbmcode;
	private String wbmname;
	private Integer wbvcode;
	private String wbvname;
	
	public PendingVillMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PendingVillMap(Integer wbdcode, String wbdname, Integer wbmcode, String wbmname, Integer wbvcode,
			String wbvname) {
		super();
		this.wbdcode = wbdcode;
		this.wbdname = wbdname;
		this.wbmcode = wbmcode;
		this.wbmname = wbmname;
		this.wbvcode = wbvcode;
		this.wbvname = wbvname;
	}

	public Integer getWbdcode() {
		return wbdcode;
	}

	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}

	public String getWbdname() {
		return wbdname;
	}

	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}

	public Integer getWbmcode() {
		return wbmcode;
	}

	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}

	public String getWbmname() {
		return wbmname;
	}

	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}

	public Integer getWbvcode() {
		return wbvcode;
	}

	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}

	public String getWbvname() {
		return wbvname;
	}

	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}

	@Override
	public String toString() {
		return "PendingVillMap [wbdcode=" + wbdcode + ", wbdname=" + wbdname + ", wbmcode=" + wbmcode + ", wbmname="
				+ wbmname + ", wbvcode=" + wbvcode + ", wbvname=" + wbvname + "]";
	}
	

}
