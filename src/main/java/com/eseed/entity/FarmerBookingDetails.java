package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class FarmerBookingDetails {
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO)
private Long bookingid;
private String oc_name;
private String oc_fname;
private String cr_sno;
private BigDecimal kh_no;
private BigDecimal tot_extent;
private BigDecimal occupant_extent;
private Integer mcode;
private Integer cr_mand_code;
private String mobileno;
private String wbvname;
private String vsname;
public FarmerBookingDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public FarmerBookingDetails(Long bookingid, String oc_name, String oc_fname, String cr_sno, BigDecimal kh_no,
		BigDecimal tot_extent, BigDecimal occupant_extent, Integer mcode, Integer cr_mand_code, String mobileno) {
	super();
	this.bookingid = bookingid;
	this.oc_name = oc_name;
	this.oc_fname = oc_fname;
	this.cr_sno = cr_sno;
	this.kh_no = kh_no;
	this.tot_extent = tot_extent;
	this.occupant_extent = occupant_extent;
	this.mcode = mcode;
	this.cr_mand_code = cr_mand_code;
	this.mobileno = mobileno;
}
public Long getBookingid() {
	return bookingid;
}
public void setBookingid(Long bookingid) {
	this.bookingid = bookingid;
}
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
public String getCr_sno() {
	return cr_sno;
}
public void setCr_sno(String cr_sno) {
	this.cr_sno = cr_sno;
}
public BigDecimal getKh_no() {
	return kh_no;
}
public void setKh_no(BigDecimal kh_no) {
	this.kh_no = kh_no;
}
public BigDecimal getTot_extent() {
	return tot_extent;
}
public void setTot_extent(BigDecimal tot_extent) {
	this.tot_extent = tot_extent;
}
public BigDecimal getOccupant_extent() {
	return occupant_extent;
}
public void setOccupant_extent(BigDecimal occupant_extent) {
	this.occupant_extent = occupant_extent;
}
public Integer getMcode() {
	return mcode;
}
public void setMcode(Integer mcode) {
	this.mcode = mcode;
}
public Integer getCr_mand_code() {
	return cr_mand_code;
}
public void setCr_mand_code(Integer cr_mand_code) {
	this.cr_mand_code = cr_mand_code;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getWbvname() {
	return wbvname;
}
public void setWbvname(String wbvname) {
	this.wbvname = wbvname;
}
public String getVsname() {
	return vsname;
}
public void setVsname(String vsname) {
	this.vsname = vsname;
}
@Override
public String toString() {
	return "FarmerBookingDetails [bookingid=" + bookingid + ", oc_name=" + oc_name + ", oc_fname=" + oc_fname
			+ ", cr_sno=" + cr_sno + ", kh_no=" + kh_no + ", tot_extent=" + tot_extent + ", occupant_extent="
			+ occupant_extent + ", mcode=" + mcode + ", cr_mand_code=" + cr_mand_code + ", mobileno=" + mobileno + "]";
}


}
