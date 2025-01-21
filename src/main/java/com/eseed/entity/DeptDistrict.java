package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DeptDistrict {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lgddcode;
	private String dnameeng;
	private Integer wbdcode;
	private String dnametelugu;
	
	
	public DeptDistrict() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DeptDistrict(Integer lgddcode, String dnameeng, Integer wbdcode, String dnametelugu) {
		super();
		this.lgddcode = lgddcode;
		this.dnameeng = dnameeng;
		this.wbdcode = wbdcode;
		this.dnametelugu = dnametelugu;
	}


	public Integer getLgddcode() {
		return lgddcode;
	}


	public void setLgddcode(Integer lgddcode) {
		this.lgddcode = lgddcode;
	}


	public String getDnameeng() {
		return dnameeng;
	}


	public void setDnameeng(String dnameeng) {
		this.dnameeng = dnameeng;
	}


	public Integer getWbdcode() {
		return wbdcode;
	}


	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}


	public String getDnametelugu() {
		return dnametelugu;
	}


	public void setDnametelugu(String dnametelugu) {
		this.dnametelugu = dnametelugu;
	}


	@Override
	public String toString() {
		return "DeptDistrict [lgddcode=" + lgddcode + ", dnameeng=" + dnameeng + ", wbdcode=" + wbdcode
				+ ", dnametelugu=" + dnametelugu + "]";
	}
	

	
}
