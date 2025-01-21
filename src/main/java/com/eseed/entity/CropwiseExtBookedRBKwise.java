package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CropwiseExtBookedRBKwise {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private String wbvname;
	private String vscode ; 
	private String totext; 
	private Integer wbvcode;
	private String vname;
	public CropwiseExtBookedRBKwise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropwiseExtBookedRBKwise(String wbvname, String vscode, String totext, Integer wbvcode, String vname) {
		super();
		this.wbvname = wbvname;
		this.vscode = vscode;
		this.totext = totext;
		this.wbvcode = wbvcode;
		this.vname = vname;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public String getVscode() {
		return vscode;
	}
	public void setVscode(String vscode) {
		this.vscode = vscode;
	}
	public String getTotext() {
		return totext;
	}
	public void setTotext(String totext) {
		this.totext = totext;
	}
	public Integer getWbvcode() {
		return wbvcode;
	}
	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "CropwiseExtBookedRBKwise [wbvname=" + wbvname + ", vscode=" + vscode + ", totext=" + totext
				+ ", wbvcode=" + wbvcode + ", vname=" + vname + "]";
	}
	
}
