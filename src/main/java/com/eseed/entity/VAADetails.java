package com.eseed.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_registration_vs_v",schema="ecrop2023")
public class VAADetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String mandalname;
	private String villagename;
	private String name;
	private String mobile_phone;
	private String emailid;
	private String regdate;
	private String status;
	
	public VAADetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VAADetails(String userid, String dname, String mandalname, String villagename, String name,
			String mobile_phone, String emailid, String regdate, String status) {
		super();
		this.dname = dname;
		this.mandalname = mandalname;
		this.villagename = villagename;
		this.name = name;
		this.mobile_phone = mobile_phone;
		this.emailid = emailid;
		this.regdate = regdate;
		this.status = status;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "VAADetails [dname=" + dname + ", mandalname=" + mandalname + ", villagename="
				+ villagename + ", name=" + name + ", mobile_phone=" + mobile_phone + ", emailid=" + emailid
				+ ", regdate=" + regdate + ", status=" + status + "]";
	}

	
	


	
}
