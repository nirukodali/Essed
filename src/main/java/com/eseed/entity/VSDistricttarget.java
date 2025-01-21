package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class VSDistricttarget {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String seedvarietyname;
	private Number tottarget;
	private String seedvariety;
	private Integer dcode;
	private Integer cropyear;
	private String season;
	
	
	public VSDistricttarget() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VSDistricttarget(String dname, String seedvarietyname, Number tottarget, String seedvariety, Integer dcode,
			Integer cropyear, String season) {
		super();
		this.dname = dname;
		this.seedvarietyname = seedvarietyname;
		this.tottarget = tottarget;
		this.seedvariety = seedvariety;
		this.dcode = dcode;
		this.cropyear = cropyear;
		this.season = season;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getSeedvarietyname() {
		return seedvarietyname;
	}


	public void setSeedvarietyname(String seedvarietyname) {
		this.seedvarietyname = seedvarietyname;
	}


	public Number getTottarget() {
		return tottarget;
	}


	public void setTottarget(Number tottarget) {
		this.tottarget = tottarget;
	}


	public String getSeedvariety() {
		return seedvariety;
	}


	public void setSeedvariety(String seedvariety) {
		this.seedvariety = seedvariety;
	}


	public Integer getDcode() {
		return dcode;
	}


	public void setDcode(Integer dcode) {
		this.dcode = dcode;
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


	@Override
	public String toString() {
		return "VSDistricttarget [dname=" + dname + ", seedvarietyname=" + seedvarietyname + ", tottarget=" + tottarget
				+ ", seedvariety=" + seedvariety + ", dcode=" + dcode + ", cropyear=" + cropyear + ", season=" + season
				+ "]";
	}
	
	

}
