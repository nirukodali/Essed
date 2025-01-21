package com.eseed.dto;

public class SeedVarietyCodeDto {
	
	private String varietyname;
	
	private String varietycode;
	
	private Integer productid;
	
	

	public String getVarietyname() {
		return varietyname;
	}

	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}

	public String getVarietycode() {
		return varietycode;
	}

	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	@Override
	public String toString() {
		return "SeedVarietyCodeDto [varietyname=" + varietyname + ", varietycode=" + varietycode + ", productid="
				+ productid + ", getVarietyname()=" + getVarietyname() + ", getVarietycode()=" + getVarietycode()
				+ ", getProductid()=" + getProductid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

	
	
}
