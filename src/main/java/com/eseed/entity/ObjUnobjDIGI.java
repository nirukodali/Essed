package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ObjUnobjDIGI {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer code;
	private String category;
	private String crb_remarks;
	private String remarks;
	
	
	public ObjUnobjDIGI() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ObjUnobjDIGI(Integer code, String category, String crb_remarks, String remarks) {
		super();
		this.code = code;
		this.category = category;
		this.crb_remarks = crb_remarks;
		this.remarks = remarks;
	}


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getCrb_remarks() {
		return crb_remarks;
	}


	public void setCrb_remarks(String crb_remarks) {
		this.crb_remarks = crb_remarks;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	@Override
	public String toString() {
		return "ObjUnobjDIGI [code=" + code + ", category=" + category + ", crb_remarks=" + crb_remarks + ", remarks="
				+ remarks + "]";
	}
}
