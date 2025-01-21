package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cr_variety_master")
public class VarietyNameEntity {
	
	@Id
	@Column(name = "varietyname") 
	private String varietyName;
	
	@Column(name = "varietycode") 
	private Integer varietyCodeCount;
	
	public Integer getVarietyCodeCount() {
		return varietyCodeCount;
	}

	public void setVarietyCodeCount(Integer varietyCodeCount) {
		this.varietyCodeCount = varietyCodeCount;
	}

	public String getVarietyName() {
		return varietyName;
	}

	public void setVarietyName(String varietyName) {
		this.varietyName = varietyName;
	}
	
	public VarietyNameEntity(String varietyName, Integer varietyCodeCount) {
		super();
		this.varietyName = varietyName;
		this.varietyCodeCount = varietyCodeCount;
	}

	@Override
	public String toString() {
		return "VarietyNameEntity [varietyName=" + varietyName + ", varietyCodeCount=" + varietyCodeCount + "]";
	}

	public VarietyNameEntity() {
		
	}

}


