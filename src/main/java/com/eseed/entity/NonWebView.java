package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class NonWebView {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String kh_no;
	private String cr_sno;
	private String oc_name;
	private String oc_fname;
	private String occupname;
	private String occupfname;
	private BigDecimal tot_extent;
	private BigDecimal occupant_extent;
	private String cr_farmeruid;
	private String mobileno;
	private String gender;
	private String wbdname;
	private String wbmname;
	private String wbvname;
	public NonWebView() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NonWebView(String kh_no, String cr_sno, String oc_name, String oc_fname, String occupname, String occupfname,
			BigDecimal tot_extent, BigDecimal occupant_extent, String cr_farmeruid, String mobileno, String gender,
			String wbdname, String wbmname, String wbvname) {
		super();
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.oc_name = oc_name;
		this.oc_fname = oc_fname;
		this.occupname = occupname;
		this.occupfname = occupfname;
		this.tot_extent = tot_extent;
		this.occupant_extent = occupant_extent;
		this.cr_farmeruid = cr_farmeruid;
		this.mobileno = mobileno;
		this.gender = gender;
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
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
	public String getCr_farmeruid() {
		return cr_farmeruid;
	}
	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	@Override
	public String toString() {
		return "NonWebView [kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", oc_name=" + oc_name + ", oc_fname=" + oc_fname
				+ ", occupname=" + occupname + ", occupfname=" + occupfname + ", tot_extent=" + tot_extent
				+ ", occupant_extent=" + occupant_extent + ", cr_farmeruid=" + cr_farmeruid + ", mobileno=" + mobileno
				+ ", gender=" + gender + ", wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + "]";
	}
	

}
