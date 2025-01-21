package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class VAADeviceDet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mname;
	private String vname;
	private String imei1;
	private String imei2;
	private String mobile_phone;
	private String emailid;
	private String status;
	private String dt_crt;
	private String district;
	private String blockortehsil;
	private String village;
	private String userid;
	
	
	public VAADeviceDet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VAADeviceDet(String mname, String vname, String imei1, String imei2, String mobile_phone, String emailid,
			String status, String dt_crt, String district, String blockortehsil, String village, String userid) {
		super();
		this.mname = mname;
		this.vname = vname;
		this.imei1 = imei1;
		this.imei2 = imei2;
		this.mobile_phone = mobile_phone;
		this.emailid = emailid;
		this.status = status;
		this.dt_crt = dt_crt;
		this.district = district;
		this.blockortehsil = blockortehsil;
		this.village = village;
		this.userid = userid;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}


	public String getImei1() {
		return imei1;
	}


	public void setImei1(String imei1) {
		this.imei1 = imei1;
	}


	public String getImei2() {
		return imei2;
	}


	public void setImei2(String imei2) {
		this.imei2 = imei2;
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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDt_crt() {
		return dt_crt;
	}


	public void setDt_crt(String dt_crt) {
		this.dt_crt = dt_crt;
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


	public String getVillage() {
		return village;
	}


	public void setVillage(String village) {
		this.village = village;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	@Override
	public String toString() {
		return "VAADeviceDet [mname=" + mname + ", vname=" + vname + ", imei1=" + imei1 + ", imei2=" + imei2
				+ ", mobile_phone=" + mobile_phone + ", emailid=" + emailid + ", status=" + status + ", dt_crt="
				+ dt_crt + ", district=" + district + ", blockortehsil=" + blockortehsil + ", village=" + village
				+ ", userid=" + userid + "]";
	}

	
	

}
