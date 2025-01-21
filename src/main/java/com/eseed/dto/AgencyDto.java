package com.eseed.dto;

public class AgencyDto {
	
	private Integer agencycode;
	private String agencyname;
	private Character active;
	private Integer	oldagencycode;
	private Character agencytype;
	
	
	
	public Integer getAgencycode() {
		return agencycode;
	}
	public void setAgencycode(Integer agencycode) {
		this.agencycode = agencycode;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}
	public Character getActive() {
		return active;
	}
	public void setActive(Character active) {
		this.active = active;
	}
	public Integer getOldagencycode() {
		return oldagencycode;
	}
	public void setOldagencycode(Integer oldagencycode) {
		this.oldagencycode = oldagencycode;
	}
	public Character getAgencytype() {
		return agencytype;
	}
	public void setAgencytype(Character agencytype) {
		this.agencytype = agencytype;
	}
	@Override
	public String toString() {
		return "AgencyDto [agencycode=" + agencycode + ", agencyname=" + agencyname + ", active=" + active
				+ ", oldagencycode=" + oldagencycode + ", agencytype=" + agencytype + ", getAgencycode()="
				+ getAgencycode() + ", getAgencyname()=" + getAgencyname() + ", getActive()=" + getActive()
				+ ", getOldagencycode()=" + getOldagencycode() + ", getAgencytype()=" + getAgencytype()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
