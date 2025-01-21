package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class DistrictMandal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mname;
	private Integer mcode;
	
	public DistrictMandal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DistrictMandal(String mname, Integer mcode) {
		super();
		this.mname = mname;
		this.mcode = mcode;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Integer getMcode() {
		return mcode;
	}
	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}
	@Override
	public String toString() {
		return "DistrictMandal [mname=" + mname + ", mcode=" + mcode + "]";
	}

}
