package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wbvillage_mst")
public class WbMaster {

	@Column(name = "wbedname")
	private String wbedname;

	@Column(name = "wbemname")
	private String wbemname;

	@Column(name = "wbevname")
	private String wbevname;

	@Column(name = "wbdcode")
	private Integer wbdcode;

	@Column(name = "wbmcode")
	private Integer wbmcode;

	@Id
	@Column(name = "wbvcode")
	private Integer wbvcode;

	@Column(name = "wbvname")
	private String wbvname;

	public String getWbedname() {
		return wbedname;
	}

	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}

	public String getWbemname() {
		return wbemname;
	}

	public void setWbemname(String wbemname) {
		this.wbemname = wbemname;
	}

	public String getWbevname() {
		return wbevname;
	}

	public void setWbevname(String wbevname) {
		this.wbevname = wbevname;
	}

	public Integer getWbdcode() {
		return wbdcode;
	}

	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}

	public Integer getWbmcode() {
		return wbmcode;
	}

	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}

	public Integer getWbvcode() {
		return wbvcode;
	}

	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}

	public String getWbvname() {
		return wbvname;
	}

	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}

}