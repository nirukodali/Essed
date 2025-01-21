package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vill_sec_det")
public class Village {

	@Id
	@Column(name = "vcode")
	private Integer vcode;

	@Column(name = "vname")
	private String vname;
	
	
	public Integer getVcode() {
		return vcode;
	}



	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}



	public String getVname() {
		return vname;
	}



	public void setVname(String vname) {
		this.vname = vname;
	}



	public Village() {

	}



	@Override
	public String toString() {
		return "Village [vcode=" + vcode + ", vname=" + vname + ", getVcode()=" + getVcode() + ", getVname()="
				+ getVname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
