package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LandDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dcode;
	private Long totrec;
	private String wbdname;
	private String dname;
	private Long totrev;
	private Long downloadedcnt;
	private Long notdownloadedcnt;
	
	
	public LandDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LandDetails(Integer dcode, Long totrec, String wbdname, String dname, Long totrev, Long downloadedcnt,
			Long notdownloadedcnt) {
		super();
		this.dcode = dcode;
		this.totrec = totrec;
		this.wbdname = wbdname;
		this.dname = dname;
		this.totrev = totrev;
		this.downloadedcnt = downloadedcnt;
		this.notdownloadedcnt = notdownloadedcnt;
	}


	public Integer getDcode() {
		return dcode;
	}


	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}


	public Long getTotrec() {
		return totrec;
	}


	public void setTotrec(Long totrec) {
		this.totrec = totrec;
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


	public Long getTotrev() {
		return totrev;
	}


	public void setTotrev(Long totrev) {
		this.totrev = totrev;
	}


	public Long getDownloadedcnt() {
		return downloadedcnt;
	}


	public void setDownloadedcnt(Long downloadedcnt) {
		this.downloadedcnt = downloadedcnt;
	}


	public Long getNotdownloadedcnt() {
		return notdownloadedcnt;
	}


	public void setNotdownloadedcnt(Long notdownloadedcnt) {
		this.notdownloadedcnt = notdownloadedcnt;
	}


	@Override
	public String toString() {
		return "LandDetails [dcode=" + dcode + ", totrec=" + totrec + ", wbdname=" + wbdname + ", dname=" + dname
				+ ", totrev=" + totrev + ", downloadedcnt=" + downloadedcnt + ", notdownloadedcnt=" + notdownloadedcnt
				+ "]";
	}
	
	

}
