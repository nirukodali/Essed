package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ROFRExtentAbstract {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	private String wbedname;
	private String wbemname;
	private String given;
	private String ported;
	
	
	public ROFRExtentAbstract() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ROFRExtentAbstract(Integer id, String wbedname, String wbemname, String given, String ported) {
		super();
		this.id = id;
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.given = given;
		this.ported = ported;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getWbedname() {
		return wbedname;
	}


	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}


	public String getWbemname() {
		return wbemname;
	}


	public void setWbemname(String wbemname) {
		this.wbemname = wbemname;
	}


	public String getGiven() {
		return given;
	}


	public void setGiven(String given) {
		this.given = given;
	}


	public String getPorted() {
		return ported;
	}


	public void setPorted(String ported) {
		this.ported = ported;
	}


	@Override
	public String toString() {
		return "ROFRExtentAbstract [id=" + id + ", wbedname=" + wbedname + ", wbemname=" + wbemname + ", given=" + given
				+ ", ported=" + ported + "]";
	}
	

}
