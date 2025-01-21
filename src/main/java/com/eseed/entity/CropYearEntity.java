package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="cropnames",schema="ecrop2023")
public class CropYearEntity  {
@Id
private String seasonvalue;
private String	cropyear;
public CropYearEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public CropYearEntity(String seasonvalue, String cropyear) {
	super();
	this.seasonvalue = seasonvalue;
	this.cropyear = cropyear;
}
public String getSeasonvalue() {
	return seasonvalue;
}
public void setSeasonvalue(String seasonvalue) {
	this.seasonvalue = seasonvalue;
}
public String getCropyear() {
	return cropyear;
}
public void setCropyear(String cropyear) {
	this.cropyear = cropyear;
}
@Override
public String toString() {
	return "CropYearEntity [seasonvalue=" + seasonvalue + ", cropyear=" + cropyear + "]";
}
	


}
