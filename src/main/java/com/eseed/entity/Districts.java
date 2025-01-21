package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="user_registration")
public class Districts {
	
	@Id 
	@Column(name="wbdcode")
	private Integer dcode;
	
	private String dname;

	public Districts() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Districts(Integer dcode, String dname) {
		super();
		this.dcode = dcode;
		this.dname = dname;
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
	
	

}

