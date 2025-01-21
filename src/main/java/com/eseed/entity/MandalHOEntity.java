package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "homandals_v")
public class MandalHOEntity {

	@Id
	@Column(name = "mcode")
	private Integer mcode;

	@Column(name = "mname")
	private String mname;

	public MandalHOEntity() {

	}

	@Override
	public String toString() {
		return "MandalEntity [mcode=" + mcode + ", mname=" + mname + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Integer getMcode() {
		return mcode;
	}

	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

}