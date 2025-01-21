package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cropnames")
public class CropNamesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cropid")
	private Integer cropid;

	@Column(name = "cropname")
	private String cropname;

	@Column(name = "croptype")
	private Character croptype;

//	@Column(name = "grpcode")
//	private Integer grpcode;

//	@Column(name = "cropclass")
//	private Character cropclass;

//	@Column(name = "cropnameeng")
//	private String cropnameeng;

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

	public Character getCroptype() {
		return croptype;
	}

	public void setCroptype(Character croptype) {
		this.croptype = croptype;
	}

//	public Integer getGrpcode() {
//		return grpcode;
//	}
//
//	public void setGrpcode(Integer grpcode) {
//		this.grpcode = grpcode;
//	}

//	public Character getCropclass() {
//		return cropclass;
//	}
//
//	public void setCropclass(Character cropclass) {
//		this.cropclass = cropclass;
//	}

//	public String getCropnameeng() {
//		return cropnameeng;
//	}
//
//	public void setCropnameeng(String cropnameeng) {
//		this.cropnameeng = cropnameeng;
//	}

	@Override
	public String toString() {
		return "CropNamesEntity [cropid=" + cropid + ", cropname=" + cropname + ", croptype=" + croptype + ", cropnameeng=]";
	}

}
