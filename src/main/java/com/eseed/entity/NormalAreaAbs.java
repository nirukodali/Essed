package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NormalAreaAbs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private Integer normalarea;
	
	public NormalAreaAbs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NormalAreaAbs(String dname, Integer normalarea) {
		super();
		this.dname = dname;
		this.normalarea = normalarea;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Integer getNormalarea() {
		return normalarea;
	}

	public void setNormalarea(Integer normalarea) {
		this.normalarea = normalarea;
	}

	@Override
	public String toString() {
		return "NormalAreaAbs [dname=" + dname + ", normalarea=" + normalarea + "]";
	}
	

}
