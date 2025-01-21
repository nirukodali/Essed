package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cropnames")
public class SeedNameEntity {
	
	@Id
	@Column(name = "cropid") 
	private Integer cropid;

	@Column(name = "cropname")
	private String cropName;

	public Integer getCropid() {
		return cropid;
	}

	public void setCropid(Integer cropId) {
		this.cropid = cropId;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	@Override
	public String toString() {
		return "SeedNameEntity [cropId=" + cropid + ", cropName=" + cropName + "]";
	}

	public SeedNameEntity(Integer cropid, String cropName) {
		super();
		this.cropid = cropid;
		this.cropName = cropName;
	}
	
	public SeedNameEntity() {
		
	}

}


