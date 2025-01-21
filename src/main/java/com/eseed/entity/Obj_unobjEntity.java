package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "obj_unobj")
public class Obj_unobjEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	@Column(name="code")
	private Integer code;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "crb_remarks")
	private String crb_remarks;

	 @Override
	    public String toString() {
	        return "Obj_unobjEntity{" +
	                "code=" + code +
	                ", category='" + category + '\'' +
	                '}';
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
	
	
	
}
