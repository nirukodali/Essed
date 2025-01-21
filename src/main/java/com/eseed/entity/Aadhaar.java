package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_registration")
public class Aadhaar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String district;
	private String updatedcount;
	private String notupdatedcount;
	
	
	public Aadhaar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aadhaar(String district, String updatedcount, String notupdatedcount) {
		super();
		this.district = district;
		this.updatedcount = updatedcount;
		this.notupdatedcount = notupdatedcount;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getUpdatedcount() {
		return updatedcount;
	}
	public void setUpdatedcount(String updatedcount) {
		this.updatedcount = updatedcount;
	}
	public String getNotupdatedcount() {
		return notupdatedcount;
	}
	public void setNotupdatedcount(String notupdatedcount) {
		this.notupdatedcount = notupdatedcount;
	}
	@Override
	public String toString() {
		return "Aadhaar [district=" + district + ", updatedcount=" + updatedcount + ", notupdatedcount="
				+ notupdatedcount + "]";
	}
	
	

}
