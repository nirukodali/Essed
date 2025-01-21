package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_variety_master")
public class CropVarietyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "varietycode")//varietycode, varietyname, cropcode
	private Integer varietycode;

	@Column(name = "varietyname")
	private String varietyname;

	@Column(name = "cropcode")
	private Integer cropcode;

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

	@Override
	public String toString() {
		return "CropVarietyEntity [varietycode=" + varietycode + ", varietyname=" + varietyname + ", cropcode="
				+ cropcode + "]";
	}

}
