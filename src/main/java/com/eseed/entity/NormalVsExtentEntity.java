package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NormalVsExtentEntity {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private String mname;
	private BigDecimal normalarea;
	private BigDecimal bookedext;
	@Override
	public String toString() {
		return "NormalVsExtentEntity [mname=" + mname + ", normalarea=" + normalarea + ", bookedext=" + bookedext
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public NormalVsExtentEntity(String mname, BigDecimal normalarea, BigDecimal bookedext) {
		super();
		this.mname = mname;
		this.normalarea = normalarea;
		this.bookedext = bookedext;
	}
	public NormalVsExtentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public BigDecimal getNormalarea() {
		return normalarea;
	}
	public void setNormalarea(BigDecimal normalarea) {
		this.normalarea = normalarea;
	}
	public BigDecimal getBookedext() {
		return bookedext;
	}
	public void setBookedext(BigDecimal bookedext) {
		this.bookedext = bookedext;
	}
	
	
}
