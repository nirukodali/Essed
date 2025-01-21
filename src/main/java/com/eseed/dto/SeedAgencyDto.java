package com.eseed.dto;

public class SeedAgencyDto {

private Integer dcode;
private String    agency_code ;
private String    productcode ;
private String   subproductcode ;
private String varietycode   ;
public Integer getDcode() {
	return dcode;
}
public void setDcode(Integer dcode) {
	this.dcode = dcode;
}
public String getAgency_code() {
	return agency_code;
}
public void setAgency_code(String agency_code) {
	this.agency_code = agency_code;
}
public String getProductcode() {
	return productcode;
}
public void setProductcode(String productcode) {
	this.productcode = productcode;
}
public String getSubproductcode() {
	return subproductcode;
}
public void setSubproductcode(String subproductcode) {
	this.subproductcode = subproductcode;
}
public String getVarietycode() {
	return varietycode;
}
public void setVarietycode(String varietycode) {
	this.varietycode = varietycode;
}
@Override
public String toString() {
	return "SeedAgencyDto [dcode=" + dcode + ", agency_code=" + agency_code + ", productcode=" + productcode
			+ ", subproductcode=" + subproductcode + ", varietycode=" + varietycode + "]";
}


	
}
