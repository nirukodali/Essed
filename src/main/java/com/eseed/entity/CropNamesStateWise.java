package com.eseed.entity;

import java.math.BigDecimal;

public class CropNamesStateWise {
	private String cropname;
	private Integer cropid;
	private BigDecimal bookedext;
	private BigDecimal farmers;
	private BigDecimal cr_dist_code;
	private String url;
	

	public CropNamesStateWise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CropNamesStateWise(String cropname, Integer cropid, BigDecimal bookedext, BigDecimal farmers) {
		super();
		this.cropname = cropname;
		this.cropid = cropid;
		this.bookedext = bookedext;
		this.farmers = farmers;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public Integer getCropid() {
		return cropid;
	}
	public void setCropid(Integer cropid) {
		this.cropid = cropid;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public BigDecimal getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(BigDecimal cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	@Override
	public String toString() {
		return "CropNamesStateWise [cropname=" + cropname + ", cropid=" + cropid + ", bookedext=" + bookedext
				+ ", farmers=" + farmers + "]";
	}
	
	

}
