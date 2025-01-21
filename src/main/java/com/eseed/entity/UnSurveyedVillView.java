package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnSurveyedVillView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private String wbmname;
	private String wbvname;
	private Long Unset_est;
	private Long Unset_inam;	
	private Long Unsurveyed_est;
	private Long Unsurveyed_Inam;
	
	
	public UnSurveyedVillView() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UnSurveyedVillView(String wbdname, String wbmname, String wbvname, Long unset_est, Long unset_inam,
			Long unsurveyed_est, Long unsurveyed_Inam) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		Unset_est = unset_est;
		Unset_inam = unset_inam;
		Unsurveyed_est = unsurveyed_est;
		Unsurveyed_Inam = unsurveyed_Inam;
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


	public Long getUnset_est() {
		return Unset_est;
	}


	public void setUnset_est(Long unset_est) {
		Unset_est = unset_est;
	}


	public Long getUnset_inam() {
		return Unset_inam;
	}


	public void setUnset_inam(Long unset_inam) {
		Unset_inam = unset_inam;
	}


	public Long getUnsurveyed_est() {
		return Unsurveyed_est;
	}


	public void setUnsurveyed_est(Long unsurveyed_est) {
		Unsurveyed_est = unsurveyed_est;
	}


	public Long getUnsurveyed_Inam() {
		return Unsurveyed_Inam;
	}


	public void setUnsurveyed_Inam(Long unsurveyed_Inam) {
		Unsurveyed_Inam = unsurveyed_Inam;
	}


	@Override
	public String toString() {
		return "UnSurveyedVillView [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname
				+ ", Unset_est=" + Unset_est + ", Unset_inam=" + Unset_inam + ", Unsurveyed_est=" + Unsurveyed_est
				+ ", Unsurveyed_Inam=" + Unsurveyed_Inam + "]";
	}
	
	
}
