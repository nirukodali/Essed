package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AadhaarCN {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private Long updatedcount;
	private Long notupdatedcount;
	private String district;
	
	
	public AadhaarCN() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AadhaarCN(String dname, Long updatedcount, Long notupdatedcount, String district) {
		super();
		this.dname = dname;
		this.updatedcount = updatedcount;
		this.notupdatedcount = notupdatedcount;
		this.district = district;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Long getUpdatedcount() {
		return updatedcount;
	}


	public void setUpdatedcount(Long updatedcount) {
		this.updatedcount = updatedcount;
	}


	public Long getNotupdatedcount() {
		return notupdatedcount;
	}


	public void setNotupdatedcount(Long notupdatedcount) {
		this.notupdatedcount = notupdatedcount;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	@Override
	public String toString() {
		return "AadhaarCN [dname=" + dname + ", updatedcount=" + updatedcount + ", notupdatedcount=" + notupdatedcount
				+ ", district=" + district + "]";
	}
	
	

}
