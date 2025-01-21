package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CropNamesMandalWise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String wbmname;
	private BigDecimal cr_mand_code;
	private BigDecimal farmers;
	private BigDecimal bookedext;
	private BigDecimal normalarea;
	private BigDecimal cr_dist_code;
	public CropNamesMandalWise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropNamesMandalWise(String wbmname, BigDecimal cr_mand_code, BigDecimal farmers, BigDecimal bookedext,
			BigDecimal normalarea) {
		super();
		this.wbmname = wbmname;
		this.cr_mand_code = cr_mand_code;
		this.farmers = farmers;
		this.bookedext = bookedext;
		this.normalarea = normalarea;
	}
	public String getWbmname() {
		return wbmname;
	}
	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}
	public BigDecimal getCr_mand_code() {
		return cr_mand_code;
	}
	public void setCr_mand_code(BigDecimal cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}
	public BigDecimal getFarmers() {
		return farmers;
	}
	public void setFarmers(BigDecimal farmers) {
		this.farmers = farmers;
	}
	public BigDecimal getBookedext() {
		return bookedext;
	}
	public void setBookedext(BigDecimal bookedext) {
		this.bookedext = bookedext;
	}
	public BigDecimal getNormalarea() {
		return normalarea;
	}
	public void setNormalarea(BigDecimal normalarea) {
		this.normalarea = normalarea;
	}
	public BigDecimal getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(BigDecimal cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	@Override
	public String toString() {
		return "CropNamesMandalWise [wbmname=" + wbmname + ", cr_mand_code=" + cr_mand_code + ", farmers=" + farmers
				+ ", bookedext=" + bookedext + ", normalarea=" + normalarea + "]";
	}

	
	
}
