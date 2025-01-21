package com.eseed.util;

public class WbVillageModel {

	public WbVillageModel() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer wbvcode;
	private String wbvname;
	
	
	public WbVillageModel(Integer wbvcode, String wbvname) {
		super();
		this.wbvcode = wbvcode;
		this.wbvname = wbvname;
	}
	public Integer getWbvcode() {
		return wbvcode;
	}
	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	@Override
	public String toString() {
		return "WbVillageModel [wbvcode=" + wbvcode + ", wbvname=" + wbvname + "]";
	}
	
	

}
