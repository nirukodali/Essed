package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FirstCrdetVwise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbedname;
	private String wbemname;
	private String wbevname;
	private String inf;
	private String ine;
	private String sf;
	private String se;
	private String mxf;
	private String me;
	
	
	
	public FirstCrdetVwise() {
		super();
		// TODO Auto-generated constructor stub
	}



	public FirstCrdetVwise(String wbedname, String wbemname, String wbevname, String inf, String ine, String sf,
			String se, String mxf, String me) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.inf = inf;
		this.ine = ine;
		this.sf = sf;
		this.se = se;
		this.mxf = mxf;
		this.me = me;
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



	public String getInf() {
		return inf;
	}



	public void setInf(String inf) {
		this.inf = inf;
	}



	public String getIne() {
		return ine;
	}



	public void setIne(String ine) {
		this.ine = ine;
	}



	public String getSf() {
		return sf;
	}



	public void setSf(String sf) {
		this.sf = sf;
	}



	public String getSe() {
		return se;
	}



	public void setSe(String se) {
		this.se = se;
	}



	public String getMxf() {
		return mxf;
	}



	public void setMxf(String mxf) {
		this.mxf = mxf;
	}



	public String getMe() {
		return me;
	}



	public void setMe(String me) {
		this.me = me;
	}



	@Override
	public String toString() {
		return "FirstCrdetVwise [wbedname=" + wbedname + ", wbemname=" + wbemname + ", wbevname=" + wbevname + ", inf="
				+ inf + ", ine=" + ine + ", sf=" + sf + ", se=" + se + ", mxf=" + mxf + ", me=" + me + "]";
	}


	 


	
	
}
