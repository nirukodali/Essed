package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="District_2011_cs")
public class DistrictCsEntity {
	
	@Id
	@Column(name="dcode")
	private Integer dcode;
	
	@Column(name="dname")
	private String  dname;
	
	@Column(name="wbdcode")
	private String  wbdcode;
	
	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getWbdcode() {
		return wbdcode;
	}

	public void setWbdcode(String wbdcode) {
		this.wbdcode = wbdcode;
	}
	
	
	

}