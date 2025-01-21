package com.eseed.dto;

public class UserActiveDeactiveDto {

	private String userid;
	private String district;

	private String mandal;

	private String village;

	private String status;
	private String cropyear;
	private String actid;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
	

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCropyear() {
		return cropyear;
	}

	public void setCropyear(String cropyear) {
		this.cropyear = cropyear;
	}

	public String getActid() {
		return actid;
	}

	public void setActid(String actid) {
		this.actid = actid;
	}

	@Override
	public String toString() {
		return "UserActiveDeactiveDto [userid=" + userid + ", district=" + district + ", mandal=" + mandal
				+ ", village=" + village + ", status=" + status + ", cropyear=" + cropyear + ", actid=" + actid + "]";
	}


	


	
}
