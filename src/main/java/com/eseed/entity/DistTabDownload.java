package com.eseed.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class DistTabDownload {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private Integer totrevvill;
	private Integer totprepareddatavill;
	private Integer tabdownloadedvill;
	private Integer totallps;
	private Integer totlps_downloaded;
	private Integer wbdcode;
	
	
	public DistTabDownload() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DistTabDownload(String dname, Integer totrevvill, Integer totprepareddatavill, Integer tabdownloadedvill,
			Integer totallps, Integer totlps_downloaded, Integer wbdcode) {
		super();
		this.dname = dname;
		this.totrevvill = totrevvill;
		this.totprepareddatavill = totprepareddatavill;
		this.tabdownloadedvill = tabdownloadedvill;
		this.totallps = totallps;
		this.totlps_downloaded = totlps_downloaded;
		this.wbdcode = wbdcode;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Integer getTotrevvill() {
		return totrevvill;
	}


	public void setTotrevvill(Integer totrevvill) {
		this.totrevvill = totrevvill;
	}


	public Integer getTotprepareddatavill() {
		return totprepareddatavill;
	}


	public void setTotprepareddatavill(Integer totprepareddatavill) {
		this.totprepareddatavill = totprepareddatavill;
	}


	public Integer getTabdownloadedvill() {
		return tabdownloadedvill;
	}


	public void setTabdownloadedvill(Integer tabdownloadedvill) {
		this.tabdownloadedvill = tabdownloadedvill;
	}


	public Integer getTotallps() {
		return totallps;
	}


	public void setTotallps(Integer totallps) {
		this.totallps = totallps;
	}


	public Integer getTotlps_downloaded() {
		return totlps_downloaded;
	}


	public void setTotlps_downloaded(Integer totlps_downloaded) {
		this.totlps_downloaded = totlps_downloaded;
	}


	public Integer getWbdcode() {
		return wbdcode;
	}


	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}


	@Override
	public String toString() {
		return "DistTabDownload [dname=" + dname + ", totrevvill=" + totrevvill + ", totprepareddatavill="
				+ totprepareddatavill + ", tabdownloadedvill=" + tabdownloadedvill + ", totallps=" + totallps
				+ ", totlps_downloaded=" + totlps_downloaded + ", wbdcode=" + wbdcode + "]";
	}
	
	
}
