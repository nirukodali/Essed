package com.eseed.entity;

public class SuperChkUpdStatusModel {
	
private String 	supercheck_userid;
private String	 vaa_sup_rem;
private String	 mro_remarks;
private String	 mao_remarks; 
private String	 oremarks ;
private String	 occup_name;
private String	 occup_fname;
private String    bookingid;
private String    kh_no;
private String    cr_sno;
private String    cr_sow_date;
private String   cr_no;
private String    wbdname;
private String    wbmname;
private String    wbvname;
private String    cropname;
private String  varietyname;
private String   reason;
private String remarks;

public String getSupercheck_userid() {
	return supercheck_userid;
}
public void setSupercheck_userid(String supercheck_userid) {
	this.supercheck_userid = supercheck_userid;
}
public String getVaa_sup_rem() {
	return vaa_sup_rem;
}
public void setVaa_sup_rem(String vaa_sup_rem) {
	this.vaa_sup_rem = vaa_sup_rem;
}
public String getMro_remarks() {
	return mro_remarks;
}
public void setMro_remarks(String mro_remarks) {
	this.mro_remarks = mro_remarks;
}
public String getMao_remarks() {
	return mao_remarks;
}
public void setMao_remarks(String mao_remarks) {
	this.mao_remarks = mao_remarks;
}
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
public String getBookingid() {
	return bookingid;
}
public void setBookingid(String bookingid) {
	this.bookingid = bookingid;
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
public SuperChkUpdStatusModel(String supercheck_userid, String vaa_sup_rem, String mro_remarks, String mao_remarks,
		String oremarks, String occup_name, String occup_fname, String bookingid, String kh_no, String cr_sno,
		String cr_sow_date, String cr_no, String wbdname, String wbmname, String wbvname, String cropname,
		String varietyname, String reason) {
	super();
	this.supercheck_userid = supercheck_userid;
	this.vaa_sup_rem = vaa_sup_rem;
	this.mro_remarks = mro_remarks;
	this.mao_remarks = mao_remarks;
	this.oremarks = oremarks;
	this.occup_name = occup_name;
	this.occup_fname = occup_fname;
	this.bookingid = bookingid;
	this.kh_no = kh_no;
	this.cr_sno = cr_sno;
	this.cr_sow_date = cr_sow_date;
	this.cr_no = cr_no;
	this.wbdname = wbdname;
	this.wbmname = wbmname;
	this.wbvname = wbvname;
	this.cropname = cropname;
	this.varietyname = varietyname;
	this.reason = reason;
}
public SuperChkUpdStatusModel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "SuperChkUpdStatusModel [supercheck_userid=" + supercheck_userid + ", vaa_sup_rem=" + vaa_sup_rem
			+ ", mro_remarks=" + mro_remarks + ", mao_remarks=" + mao_remarks + ", oremarks=" + oremarks
			+ ", occup_name=" + occup_name + ", occup_fname=" + occup_fname + ", bookingid=" + bookingid + ", kh_no="
			+ kh_no + ", cr_sno=" + cr_sno + ", cr_sow_date=" + cr_sow_date + ", cr_no=" + cr_no + ", wbdname="
			+ wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", cropname=" + cropname + ", varietyname="
			+ varietyname + ", reason=" + reason + "]";
}
  	
}
