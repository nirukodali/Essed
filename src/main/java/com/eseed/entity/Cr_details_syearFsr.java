package com.eseed.entity;

import java.math.BigDecimal; 
import java.util.Date;

public class Cr_details_syearFsr {
	
	private String oremarks;
    private  String occup_name;
    private String occup_fname;
    private int bookingid;
    private BigDecimal kh_no;
    private String cr_sno;
    private Date cr_sow_date;
    private String  cr_no;
    private String wbdname;
    private String wbmname;
    private String wbvname;
    private String cropname;
    private String varietyname;
    private String reason;
    private String remarks;
	public String getOremarks() {
		return oremarks;
	}
	public void setOremarks(String oremarks) {
		this.oremarks = oremarks;
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
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
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
	public Date getCr_sow_date() {
		return cr_sow_date;
	}
	public void setCr_sow_date(Date cr_sow_date) {
		this.cr_sow_date = cr_sow_date;
	}
	public String getCr_no() {
		return cr_no;
	}
	public void setCr_no(String cr_no) {
		this.cr_no = cr_no;
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Cr_details_syearFsr [oremarks=" + oremarks + ", occup_name=" + occup_name + ", occup_fname="
				+ occup_fname + ", bookingid=" + bookingid + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno
				+ ", cr_sow_date=" + cr_sow_date + ", cr_no=" + cr_no + ", wbdname=" + wbdname + ", wbmname=" + wbmname
				+ ", wbvname=" + wbvname + ", cropname=" + cropname + ", varietyname=" + varietyname + ", reason="
				+ reason + ", remarks=" + remarks + "]";
	}
    
    
}
