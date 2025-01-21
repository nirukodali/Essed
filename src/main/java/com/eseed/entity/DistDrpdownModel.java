package com.eseed.entity;

public class DistDrpdownModel {

	
	private String dcode;
	
	private String dname;

	public DistDrpdownModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistDrpdownModel(String dcode, String dname) {
		super();
		this.dcode = dcode;
		this.dname = dname;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "DistDrpdown [dcode=" + dcode + ", dname=" + dname + "]";
	}
	
	
}
