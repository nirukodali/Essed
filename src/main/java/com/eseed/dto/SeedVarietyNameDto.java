package com.eseed.dto;

public class SeedVarietyNameDto {
	
	private String varietyname;
	
	private String varietycode;
	

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

	@Override
	public String toString() {
		return "SeedVarietyNameDto [varietyname=" + varietyname + ", varietycode=" + varietycode + ", getVarietyname()="
				+ getVarietyname() + ", getVarietycode()=" + getVarietycode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
