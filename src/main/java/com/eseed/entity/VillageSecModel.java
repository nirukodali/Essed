package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vill_sec_det")
public class VillageSecModel {
@Id
	private Integer vcode;
	private String vname;
	
	public VillageSecModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VillageSecModel(Integer vcode, String vname) {
		super();
		this.vcode = vcode;
		this.vname = vname;
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
		return "VillageSecModel [vcode=" + vcode + ", vname=" + vname + "]";
	}

	
	
	}
