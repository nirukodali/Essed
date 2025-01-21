package com.eseed.dto;

import java.util.Date;

public class StandardsQty {

	private Integer dcode;
	private String varietycode;
	private String dname;
	private Character season;
	private Integer cropyear;
	private Double from_extent;
	private Double to_extent;
	private Integer no_bags_allowed;
	private Date fromdate;
	private Date todate;

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

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "StandardsQty [dcode=" + dcode + ", varietycode=" + varietycode + ", dname=" + dname + ", season="
				+ season + ", cropyear=" + cropyear + ", from_extent=" + from_extent + ", to_extent=" + to_extent
				+ ", no_bags_allowed=" + no_bags_allowed + ", fromdate=" + fromdate + ", todate=" + todate + "]";
	}


}
