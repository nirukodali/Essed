package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ResurveyStatusDMV {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private String wbdname;
	 private String  wbmname;
	 private String wbvname;
	 private String wbedname;
	 private String wbemname;
	 private String  wbevname;
	 private Character resurveyed;
	public ResurveyStatusDMV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResurveyStatusDMV(String wbdname, String wbmname, String wbvname, String wbedname, String wbemname,
			String wbevname, Character resurveyed) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.resurveyed = resurveyed;
	}
	
	public String getWbdname() {
		return wbdname;
	}
	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}
	public String getWbmname() {
		return wbmname;
	}
	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
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
	public Character getResurveyed() {
		return resurveyed;
	}
	public void setResurveyed(Character resurveyed) {
		this.resurveyed = resurveyed;
	}
	 
	@Override
	public String toString() {
		return "ResurveyStatusDMV [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", wbedname="
				+ wbedname + ", wbemname=" + wbemname + ", wbevname=" + wbevname + ", resurveyed=" + resurveyed + "]";
	} 

}
