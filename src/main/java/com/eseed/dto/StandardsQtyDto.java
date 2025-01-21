package com.eseed.dto;

import java.util.Date;

public class StandardsQtyDto {
	
	private Date fromdate;
	private Date todate;
	private Integer quantityperbag;
	private Double from_extent;
	private Double to_extent;
	private Integer no_bags_allowed;
	private Integer stdid;
	private String varietycode;
	private Character season;
	private Integer cropyear;
	private Integer dcode;
	@Override
	public String toString() {
		return "StandardsQtyDto [fromdate=" + fromdate + ", todate=" + todate + ", quantityperbag=" + quantityperbag
				+ ", from_extent=" + from_extent + ", to_extent=" + to_extent + ", no_bags_allowed=" + no_bags_allowed
				+ ", stdid=" + stdid + ", varietycode=" + varietycode + ", season=" + season + ", cropyear=" + cropyear
				+ ", dcode=" + dcode + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
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
	public Integer getQuantityperbag() {
		return quantityperbag;
	}
	public void setQuantityperbag(Integer quantityperbag) {
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
	public Integer getStdid() {
		return stdid;
	}
	public void setStdid(Integer stdid) {
		this.stdid = stdid;
	}
	public String getVarietycode() {
		return varietycode;
	}
	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
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
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}


	
}
