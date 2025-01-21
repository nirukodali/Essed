package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class ObjUnobj {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String code;
	private String category;
	private String crb_remarks;
	public ObjUnobj() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ObjUnobj(String code, String category, String crb_remarks) {
		super();
		this.code = code;
		this.category = category;
		this.crb_remarks = crb_remarks;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
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
	@Override
	public String toString() {
		return "ObjUnobj [code=" + code + ", category=" + category + ", crb_remarks=" + crb_remarks + "]";
	}

	
}
