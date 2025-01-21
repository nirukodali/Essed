package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="cropnames")
public class VillageUpdation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="cropname")
	private String cropname;
	
	@Column(name="cropid")
	private int cropid;
	
	
	public VillageUpdation() {
		super();
	}

	public VillageUpdation(String cropname) {
		super();
		this.cropname = cropname;
	}

	public String getCropname() {
		return cropname;
	}

	public void setCropname(String cropname) {
		this.cropname = cropname;
	}


	public int getCropid() {
		return cropid;
	}

	public void setCropid(int cropid) {
		this.cropid = cropid;
	}

	
	
	
}
