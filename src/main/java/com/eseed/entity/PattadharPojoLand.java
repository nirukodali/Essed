package com.eseed.entity;

import java.math.BigDecimal;

public class PattadharPojoLand {
	
	
	private Integer cr_vcode;
	
	
	private String fatherName;
	private String farmerName;
	private BigDecimal totalExtent;
	private String occupName;
	private BigDecimal khatNo;
	private String surveyNo;
	private BigDecimal occup_extent;
	
	private Integer rec_id;
	public Integer getRec_id() {
		return rec_id;
	}
	public void setRec_id(Integer rec_id) {
		this.rec_id = rec_id;
	}
	public BigDecimal getOccup_extent() {
		return occup_extent;
	}
	public void setOccup_extent(BigDecimal occup_extent) {
		this.occup_extent = occup_extent;
	}
	public Integer getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(Integer cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	public String getSurveyNo() {
		return surveyNo;
	}
	public void setSurveyNo(String surveyNo) {
		this.surveyNo = surveyNo;
	}
	public BigDecimal getKhatNo() {
		return khatNo;
	}
	public void setKhatNo(BigDecimal khatNo) {
		this.khatNo = khatNo;
	}
	public BigDecimal getTotalExtent() {
		return totalExtent;
	}
	public void setTotalExtent(BigDecimal totalExtent) {
		this.totalExtent = totalExtent;
	}
	public String getOccupName() {
		return occupName;
	}
	public void setOccupName(String occupName) {
		this.occupName = occupName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

}
