package com.eseed.entity;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "user_registration")
public class UserRegEntity {

	
	@Column(name = "usertype")
	public Integer userType;
	
	@Column(name = "name")
	private String name;

	
	
	@Column(name = "aadhaar_id")
	private String aadhaar_id;

	@Column(name = "type_user")
	private String type_user;

	@Column(name = "mobile_phone")
	private String mobile_phone;

	@Id
	@Column(name = "userid")
	private String userid;

	@Column(name = "encpassword")
	private String encpassword;

	@Column(name = "district")
	private String distCode;

	@Column(name = "blockortehsil")
	private String mandCode;

	@Column(name = "village")
	private String villCode;

	@Column(name = "wbmcode")
	private Integer wbMcode;

	@Column(name = "wbdcode")
	private Integer wbDcode;
	
	@Column(name = "emailid")
	private String emailid;

	@Column(name = "wbvcode")
	private Integer wbvcode;
	
	@ManyToMany(cascade =CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "userroles_v",joinColumns = @JoinColumn(name = "userid"),
	inverseJoinColumns = @JoinColumn(name = "usertype"))
	Set<UserTypesEntity> roles = new HashSet<UserTypesEntity>();
	
	
	public UserRegEntity() {
		// TODO Auto-generated constructor stub
	}


	public UserRegEntity( String name, String aadhaar_id, String type_user, String mobile_phone,
			String userid, String encpassword, String distCode, String mandCode, String villCode, Integer wbMcode,
			Integer wbDcode, Integer wbvcode, Set<UserTypesEntity> roles) {
		super();
		this.name = name;
		this.aadhaar_id = aadhaar_id;
		this.type_user = type_user;
		this.mobile_phone = mobile_phone;
		this.userid = userid;
		this.encpassword = encpassword;
		this.distCode = distCode;
		this.mandCode = mandCode;
		this.villCode = villCode;
		this.wbMcode = wbMcode;
		this.wbDcode = wbDcode;
		this.wbvcode = wbvcode;
		this.roles = roles;
	}

	
	

	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


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


	public String getAadhaar_id() {
		return aadhaar_id;
	}


	public void setAadhaar_id(String aadhaar_id) {
		this.aadhaar_id = aadhaar_id;
	}


	public String getType_user() {
		return type_user;
	}


	public void setType_user(String type_user) {
		this.type_user = type_user;
	}


	public String getMobile_phone() {
		return mobile_phone;
	}


	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getEncpassword() {
		return encpassword;
	}


	public void setEncpassword(String encpassword) {
		this.encpassword = encpassword;
	}


	public String getDistCode() {
		return distCode;
	}


	public void setDistCode(String distCode) {
		this.distCode = distCode;
	}


	public String getMandCode() {
		return mandCode;
	}


	public void setMandCode(String mandCode) {
		this.mandCode = mandCode;
	}


	public String getVillCode() {
		return villCode;
	}


	public void setVillCode(String villCode) {
		this.villCode = villCode;
	}


	public Integer getWbMcode() {
		return wbMcode;
	}


	public void setWbMcode(Integer wbMcode) {
		this.wbMcode = wbMcode;
	}


	public Integer getWbDcode() {
		return wbDcode;
	}


	public void setWbDcode(Integer wbDcode) {
		this.wbDcode = wbDcode;
	}


	public Integer getWbvcode() {
		return wbvcode;
	}


	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}


	public Set<UserTypesEntity> getRoles() {
		return roles;
	}


	public void setRoles(Set<UserTypesEntity> roles) {
		this.roles = roles;
	}
	
	
	
	 public String  getUserTypeEntityDetails() {
		 
		 String role="";
	        for (UserTypesEntity typeentity : roles) {
	            System.out.println(typeentity.getTypeName());
	            
	            role=typeentity.getTypeName();
	        }
			return role;
	    }


	@Override
	public String toString() {
		return "UserRegEntity [userType=" + userType + ", name=" + name + ", aadhaar_id=" + aadhaar_id + ", type_user="
				+ type_user + ", mobile_phone=" + mobile_phone + ", userid=" + userid + ", encpassword=" + encpassword
				+ ", distCode=" + distCode + ", mandCode=" + mandCode + ", villCode=" + villCode + ", wbMcode="
				+ wbMcode + ", wbDcode=" + wbDcode + ", wbvcode=" + wbvcode + ", roles=" + roles + "]";
	}
	
}


