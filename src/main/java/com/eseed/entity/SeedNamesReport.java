package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SeedNamesReport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String productcode;
	private String productname;
	private String subproductname;
	private String varietyname;
	private String units;
	private Short  farmertype;
	private Character active;
	private Integer groupcode;
	private String subproductcode;
	private String varietycode;
	
	
	public SeedNamesReport() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SeedNamesReport(String productcode, String productname, String subproductname, String varietyname,
			String units, Short  farmertype, Character active, Integer groupcode, String subproductcode,
			String varietycode) {
		super();
		this.productcode = productcode;
		this.productname = productname;
		this.subproductname = subproductname;
		this.varietyname = varietyname;
		this.units = units;
		this.farmertype = farmertype;
		this.active = active;
		this.groupcode = groupcode;
		this.subproductcode = subproductcode;
		this.varietycode = varietycode;
	}


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


	public String getSubproductname() {
		return subproductname;
	}


	public void setSubproductname(String subproductname) {
		this.subproductname = subproductname;
	}


	public String getVarietyname() {
		return varietyname;
	}


	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}


	public String getUnits() {
		return units;
	}


	public void setUnits(String units) {
		this.units = units;
	}


	public Short getFarmertype() {
		return farmertype;
	}


	public void setFarmertype(Short farmertype) {
		this.farmertype = farmertype;
	}


	public Character getActive() {
		return active;
	}


	public void setActive(Character active) {
		this.active = active;
	}


	public Integer getGroupcode() {
		return groupcode;
	}


	public void setGroupcode(Integer groupcode) {
		this.groupcode = groupcode;
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
		return "SeedNamesReport [productcode=" + productcode + ", productname=" + productname + ", subproductname="
				+ subproductname + ", varietyname=" + varietyname + ", units=" + units + ", farmertype=" + farmertype
				+ ", active=" + active + ", groupcode=" + groupcode + ", subproductcode=" + subproductcode
				+ ", varietycode=" + varietycode + "]";
	}
}
