package com.eseed.dto;

import java.sql.Date;

public class ProductPriceDto {
	

private Integer newrateid;
private Integer dcode;  
private double product_price;
private double subsidy_percent; 
private double subsidy_amt;
private double nonsubsidy_amt; 
private String  fromdate; 
private String todate;
private Character active;
private Integer productid; 
private double quantityperbag;
private String dname;
private String name ;
private String varietycode;   
private Integer cropyear;
private Character season;
private String payment_from_dt;
private String  payment_close_dt;
private String dist_from_dt;
private String dist_close_dt;




public Integer getNewrateid() {
	return newrateid;
}
public void setNewrateid(Integer newrateid) {
	this.newrateid = newrateid;
}
public Integer getDcode() {
	return dcode;
}
public void setDcode(Integer dcode) {
	this.dcode = dcode;
}
public double getProduct_price() {
	return product_price;
}
public void setProduct_price(double product_price) {
	this.product_price = product_price;
}
public double getSubsidy_percent() {
	return subsidy_percent;
}
public void setSubsidy_percent(double subsidy_percent) {
	this.subsidy_percent = subsidy_percent;
}
public double getSubsidy_amt() {
	return subsidy_amt;
}
public void setSubsidy_amt(double subsidy_amt) {
	this.subsidy_amt = subsidy_amt;
}
public double getNonsubsidy_amt() {
	return nonsubsidy_amt;
}
public void setNonsubsidy_amt(double nonsubsidy_amt) {
	this.nonsubsidy_amt = nonsubsidy_amt;
}
public String getFromdate() {
	return fromdate;
}
public void setFromdate(String fromdate) {
	this.fromdate = fromdate;
}
public String getTodate() {
	return todate;
}
public void setTodate(String todate) {
	this.todate = todate;
}
public Character getActive() {
	return active;
}
public void setActive(Character active) {
	this.active = active;
}
public Integer getProductid() {
	return productid;
}
public void setProductid(Integer productid) {
	this.productid = productid;
}
public double getQuantityperbag() {
	return quantityperbag;
}
public void setQuantityperbag(double quantityperbag) {
	this.quantityperbag = quantityperbag;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getVarietycode() {
	return varietycode;
}
public void setVarietycode(String varietycode) {
	this.varietycode = varietycode;
}
public Integer getCropyear() {
	return cropyear;
}
public void setCropyear(Integer cropyear) {
	this.cropyear = cropyear;
}
public Character getSeason() {
	return season;
}
public void setSeason(Character season) {
	this.season = season;
}
public String getPayment_from_dt() {
	return payment_from_dt;
}
public void setPayment_from_dt(String payment_from_dt) {
	this.payment_from_dt = payment_from_dt;
}
public String getPayment_close_dt() {
	return payment_close_dt;
}
public void setPayment_close_dt(String payment_close_dt) {
	this.payment_close_dt = payment_close_dt;
}
public String getDist_from_dt() {
	return dist_from_dt;
}
public void setDist_from_dt(String dist_from_dt) {
	this.dist_from_dt = dist_from_dt;
}
public String getDist_close_dt() {
	return dist_close_dt;
}
public void setDist_close_dt(String dist_close_dt) {
	this.dist_close_dt = dist_close_dt;
}
@Override
public String toString() {
	return "ProductPriceDto [newrateid=" + newrateid + ", dcode=" + dcode + ", product_price=" + product_price
			+ ", subsidy_percent=" + subsidy_percent + ", subsidy_amt=" + subsidy_amt + ", nonsubsidy_amt="
			+ nonsubsidy_amt + ", fromdate=" + fromdate + ", todate=" + todate + ", active=" + active + ", productid="
			+ productid + ", quantityperbag=" + quantityperbag + ", dname=" + dname + ", name=" + name
			+ ", varietycode=" + varietycode + ", cropyear=" + cropyear + ", season=" + season + ", payment_from_dt="
			+ payment_from_dt + ", payment_close_dt=" + payment_close_dt + ", dist_from_dt=" + dist_from_dt
			+ ", dist_close_dt=" + dist_close_dt + ", getNewrateid()=" + getNewrateid() + ", getDcode()=" + getDcode()
			+ ", getProduct_price()=" + getProduct_price() + ", getSubsidy_percent()=" + getSubsidy_percent()
			+ ", getSubsidy_amt()=" + getSubsidy_amt() + ", getNonsubsidy_amt()=" + getNonsubsidy_amt()
			+ ", getFromdate()=" + getFromdate() + ", getTodate()=" + getTodate() + ", getActive()=" + getActive()
			+ ", getProductid()=" + getProductid() + ", getQuantityperbag()=" + getQuantityperbag() + ", getDname()="
			+ getDname() + ", getName()=" + getName() + ", getVarietycode()=" + getVarietycode() + ", getCropyear()="
			+ getCropyear() + ", getSeason()=" + getSeason() + ", getPayment_from_dt()=" + getPayment_from_dt()
			+ ", getPayment_close_dt()=" + getPayment_close_dt() + ", getDist_from_dt()=" + getDist_from_dt()
			+ ", getDist_close_dt()=" + getDist_close_dt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}


	
}
