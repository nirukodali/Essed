package com.eseed.entity;

import javax.persistence.Id;

public class VroRejdetModel {
	
	@Id
	private String	bookingid;
	private String	wbvname;
	private String	cr_dist_code;
	private String	cr_mand_code;
	private String	cr_vcode;
	private String	cr_no;
	private String cropname;
	private String varietyname;
	private String	cr_sow_dt;
	private String cr_sno;
	private String kh_no;
	private String 	rej_reason;
	private String reason;
	private String vcode;
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public String getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(String cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	public String getCr_mand_code() {
		return cr_mand_code;
	}
	public void setCr_mand_code(String cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}
	public String getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(String cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
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
	public String getCr_sow_dt() {
		return cr_sow_dt;
	}
	public void setCr_sow_dt(String cr_sow_dt) {
		this.cr_sow_dt = cr_sow_dt;
	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public String getKh_no() {
		return kh_no;
	}
	public void setKh_no(String kh_no) {
		this.kh_no = kh_no;
	}
	public String getRej_reason() {
		return rej_reason;
	}
	public void setRej_reason(String rej_reason) {
		this.rej_reason = rej_reason;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getVcode() {
		return vcode;
	}
	public void setVcode(String vcode) {
		this.vcode = vcode;
	}
	public VroRejdetModel(String wbvname, String cr_dist_code, String cr_mand_code, String cr_vcode, String bookingid,
			String cr_no, String cropname, String varietyname, String cr_sow_dt, String cr_sno, String kh_no,
			String rej_reason, String reason, String vcode) {
		super();
		this.wbvname = wbvname;
		this.cr_dist_code = cr_dist_code;
		this.cr_mand_code = cr_mand_code;
		this.cr_vcode = cr_vcode;
		this.bookingid = bookingid;
		this.cr_no = cr_no;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.cr_sow_dt = cr_sow_dt;
		this.cr_sno = cr_sno;
		this.kh_no = kh_no;
		this.rej_reason = rej_reason;
		this.reason = reason;
		this.vcode = vcode;
	}
	public VroRejdetModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "vrorejdet [wbvname=" + wbvname + ", cr_dist_code=" + cr_dist_code + ", cr_mand_code=" + cr_mand_code
				+ ", cr_vcode=" + cr_vcode + ", bookingid=" + bookingid + ", cr_no=" + cr_no + ", cropname=" + cropname
				+ ", varietyname=" + varietyname + ", cr_sow_dt=" + cr_sow_dt + ", cr_sno=" + cr_sno + ", kh_no="
				+ kh_no + ", rej_reason=" + rej_reason + ", reason=" + reason + ", vcode=" + vcode + "]";
	}
	
	
	
	
	
}
