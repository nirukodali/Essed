package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SeasonCropBookedExtent {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
private String cr_crop;
private String cropname;
private String cropnameeng;
private String bookedext;
public SeasonCropBookedExtent() {
	super();
	// TODO Auto-generated constructor stub
}
public SeasonCropBookedExtent(String cr_crop, String cropname, String cropnameeng, String bookedext) {
	super();
	this.cr_crop = cr_crop;
	this.cropname = cropname;
	this.cropnameeng = cropnameeng;
	this.bookedext = bookedext;
}
public String getCr_crop() {
	return cr_crop;
}
public void setCr_crop(String cr_crop) {
	this.cr_crop = cr_crop;
}
public String getCropname() {
	return cropname;
}
public void setCropname(String cropname) {
	this.cropname = cropname;
}
public String getCropnameeng() {
	return cropnameeng;
}
public void setCropnameeng(String cropnameeng) {
	this.cropnameeng = cropnameeng;
}
public String getBookedext() {
	return bookedext;
}
public void setBookedext(String bookedext) {
	this.bookedext = bookedext;
}
@Override
public String toString() {
	return "SeasonCropBookedExtent [cr_crop=" + cr_crop + ", cropname=" + cropname + ", cropnameeng=" + cropnameeng
			+ ", bookedext=" + bookedext + "]";
}


}
