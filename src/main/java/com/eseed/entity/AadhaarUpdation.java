package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="villsec_rev_v",schema="ecrop2024")
public class AadhaarUpdation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="vscode")
	private int vscode;
	
	@Column(name="dcode")
	private int dcode;
	
	@Column(name="mcode")
	private int mcode;
	
	@Column(name="wbvname")
	private String wbvname;
	
	@Column(name="vcode")
	private String vcode;
	

	public AadhaarUpdation() {
		super();
	}


	public AadhaarUpdation(Integer vscode, int dcode, int mcode, String wbvname) {
		super();
		this.vscode = vscode;
		this.dcode = dcode;
		this.mcode = mcode;
		this.wbvname = wbvname;
	}

	public Integer getVscode() {
		return vscode;
	}

	public void setVscode(Integer vscode) {
		this.vscode = vscode;
	}

	public int getDcode() {
		return dcode;
	}

	public void setDcode(int dcode) {
		this.dcode = dcode;
	}

	public int getMcode() {
		return mcode;
	}

	public void setMcode(int mcode) {
		this.mcode = mcode;
	}


	public String getWbvname() {
		return wbvname;
	}


	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}


	public String getVcode() {
		return vcode;
	}


	public void setVcode(String vcode) {
		this.vcode = vcode;
	}


	public void setVscode(int vscode) {
		this.vscode = vscode;
	}


	@Override
	public String toString() {
		return "AadhaarUpdation [vscode=" + vscode + ", dcode=" + dcode + ", mcode=" + mcode + ", wbvname=" + wbvname
				+ "]";
	}

	
}
