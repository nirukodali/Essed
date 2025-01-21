package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class WaterSourceDIGI {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer wsrcid;
	private String wsrcdesc;
	
	public WaterSourceDIGI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WaterSourceDIGI(Integer wsrcid, String wsrcdesc) {
		super();
		this.wsrcid = wsrcid;
		this.wsrcdesc = wsrcdesc;
	}

	public Integer getWsrcid() {
		return wsrcid;
	}

	public void setWsrcid(Integer wsrcid) {
		this.wsrcid = wsrcid;
	}

	public String getWsrcdesc() {
		return wsrcdesc;
	}

	public void setWsrcdesc(String wsrcdesc) {
		this.wsrcdesc = wsrcdesc;
	}

	@Override
	public String toString() {
		return "WaterSourceDIGI [wsrcid=" + wsrcid + ", wsrcdesc=" + wsrcdesc + "]";
	}
	

}
