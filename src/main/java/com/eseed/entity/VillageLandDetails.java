package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class VillageLandDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dcode;
	private String wbdname;
	private String dname;
	private String mname;
	private String wbvname;
	private Integer mcode;
	private Integer wbmcode;
	private Integer no_of_records;
	
	
	public VillageLandDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VillageLandDetails(Integer dcode, String wbdname, String dname, String mname, String wbvname, Integer mcode,
			Integer wbmcode, Integer no_of_records) {
		super();
		this.dcode = dcode;
		this.wbdname = wbdname;
		this.dname = dname;
		this.mname = mname;
		this.wbvname = wbvname;
		this.mcode = mcode;
		this.wbmcode = wbmcode;
		this.no_of_records = no_of_records;
	}


	public Integer getDcode() {
		return dcode;
	}


	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}


	public String getWbdname() {
		return wbdname;
	}


	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
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


	public Integer getMcode() {
		return mcode;
	}


	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}


	public Integer getWbmcode() {
		return wbmcode;
	}


	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}


	public Integer getNo_of_records() {
		return no_of_records;
	}


	public void setNo_of_records(Integer no_of_records) {
		this.no_of_records = no_of_records;
	}


	@Override
	public String toString() {
		return "VillageLandDetails [dcode=" + dcode + ", wbdname=" + wbdname + ", dname=" + dname + ", mname=" + mname
				+ ", wbvname=" + wbvname + ", mcode=" + mcode + ", wbmcode=" + wbmcode + ", no_of_records="
				+ no_of_records + "]";
	}
	
	

}
