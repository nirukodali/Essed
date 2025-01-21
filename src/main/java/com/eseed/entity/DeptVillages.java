package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DeptVillages {
	private Integer lgddcode;
	private String dnameeng;
	private Integer lgdmcode;
	private String mnameeng;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lgdvcode;
	private String vnameeng;
	private Integer wbvcodenew;
	
	
	public DeptVillages() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DeptVillages(Integer lgddcode, String dnameeng, Integer lgdmcode, String mnameeng, Integer lgdvcode,
			String vnameeng, Integer wbvcodenew) {
		super();
		this.lgddcode = lgddcode;
		this.dnameeng = dnameeng;
		this.lgdmcode = lgdmcode;
		this.mnameeng = mnameeng;
		this.lgdvcode = lgdvcode;
		this.vnameeng = vnameeng;
		this.wbvcodenew = wbvcodenew;
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


	public Integer getLgdvcode() {
		return lgdvcode;
	}


	public void setLgdvcode(Integer lgdvcode) {
		this.lgdvcode = lgdvcode;
	}


	public String getVnameeng() {
		return vnameeng;
	}


	public void setVnameeng(String vnameeng) {
		this.vnameeng = vnameeng;
	}


	public Integer getWbvcodenew() {
		return wbvcodenew;
	}


	public void setWbvcodenew(Integer wbvcodenew) {
		this.wbvcodenew = wbvcodenew;
	}


	@Override
	public String toString() {
		return "DeptVillages [lgddcode=" + lgddcode + ", dnameeng=" + dnameeng + ", lgdmcode=" + lgdmcode
				+ ", mnameeng=" + mnameeng + ", lgdvcode=" + lgdvcode + ", vnameeng=" + vnameeng + ", wbvcodenew="
				+ wbvcodenew + "]";
	}
	
	

	
}
