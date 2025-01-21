package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dist_mand_names_v")
public class HoDistrictView {

	@Id 
	@Column(name="dcode")
	private Integer dcode;
	
	@Column(name="mcode")
	private Integer mcode;
	
	@Column(name="dname")
	private String dname;
	
	@Column(name="mname")
	private String mname;
	
	@Column(name="wbdcode")
	private Integer wbdcode;

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public Integer getMcode() {
		return mcode;
	}

	public void setMcode(Integer mcode) {
		this.mcode = mcode;
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

	public Integer getWbdcode() {
		return wbdcode;
	}

	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}
	
	
}
