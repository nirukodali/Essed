package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "devicedet")
public class DeviceEntity {
	@Id
	@Column(name = "deviceid")
	
	private Integer deviceid;
	
	@Column(name = "vcode")
	private String vcode;
	
	
	
	@Column(name = "imei1")
	
	private String imei1;
	
	@Column(name = "imei2")
	
	private String  imei2;

	@Column(name = "status")
	private String status;

	@Column(name = "cropyear")
	private Integer cropyear;

	@Column(name = "season")
	private String  season;
	
	@Column(name = "devicesIno")
	private String  devicesIno;
	
	@Column(name = "dt_crt")
	private java.sql.Timestamp to_date;

	public java.sql.Timestamp getTo_date() {
		return to_date;
	}

	public void setTo_date(java.sql.Timestamp to_date) {
		this.to_date = to_date;
	}

	public Integer getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(Integer deviceid) {
		this.deviceid = deviceid;
	}

	public String getVcode() {
		return vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	public String getImei1() {
		return imei1;
	}

	public void setIme1(String ime1) {
		this.imei1 = imei1;
	}

	public String getImei2() {
		return imei2;
	}

	public void setImei2(String imei2) {
		this.imei2 = imei2;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCropyear() {
		return cropyear;
	}

	public void setCropyear(Integer cropyear) {
		this.cropyear = cropyear;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getDevicesIno() {
		return devicesIno;
	}

	public void setDevicesIno(String devicesIno) {
		this.devicesIno = devicesIno;
	}

	public DeviceEntity() {
		
		
		
	}

}
