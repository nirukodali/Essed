package com.eseed.entity;

import java.math.BigInteger;

public class SocialAuditMonoValidCheckEntity {
	
private int sowType;
	
	private String season;
	
	private int dcode;
	
	private int bookingid;
	
	private int year;
	
	private BigInteger count;

	public int getSowType() {
		return sowType;
	}

	public void setSowType(int sowType) {
		this.sowType = sowType;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public int getDcode() {
		return dcode;
	}

	public void setDcode(int dcode) {
		this.dcode = dcode;
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public BigInteger getCount() {
		return count;
	}

	public void setCount(BigInteger count) {
		this.count = count;
	}
	
}
