package com.eseed.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "cr_variety_master")
public class CrVarietyMaster {
    @Id
    @Column(name = "varietycode")
    private String varietyCode;
    private String varietyname;
	public String getVarietyCode() {
		return varietyCode;
	}
	public void setVarietyCode(String varietyCode) {
		this.varietyCode = varietyCode;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}

    // Other fields corresponding to columns in the table
}