package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "district_2011_cs")
public class HoDistrict {
	
	@Id
	@Column(name="dcode")
	private Integer distcode;
	
	@Column(name="dname")
	private String distname;

	public Integer getDistcode() {
		return distcode;
	}

	public void setDistcode(Integer distcode) {
		this.distcode = distcode;
	}

	public String getDistname() {
		return distname;
	}

	public void setDistname(String distname) {
		this.distname = distname;
	}

	
}
