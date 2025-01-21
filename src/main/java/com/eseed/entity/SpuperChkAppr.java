package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SpuperChkAppr {
	
private String	wbdname;
private String	wbmname;
private String	wbvname;
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
private String	bookingid;
private String	 occup_name;
private String	 occup_fname;
private String	cropname;
private String	varietyname;
private String	 cr_sow_dt;
private String	 kh_no ;
private String	cr_sno;
public SpuperChkAppr() {
	super();
	// TODO Auto-generated constructor stub
}
public SpuperChkAppr(String wbdname, String wbmname, String wbvname, String bookingid, String occup_name,
		String occup_fname, String cropname, String varietyname, String cr_sow_dt, String kh_no, String cr_sno) {
	super();
	this.wbdname = wbdname;
	this.wbmname = wbmname;
	this.wbvname = wbvname;
	this.bookingid = bookingid;
	this.occup_name = occup_name;
	this.occup_fname = occup_fname;
	this.cropname = cropname;
	this.varietyname = varietyname;
	this.cr_sow_dt = cr_sow_dt;
	this.kh_no = kh_no;
	this.cr_sno = cr_sno;
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
public String getBookingid() {
	return bookingid;
}
public void setBookingid(String bookingid) {
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
public String getCr_sow_dt() {
	return cr_sow_dt;
}
public void setCr_sow_dt(String cr_sow_dt) {
	this.cr_sow_dt = cr_sow_dt;
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
@Override
public String toString() {
	return "SpuperChkAppr [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", bookingid="
			+ bookingid + ", occup_name=" + occup_name + ", occup_fname=" + occup_fname + ", cropname=" + cropname
			+ ", varietyname=" + varietyname + ", cr_sow_dt=" + cr_sow_dt + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno
			+ "]";
}


}
