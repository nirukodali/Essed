package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CropNamesVillageWise {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String wbvname;
    private Integer cr_vcode;
    private BigDecimal bookedext;
    private BigDecimal farmers;
    private BigDecimal cr_dist_code;
    private BigDecimal cr_mand_code;
	public CropNamesVillageWise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropNamesVillageWise(String wbvname, Integer cr_vcode, BigDecimal bookedext, BigDecimal farmers,
			BigDecimal cr_dist_code, BigDecimal cr_mand_code) {
		super();
		this.wbvname = wbvname;
		this.cr_vcode = cr_vcode;
		this.bookedext = bookedext;
		this.farmers = farmers;
		this.cr_dist_code = cr_dist_code;
		this.cr_mand_code = cr_mand_code;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public Integer getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(Integer cr_vcode) {
		this.cr_vcode = cr_vcode;
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
	@Override
	public String toString() {
		return "CropNamesVillageWise [wbvname=" + wbvname + ", cr_vcode=" + cr_vcode + ", bookedext=" + bookedext
				+ ", farmers=" + farmers + ", cr_dist_code=" + cr_dist_code + ", cr_mand_code=" + cr_mand_code + "]";
	}
	
}
