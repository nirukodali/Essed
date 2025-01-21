package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DaoCropDetEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbmname;
	private String wbvname;
	private String oc_name;
	private String oc_fname;
	private BigDecimal kh_no;
	private String cr_sno;
	private String cropname;
	private BigDecimal tot_extent;
	private BigDecimal mobileno;
	@Override
	public String toString() {
		return "DaoCropDetEntity [wbmname=" + wbmname + ", wbvname=" + wbvname + ", oc_name=" + oc_name + ", oc_fname="
				+ oc_fname + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", cropname=" + cropname + ", tot_extent="
				+ tot_extent + ", mobileno=" + mobileno + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public DaoCropDetEntity(String wbmname, String wbvname, String oc_name, String oc_fname, BigDecimal kh_no,
			String cr_sno, String cropname, BigDecimal tot_extent, BigDecimal mobileno) {
		super();
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.oc_name = oc_name;
		this.oc_fname = oc_fname;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.cropname = cropname;
		this.tot_extent = tot_extent;
		this.mobileno = mobileno;
	}
	public DaoCropDetEntity() {
		super();
		// TODO Auto-generated constructor stub
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
	public BigDecimal getKh_no() {
		return kh_no;
	}
	public void setKh_no(BigDecimal kh_no) {
		this.kh_no = kh_no;
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
	public BigDecimal getTot_extent() {
		return tot_extent;
	}
	public void setTot_extent(BigDecimal tot_extent) {
		this.tot_extent = tot_extent;
	}
	public BigDecimal getMobileno() {
		return mobileno;
	}
	public void setMobileno(BigDecimal mobileno) {
		this.mobileno = mobileno;
	}
	
	
}
