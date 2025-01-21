package com.eseed.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Pricesreport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dcode;
	private String varietycode;
	private Double product_price;
	private Double subsidy_amt;
	private Double nonsubsidy_amt;
	private Date fromdate;
	private Date todate;
	private Character active;
	private Integer productid;
	private Double quantityperbag;
	
	
	public Pricesreport() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pricesreport(Integer dcode, String varietycode, Double product_price, Double subsidy_amt,
			Double nonsubsidy_amt, Date fromdate, Date todate, Character active, Integer productid,
			Double quantityperbag) {
		super();
		this.dcode = dcode;
		this.varietycode = varietycode;
		this.product_price = product_price;
		this.subsidy_amt = subsidy_amt;
		this.nonsubsidy_amt = nonsubsidy_amt;
		this.fromdate = fromdate;
		this.todate = todate;
		this.active = active;
		this.productid = productid;
		this.quantityperbag = quantityperbag;
	}


	public Integer getDcode() {
		return dcode;
	}


	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}


	public String getVarietycode() {
		return varietycode;
	}


	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
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


	public Integer getProductid() {
		return productid;
	}


	public void setProductid(Integer productid) {
		this.productid = productid;
	}


	public Double getQuantityperbag() {
		return quantityperbag;
	}


	public void setQuantityperbag(Double quantityperbag) {
		this.quantityperbag = quantityperbag;
	}


	@Override
	public String toString() {
		return "Pricesreport [dcode=" + dcode + ", varietycode=" + varietycode + ", product_price=" + product_price
				+ ", subsidy_amt=" + subsidy_amt + ", nonsubsidy_amt=" + nonsubsidy_amt + ", fromdate=" + fromdate
				+ ", todate=" + todate + ", active=" + active + ", productid=" + productid + ", quantityperbag="
				+ quantityperbag + "]";
	}
}
