package com.eseed.dto;

import java.util.Date;

public class ProductPricesBDto {

	private Integer dcode;
	private String dname;
	private String seedname;
	private Character season;
	private Integer cropyear;
	private Double product_price;
	private Double subsidy_amt;
	private Double nonSubsidy_amt;
	private Double subsidy_percent;
	private Date fromdate;
	private Date todate;
	private Double quantityperbag;
	private Double from_extent;
	private Double to_extent;
	private Integer no_bags_allowed;
	private String varietycode;

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getSeedname() {
		return seedname;
	}

	public void setSeedname(String seedname) {
		this.seedname = seedname;
	}

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

	public Double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}

	public Double getSubsidy_amt() {
		return subsidy_amt;
	}

	public void setSubsidy_amt(Double subsidy_amt) {
		this.subsidy_amt = subsidy_amt;
	}

	public Double getNonSubsidy_amt() {
		return nonSubsidy_amt;
	}

	public void setNonSubsidy_amt(Double nonSubsidy_amt) {
		this.nonSubsidy_amt = nonSubsidy_amt;
	}

	public Double getSubsidy_percent() {
		return subsidy_percent;
	}

	public void setSubsidy_percent(Double subsidy_percent) {
		this.subsidy_percent = subsidy_percent;
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

	public Double getQuantityperbag() {
		return quantityperbag;
	}

	public void setQuantityperbag(Double quantityperbag) {
		this.quantityperbag = quantityperbag;
	}

	public Double getFrom_extent() {
		return from_extent;
	}

	public void setFrom_extent(Double from_extent) {
		this.from_extent = from_extent;
	}

	public Double getTo_extent() {
		return to_extent;
	}

	public void setTo_extent(Double to_extent) {
		this.to_extent = to_extent;
	}

	public Integer getNo_bags_allowed() {
		return no_bags_allowed;
	}

	public void setNo_bags_allowed(Integer no_bags_allowed) {
		this.no_bags_allowed = no_bags_allowed;
	}

	public String getVarietycode() {
		return varietycode;
	}

	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
	}

	@Override
	public String toString() {
		return "ProductPriceDto [dcode=" + dcode + ", dname=" + dname + ", seedname=" + seedname + ", season=" + season
				+ ", cropyear=" + cropyear + ", product_price=" + product_price + ", subsidy_amt=" + subsidy_amt
				+ ", nonSubsidy_amt=" + nonSubsidy_amt + ", subsidy_percent=" + subsidy_percent + ", fromdate="
				+ fromdate + ", todate=" + todate + ", quantityperbag=" + quantityperbag + ", from_extent="
				+ from_extent + ", to_extent=" + to_extent + ", no_bags_allowed=" + no_bags_allowed + ", varietycode="
				+ varietycode + ", getDcode()=" + getDcode() + ", getDname()=" + getDname() + ", getSeedname()="
				+ getSeedname() + ", getSeason()=" + getSeason() + ", getCropyear()=" + getCropyear()
				+ ", getProduct_price()=" + getProduct_price() + ", getSubsidy_amt()=" + getSubsidy_amt()
				+ ", getNonSubsidy_amt()=" + getNonSubsidy_amt() + ", getSubsidy_percent()=" + getSubsidy_percent()
				+ ", getFromdate()=" + getFromdate() + ", getTodate()=" + getTodate() + ", getQuantityperbag()="
				+ getQuantityperbag() + ", getFrom_extent()=" + getFrom_extent() + ", getTo_extent()=" + getTo_extent()
				+ ", getNo_bags_allowed()=" + getNo_bags_allowed() + ", getVarietycode()=" + getVarietycode()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
