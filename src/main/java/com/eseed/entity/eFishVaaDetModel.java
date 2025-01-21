package com.eseed.entity;

public class eFishVaaDetModel {
private String 	mapped_extent;
private String	 avail_ext;
private String	 dcode;
private String	 mcode;
private String   wbvname;
private String   ocname;
private String   ocfname;
private String  booking_available;
private String  allowable_ext;
private String  farmer_name;
private String  father_name;
private String  survey_no;
private String  kh_no;
private String  occupant_extent; 
private String  tot_extent ;
public String getMapped_extent() {
	return mapped_extent;
}
public void setMapped_extent(String mapped_extent) {
	this.mapped_extent = mapped_extent;
}
public String getAvail_ext() {
	return avail_ext;
}
public void setAvail_ext(String avail_ext) {
	this.avail_ext = avail_ext;
}
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
public String getWbvname() {
	return wbvname;
}
public void setWbvname(String wbvname) {
	this.wbvname = wbvname;
}
public String getOcname() {
	return ocname;
}
public void setOcname(String ocname) {
	this.ocname = ocname;
}
public String getOcfname() {
	return ocfname;
}
public void setOcfname(String ocfname) {
	this.ocfname = ocfname;
}
public String getBooking_available() {
	return booking_available;
}
public void setBooking_available(String booking_available) {
	this.booking_available = booking_available;
}
public String getAllowable_ext() {
	return allowable_ext;
}
public void setAllowable_ext(String allowable_ext) {
	this.allowable_ext = allowable_ext;
}
public String getFarmer_name() {
	return farmer_name;
}
public void setFarmer_name(String farmer_name) {
	this.farmer_name = farmer_name;
}
public String getFather_name() {
	return father_name;
}
public void setFather_name(String father_name) {
	this.father_name = father_name;
}
public String getSurvey_no() {
	return survey_no;
}
public void setSurvey_no(String survey_no) {
	this.survey_no = survey_no;
}
public String getKh_no() {
	return kh_no;
}
public void setKh_no(String kh_no) {
	this.kh_no = kh_no;
}
public String getOccupant_extent() {
	return occupant_extent;
}
public void setOccupant_extent(String occupant_extent) {
	this.occupant_extent = occupant_extent;
}
public String getTot_extent() {
	return tot_extent;
}
public void setTot_extent(String tot_extent) {
	this.tot_extent = tot_extent;
}
public eFishVaaDetModel(String mapped_extent, String avail_ext, String dcode, String mcode, String wbvname,
		String ocname, String ocfname, String booking_available, String allowable_ext, String farmer_name,
		String father_name, String survey_no, String kh_no, String occupant_extent, String tot_extent) {
	super();
	this.mapped_extent = mapped_extent;
	this.avail_ext = avail_ext;
	this.dcode = dcode;
	this.mcode = mcode;
	this.wbvname = wbvname;
	this.ocname = ocname;
	this.ocfname = ocfname;
	this.booking_available = booking_available;
	this.allowable_ext = allowable_ext;
	this.farmer_name = farmer_name;
	this.father_name = father_name;
	this.survey_no = survey_no;
	this.kh_no = kh_no;
	this.occupant_extent = occupant_extent;
	this.tot_extent = tot_extent;
}
public eFishVaaDetModel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "eFishVaaDetModel [mapped_extent=" + mapped_extent + ", avail_ext=" + avail_ext + ", dcode=" + dcode
			+ ", mcode=" + mcode + ", wbvname=" + wbvname + ", ocname=" + ocname + ", ocfname=" + ocfname
			+ ", booking_available=" + booking_available + ", allowable_ext=" + allowable_ext + ", farmer_name="
			+ farmer_name + ", father_name=" + father_name + ", survey_no=" + survey_no + ", kh_no=" + kh_no
			+ ", occupant_extent=" + occupant_extent + ", tot_extent=" + tot_extent + "]";
}	
}
