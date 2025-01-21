package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FarmerDetails {
	private String wbmname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbvname;
	private String occupname;
	private String occupfname;
	private String cr_sno;
	private String cropname;
	private String varietyname;
	private BigDecimal bookedext;
	private BigDecimal kh_no;
	//private Date cr_sow_date;
	private String cr_sow_date;
	private BigDecimal mobileno;
	public FarmerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FarmerDetails(String wbmname, String wbvname, String occupname, String occupfname, String cr_sno,
			String cropname, String varietyname, BigDecimal bookedext, String cr_sow_date, BigDecimal mobileno) {
		super();
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.occupname = occupname;
		this.occupfname = occupfname;
		this.cr_sno = cr_sno;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.bookedext = bookedext;
		this.cr_sow_date = cr_sow_date;
		this.mobileno = mobileno;
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
	public String getOccupname() {
		return occupname;
	}
	public void setOccupname(String occupname) {
		this.occupname = occupname;
	}
	public String getOccupfname() {
		return occupfname;
	}
	public void setOccupfname(String occupfname) {
		this.occupfname = occupfname;
	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
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
	public BigDecimal getBookedext() {
		return bookedext;
	}
	public void setBookedext(BigDecimal bookedext) {
		this.bookedext = bookedext;
	}
	public String getCr_sow_date() {
		return cr_sow_date;
	}
	public void setCr_sow_date(String cr_sow_date) {
		this.cr_sow_date = cr_sow_date;
	}
	public BigDecimal getMobileno() {
		return mobileno;
	}
	public void setMobileno(BigDecimal mobileno) {
		this.mobileno = mobileno;
	}
	public BigDecimal getKh_no() {
		return kh_no;
	}
	public void setKh_no(BigDecimal kh_no) {
		this.kh_no = kh_no;
	}
	@Override
	public String toString() {
		return "FarmerDetails [wbmname=" + wbmname + ", wbvname=" + wbvname + ", occupname=" + occupname
				+ ", occupfname=" + occupfname + ", cr_sno=" + cr_sno + ", cropname=" + cropname + ", varietyname="
				+ varietyname + ", bookedext=" + bookedext + ", cr_sow_date=" + cr_sow_date + ", mobileno=" + mobileno
				+ "]";
	}
	
	
}
