package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CropNameDIGI {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cropid;
	private String cropname;
	private String cropnameeng;
	
	public CropNameDIGI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CropNameDIGI(Integer cropid, String cropname, String cropnameeng) {
		super();
		this.cropid = cropid;
		this.cropname = cropname;
		this.cropnameeng = cropnameeng;
	}

	public Integer getCropid() {
		return cropid;
	}

	public void setCropid(Integer cropid) {
		this.cropid = cropid;
	}

	public String getCropname() {
		return cropname;
	}

	public void setCropname(String cropname) {
		this.cropname = cropname;
	}

	public String getCropnameeng() {
		return cropnameeng;
	}

	public void setCropnameeng(String cropnameeng) {
		this.cropnameeng = cropnameeng;
	}

	@Override
	public String toString() {
		return "CropNameDIGI [cropid=" + cropid + ", cropname=" + cropname + ", cropnameeng=" + cropnameeng + "]";
	}
	
	

}
