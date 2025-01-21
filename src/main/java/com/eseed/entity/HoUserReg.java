package com.eseed.entity;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_registration")
public class HoUserReg {
	
	@Id
	private String blockortehsil;
	
	private String district;
	
	private String type_user;
	
	private String userid ;
	
	private String password;
	
	private String retype_password;
	
	private String encpassword;
	
	private String status;
	
	private String webloginstatus;
	
	private Timestamp datetime;

	public Timestamp getDatetime() {
		return datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlockortehsil() {
		return blockortehsil;
	}

	public void setBlockortehsil(String blockortehsil) {
		this.blockortehsil = blockortehsil;
	}

	public String getType_user() {
		return type_user;
	}

	public void setType_user(String type_user) {
		this.type_user = type_user;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRetype_password() {
		return retype_password;
	}

	public void setRetype_password(String retype_password) {
		this.retype_password = retype_password;
	}

	public String getEncpassword() {
		return encpassword;
	}

	public void setEncpassword(String encpassword) {
		this.encpassword = encpassword;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWebloginstatus() {
		return webloginstatus;
	}

	public void setWebloginstatus(String webloginstatus) {
		this.webloginstatus = webloginstatus;
	}
	
	
	
}
