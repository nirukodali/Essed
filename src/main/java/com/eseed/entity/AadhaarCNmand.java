package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AadhaarCNmand {
	@Id
	private String lgdmname;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String vname;
	
	
	public AadhaarCNmand() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AadhaarCNmand(String lgdmname, String vname) {
		super();
		this.lgdmname = lgdmname;
		this.vname = vname;
	}


	public String getLgdmname() {
		return lgdmname;
	}


	public void setLgdmname(String lgdmname) {
		this.lgdmname = lgdmname;
	}


	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}
	
	

}
