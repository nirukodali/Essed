package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RepLandDataDetails {
	private String mname;
	 private BigDecimal totrec;
	 private BigDecimal downloadedcnt;
	 private BigDecimal notdownloadedcnt;
	 private BigDecimal totrev;
	 private String wbdname;
	 private String dname;
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer mcode;
	 private Integer dcode;
	public RepLandDataDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RepLandDataDetails [mname=" + mname + ", totrec=" + totrec + ", downloadedcnt=" + downloadedcnt
				+ ", notdownloadedcnt=" + notdownloadedcnt + ", totrev=" + totrev + ", wbdname=" + wbdname + ", dname="
				+ dname + ", mcode=" + mcode + ", dcode=" + dcode + "]";
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public BigDecimal getTotrec() {
		return totrec;
	}
	public void setTotrec(BigDecimal totrec) {
		this.totrec = totrec;
	}
	public BigDecimal getDownloadedcnt() {
		return downloadedcnt;
	}
	public void setDownloadedcnt(BigDecimal downloadedcnt) {
		this.downloadedcnt = downloadedcnt;
	}
	public BigDecimal getNotdownloadedcnt() {
		return notdownloadedcnt;
	}
	public void setNotdownloadedcnt(BigDecimal notdownloadedcnt) {
		this.notdownloadedcnt = notdownloadedcnt;
	}
	public BigDecimal getTotrev() {
		return totrev;
	}
	public void setTotrev(BigDecimal totrev) {
		this.totrev = totrev;
	}
	public String getWbdname() {
		return wbdname;
	}
	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Integer getMcode() {
		return mcode;
	}
	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}
	
}
