package com.eseed.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cropnames")
public class CropName {
    @Id
    @Column(name = "cropid")
    private String cropId;
    private String cropname;
	public String getCropId() {
		return cropId;
	}
	public void setCropId(String cropId) {
		this.cropId = cropId;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}

    // Other fields corresponding to columns in the table
}