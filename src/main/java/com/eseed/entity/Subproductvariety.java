package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subproductvariety {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String name;
	private String varietycode;
	private String units;
	private String active;
	
	
	public Subproductvariety() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Subproductvariety(String name, String varietycode, String units, String active) {
		super();
		this.name = name;
		this.varietycode = varietycode;
		this.units = units;
		this.active = active;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVarietycode() {
		return varietycode;
	}


	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
	}


	public String getUnits() {
		return units;
	}


	public void setUnits(String units) {
		this.units = units;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "Subproductvariety [name=" + name + ", varietycode=" + varietycode + ", units=" + units + ", active="
				+ active + "]";
	}
}
