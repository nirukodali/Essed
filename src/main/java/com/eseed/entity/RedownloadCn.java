package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RedownloadCn {
	
	private String wbdname;
	private String wbmname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbvname;
	private Long downloadcount;
	
	
	public RedownloadCn() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RedownloadCn(String wbdname, String wbmname, String wbvname, Long downloadcount) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.downloadcount = downloadcount;
	}


	public String getWbdname() {
		return wbdname;
	}


	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}


	public String getWbmname() {
		return wbmname;
	}


	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}


	public String getWbvname() {
		return wbvname;
	}


	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}


	public Long getDownloadcount() {
		return downloadcount;
	}


	public void setDownloadcount(Long downloadcount) {
		this.downloadcount = downloadcount;
	}


	@Override
	public String toString() {
		return "RedownloadCn [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", downloadcount="
				+ downloadcount + "]";
	}
	

}
