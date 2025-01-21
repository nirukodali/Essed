package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class VillSecListMaoIntf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vcode;
	private String vname;
	public VillSecListMaoIntf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VillSecListMaoIntf(Integer vcode, String vname) {
		super();
		this.vcode = vcode;
		this.vname = vname;
	}
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
	@Override
	public String toString() {
		return "VillSecListMaoIntf [vcode=" + vcode + ", vname=" + vname + "]";
	}
	

}
