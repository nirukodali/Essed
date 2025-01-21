package com.eseed.entity;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class AuthvAAvROadaEKYC {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private String wbmname;
	 private BigDecimal totfarmercount;
	 private BigDecimal totalbookings; 
	 private BigDecimal  totextent;
	 private BigDecimal  vaaauthcount; 
	 private BigDecimal  vaaauthextent; 
	 private BigDecimal  vroauthcount;
	 private BigDecimal vroauthextent;
	 private BigDecimal totekycbookings;
	 private BigDecimal ekycfarmercount;
	 private BigDecimal ekycbookedext;
	public AuthvAAvROadaEKYC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthvAAvROadaEKYC(String wbmname, BigDecimal totfarmercount, BigDecimal totalbookings, BigDecimal totextent,
			BigDecimal vaaauthcount, BigDecimal vaaauthextent, BigDecimal vroauthcount, BigDecimal vroauthextent,
			BigDecimal totekycbookings, BigDecimal ekycfarmercount, BigDecimal ekycbookedext) {
		super();
		this.wbmname = wbmname;
		this.totfarmercount = totfarmercount;
		this.totalbookings = totalbookings;
		this.totextent = totextent;
		this.vaaauthcount = vaaauthcount;
		this.vaaauthextent = vaaauthextent;
		this.vroauthcount = vroauthcount;
		this.vroauthextent = vroauthextent;
		this.totekycbookings = totekycbookings;
		this.ekycfarmercount = ekycfarmercount;
		this.ekycbookedext = ekycbookedext;
	}
	public String getWbmname() {
		return wbmname;
	}
	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}
	public BigDecimal getTotfarmercount() {
		return totfarmercount;
	}
	public void setTotfarmercount(BigDecimal totfarmercount) {
		this.totfarmercount = totfarmercount;
	}
	public BigDecimal getTotalbookings() {
		return totalbookings;
	}
	public void setTotalbookings(BigDecimal totalbookings) {
		this.totalbookings = totalbookings;
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
	@Override
	public String toString() {
		return "AuthvAAvROadaEKYC [wbmname=" + wbmname + ", totfarmercount=" + totfarmercount + ", totalbookings="
				+ totalbookings + ", totextent=" + totextent + ", vaaauthcount=" + vaaauthcount + ", vaaauthextent="
				+ vaaauthextent + ", vroauthcount=" + vroauthcount + ", vroauthextent=" + vroauthextent
				+ ", totekycbookings=" + totekycbookings + ", ekycfarmercount=" + ekycfarmercount + ", ekycbookedext="
				+ ekycbookedext + "]";
	}
	 
	 
}
