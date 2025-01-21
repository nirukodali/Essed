package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DeptMandals {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lgddcode;
	private String dnameeng;
	private Integer lgdmcode;
	private String mnameeng;
	
	
	public DeptMandals() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DeptMandals(Integer lgddcode, String dnameeng, Integer lgdmcode, String mnameeng) {
		super();
		this.lgddcode = lgddcode;
		this.dnameeng = dnameeng;
		this.lgdmcode = lgdmcode;
		this.mnameeng = mnameeng;
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


	public Integer getLgdmcode() {
		return lgdmcode;
	}


	public void setLgdmcode(Integer lgdmcode) {
		this.lgdmcode = lgdmcode;
	}


	public String getMnameeng() {
		return mnameeng;
	}


	public void setMnameeng(String mnameeng) {
		this.mnameeng = mnameeng;
	}


	@Override
	public String toString() {
		return "DeptMandals [lgddcode=" + lgddcode + ", dnameeng=" + dnameeng + ", lgdmcode=" + lgdmcode + ", mnameeng="
				+ mnameeng + "]";
	}
	

	
}
