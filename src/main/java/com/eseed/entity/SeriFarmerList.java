package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class SeriFarmerList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbedname;
	private String wbemname;
	private String wbevname;
	private Integer bookingid;
	private String occupname;
	private String occupfname;
	private String cr_farmeruid;
	private String cropname;
	private BigDecimal kh_no;
	private String cr_no;
	private BigDecimal bookedext;
	private BigDecimal mobileno;
	public SeriFarmerList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SeriFarmerList(String wbedname, String wbemname, String wbevname, Integer bookingid, String occupname,
			String occupfname, String cr_farmeruid, String cropname, BigDecimal kh_no, String cr_no, BigDecimal bookedext,
			BigDecimal mobileno) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.bookingid = bookingid;
		this.occupname = occupname;
		this.occupfname = occupfname;
		this.cr_farmeruid = cr_farmeruid;
		this.cropname = cropname;
		this.kh_no = kh_no;
		this.cr_no = cr_no;
		this.bookedext = bookedext;
		this.mobileno = mobileno;
	}
	public String getWbedname() {
		return wbedname;
	}
	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}
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
	public Integer getBookingid() {
		return bookingid;
	}
	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
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
	public String getCr_farmeruid() {
		return cr_farmeruid;
	}
	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public BigDecimal getKh_no() {
		return kh_no;
	}
	public void setKh_no(BigDecimal kh_no) {
		this.kh_no = kh_no;
	}
	public String getCr_no() {
		return cr_no;
	}
	public void setCr_no(String cr_no) {
		this.cr_no = cr_no;
	}
	public BigDecimal getBookedext() {
		return bookedext;
	}
	public void setBookedext(BigDecimal bookedext) {
		this.bookedext = bookedext;
	}
	public BigDecimal getMobileno() {
		return mobileno;
	}
	public void setMobileno(BigDecimal mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "SeriFarmerList [wbedname=" + wbedname + ", wbemname=" + wbemname + ", wbevname=" + wbevname + ", bookingid="
				+ bookingid + ", occupname=" + occupname + ", occupfname=" + occupfname + ", cr_farmeruid=" + cr_farmeruid
				+ ", cropname=" + cropname + ", kh_no=" + kh_no + ", cr_no=" + cr_no + ", bookedext=" + bookedext
				+ ", mobileno=" + mobileno + "]";
	}
	
	
}
