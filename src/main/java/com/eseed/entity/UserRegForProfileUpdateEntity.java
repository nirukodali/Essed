package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_registration")
public class UserRegForProfileUpdateEntity {


	@Column(name = "usertype")
	public Integer userType;
	
	@Column(name = "name")
	private String name;

	@Column(name = "aadhaar_id")
	private String aadharId;

	@Column(name = "type_user")
	private String typeuser;

	@Column(name = "mobile_phone")
	private String mobilePhone;

	@Id
	@Column(name = "userid")
	private String userid;

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getTypeuser() {
		return typeuser;
	}

	public void setTypeuser(String typeuser) {
		this.typeuser = typeuser;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
