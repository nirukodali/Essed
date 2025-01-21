package com.eseed.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rep_Auth_Villagewise_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mname;
	private String vname;
	private String rbk;
	private BigInteger totalbookings;
	private BigInteger totfarmercount;	
	private BigDecimal totextent;
	private BigInteger vaaauthcount;
	private BigDecimal vaaauthextent;
	private BigInteger vroauthcount;
	private BigDecimal vroauthextent;
	private BigInteger totekycbookings;
	private BigInteger ekycfarmercount;
	private BigDecimal ekycbookedext;
	@Override
	public String toString() {
		return "Rep_Auth_Villagewise_Entity [mname=" + mname + ", vname=" + vname + ", rbk=" + rbk + ", totalbookings="
				+ totalbookings + ", totfarmercount=" + totfarmercount + ", totextent=" + totextent + ", vaaauthcount="
				+ vaaauthcount + ", vaaauthextent=" + vaaauthextent + ", vroauthcount=" + vroauthcount
				+ ", vroauthextent=" + vroauthextent + ", totekycbookings=" + totekycbookings + ", ekycfarmercount="
				+ ekycfarmercount + ", ekycbookedext=" + ekycbookedext + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Rep_Auth_Villagewise_Entity(String mname, String vname, String rbk, BigInteger totalbookings,
			BigInteger totfarmercount, BigDecimal totextent, BigInteger vaaauthcount, BigDecimal vaaauthextent,
			BigInteger vroauthcount, BigDecimal vroauthextent, BigInteger totekycbookings, BigInteger ekycfarmercount,
			BigDecimal ekycbookedext) {
		super();
		this.mname = mname;
		this.vname = vname;
		this.rbk = rbk;
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
	public Rep_Auth_Villagewise_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getRbk() {
		return rbk;
	}
	public void setRbk(String rbk) {
		this.rbk = rbk;
	}
	public BigInteger getTotalbookings() {
		return totalbookings;
	}
	public void setTotalbookings(BigInteger totalbookings) {
		this.totalbookings = totalbookings;
	}
	public BigInteger getTotfarmercount() {
		return totfarmercount;
	}
	public void setTotfarmercount(BigInteger totfarmercount) {
		this.totfarmercount = totfarmercount;
	}
	public BigDecimal getTotextent() {
		return totextent;
	}
	public void setTotextent(BigDecimal totextent) {
		this.totextent = totextent;
	}
	public BigInteger getVaaauthcount() {
		return vaaauthcount;
	}
	public void setVaaauthcount(BigInteger vaaauthcount) {
		this.vaaauthcount = vaaauthcount;
	}
	public BigDecimal getVaaauthextent() {
		return vaaauthextent;
	}
	public void setVaaauthextent(BigDecimal vaaauthextent) {
		this.vaaauthextent = vaaauthextent;
	}
	public BigInteger getVroauthcount() {
		return vroauthcount;
	}
	public void setVroauthcount(BigInteger vroauthcount) {
		this.vroauthcount = vroauthcount;
	}
	public BigDecimal getVroauthextent() {
		return vroauthextent;
	}
	public void setVroauthextent(BigDecimal vroauthextent) {
		this.vroauthextent = vroauthextent;
	}
	public BigInteger getTotekycbookings() {
		return totekycbookings;
	}
	public void setTotekycbookings(BigInteger totekycbookings) {
		this.totekycbookings = totekycbookings;
	}
	public BigInteger getEkycfarmercount() {
		return ekycfarmercount;
	}
	public void setEkycfarmercount(BigInteger ekycfarmercount) {
		this.ekycfarmercount = ekycfarmercount;
	}
	public BigDecimal getEkycbookedext() {
		return ekycbookedext;
	}
	public void setEkycbookedext(BigDecimal ekycbookedext) {
		this.ekycbookedext = ekycbookedext;
	}
	
	
	
	
}
