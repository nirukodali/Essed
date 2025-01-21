package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NormalArea {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mname;
	private Number normalarea;
	
	
	public NormalArea() {
		super();
		// TODO Auto-generated constructor stub
	}


	public NormalArea(String mname, Number normalarea) {
		super();
		this.mname = mname;
		this.normalarea = normalarea;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public Number getNormalarea() {
		return normalarea;
	}


	public void setNormalarea(Number normalarea) {
		this.normalarea = normalarea;
	}


	@Override
	public String toString() {
		return "NormalArea [mname=" + mname + ", normalarea=" + normalarea + "]";
	}
	

	
}
