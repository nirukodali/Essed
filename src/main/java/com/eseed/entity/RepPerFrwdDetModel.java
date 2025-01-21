package com.eseed.entity;
import java.util.Date;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
public class RepPerFrwdDetModel {
	 private String oc_name;
	 private String oc_fname;
	 private String bookingid;
	 private String varietyname;
	 private String cropname;
	 private String cr_mix_unmix_ext;
	 private String kh_no;
	 private String cr_sno;
	 private String cr_sow_date ;
	public String getOc_name() {
		return oc_name;
	}
	public void setOc_name(String oc_name) {
		this.oc_name = oc_name;
	}
	public String getOc_fname() {
		return oc_fname;
	}
	public void setOc_fname(String oc_fname) {
		this.oc_fname = oc_fname;
	}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}
	public void setCr_mix_unmix_ext(String cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
	}
	public String getKh_no() {
		return kh_no;
	}
	public void setKh_no(String kh_no) {
		this.kh_no = kh_no;
	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public String getCr_sow_date() {
		return cr_sow_date;
	}
	public void setCr_sow_date(String cr_sow_date) {
		this.cr_sow_date = cr_sow_date;
	}
	public RepPerFrwdDetModel(String oc_name, String oc_fname, String bookingid, String varietyname, String cropname,
			String cr_mix_unmix_ext, String kh_no, String cr_sno, String cr_sow_date) {
		super();
		this.oc_name = oc_name;
		this.oc_fname = oc_fname;
		this.bookingid = bookingid;
		this.varietyname = varietyname;
		this.cropname = cropname;
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.cr_sow_date = cr_sow_date;
	}
	public RepPerFrwdDetModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RepPerFrwdDetEntity [oc_name=" + oc_name + ", oc_fname=" + oc_fname + ", bookingid=" + bookingid
				+ ", varietyname=" + varietyname + ", cropname=" + cropname + ", cr_mix_unmix_ext=" + cr_mix_unmix_ext
				+ ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", cr_sow_date=" + cr_sow_date + "]";
	}
		 
	
}












