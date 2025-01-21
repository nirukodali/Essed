package com.eseed.entity;






public class DistrictCount {
	
	private String wbedname;
	private long count;
	private Integer dcode;
	
	public DistrictCount() {}
	public String getWbedname() {
		return wbedname;
	}
	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}
	public DistrictCount(String wbedname, long count, Integer dcode) {
		super();
		this.wbedname = wbedname;
		this.count = count;
		this.dcode = dcode;
	}
	@Override
	public String toString() {
		return "DistrictCount [wbedname=" + wbedname + ", count=" + count + ", dcode=" + dcode + "]";
	}
	
	
	
	
}