package com.eseed.entity;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.sql.Date;

public class DeceasedFarmerVRO {
	
	
	private String oc_name;
	private String oc_fname;
	private String cr_sno;
	private BigDecimal kh_no;
	private int cr_vcode;
	private int bookingid;
	private String cr_farmeruid;
	private Date date_of_death;
	private String relation;
	private String sug_occupname;
	private String sug_occupfname;
	private String sug_farmeruid;
	private BigDecimal cr_dist_code;
	private BigDecimal cr_mand_code;
	private Integer dcode;
	private Integer mcode;
	private String wbemname;
	private String wbevname;
	
	
	
	
	
	
	public String getWbemname() {
		return wbemname;
	}
	public void setWbemname(String wbemname) {
		this.wbemname = wbemname;
	}
	public String getWbevname() {
		return wbevname;
	}
	public void setWbevname(String wbevname) {
		this.wbevname = wbevname;
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
	public String getCr_farmeruid() {
		return cr_farmeruid;
	}
	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}
	public Date getDate_of_death() {
		return date_of_death;
	}
	public void setDate_of_death(Date date_of_death) {
		this.date_of_death = date_of_death;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getSug_occupname() {
		return sug_occupname;
	}
	public void setSug_occupname(String sug_occupname) {
		this.sug_occupname = sug_occupname;
	}
	public String getSug_occupfname() {
		return sug_occupfname;
	}
	public void setSug_occupfname(String sug_occupfname) {
		this.sug_occupfname = sug_occupfname;
	}
	public String getSug_farmeruid() {
		return sug_farmeruid;
	}
	public void setSug_farmeruid(String sug_farmeruid) {
		this.sug_farmeruid = sug_farmeruid;
	}
	public BigDecimal getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(BigDecimal cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	public BigDecimal getCr_mand_code() {
		return cr_mand_code;
	}
	public void setCr_mand_code(BigDecimal cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}
	public Integer getMcode() {
		return mcode;
	}
	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}
	@Override
	public String toString() {
		return "DeceasedFarmerVRO [oc_name=" + oc_name + ", oc_fname=" + oc_fname + ", cr_sno=" + cr_sno + ", kh_no="
				+ kh_no + ", cr_vcode=" + cr_vcode + ", bookingid=" + bookingid + ", cr_farmeruid=" + cr_farmeruid
				+ ", date_of_death=" + date_of_death + ", relation=" + relation + ", sug_occupname=" + sug_occupname
				+ ", sug_occupfname=" + sug_occupfname + ", sug_farmeruid=" + sug_farmeruid + ", cr_dist_code="
				+ cr_dist_code + ", cr_mand_code=" + cr_mand_code + ", dcode=" + dcode + ", mcode=" + mcode
				+ ", wbemname=" + wbemname + ", wbevname=" + wbevname + "]";
	}
	

	
	
	
	
}
