package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CropVaritiesDigi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cropgrpid;
	private String grpname;
	private String cropname;
	private String cropnameeng;
	private Integer varietycode;
	private String varietyname;
	private Integer cropcode;
	private Integer releasedays;
	private Integer newreleasedays;
	
	
	public CropVaritiesDigi() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CropVaritiesDigi(Integer cropgrpid, String grpname, String cropname, String cropnameeng, Integer varietycode,
			String varietyname, Integer cropcode, Integer releasedays, Integer newreleasedays) {
		super();
		this.cropgrpid = cropgrpid;
		this.grpname = grpname;
		this.cropname = cropname;
		this.cropnameeng = cropnameeng;
		this.varietycode = varietycode;
		this.varietyname = varietyname;
		this.cropcode = cropcode;
		this.releasedays = releasedays;
		this.newreleasedays = newreleasedays;
	}


	public Integer getCropgrpid() {
		return cropgrpid;
	}


	public void setCropgrpid(Integer cropgrpid) {
		this.cropgrpid = cropgrpid;
	}


	public String getGrpname() {
		return grpname;
	}


	public void setGrpname(String grpname) {
		this.grpname = grpname;
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


	public Integer getVarietycode() {
		return varietycode;
	}


	public void setVarietycode(Integer varietycode) {
		this.varietycode = varietycode;
	}


	public String getVarietyname() {
		return varietyname;
	}


	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}


	public Integer getCropcode() {
		return cropcode;
	}


	public void setCropcode(Integer cropcode) {
		this.cropcode = cropcode;
	}


	public Integer getReleasedays() {
		return releasedays;
	}


	public void setReleasedays(Integer releasedays) {
		this.releasedays = releasedays;
	}


	public Integer getNewreleasedays() {
		return newreleasedays;
	}


	public void setNewreleasedays(Integer newreleasedays) {
		this.newreleasedays = newreleasedays;
	}


	@Override
	public String toString() {
		return "CropVaritiesDigi [cropgrpid=" + cropgrpid + ", grpname=" + grpname + ", cropname=" + cropname
				+ ", cropnameeng=" + cropnameeng + ", varietycode=" + varietycode + ", varietyname=" + varietyname
				+ ", cropcode=" + cropcode + ", releasedays=" + releasedays + ", newreleasedays=" + newreleasedays
				+ "]";
	}
}
