package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="district_2011_cs")
public class DistrictEntity {
	
	@Id
	@Column(name = "dcode")
	private Integer dcode;

	@Column(name = "dname")
	private String dname;
	
	

	@Override
	public String toString() {
		return "DistrictEntity [dcode=" + dcode + ", dname=" + dname + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



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



	public DistrictEntity() {
	}

}
