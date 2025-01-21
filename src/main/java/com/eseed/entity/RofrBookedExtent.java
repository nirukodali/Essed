package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RofrBookedExtent {
private BigDecimal	wbdcode;
private String wbedname;
private BigDecimal wbmcode;
private String wbemname;
@Id
private BigDecimal wbvcode;
private String wbevname;
private Long web_farmers;
private BigDecimal booked_web_ext;
private BigDecimal web_ext;
private Long nweb_farmers ;
private BigDecimal booked_nweb_ext;
private BigDecimal nweb_ext ;
private Long ccrc_farmers;
private BigDecimal booked_ccrc_ext;
private BigDecimal  ccrc_ext;
private Long rofr_farmers; 
private BigDecimal booked_rofr_ext;
private BigDecimal rofr_ext; 
private Long usus_farmers;
private BigDecimal booked_usus_ext;
private BigDecimal usus_ext;
public RofrBookedExtent() {
	super();
	// TODO Auto-generated constructor stub
}
public RofrBookedExtent(BigDecimal wbdcode, String wbedname, BigDecimal wbmcode, String wbemname, BigDecimal wbvcode,
		String wbevname, Long web_farmers, BigDecimal booked_web_ext, BigDecimal web_ext, Long nweb_farmers,
		BigDecimal booked_nweb_ext, BigDecimal nweb_ext, Long ccrc_farmers, BigDecimal booked_ccrc_ext, BigDecimal ccrc_ext,
		Long rofr_farmers, BigDecimal booked_rofr_ext, BigDecimal rofr_ext, Long usus_farmers, BigDecimal booked_usus_ext,
		BigDecimal usus_ext) {
	super();
	this.wbdcode = wbdcode;
	this.wbedname = wbedname;
	this.wbmcode = wbmcode;
	this.wbemname = wbemname;
	this.wbvcode = wbvcode;
	this.wbevname = wbevname;
	this.web_farmers = web_farmers;
	this.booked_web_ext = booked_web_ext;
	this.web_ext = web_ext;
	this.nweb_farmers = nweb_farmers;
	this.booked_nweb_ext = booked_nweb_ext;
	this.nweb_ext = nweb_ext;
	this.ccrc_farmers = ccrc_farmers;
	this.booked_ccrc_ext = booked_ccrc_ext;
	this.ccrc_ext = ccrc_ext;
	this.rofr_farmers = rofr_farmers;
	this.booked_rofr_ext = booked_rofr_ext;
	this.rofr_ext = rofr_ext;
	this.usus_farmers = usus_farmers;
	this.booked_usus_ext = booked_usus_ext;
	this.usus_ext = usus_ext;
}
public BigDecimal getWbdcode() {
	return wbdcode;
}
public void setWbdcode(BigDecimal wbdcode) {
	this.wbdcode = wbdcode;
}
public String getWbedname() {
	return wbedname;
}
public void setWbedname(String wbedname) {
	this.wbedname = wbedname;
}
public BigDecimal getWbmcode() {
	return wbmcode;
}
public void setWbmcode(BigDecimal wbmcode) {
	this.wbmcode = wbmcode;
}
public String getWbemname() {
	return wbemname;
}
public void setWbemname(String wbemname) {
	this.wbemname = wbemname;
}
public BigDecimal getWbvcode() {
	return wbvcode;
}
public void setWbvcode(BigDecimal wbvcode) {
	this.wbvcode = wbvcode;
}
public String getWbevname() {
	return wbevname;
}
public void setWbevname(String wbevname) {
	this.wbevname = wbevname;
}
public Long getWeb_farmers() {
	return web_farmers;
}
public void setWeb_farmers(Long web_farmers) {
	this.web_farmers = web_farmers;
}
public BigDecimal getBooked_web_ext() {
	return booked_web_ext;
}
public void setBooked_web_ext(BigDecimal booked_web_ext) {
	this.booked_web_ext = booked_web_ext;
}
public BigDecimal getWeb_ext() {
	return web_ext;
}
public void setWeb_ext(BigDecimal web_ext) {
	this.web_ext = web_ext;
}
public Long getNweb_farmers() {
	return nweb_farmers;
}
public void setNweb_farmers(Long nweb_farmers) {
	this.nweb_farmers = nweb_farmers;
}
public BigDecimal getBooked_nweb_ext() {
	return booked_nweb_ext;
}
public void setBooked_nweb_ext(BigDecimal booked_nweb_ext) {
	this.booked_nweb_ext = booked_nweb_ext;
}
public BigDecimal getNweb_ext() {
	return nweb_ext;
}
public void setNweb_ext(BigDecimal nweb_ext) {
	this.nweb_ext = nweb_ext;
}
public Long getCcrc_farmers() {
	return ccrc_farmers;
}
public void setCcrc_farmers(Long ccrc_farmers) {
	this.ccrc_farmers = ccrc_farmers;
}
public BigDecimal getBooked_ccrc_ext() {
	return booked_ccrc_ext;
}
public void setBooked_ccrc_ext(BigDecimal booked_ccrc_ext) {
	this.booked_ccrc_ext = booked_ccrc_ext;
}
public BigDecimal getCcrc_ext() {
	return ccrc_ext;
}
public void setCcrc_ext(BigDecimal ccrc_ext) {
	this.ccrc_ext = ccrc_ext;
}
public Long getRofr_farmers() {
	return rofr_farmers;
}
public void setRofr_farmers(Long rofr_farmers) {
	this.rofr_farmers = rofr_farmers;
}
public BigDecimal getBooked_rofr_ext() {
	return booked_rofr_ext;
}
public void setBooked_rofr_ext(BigDecimal booked_rofr_ext) {
	this.booked_rofr_ext = booked_rofr_ext;
}
public BigDecimal getRofr_ext() {
	return rofr_ext;
}
public void setRofr_ext(BigDecimal rofr_ext) {
	this.rofr_ext = rofr_ext;
}
public Long getUsus_farmers() {
	return usus_farmers;
}
public void setUsus_farmers(Long usus_farmers) {
	this.usus_farmers = usus_farmers;
}
public BigDecimal getBooked_usus_ext() {
	return booked_usus_ext;
}
public void setBooked_usus_ext(BigDecimal booked_usus_ext) {
	this.booked_usus_ext = booked_usus_ext;
}
public BigDecimal getUsus_ext() {
	return usus_ext;
}
public void setUsus_ext(BigDecimal usus_ext) {
	this.usus_ext = usus_ext;
}
@Override
public String toString() {
	return "RofrBookedExtent [wbdcode=" + wbdcode + ", wbedname=" + wbedname + ", wbmcode=" + wbmcode + ", wbemname="
			+ wbemname + ", wbvcode=" + wbvcode + ", wbevname=" + wbevname + ", web_farmers=" + web_farmers
			+ ", booked_web_ext=" + booked_web_ext + ", web_ext=" + web_ext + ", nweb_farmers=" + nweb_farmers
			+ ", booked_nweb_ext=" + booked_nweb_ext + ", nweb_ext=" + nweb_ext + ", ccrc_farmers=" + ccrc_farmers
			+ ", booked_ccrc_ext=" + booked_ccrc_ext + ", ccrc_ext=" + ccrc_ext + ", rofr_farmers=" + rofr_farmers
			+ ", booked_rofr_ext=" + booked_rofr_ext + ", rofr_ext=" + rofr_ext + ", usus_farmers=" + usus_farmers
			+ ", booked_usus_ext=" + booked_usus_ext + ", usus_ext=" + usus_ext + "]";
}



}
