package com.eseed.entity;

public class pendingphyackModel {

	
  private String dcode;
  private String mcode;
  private String  wbdname;
  private String wbmname;
  private String wbvname;
  private String cr_farmeruid;
  private String bookingid;
  private String kh_no;
  private String  cr_sno;
  private String  smsmobileno;
  private String  updatedby;
  private String   occupname ;
public String getDcode() {
	return dcode;
}
public void setDcode(String dcode) {
	this.dcode = dcode;
}
public String getMcode() {
	return mcode;
}
public void setMcode(String mcode) {
	this.mcode = mcode;
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
public String getCr_farmeruid() {
	return cr_farmeruid;
}
public void setCr_farmeruid(String cr_farmeruid) {
	this.cr_farmeruid = cr_farmeruid;
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
public String getSmsmobileno() {
	return smsmobileno;
}
public void setSmsmobileno(String smsmobileno) {
	this.smsmobileno = smsmobileno;
}
public String getUpdatedby() {
	return updatedby;
}
public void setUpdatedby(String updatedby) {
	this.updatedby = updatedby;
}
public String getOccupname() {
	return occupname;
}
public void setOccupname(String occupname) {
	this.occupname = occupname;
}
public pendingphyackModel(String dcode, String mcode, String wbdname, String wbmname, String wbvname,
		String cr_farmeruid, String bookingid, String kh_no, String cr_sno, String smsmobileno, String updatedby,
		String occupname) {
	super();
	this.dcode = dcode;
	this.mcode = mcode;
	this.wbdname = wbdname;
	this.wbmname = wbmname;
	this.wbvname = wbvname;
	this.cr_farmeruid = cr_farmeruid;
	this.bookingid = bookingid;
	this.kh_no = kh_no;
	this.cr_sno = cr_sno;
	this.smsmobileno = smsmobileno;
	this.updatedby = updatedby;
	this.occupname = occupname;
}
public pendingphyackModel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "pendingphyackModel [dcode=" + dcode + ", mcode=" + mcode + ", wbdname=" + wbdname + ", wbmname=" + wbmname
			+ ", wbvname=" + wbvname + ", cr_farmeruid=" + cr_farmeruid + ", bookingid=" + bookingid + ", kh_no="
			+ kh_no + ", cr_sno=" + cr_sno + ", smsmobileno=" + smsmobileno + ", updatedby=" + updatedby
			+ ", occupname=" + occupname + "]";
}

	
	
	
	
}
