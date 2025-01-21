package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RbkSurveyNoMappingDrpdwn {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer vcode;
	private String vname;
	public RbkSurveyNoMappingDrpdwn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RbkSurveyNoMappingDrpdwn(Integer vcode, String vname) {
		super();
		this.vcode = vcode;
		this.vname = vname;
	}
	public Integer getVcode() {
		return vcode;
	}
	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "RbkSurveyNoMappingDrpdwn [vcode=" + vcode + ", vname=" + vname + "]";
	}
	
	

}
