package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RepVaaDetails {
	
	private String districtname;
	private String mandalname;
	private String villagename;
	private String userid;
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigDecimal mobile_phone;
	private String emailid;
	private String status;
	public RepVaaDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RepVaaDetails(String districtname, String mandalname, String villagename, String userid, String name,
			BigDecimal mobile_phone, String emailid, String status) {
		super();
		this.districtname = districtname;
		this.mandalname = mandalname;
		this.villagename = villagename;
		this.userid = userid;
		this.name = name;
		this.mobile_phone = mobile_phone;
		this.emailid = emailid;
		this.status = status;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	public String getMandalname() {
		return mandalname;
	}
	public void setMandalname(String mandalname) {
		this.mandalname = mandalname;
	}
	public String getVillagename() {
		return villagename;
	}
	public void setVillagename(String villagename) {
		this.villagename = villagename;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(BigDecimal mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RepVaaDetails [districtname=" + districtname + ", mandalname=" + mandalname + ", villagename="
				+ villagename + ", userid=" + userid + ", name=" + name + ", mobile_phone=" + mobile_phone
				+ ", emailid=" + emailid + ", status=" + status + "]";
	}
	
	

}
