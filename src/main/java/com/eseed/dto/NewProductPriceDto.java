package com.eseed.dto;

import java.sql.Date;

public class NewProductPriceDto {
	
	private Double product_price;
	private Double subsidy_percent;
	private Double subsidy_amt;
	private Double nonsubsidy_amt;
	private Date fromdate;
	private Date todate;
	private Character active;
	private int productid;
	private Double quantityperbag;
	private int dcode;
	private String varietyName;
	private String distName;
	private String varietyCode;
	
	public String getVarietyCode() {
		return varietyCode;
	}

	public void setVarietyCode(String varietyCode) {
		this.varietyCode = varietyCode;
	}

	public Double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}

	public Double getSubsidy_percent() {
		return subsidy_percent;
	}

	public void setSubsidy_percent(Double subsidy_percent) {
		this.subsidy_percent = subsidy_percent;
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

	public Character getActive() {
		return active;
	}

	public void setActive(Character active) {
		this.active = active;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public Double getQuantityperbag() {
		return quantityperbag;
	}

	public void setQuantityperbag(Double quantityperbag) {
		this.quantityperbag = quantityperbag;
	}

	public int getDcode() {
		return dcode;
	}

	public void setDcode(int dcode) {
		this.dcode = dcode;
	}

	public String getVarietyName() {
		return varietyName;
	}

	public void setVarietyName(String varietyName) {
		this.varietyName = varietyName;
	}

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	@Override
	public String toString() {
		return "NewProductPriceDto [product_price=" + product_price + ", subsidy_percent=" + subsidy_percent
				+ ", subsidy_amt=" + subsidy_amt + ", nonsubsidy_amt=" + nonsubsidy_amt + ", fromdate=" + fromdate
				+ ", todate=" + todate + ", active=" + active + ", productid=" + productid + ", quantityperbag="
				+ quantityperbag + ", dcode=" + dcode + ", varietyName=" + varietyName + ", distName=" + distName
				+ ", varietyCode=" + varietyCode + "]";
	}

	public NewProductPriceDto(Double product_price, Double subsidy_percent, Double subsidy_amt, Double nonsubsidy_amt,
			Date fromdate, Date todate, Character active, int productid, Double quantityperbag, int dcode,
			String varietyName, String distName, String varietyCode) {
		super();
		this.product_price = product_price;
		this.subsidy_percent = subsidy_percent;
		this.subsidy_amt = subsidy_amt;
		this.nonsubsidy_amt = nonsubsidy_amt;
		this.fromdate = fromdate;
		this.todate = todate;
		this.active = active;
		this.productid = productid;
		this.quantityperbag = quantityperbag;
		this.dcode = dcode;
		this.varietyName = varietyName;
		this.distName = distName;
		this.varietyCode = varietyCode;
	}

	public NewProductPriceDto() {
		
	}

}
