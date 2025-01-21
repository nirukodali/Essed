package com.eseed.entity;

import java.util.Date;

public class ReplicationEntity {

	private Character season;
	private Integer cropyear;
	private String varietycode;
	private String productcode;
	private String name;
	private String subproductcode;
	private String subproductname;
	private Double productprice;
	private Double subsidy_amt;
	private Double nonsubsidy_amt;
	private String varietyname;
	private Integer dcode;
	private Date fromdate;
	private Date todate;
	private String quantity;
	private Character Active;
	public Character getSeason() {
		return season;
	}
	public void setSeason(Character season) {
		this.season = season;
	}
	public Integer getCropyear() {
		return cropyear;
	}
	public void setCropyear(Integer cropyear) {
		this.cropyear = cropyear;
	}
	public String getVarietycode() {
		return varietycode;
	}
	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Double getProductprice() {
		return productprice;
	}
	public void setProductprice(Double productprice) {
		this.productprice = productprice;
	}
	public Double getSubsidy_amt() {
		return subsidy_amt;
	}
	public void setSubsidy_amt(Double subsidy_amt) {
		this.subsidy_amt = subsidy_amt;
	}
	public Double getNonsubsidy_amt() {
		return nonsubsidy_amt;
	}
	public void setNonsubsidy_amt(Double nonsubsidy_amt) {
		this.nonsubsidy_amt = nonsubsidy_amt;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Character getActive() {
		return Active;
	}
	public void setActive(Character active) {
		Active = active;
	}
	@Override
	public String toString() {
		return "ReplicationEntity [season=" + season + ", cropyear=" + cropyear + ", varietycode=" + varietycode
				+ ", productcode=" + productcode + ", name=" + name + ", subproductcode=" + subproductcode
				+ ", subproductname=" + subproductname + ", productprice=" + productprice + ", subsidy_amt="
				+ subsidy_amt + ", nonsubsidy_amt=" + nonsubsidy_amt + ", varietyname=" + varietyname + ", dcode="
				+ dcode + ", fromdate=" + fromdate + ", todate=" + todate + ", quantity=" + quantity + ", Active="
				+ Active + ", getSeason()=" + getSeason() + ", getCropyear()=" + getCropyear() + ", getVarietycode()="
				+ getVarietycode() + ", getProductcode()=" + getProductcode() + ", getName()=" + getName()
				+ ", getSubproductcode()=" + getSubproductcode() + ", getSubproductname()=" + getSubproductname()
				+ ", getProductprice()=" + getProductprice() + ", getSubsidy_amt()=" + getSubsidy_amt()
				+ ", getNonsubsidy_amt()=" + getNonsubsidy_amt() + ", getVarietyname()=" + getVarietyname()
				+ ", getDcode()=" + getDcode() + ", getFromdate()=" + getFromdate() + ", getTodate()=" + getTodate()
				+ ", getQuantity()=" + getQuantity() + ", getActive()=" + getActive() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
