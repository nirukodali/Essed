package com.eseed.dto;

public class AddSeedVarietyDto {

	private String productcode;
	private String productname;

	private String subproductcode;
	private String subproductname;

	private String units;

	private String farmertype;

	private String farmer_desc;

	private String groupcode;
	private String groupname;
	private String active;
	private String repgrpcode;
	private String varietycode;

	private String seedname;
	private String seed;
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getSubproductcode() {
		return subproductcode;
	}
	public void setSubproductcode(String subproductcode) {
		this.subproductcode = subproductcode;
	}
	public String getSubproductname() {
		return subproductname;
	}
	public void setSubproductname(String subproductname) {
		this.subproductname = subproductname;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getFarmertype() {
		return farmertype;
	}
	public void setFarmertype(String farmertype) {
		this.farmertype = farmertype;
	}
	public String getFarmer_desc() {
		return farmer_desc;
	}
	public void setFarmer_desc(String farmer_desc) {
		this.farmer_desc = farmer_desc;
	}
	public String getGroupcode() {
		return groupcode;
	}
	public void setGroupcode(String groupcode) {
		this.groupcode = groupcode;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getRepgrpcode() {
		return repgrpcode;
	}
	public void setRepgrpcode(String repgrpcode) {
		this.repgrpcode = repgrpcode;
	}
	public String getVarietycode() {
		return varietycode;
	}
	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
	}
	public String getSeedname() {
		return seedname;
	}
	public void setSeedname(String seedname) {
		this.seedname = seedname;
	}
	public String getSeed() {
		return seed;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}
	@Override
	public String toString() {
		return "AddSeedVarietyDto [productcode=" + productcode + ", productname=" + productname + ", subproductcode="
				+ subproductcode + ", subproductname=" + subproductname + ", units=" + units + ", farmertype="
				+ farmertype + ", farmer_desc=" + farmer_desc + ", groupcode=" + groupcode + ", groupname=" + groupname
				+ ", active=" + active + ", repgrpcode=" + repgrpcode + ", varietycode=" + varietycode + ", seedname="
				+ seedname + ", seed=" + seed + ", getProductcode()=" + getProductcode() + ", getProductname()="
				+ getProductname() + ", getSubproductcode()=" + getSubproductcode() + ", getSubproductname()="
				+ getSubproductname() + ", getUnits()=" + getUnits() + ", getFarmertype()=" + getFarmertype()
				+ ", getFarmer_desc()=" + getFarmer_desc() + ", getGroupcode()=" + getGroupcode() + ", getGroupname()="
				+ getGroupname() + ", getActive()=" + getActive() + ", getRepgrpcode()=" + getRepgrpcode()
				+ ", getVarietycode()=" + getVarietycode() + ", getSeedname()=" + getSeedname() + ", getSeed()="
				+ getSeed() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



}
