package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AbstractExtentBookedEntity {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private String mname;
	private String cropname;
	private BigDecimal totext;
	@Override
	public String toString() {
		return "AbstractExtentBookedEntity [mname=" + mname + ", totext=" + totext + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public AbstractExtentBookedEntity(String mname, BigDecimal totext) {
		super();
		this.mname = mname;
		this.totext = totext;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public BigDecimal getTotext() {
		return totext;
	}
	public void setTotext(BigDecimal totext) {
		this.totext = totext;
	}
	public AbstractExtentBookedEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	
	
}
