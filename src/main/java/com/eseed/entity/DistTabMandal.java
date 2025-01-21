package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DistTabMandal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mname;
	private Long totrevvill;
	private Long totprepareddatavill;
	private Long tabdownloadedvill;
	private Long totallps;
	private Long lps_downloaded;
	private Integer wbdcode;
	private Integer wbmcode;
	
	
	public DistTabMandal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DistTabMandal(String mname, Long totrevvill, Long totprepareddatavill, Long tabdownloadedvill, Long totallps,
			Long lps_downloaded, Integer wbdcode, Integer wbmcode) {
		super();
		this.mname = mname;
		this.totrevvill = totrevvill;
		this.totprepareddatavill = totprepareddatavill;
		this.tabdownloadedvill = tabdownloadedvill;
		this.totallps = totallps;
		this.lps_downloaded = lps_downloaded;
		this.wbdcode = wbdcode;
		this.wbmcode = wbmcode;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public Long getTotrevvill() {
		return totrevvill;
	}


	public void setTotrevvill(Long totrevvill) {
		this.totrevvill = totrevvill;
	}


	public Long getTotprepareddatavill() {
		return totprepareddatavill;
	}


	public void setTotprepareddatavill(Long totprepareddatavill) {
		this.totprepareddatavill = totprepareddatavill;
	}


	public Long getTabdownloadedvill() {
		return tabdownloadedvill;
	}


	public void setTabdownloadedvill(Long tabdownloadedvill) {
		this.tabdownloadedvill = tabdownloadedvill;
	}


	public Long getTotallps() {
		return totallps;
	}


	public void setTotallps(Long totallps) {
		this.totallps = totallps;
	}


	public Long getLps_downloaded() {
		return lps_downloaded;
	}


	public void setLps_downloaded(Long lps_downloaded) {
		this.lps_downloaded = lps_downloaded;
	}


	public Integer getWbdcode() {
		return wbdcode;
	}


	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}


	public Integer getWbmcode() {
		return wbmcode;
	}


	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}


	@Override
	public String toString() {
		return "DistTabMandal [mname=" + mname + ", totrevvill=" + totrevvill + ", totprepareddatavill="
				+ totprepareddatavill + ", tabdownloadedvill=" + tabdownloadedvill + ", totallps=" + totallps
				+ ", lps_downloaded=" + lps_downloaded + ", wbdcode=" + wbdcode + ", wbmcode=" + wbmcode + "]";
	}
}
