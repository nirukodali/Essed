package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "waterresources")
public class WaterResourcesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "wsrcid")
	private Integer wsrcid;

	@Column(name = "wsrcdesc")
	private String wsrcdesc;

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
		return "WaterResourcesEntity [wsrcid=" + wsrcid + ", wsrcdesc=" + wsrcdesc + "]";
	}

}
