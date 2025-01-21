package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class District {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dcode;
	private String dname;
	private Integer wbdcode;
	private Integer lgddcode;
	private String dname_telugu;
	
	
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}


	public District(Integer dcode, String dname, Integer wbdcode, Integer lgddcode, String dname_telugu) {
		super();
		this.dcode = dcode;
		this.dname = dname;
		this.wbdcode = wbdcode;
		this.lgddcode = lgddcode;
		this.dname_telugu = dname_telugu;
	}


	public Integer getDcode() {
		return dcode;
	}


	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Integer getWbdcode() {
		return wbdcode;
	}


	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}


	public Integer getLgddcode() {
		return lgddcode;
	}


	public void setLgddcode(Integer lgddcode) {
		this.lgddcode = lgddcode;
	}


	public String getDname_telugu() {
		return dname_telugu;
	}


	public void setDname_telugu(String dname_telugu) {
		this.dname_telugu = dname_telugu;
	}


	@Override
	public String toString() {
		return "District [dcode=" + dcode + ", dname=" + dname + ", wbdcode=" + wbdcode + ", lgddcode=" + lgddcode
				+ ", dname_telugu=" + dname_telugu + "]";
	}
	
	

}
