package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="wbvillage_mst")
public class Master {
	
	@Id 
	@Column(name="wbdcode")
	private Integer wbDcode;
	@Column(name="wbmcode")
	private Integer wbMcode;
	@Column(name="wbedname")
	private String wbeDname;
	@Column(name="wbemname")
	private String wbeMname;
	public Master() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Master(Integer wbDcode, Integer wbMcode, String wbeDname, String wbeMname) {
		super();
		this.wbDcode = wbDcode;
		this.wbMcode = wbMcode;
		this.wbeDname = wbeDname;
		this.wbeMname = wbeMname;
	}
	public Integer getWbDcode() {
		return wbDcode;
	}
	public void setWbDcode(Integer wbDcode) {
		this.wbDcode = wbDcode;
	}
	public Integer getWbMcode() {
		return wbMcode;
	}
	public void setWbMcode(Integer wbMcode) {
		this.wbMcode = wbMcode;
	}
	public String getWbeDname() {
		return wbeDname;
	}
	public void setWbeDname(String wbeDname) {
		this.wbeDname = wbeDname;
	}
	public String getWbeMname() {
		return wbeMname;
	}
	public void setWbeMname(String wbeMname) {
		this.wbeMname = wbeMname;
	}
	@Override
	public String toString() {
		return "Master [wbDcode=" + wbDcode + ", wbMcode=" + wbMcode + ", wbeDname=" + wbeDname + ", wbeMname="
				+ wbeMname + "]";
	}
	
}
