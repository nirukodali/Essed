package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "crop_nutrient_deficiency", schema = "cropimages")
public class CLSCropNutrientDeficiencyEntity {
	
	private Integer id;
	
	@Id
	private Integer cropid;
	
	private String cropname;
	
	private String nutrient;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCropid() {
		return cropid;
	}

	public void setCropid(Integer cropid) {
		this.cropid = cropid;
	}

	public String getCropname() {
		return cropname;
	}

	public void setCropname(String cropname) {
		this.cropname = cropname;
	}

	public String getNutrient() {
		return nutrient;
	}

	public void setNutrient(String nutrient) {
		this.nutrient = nutrient;
	}
	
	

}
