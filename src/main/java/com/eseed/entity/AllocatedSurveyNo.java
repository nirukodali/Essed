package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class AllocatedSurveyNo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String lgdvname;
	private String data_src;
	private String kh_no ;
	private String cr_sno;
	private BigDecimal tot_extent;
	private String geo_reffered;
	public AllocatedSurveyNo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllocatedSurveyNo(String lgdvname, String data_src, String kh_no, String cr_sno, BigDecimal tot_extent,
			String geo_reffered) {
		super();
		this.lgdvname = lgdvname;
		this.data_src = data_src;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.tot_extent = tot_extent;
		this.geo_reffered = geo_reffered;
	}
	public String getLgdvname() {
		return lgdvname;
	}
	public void setLgdvname(String lgdvname) {
		this.lgdvname = lgdvname;
	}
	public String getData_src() {
		return data_src;
	}
	public void setData_src(String data_src) {
		this.data_src = data_src;
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
	public BigDecimal getTot_extent() {
		return tot_extent;
	}
	public void setTot_extent(BigDecimal tot_extent) {
		this.tot_extent = tot_extent;
	}
	public String getGeo_reffered() {
		return geo_reffered;
	}
	public void setGeo_reffered(String geo_reffered) {
		this.geo_reffered = geo_reffered;
	}
	@Override
	public String toString() {
		return "AllocatedSurveyNo [lgdvname=" + lgdvname + ", data_src=" + data_src + ", kh_no=" + kh_no + ", cr_sno="
				+ cr_sno + ", tot_extent=" + tot_extent + ", geo_reffered=" + geo_reffered + "]";
	}
	

}
