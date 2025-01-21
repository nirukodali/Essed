package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wbvillage_mst")
public class Perinnial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String wbdname;
	private String wbmname;
	private String wbvname;
	private Integer wbdcode;
	private Integer wbmcode;
	private Integer wbvcode;
	
	public Perinnial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perinnial(String wbdname, String wbmname, String wbvname, Integer wbdcode, Integer wbmcode,
			Integer wbvcode) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.wbdcode = wbdcode;
		this.wbmcode = wbmcode;
		this.wbvcode = wbvcode;
	}

	public String getWbdname() {
		return wbdname;
	}

	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}

	public String getWbmname() {
		return wbmname;
	}

	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}

	public String getWbvname() {
		return wbvname;
	}

	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}

	public Integer getWbdcode() {
		return wbdcode;
	}

	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}

	public Integer getWbmcode() {
		return wbmcode;
	}

	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}

	public Integer getWbvcode() {
		return wbvcode;
	}

	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}


	
}
