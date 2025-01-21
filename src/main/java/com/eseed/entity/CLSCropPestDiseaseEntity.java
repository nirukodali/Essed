package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "crop_pest_disease", schema = "cropimages")
public class CLSCropPestDiseaseEntity {
	
	
	private Integer id;
	
	private String cropid;
	
	private String pest_disease;
	
	@Id
	private Integer pest_disease_id;
	
	private String name_of_pest_disease;
	
	private Integer stage_id;
	
	private String stage;
	
	private String Intensity;
	
	private String cropname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCropid() {
		return cropid;
	}

	public void setCropid(String cropid) {
		this.cropid = cropid;
	}

	public String getPest_disease() {
		return pest_disease;
	}

	public void setPest_disease(String pest_disease) {
		this.pest_disease = pest_disease;
	}

	public Integer getPest_disease_id() {
		return pest_disease_id;
	}

	public void setPest_disease_id(Integer pest_disease_id) {
		this.pest_disease_id = pest_disease_id;
	}

	public String getName_of_pest_disease() {
		return name_of_pest_disease;
	}

	public void setName_of_pest_disease(String name_of_pest_disease) {
		this.name_of_pest_disease = name_of_pest_disease;
	}

	public Integer getStage_id() {
		return stage_id;
	}

	public void setStage_id(Integer stage_id) {
		this.stage_id = stage_id;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getIntensity() {
		return Intensity;
	}

	public void setIntensity(String intensity) {
		Intensity = intensity;
	}

	public String getCropname() {
		return cropname;
	}

	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	
	
}
