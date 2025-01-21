package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropnames")
public class CropnamesFAgriCrop {
	@Id
	private String cropname;
	private String cropnameeng;
	private char cropnature;
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
	public char getCropnature() {
		return cropnature;
	}
	public void setCropnature(char cropnature) {
		this.cropnature = cropnature;
	}
	@Override
	public String toString() {
		return "CropnamesFAgriCrop [cropname=" + cropname + ", cropnameeng=" + cropnameeng + ", cropnature="
				+ cropnature + "]";
	}
	
	

}
