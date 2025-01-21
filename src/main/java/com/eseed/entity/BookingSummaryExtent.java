package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BookingSummaryExtent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbedname;
	private String bookedextent;
	private String vaaselectedext;
	private String mappedextent;
	
	
	public BookingSummaryExtent() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BookingSummaryExtent(String wbedname, String bookedextent, String vaaselectedext, String mappedextent) {
		super();
		this.wbedname = wbedname;
		this.bookedextent = bookedextent;
		this.vaaselectedext = vaaselectedext;
		this.mappedextent = mappedextent;
	}


	public String getWbedname() {
		return wbedname;
	}


	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}


	public String getBookedextent() {
		return bookedextent;
	}


	public void setBookedextent(String bookedextent) {
		this.bookedextent = bookedextent;
	}


	public String getVaaselectedext() {
		return vaaselectedext;
	}


	public void setVaaselectedext(String vaaselectedext) {
		this.vaaselectedext = vaaselectedext;
	}


	public String getMappedextent() {
		return mappedextent;
	}


	public void setMappedextent(String mappedextent) {
		this.mappedextent = mappedextent;
	}


	@Override
	public String toString() {
		return "BookingSummaryExtent [wbedname=" + wbedname + ", bookedextent=" + bookedextent + ", vaaselectedext="
				+ vaaselectedext + ", mappedextent=" + mappedextent + "]";
	}


	
	
}
