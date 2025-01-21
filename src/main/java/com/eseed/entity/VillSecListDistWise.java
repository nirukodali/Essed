package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import groovy.transform.Generated;

@Entity
@Table
public class VillSecListDistWise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String vsdname;
	private Integer vcode;
	private String vname;
	
	
	public VillSecListDistWise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VillSecListDistWise(String vsdname, Integer vcode, String vname) {
		super();
		this.vsdname = vsdname;
		this.vcode = vcode;
		this.vname = vname;
	}


	public String getVsdname() {
		return vsdname;
	}


	public void setVsdname(String vsdname) {
		this.vsdname = vsdname;
	}


	public Integer getVcode() {
		return vcode;
	}


	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}


	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}


	@Override
	public String toString() {
		return "VillSecListDistWise [vsdname=" + vsdname + ", vcode=" + vcode + ", vname=" + vname + "]";
	}
	
	

}
