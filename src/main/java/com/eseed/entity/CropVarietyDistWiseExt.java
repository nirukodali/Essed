package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CropVarietyDistWiseExt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbedname;
	private String cropnameeng;
	private String varietyname;
	private Long uid;
	private Number ext;
	
	
	public CropVarietyDistWiseExt() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CropVarietyDistWiseExt(String wbedname, String cropnameeng, String varietyname, Long uid, Number ext) {
		super();
		this.wbedname = wbedname;
		this.cropnameeng = cropnameeng;
		this.varietyname = varietyname;
		this.uid = uid;
		this.ext = ext;
	}


	public String getWbedname() {
		return wbedname;
	}


	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}


	public String getCropnameeng() {
		return cropnameeng;
	}


	public void setCropnameeng(String cropnameeng) {
		this.cropnameeng = cropnameeng;
	}


	public String getVarietyname() {
		return varietyname;
	}


	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}


	public Long getUid() {
		return uid;
	}


	public void setUid(Long uid) {
		this.uid = uid;
	}


	public Number getExt() {
		return ext;
	}


	public void setExt(Number ext) {
		this.ext = ext;
	}


	@Override
	public String toString() {
		return "CropVarietyDistWiseExt [wbedname=" + wbedname + ", cropnameeng=" + cropnameeng + ", varietyname="
				+ varietyname + ", uid=" + uid + ", ext=" + ext + "]";
	}
}
