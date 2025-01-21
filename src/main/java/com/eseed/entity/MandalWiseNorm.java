package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MandalWiseNorm {
	
	private String dname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mname;
	private BigDecimal normalarea;
	
	public MandalWiseNorm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MandalWiseNorm(String dname, String mname, BigDecimal normalarea) {
		super();
		this.dname = dname;
		this.mname = mname;
		this.normalarea = normalarea;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
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

	@Override
	public String toString() {
		return "MandalWiseNorm [dname=" + dname + ", mname=" + mname + ", normalarea=" + normalarea + "]";
	}
	
	

}
