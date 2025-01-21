package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AuthCropWise {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private Integer totfarmercount;
	private Integer totalbookings;
	private Integer totextent;
	private Integer vaaauthcount;
	private Integer vaaauthextent;
	private Integer vroauthcount;
	private Integer vroauthextent;
	private Integer totekycbookings;
	private Integer ekycfarmercount;
	private Integer ekycbookedext;
	
	
	public AuthCropWise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AuthCropWise(String wbdname, Integer totfarmercount, Integer totalbookings, Integer totextent,
			Integer vaaauthcount, Integer vaaauthextent, Integer vroauthcount, Integer vroauthextent,
			Integer totekycbookings, Integer ekycfarmercount, Integer ekycbookedext) {
		super();
		this.wbdname = wbdname;
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


	public String getWbdname() {
		return wbdname;
	}


	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}


	public Integer getTotfarmercount() {
		return totfarmercount;
	}


	public void setTotfarmercount(Integer totfarmercount) {
		this.totfarmercount = totfarmercount;
	}


	public Integer getTotalbookings() {
		return totalbookings;
	}


	public void setTotalbookings(Integer totalbookings) {
		this.totalbookings = totalbookings;
	}


	public Integer getTotextent() {
		return totextent;
	}


	public void setTotextent(Integer totextent) {
		this.totextent = totextent;
	}


	public Integer getVaaauthcount() {
		return vaaauthcount;
	}


	public void setVaaauthcount(Integer vaaauthcount) {
		this.vaaauthcount = vaaauthcount;
	}


	public Integer getVaaauthextent() {
		return vaaauthextent;
	}


	public void setVaaauthextent(Integer vaaauthextent) {
		this.vaaauthextent = vaaauthextent;
	}


	public Integer getVroauthcount() {
		return vroauthcount;
	}


	public void setVroauthcount(Integer vroauthcount) {
		this.vroauthcount = vroauthcount;
	}


	public Integer getVroauthextent() {
		return vroauthextent;
	}


	public void setVroauthextent(Integer vroauthextent) {
		this.vroauthextent = vroauthextent;
	}


	public Integer getTotekycbookings() {
		return totekycbookings;
	}


	public void setTotekycbookings(Integer totekycbookings) {
		this.totekycbookings = totekycbookings;
	}


	public Integer getEkycfarmercount() {
		return ekycfarmercount;
	}


	public void setEkycfarmercount(Integer ekycfarmercount) {
		this.ekycfarmercount = ekycfarmercount;
	}


	public Integer getEkycbookedext() {
		return ekycbookedext;
	}


	public void setEkycbookedext(Integer ekycbookedext) {
		this.ekycbookedext = ekycbookedext;
	}


	@Override
	public String toString() {
		return "AuthCropWise [wbdname=" + wbdname + ", totfarmercount=" + totfarmercount + ", totalbookings="
				+ totalbookings + ", totextent=" + totextent + ", vaaauthcount=" + vaaauthcount + ", vaaauthextent="
				+ vaaauthextent + ", vroauthcount=" + vroauthcount + ", vroauthextent=" + vroauthextent
				+ ", totekycbookings=" + totekycbookings + ", ekycfarmercount=" + ekycfarmercount + ", ekycbookedext="
				+ ekycbookedext + "]";
	}
	
	
	
}
