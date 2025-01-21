package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DataSourceExtEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbemname;
	private BigDecimal web_farmers;
	private BigDecimal web_ext;
	private BigDecimal nweb_farmers;
	private BigDecimal nweb_ext;
	private BigDecimal ccrc_farmers;
	private BigDecimal ccrc_ext;
	private BigDecimal rofr_farmers;
	private BigDecimal rofr_ext;
	private BigDecimal usus_farmers;
	private BigDecimal usus_ext;
	@Override
	public String toString() {
		return "DataSourceExtEntity [wbemname=" + wbemname + ", web_farmers=" + web_farmers + ", web_ext=" + web_ext
				+ ", nweb_farmers=" + nweb_farmers + ", nweb_ext=" + nweb_ext + ", ccrc_farmers=" + ccrc_farmers
				+ ", ccrc_ext=" + ccrc_ext + ", rofr_farmers=" + rofr_farmers + ", rofr_ext=" + rofr_ext
				+ ", usus_farmers=" + usus_farmers + ", usus_ext=" + usus_ext + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public DataSourceExtEntity(String wbemname, BigDecimal web_farmers, BigDecimal web_ext, BigDecimal nweb_farmers,
			BigDecimal nweb_ext, BigDecimal ccrc_farmers, BigDecimal ccrc_ext, BigDecimal rofr_farmers,
			BigDecimal rofr_ext, BigDecimal usus_farmers, BigDecimal usus_ext) {
		super();
		this.wbemname = wbemname;
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
	public DataSourceExtEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getWbemname() {
		return wbemname;
	}
	public void setWbemname(String wbemname) {
		this.wbemname = wbemname;
	}
	public BigDecimal getWeb_farmers() {
		return web_farmers;
	}
	public void setWeb_farmers(BigDecimal web_farmers) {
		this.web_farmers = web_farmers;
	}
	public BigDecimal getWeb_ext() {
		return web_ext;
	}
	public void setWeb_ext(BigDecimal web_ext) {
		this.web_ext = web_ext;
	}
	public BigDecimal getNweb_farmers() {
		return nweb_farmers;
	}
	public void setNweb_farmers(BigDecimal nweb_farmers) {
		this.nweb_farmers = nweb_farmers;
	}
	public BigDecimal getNweb_ext() {
		return nweb_ext;
	}
	public void setNweb_ext(BigDecimal nweb_ext) {
		this.nweb_ext = nweb_ext;
	}
	public BigDecimal getCcrc_farmers() {
		return ccrc_farmers;
	}
	public void setCcrc_farmers(BigDecimal ccrc_farmers) {
		this.ccrc_farmers = ccrc_farmers;
	}
	public BigDecimal getCcrc_ext() {
		return ccrc_ext;
	}
	public void setCcrc_ext(BigDecimal ccrc_ext) {
		this.ccrc_ext = ccrc_ext;
	}
	public BigDecimal getRofr_farmers() {
		return rofr_farmers;
	}
	public void setRofr_farmers(BigDecimal rofr_farmers) {
		this.rofr_farmers = rofr_farmers;
	}
	public BigDecimal getRofr_ext() {
		return rofr_ext;
	}
	public void setRofr_ext(BigDecimal rofr_ext) {
		this.rofr_ext = rofr_ext;
	}
	public BigDecimal getUsus_farmers() {
		return usus_farmers;
	}
	public void setUsus_farmers(BigDecimal usus_farmers) {
		this.usus_farmers = usus_farmers;
	}
	public BigDecimal getUsus_ext() {
		return usus_ext;
	}
	public void setUsus_ext(BigDecimal usus_ext) {
		this.usus_ext = usus_ext;
	}
	
	
}
