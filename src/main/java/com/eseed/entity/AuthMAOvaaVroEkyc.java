package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AuthMAOvaaVroEkyc {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String  rbk;
	private String totalbookings ;
	private String totextent;
	private String vaaauthcount ;
	private String vaaauthextent ;
	private String vroauthcount ;
	private String vroauthextent ;
	private String totekycbookings ; 
	private String totfarmercount;
	private String ekycfarmercount;
	private String ekycbookedext;
	public AuthMAOvaaVroEkyc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthMAOvaaVroEkyc(String rbk, String totalbookings, String totextent, String vaaauthcount,
			String vaaauthextent, String vroauthcount, String vroauthextent, String totekycbookings,
			String totfarmercount, String ekycfarmercount, String ekycbookedext) {
		super();
		this.rbk = rbk;
		this.totalbookings = totalbookings;
		this.totextent = totextent;
		this.vaaauthcount = vaaauthcount;
		this.vaaauthextent = vaaauthextent;
		this.vroauthcount = vroauthcount;
		this.vroauthextent = vroauthextent;
		this.totekycbookings = totekycbookings;
		this.totfarmercount = totfarmercount;
		this.ekycfarmercount = ekycfarmercount;
		this.ekycbookedext = ekycbookedext;
	}
	public String getRbk() {
		return rbk;
	}
	public void setRbk(String rbk) {
		this.rbk = rbk;
	}
	public String getTotalbookings() {
		return totalbookings;
	}
	public void setTotalbookings(String totalbookings) {
		this.totalbookings = totalbookings;
	}
	public String getTotextent() {
		return totextent;
	}
	public void setTotextent(String totextent) {
		this.totextent = totextent;
	}
	public String getVaaauthcount() {
		return vaaauthcount;
	}
	public void setVaaauthcount(String vaaauthcount) {
		this.vaaauthcount = vaaauthcount;
	}
	public String getVaaauthextent() {
		return vaaauthextent;
	}
	public void setVaaauthextent(String vaaauthextent) {
		this.vaaauthextent = vaaauthextent;
	}
	public String getVroauthcount() {
		return vroauthcount;
	}
	public void setVroauthcount(String vroauthcount) {
		this.vroauthcount = vroauthcount;
	}
	public String getVroauthextent() {
		return vroauthextent;
	}
	public void setVroauthextent(String vroauthextent) {
		this.vroauthextent = vroauthextent;
	}
	public String getTotekycbookings() {
		return totekycbookings;
	}
	public void setTotekycbookings(String totekycbookings) {
		this.totekycbookings = totekycbookings;
	}
	public String getTotfarmercount() {
		return totfarmercount;
	}
	public void setTotfarmercount(String totfarmercount) {
		this.totfarmercount = totfarmercount;
	}
	public String getEkycfarmercount() {
		return ekycfarmercount;
	}
	public void setEkycfarmercount(String ekycfarmercount) {
		this.ekycfarmercount = ekycfarmercount;
	}
	public String getEkycbookedext() {
		return ekycbookedext;
	}
	public void setEkycbookedext(String ekycbookedext) {
		this.ekycbookedext = ekycbookedext;
	}
	@Override
	public String toString() {
		return "AuthMAOvaaVroEkyc [rbk=" + rbk + ", totalbookings=" + totalbookings + ", totextent=" + totextent
				+ ", vaaauthcount=" + vaaauthcount + ", vaaauthextent=" + vaaauthextent + ", vroauthcount="
				+ vroauthcount + ", vroauthextent=" + vroauthextent + ", totekycbookings=" + totekycbookings
				+ ", totfarmercount=" + totfarmercount + ", ekycfarmercount=" + ekycfarmercount + ", ekycbookedext="
				+ ekycbookedext + "]";
	}
	
	

}
