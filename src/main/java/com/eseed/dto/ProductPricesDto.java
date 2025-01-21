package com.eseed.dto;

import java.sql.Timestamp;
import java.util.Date;

public class ProductPricesDto {

	private Integer productid;
	private String varietycode;
	private Double product_price;
	private Double subsidy_amt;
	private Double nonsubsidy_amt;
	private Date fromdate;
	private Date todate;
	private String username;

	private Timestamp ts;
	private Integer rateid;
	private Character active;
	private Integer dcode;
	private String reference;
	private Date refdate;
	private String clientip;
	private Character season;
	private String entereduserid;
	private Double subsidy_percent;
	private Integer cropyear;
	private Double quantityperbag;
	private Double subs_percent;
	private Integer newrateid;
	private Character rec_frz;
	private Date payment_close_dt;
	private Date dist_from_dt;
	private Date dist_close_dt;
	private Date payment_from_dt;

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Timestamp getTs() {
		return ts;
	}

	public void setTs(Timestamp ts) {
		this.ts = ts;
	}

	public Integer getRateid() {
		return rateid;
	}

	public void setRateid(Integer rateid) {
		this.rateid = rateid;
	}

	public Character getActive() {
		return active;
	}

	public void setActive(Character active) {
		this.active = active;
	}

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getRefdate() {
		return refdate;
	}

	public void setRefdate(Date refdate) {
		this.refdate = refdate;
	}

	public String getClientip() {
		return clientip;
	}

	public void setClientip(String clientip) {
		this.clientip = clientip;
	}

	public Character getSeason() {
		return season;
	}

	public void setSeason(Character season) {
		this.season = season;
	}

	public String getEntereduserid() {
		return entereduserid;
	}

	public void setEntereduserid(String entereduserid) {
		this.entereduserid = entereduserid;
	}

	public Double getSubsidy_percent() {
		return subsidy_percent;
	}

	public void setSubsidy_percent(Double subsidy_percent) {
		this.subsidy_percent = subsidy_percent;
	}

	public Integer getCropyear() {
		return cropyear;
	}

	public void setCropyear(Integer cropyear) {
		this.cropyear = cropyear;
	}

	public Double getQuantityperbag() {
		return quantityperbag;
	}

	public void setQuantityperbag(Double quantityperbag) {
		this.quantityperbag = quantityperbag;
	}

	public Double getSubs_percent() {
		return subs_percent;
	}

	public void setSubs_percent(Double subs_percent) {
		this.subs_percent = subs_percent;
	}

	public Integer getNewrateid() {
		return newrateid;
	}

	public void setNewrateid(Integer newrateid) {
		this.newrateid = newrateid;
	}

	public Character getRec_frz() {
		return rec_frz;
	}

	public void setRec_frz(Character rec_frz) {
		this.rec_frz = rec_frz;
	}

	public Date getPayment_close_dt() {
		return payment_close_dt;
	}

	public void setPayment_close_dt(Date payment_close_dt) {
		this.payment_close_dt = payment_close_dt;
	}

	public Date getDist_from_dt() {
		return dist_from_dt;
	}

	public void setDist_from_dt(Date dist_from_dt) {
		this.dist_from_dt = dist_from_dt;
	}

	public Date getDist_close_dt() {
		return dist_close_dt;
	}

	public void setDist_close_dt(Date dist_close_dt) {
		this.dist_close_dt = dist_close_dt;
	}

	public Date getPayment_from_dt() {
		return payment_from_dt;
	}

	public void setPayment_from_dt(Date payment_from_dt) {
		this.payment_from_dt = payment_from_dt;
	}

	@Override
	public String toString() {
		return "ProductPricesDto [productid=" + productid + ", varietycode=" + varietycode + ", product_price="
				+ product_price + ", subsidy_amt=" + subsidy_amt + ", nonsubsidy_amt=" + nonsubsidy_amt + ", fromdate="
				+ fromdate + ", todate=" + todate + ", username=" + username + ", ts=" + ts + ", rateid=" + rateid
				+ ", active=" + active + ", dcode=" + dcode + ", reference=" + reference + ", refdate=" + refdate
				+ ", clientip=" + clientip + ", season=" + season + ", entereduserid=" + entereduserid
				+ ", subsidy_percent=" + subsidy_percent + ", cropyear=" + cropyear + ", quantityperbag="
				+ quantityperbag + ", subs_percent=" + subs_percent + ", newrateid=" + newrateid + ", rec_frz="
				+ rec_frz + ", payment_close_dt=" + payment_close_dt + ", dist_from_dt=" + dist_from_dt
				+ ", dist_close_dt=" + dist_close_dt + ", payment_from_dt=" + payment_from_dt + "]";
	}

}
