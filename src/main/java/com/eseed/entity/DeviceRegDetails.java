package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DeviceRegDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String imei1;
	private String imei2;
	private String mobile_phone;
	private String emailid;
	private String status;
	private String dt_crt;
	private String vsmname;
	private String vsname;
	public DeviceRegDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeviceRegDetails(String imei1, String imei2, String mobile_phone, String emailid, String status,
			String dt_crt) {
		super();
		this.imei1 = imei1;
		this.imei2 = imei2;
		this.mobile_phone = mobile_phone;
		this.emailid = emailid;
		this.status = status;
		this.dt_crt = dt_crt;
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
	public String getVsmname() {
		return vsmname;
	}
	public void setVsmname(String vsmname) {
		this.vsmname = vsmname;
	}
	public String getVsname() {
		return vsname;
	}
	public void setVsname(String vsname) {
		this.vsname = vsname;
	}
	@Override
	public String toString() {
		return "DeviceRegDetails [imei1=" + imei1 + ", imei2=" + imei2 + ", mobile_phone=" + mobile_phone + ", emailid="
				+ emailid + ", status=" + status + ", dt_crt=" + dt_crt + "]";
	}
	

}
