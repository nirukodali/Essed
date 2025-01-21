package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SupervisoryCheckReportEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private String Wbmname;
	private String wbvname;
	private Integer bookingid;
	private String occup_name;
	private String occup_fname;
	private String cropname;
	private String varietyname;
	private Date cr_sow_date;
	private BigDecimal kh_no;
	private String cr_sno;
	private String reason;
	public SupervisoryCheckReportEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SupervisoryCheckReportEntity(String wbdname, String wbmname, String wbvname, Integer bookingid,
			String occup_name, String occup_fname, String cropname, String varietyname, Date cr_sow_date,
			BigDecimal kh_no, String cr_sno, String reason) {
		super();
		this.wbdname = wbdname;
		Wbmname = wbmname;
		this.wbvname = wbvname;
		this.bookingid = bookingid;
		this.occup_name = occup_name;
		this.occup_fname = occup_fname;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.cr_sow_date = cr_sow_date;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "SupervisoryCheckReportEntity [wbdname=" + wbdname + ", Wbmname=" + Wbmname + ", wbvname=" + wbvname
				+ ", bookingid=" + bookingid + ", occup_name=" + occup_name + ", occup_fname=" + occup_fname
				+ ", cropname=" + cropname + ", varietyname=" + varietyname + ", cr_sow_date=" + cr_sow_date
				+ ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", reason=" + reason + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getWbdname() {
		return wbdname;
	}
	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}
	public String getWbmname() {
		return Wbmname;
	}
	public void setWbmname(String wbmname) {
		Wbmname = wbmname;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public Integer getBookingid() {
		return bookingid;
	}
	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}
	public String getOccup_name() {
		return occup_name;
	}
	public void setOccup_name(String occup_name) {
		this.occup_name = occup_name;
	}
	public String getOccup_fname() {
		return occup_fname;
	}
	public void setOccup_fname(String occup_fname) {
		this.occup_fname = occup_fname;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	public Date getCr_sow_date() {
		return cr_sow_date;
	}
	public void setCr_sow_date(Date cr_sow_date) {
		this.cr_sow_date = cr_sow_date;
	}
	public BigDecimal getKh_no() {
		return kh_no;
	}
	public void setKh_no(BigDecimal kh_no) {
		this.kh_no = kh_no;
	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
