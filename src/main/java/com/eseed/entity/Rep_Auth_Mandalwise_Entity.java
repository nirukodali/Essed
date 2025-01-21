package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rep_Auth_Mandalwise_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbmname;
	private BigDecimal totalbookings;
	private BigDecimal totfarmercount;
	private BigDecimal totextent;
	private BigDecimal vaaauthcount;
	private BigDecimal vaaauthextent;
	private BigDecimal vroauthcount;
	private BigDecimal vroauthextent;
	private BigDecimal totekycbookings;
	private BigDecimal ekycfarmercount;
	private BigDecimal ekycbookedext;
	
	@Override
	public String toString() {
		return "Rep_Auth_Mandalwise_Entity [wbmname=" + wbmname + ", totalbookings=" + totalbookings
				+ ", totfarmercount=" + totfarmercount + ", totextent=" + totextent + ", vaaauthcount=" + vaaauthcount
				+ ", vaaauthextent=" + vaaauthextent + ", vroauthcount=" + vroauthcount + ", vroauthextent="
				+ vroauthextent + ", totekycbookings=" + totekycbookings + ", ekycfarmercount=" + ekycfarmercount
				+ ", ekycbookedext=" + ekycbookedext + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Rep_Auth_Mandalwise_Entity(String wbmname, BigDecimal totalbookings, BigDecimal totfarmercount,
			BigDecimal totextent, BigDecimal vaaauthcount, BigDecimal vaaauthextent, BigDecimal vroauthcount,
			BigDecimal vroauthextent, BigDecimal totekycbookings, BigDecimal ekycfarmercount,
			BigDecimal ekycbookedext) {
		super();
		this.wbmname = wbmname;
		this.totalbookings = totalbookings;
		this.totfarmercount = totfarmercount;
		this.totextent = totextent;
		this.vaaauthcount = vaaauthcount;
		this.vaaauthextent = vaaauthextent;
		this.vroauthcount = vroauthcount;
		this.vroauthextent = vroauthextent;
		this.totekycbookings = totekycbookings;
		this.ekycfarmercount = ekycfarmercount;
		this.ekycbookedext = ekycbookedext;
	}

	public Rep_Auth_Mandalwise_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getWbmname() {
		return wbmname;
	}

	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}

	public BigDecimal getTotalbookings() {
		return totalbookings;
	}

	public void setTotalbookings(BigDecimal totalbookings) {
		this.totalbookings = totalbookings;
	}

	public BigDecimal getTotfarmercount() {
		return totfarmercount;
	}

	public void setTotfarmercount(BigDecimal totfarmercount) {
		this.totfarmercount = totfarmercount;
	}

	public BigDecimal getTotextent() {
		return totextent;
	}

	public void setTotextent(BigDecimal totextent) {
		this.totextent = totextent;
	}

	public BigDecimal getVaaauthcount() {
		return vaaauthcount;
	}

	public void setVaaauthcount(BigDecimal vaaauthcount) {
		this.vaaauthcount = vaaauthcount;
	}

	public BigDecimal getVaaauthextent() {
		return vaaauthextent;
	}

	public void setVaaauthextent(BigDecimal vaaauthextent) {
		this.vaaauthextent = vaaauthextent;
	}

	public BigDecimal getVroauthcount() {
		return vroauthcount;
	}

	public void setVroauthcount(BigDecimal vroauthcount) {
		this.vroauthcount = vroauthcount;
	}

	public BigDecimal getVroauthextent() {
		return vroauthextent;
	}

	public void setVroauthextent(BigDecimal vroauthextent) {
		this.vroauthextent = vroauthextent;
	}

	public BigDecimal getTotekycbookings() {
		return totekycbookings;
	}

	public void setTotekycbookings(BigDecimal totekycbookings) {
		this.totekycbookings = totekycbookings;
	}

	public BigDecimal getEkycfarmercount() {
		return ekycfarmercount;
	}

	public void setEkycfarmercount(BigDecimal ekycfarmercount) {
		this.ekycfarmercount = ekycfarmercount;
	}

	public BigDecimal getEkycbookedext() {
		return ekycbookedext;
	}

	public void setEkycbookedext(BigDecimal ekycbookedext) {
		this.ekycbookedext = ekycbookedext;
	}
		
	
}