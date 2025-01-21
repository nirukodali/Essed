package com.eseed.dto;

import java.util.Date;

public class AgencyDetailsDto {
	
	
	
	private String cropyear;
	private String season;
	private String agencycode; 
	private String sid ;
	private String mname;
	private String idate;
	private String seedvariety;
	private String vehicaleno;
	private String quantity;
	private String userid;
	private String recddate;
	private String batchno;
	private String mandal;
	private String dist;
	private String	seedname;
	private String	agencyname;
	
	
	private String name;
	private String productcode;
	
	public String getCropyear() {
		return cropyear;
	}
	public void setCropyear(String cropyear) {
		this.cropyear = cropyear;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getAgencycode() {
		return agencycode;
	}
	public void setAgencycode(String agencycode) {
		this.agencycode = agencycode;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public String getSeedvariety() {
		return seedvariety;
	}
	public void setSeedvariety(String seedvariety) {
		this.seedvariety = seedvariety;
	}
	public String getVehicaleno() {
		return vehicaleno;
	}
	public void setVehicaleno(String vehicaleno) {
		this.vehicaleno = vehicaleno;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getRecddate() {
		return recddate;
	}
	public void setRecddate(String recddate) {
		this.recddate = recddate;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getIdate() {
		return idate;
	}
	public void setIdate(String idate) {
		this.idate = idate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getSeedname() {
		return seedname;
	}
	public void setSeedname(String seedname) {
		this.seedname = seedname;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}
	@Override
	public String toString() {
		return "AgencyDetailsDto [cropyear=" + cropyear + ", season=" + season + ", agencycode=" + agencycode + ", sid="
				+ sid + ", mname=" + mname + ", idate=" + idate + ", seedvariety=" + seedvariety + ", vehicaleno="
				+ vehicaleno + ", quantity=" + quantity + ", userid=" + userid + ", recddate=" + recddate + ", batchno="
				+ batchno + ", mandal=" + mandal + ", dist=" + dist + ", seedname=" + seedname + ", agencyname="
				+ agencyname + ", name=" + name + ", productcode=" + productcode + ", getCropyear()=" + getCropyear()
				+ ", getSeason()=" + getSeason() + ", getAgencycode()=" + getAgencycode() + ", getSid()=" + getSid()
				+ ", getMname()=" + getMname() + ", getSeedvariety()=" + getSeedvariety() + ", getVehicaleno()="
				+ getVehicaleno() + ", getQuantity()=" + getQuantity() + ", getUserid()=" + getUserid()
				+ ", getRecddate()=" + getRecddate() + ", getBatchno()=" + getBatchno() + ", getDist()=" + getDist()
				+ ", getMandal()=" + getMandal() + ", getIdate()=" + getIdate() + ", getName()=" + getName()
				+ ", getProductcode()=" + getProductcode() + ", getSeedname()=" + getSeedname() + ", getAgencyname()="
				+ getAgencyname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
