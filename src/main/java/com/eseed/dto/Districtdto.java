package com.eseed.dto;

public class Districtdto {

	private String dcode;
	private String dname;
	private String wbdcode;
	
	private String mname;
	private String mcode;
	
	
	
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
	public String getWbdcode() {
		return wbdcode;
	}
	public void setWbdcode(String wbdcode) {
		this.wbdcode = wbdcode;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMcode() {
		return mcode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	@Override
	public String toString() {
		return "Districtdto [dcode=" + dcode + ", dname=" + dname + ", wbdcode=" + wbdcode + ", mname=" + mname
				+ ", mcode=" + mcode + ", getDcode()=" + getDcode() + ", getDname()=" + getDname() + ", getWbdcode()="
				+ getWbdcode() + ", getMname()=" + getMname() + ", getMcode()=" + getMcode() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
