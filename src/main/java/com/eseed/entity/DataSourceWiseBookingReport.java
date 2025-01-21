package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DataSourceWiseBookingReport {
	private Integer wbdcode;
	private String wbedname;
	private Integer wbmcode;
	private String wbemname;
	private Integer wbvcode;
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Id
	private String wbevname;
	private Double web_farmers;
	private Double web_ext;
	private Double nweb_farmers;
	private Double nweb_ext;
	private Double ccrc_farmers;
	private Double ccrc_ext;
	private Double rofr_farmers;
	private Double rofr_ext;
	private Double usus_farmers;
	private Double usus_ext;
	public DataSourceWiseBookingReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataSourceWiseBookingReport(Integer wbdcode, String wbedname, Integer wbmcode, String wbemname,
			Integer wbvcode, String wbevname, Double web_farmers, Double web_ext, Double nweb_farmers, Double nweb_ext,
			Double ccrc_farmers, Double ccrc_ext, Double rofr_farmers, Double rofr_ext, Double usus_farmers, Double usus_ext) {
		super();
		this.wbdcode = wbdcode;
		this.wbedname = wbedname;
		this.wbmcode = wbmcode;
		this.wbemname = wbemname;
		this.wbvcode = wbvcode;
		this.wbevname = wbevname;
		this.web_farmers = web_farmers;
		this.web_ext = web_ext;
		this.nweb_farmers = nweb_farmers;
		this.nweb_ext = nweb_ext;
		this.ccrc_farmers = ccrc_farmers;
		this.ccrc_ext = ccrc_ext;
		this.rofr_farmers = rofr_farmers;
		this.rofr_ext = rofr_ext;
		this.usus_farmers = usus_farmers;
		this.usus_ext = usus_ext;
	}
	public Integer getWbdcode() {
		return wbdcode;
	}
	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}
	public String getWbedname() {
		return wbedname;
	}
	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}
	public Integer getWbmcode() {
		return wbmcode;
	}
	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}
	public String getWbemname() {
		return wbemname;
	}
	public void setWbemname(String wbemname) {
		this.wbemname = wbemname;
	}
	public Integer getWbvcode() {
		return wbvcode;
	}
	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}
	public String getWbevname() {
		return wbevname;
	}
	public void setWbevname(String wbevname) {
		this.wbevname = wbevname;
	}
	public Double getWeb_farmers() {
		return web_farmers;
	}
	public void setWeb_farmers(Double web_farmers) {
		this.web_farmers = web_farmers;
	}
	public Double getWeb_ext() {
		return web_ext;
	}
	public void setWeb_ext(Double web_ext) {
		this.web_ext = web_ext;
	}
	public Double getNweb_farmers() {
		return nweb_farmers;
	}
	public void setNweb_farmers(Double nweb_farmers) {
		this.nweb_farmers = nweb_farmers;
	}
	public Double getNweb_ext() {
		return nweb_ext;
	}
	public void setNweb_ext(Double nweb_ext) {
		this.nweb_ext = nweb_ext;
	}
	public Double getCcrc_farmers() {
		return ccrc_farmers;
	}
	public void setCcrc_farmers(Double ccrc_farmers) {
		this.ccrc_farmers = ccrc_farmers;
	}
	public Double getCcrc_ext() {
		return ccrc_ext;
	}
	public void setCcrc_ext(Double ccrc_ext) {
		this.ccrc_ext = ccrc_ext;
	}
	public Double getRofr_farmers() {
		return rofr_farmers;
	}
	public void setRofr_farmers(Double rofr_farmers) {
		this.rofr_farmers = rofr_farmers;
	}
	public Double getRofr_ext() {
		return rofr_ext;
	}
	public void setRofr_ext(Double rofr_ext) {
		this.rofr_ext = rofr_ext;
	}
	public Double getUsus_farmers() {
		return usus_farmers;
	}
	public void setUsus_farmers(Double usus_farmers) {
		this.usus_farmers = usus_farmers;
	}
	public Double getUsus_ext() {
		return usus_ext;
	}
	public void setUsus_ext(Double usus_ext) {
		this.usus_ext = usus_ext;
	}
	@Override
	public String toString() {
		return "DataSourceWiseBookingReport [wbdcode=" + wbdcode + ", wbedname=" + wbedname + ", wbmcode=" + wbmcode
				+ ", wbemname=" + wbemname + ", wbvcode=" + wbvcode + ", wbevname=" + wbevname + ", web_farmers="
				+ web_farmers + ", web_ext=" + web_ext + ", nweb_farmers=" + nweb_farmers + ", nweb_ext=" + nweb_ext
				+ ", ccrc_farmers=" + ccrc_farmers + ", ccrc_ext=" + ccrc_ext + ", rofr_farmers=" + rofr_farmers
				+ ", rofr_ext=" + rofr_ext + ", usus_farmers=" + usus_farmers + ", usus_ext=" + usus_ext + "]";
	}
	

}
