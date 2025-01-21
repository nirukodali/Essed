package com.eseed.entity;

import javax.persistence.Entity; 
import javax.persistence.Id;

@Entity
public class CropnamesFsr {
	
	@Id
	private String cropid;

	public String getCropid() {
		return cropid;
	}

	public void setCropid(String cropid) {
		this.cropid = cropid;
	}
	
}
