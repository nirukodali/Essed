package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pattadarmast_wb",schema="ecrop2024")
public class PattadarMasterEntity {

	@Column(name="cr_vcode")
	private Integer cr_vcode;
	
	@Id
	@Column(name="cr_sno")
	private String cr_sno;
	
	@Column(name="kh_no")
	private BigDecimal kh_no;
	
	@Column(name="occupname")
	private String occupname;
	
	@Column(name="occupfname")
	private String occupfname;
	
	
	@Column(name="occup_extent")
	private BigDecimal occup_extent;


	public Integer getCr_vcode() {
		return cr_vcode;
	}


	public void setCr_vcode(Integer cr_vcode) {
		this.cr_vcode = cr_vcode;
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


	public BigDecimal getOccup_extent() {
		return occup_extent;
	}


	public void setOccup_extent(BigDecimal occup_extent) {
		this.occup_extent = occup_extent;
	}
	
	
	
	
}
