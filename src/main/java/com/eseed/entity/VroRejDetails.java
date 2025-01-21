package com.eseed.entity;

import java.util.Date; 
public class VroRejDetails {
	
	private String wbvname;
    private int cr_dist_code;
    private int cr_mand_code;
    private int cr_vcode;
    private int bookingid;
    private String cr_no;
    private String cropname;
    private String varietyname;
    private Date cr_sow_date;
    private String cr_sno;
    private int kh_no;
    private int rej_reason;
    private String reason;
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public int getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(int cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	public int getCr_mand_code() {
		return cr_mand_code;
	}
	public void setCr_mand_code(int cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}
	public int getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(int cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getCr_no() {
		return cr_no;
	}
	public void setCr_no(String cr_no) {
		this.cr_no = cr_no;
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
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public int getKh_no() {
		return kh_no;
	}
	public void setKh_no(int kh_no) {
		this.kh_no = kh_no;
	}
	public int getRej_reason() {
		return rej_reason;
	}
	public void setRej_reason(int rej_reason) {
		this.rej_reason = rej_reason;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
