package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UnlockExtDDAP {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private Integer bookings;
	private Integer ext;
	private Integer mao_ho_aprr;
	private Integer mao_appr_ext;
	private Integer percentage;
	
	
	public UnlockExtDDAP() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UnlockExtDDAP(String dname, Integer bookings, Integer ext, Integer mao_ho_aprr, Integer mao_appr_ext,
			Integer percentage) {
		super();
		this.dname = dname;
		this.bookings = bookings;
		this.ext = ext;
		this.mao_ho_aprr = mao_ho_aprr;
		this.mao_appr_ext = mao_appr_ext;
		this.percentage = percentage;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Integer getBookings() {
		return bookings;
	}


	public void setBookings(Integer bookings) {
		this.bookings = bookings;
	}


	public Integer getExt() {
		return ext;
	}


	public void setExt(Integer ext) {
		this.ext = ext;
	}


	public Integer getMao_ho_aprr() {
		return mao_ho_aprr;
	}


	public void setMao_ho_aprr(Integer mao_ho_aprr) {
		this.mao_ho_aprr = mao_ho_aprr;
	}


	public Integer getMao_appr_ext() {
		return mao_appr_ext;
	}


	public void setMao_appr_ext(Integer mao_appr_ext) {
		this.mao_appr_ext = mao_appr_ext;
	}


	public Integer getPercentage() {
		return percentage;
	}


	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return "UnlockExtDDAP [dname=" + dname + ", bookings=" + bookings + ", ext=" + ext + ", mao_ho_aprr="
				+ mao_ho_aprr + ", mao_appr_ext=" + mao_appr_ext + ", percentage=" + percentage + "]";
	}
	
	
	

}
