package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RepUnlock {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private String dname ;
	private String mname;
	private String lgdvname;
	private BigDecimal bookings;
	private BigDecimal ext;
	private BigDecimal mao_ho_appr;
	private BigDecimal mao_appr_ext;
	private BigDecimal percentage;
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
	public String getLgdvname() {
		return lgdvname;
	}
	public void setLgdvname(String lgdvname) {
		this.lgdvname = lgdvname;
	}
	public BigDecimal getBookings() {
		return bookings;
	}
	public void setBookings(BigDecimal bookings) {
		this.bookings = bookings;
	}
	public BigDecimal getExt() {
		return ext;
	}
	public void setExt(BigDecimal ext) {
		this.ext = ext;
	}
	public BigDecimal getMao_ho_appr() {
		return mao_ho_appr;
	}
	public void setMao_ho_appr(BigDecimal mao_ho_appr) {
		this.mao_ho_appr = mao_ho_appr;
	}
	public BigDecimal getMao_appr_ext() {
		return mao_appr_ext;
	}
	public void setMao_appr_ext(BigDecimal mao_appr_ext) {
		this.mao_appr_ext = mao_appr_ext;
	}
	public BigDecimal getPercentage() {
		return percentage;
	}
	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}
	
	
}
