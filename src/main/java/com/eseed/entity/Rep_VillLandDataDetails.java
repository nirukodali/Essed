package com.eseed.entity;




public class Rep_VillLandDataDetails {
	
	private String wbvname;
	private Integer no_of_records;
	public Rep_VillLandDataDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rep_VillLandDataDetails(String wbvname, Integer no_of_records) {
		super();
		this.wbvname = wbvname;
		this.no_of_records = no_of_records;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public Integer getNo_of_records() {
		return no_of_records;
	}
	public void setNo_of_records(Integer no_of_records) {
		this.no_of_records = no_of_records;
	}
	@Override
	public String toString() {
		return "Rep_VillLandDataDetails [wbvname=" + wbvname + ", no_of_records=" + no_of_records + "]";
	}
	
}
