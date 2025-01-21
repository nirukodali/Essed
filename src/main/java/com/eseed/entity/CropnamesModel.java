package com.eseed.entity;

public class CropnamesModel {

private String 	cropid;
private String	cropname;
public CropnamesModel() {
	super();
	// TODO Auto-generated constructor stub
}
public CropnamesModel(String cropid, String cropname) {
	super();
	this.cropid = cropid;
	this.cropname = cropname;
}
public String getCropid() {
	return cropid;
}
public void setCropid(String cropid) {
	this.cropid = cropid;
}
public String getCropname() {
	return cropname;
}
public void setCropname(String cropname) {
	this.cropname = cropname;
}
@Override
public String toString() {
	return "CropnamesModel [cropid=" + cropid + ", cropname=" + cropname + "]";
}
	
	
}
