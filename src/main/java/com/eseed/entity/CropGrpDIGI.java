package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.transaction.Transactional;

@Entity
@Transactional
public class CropGrpDIGI {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cropgrpid;
	private String grpname;
	private String grpnameeng;
	
	
	public CropGrpDIGI() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CropGrpDIGI(Integer cropgrpid, String grpname, String grpnameeng) {
		super();
		this.cropgrpid = cropgrpid;
		this.grpname = grpname;
		this.grpnameeng = grpnameeng;
	}


	public Integer getCropgrpid() {
		return cropgrpid;
	}


	public void setCropgrpid(Integer cropgrpid) {
		this.cropgrpid = cropgrpid;
	}


	public String getGrpname() {
		return grpname;
	}


	public void setGrpname(String grpname) {
		this.grpname = grpname;
	}


	public String getGrpnameeng() {
		return grpnameeng;
	}


	public void setGrpnameeng(String grpnameeng) {
		this.grpnameeng = grpnameeng;
	}


	@Override
	public String toString() {
		return "CropGrpDIGI [cropgrpid=" + cropgrpid + ", grpname=" + grpname + ", grpnameeng=" + grpnameeng + "]";
	}
	
	
	
}
