package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AllocatedSurveyNoMapping {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private String lgdvname;
	private String data_src;
	private BigDecimal occup_extent;
	private Integer kh_no;
	private String cr_sno;
	private BigDecimal tot_extent;
	public AllocatedSurveyNoMapping() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllocatedSurveyNoMapping(String lgdvname, String data_src, BigDecimal occup_extent, Integer kh_no, String cr_sno,
			BigDecimal tot_extent) {
		super();
		this.lgdvname = lgdvname;
		this.data_src = data_src;
		this.occup_extent = occup_extent;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.tot_extent = tot_extent;
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
	public BigDecimal getOccup_extent() {
		return occup_extent;
	}
	public void setOccup_extent(BigDecimal occup_extent) {
		this.occup_extent = occup_extent;
	}
	public Integer getKh_no() {
		return kh_no;
	}
	public void setKh_no(Integer kh_no) {
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
	@Override
	public String toString() {
		return "AllocatedSurveyNoMapping [lgdvname=" + lgdvname + ", data_src=" + data_src + ", occup_extent="
				+ occup_extent + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", tot_extent=" + tot_extent + "]";
	}
	

}
