package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="downloaddet_mand_v",schema = "ecrop2023")
public class MandLandDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dcode;
	private Long totrec;
	private String wbdname;
	private String dname;
	private String mname;
	private Integer mcode;
	private Integer wbmcode;
	private Long totrev;
	private Long downloadedcnt;
	private Long notdownloadedcnt;
	
	public MandLandDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public MandLandDetails(Integer dcode, Long totrec, String wbdname, String dname, String mname, Integer mcode,
			Integer wbmcode, Long totrev, Long downloadedcnt, Long notdownloadedcnt) {
		super();
		this.dcode = dcode;
		this.totrec = totrec;
		this.wbdname = wbdname;
		this.dname = dname;
		this.mname = mname;
		this.mcode = mcode;
		this.wbmcode = wbmcode;
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


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public Integer getMcode() {
		return mcode;
	}


	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}


	public Integer getWbmcode() {
		return wbmcode;
	}


	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
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
		return "MandLandDetails [dcode=" + dcode + ", totrec=" + totrec + ", wbdname=" + wbdname + ", dname=" + dname
				+ ", mname=" + mname + ", mcode=" + mcode + ", wbmcode=" + wbmcode + ", totrev=" + totrev
				+ ", downloadedcnt=" + downloadedcnt + ", notdownloadedcnt=" + notdownloadedcnt + "]";
	} 
	

	
}
