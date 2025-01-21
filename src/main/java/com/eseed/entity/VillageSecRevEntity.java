package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "villsec_rev_v")
public class VillageSecRevEntity {

	@Id
	@Column(name = "vcode")
	private Integer vcode;

	@Column(name = "wbvname")
	private String wbvname;
	
	private String wbedname;
	
	private String wbemname;
	
private Integer wbdcode;

private Integer wbmcode;

private Integer vscode;





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

public Integer getVscode() {
	return vscode;
}

public void setVscode(Integer vscode) {
	this.vscode = vscode;
}

	public Integer getVcode() {
		return vcode;
	}

	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}

	public String getWbvname() {
		return wbvname;
	}

	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	
}