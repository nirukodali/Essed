package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Perinnial_biennial_crops {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String cropname;
	private String cropnameeng;
	private String cropclass;
	public Perinnial_biennial_crops() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Perinnial_biennial_crops(String cropname, String cropnameeng, String cropclass) {
		super();
		this.cropname = cropname;
		this.cropnameeng = cropnameeng;
		this.cropclass = cropclass;
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
	public String getCropclass() {
		return cropclass;
	}
	public void setCropclass(String cropclass) {
		this.cropclass = cropclass;
	}
	@Override
	public String toString() {
		return "Perinnial_biennial_crops [cropname=" + cropname + ", cropnameeng=" + cropnameeng + ", cropclass="
				+ cropclass + "]";
	}
	

}
