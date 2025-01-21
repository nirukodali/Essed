package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CropNamesDistrictWise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private BigDecimal bookedext;
	private BigDecimal farmers;
	private BigDecimal normalarea;
	private BigDecimal cr_dist_code;
	public CropNamesDistrictWise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropNamesDistrictWise(String wbdname, BigDecimal bookedext, BigDecimal farmers, BigDecimal normalarea,
			BigDecimal cr_dist_code) {
		super();
		this.wbdname = wbdname;
		this.bookedext = bookedext;
		this.farmers = farmers;
		this.normalarea = normalarea;
		this.cr_dist_code = cr_dist_code;
	}
	public String getWbdname() {
		return wbdname;
	}
	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}
	public BigDecimal getBookedext() {
		return bookedext;
	}
	public void setBookedext(BigDecimal bookedext) {
		this.bookedext = bookedext;
	}
	public BigDecimal getFarmers() {
		return farmers;
	}
	public void setFarmers(BigDecimal farmers) {
		this.farmers = farmers;
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
		return "CropNamesDistrictWise [wbdname=" + wbdname + ", bookedext=" + bookedext + ", farmers=" + farmers
				+ ", normalarea=" + normalarea + ", cr_dist_code=" + cr_dist_code + "]";
	}
	
	
	

}
