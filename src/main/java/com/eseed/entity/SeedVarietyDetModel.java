package com.eseed.entity;

public class SeedVarietyDetModel {

	private String productname ;
	private String subproductname ;
	private String varietycode ;
	private String varietyname ;
	
	public SeedVarietyDetModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeedVarietyDetModel(String productname, String subproductname, String varietycode, String varietyname) {
		super();
		this.productname = productname;
		this.subproductname = subproductname;
		this.varietycode = varietycode;
		this.varietyname = varietyname;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getSubproductname() {
		return subproductname;
	}

	public void setSubproductname(String subproductname) {
		this.subproductname = subproductname;
	}

	public String getVarietycode() {
		return varietycode;
	}

	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
	}

	public String getVarietyname() {
		return varietyname;
	}

	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}

	@Override
	public String toString() {
		return "SeedVarietyDetModel [productname=" + productname + ", subproductname=" + subproductname
				+ ", varietycode=" + varietycode + ", varietyname=" + varietyname + "]";
	}
	
	
	
	
}
