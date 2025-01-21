package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnSurveyedView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cr_dist_code;
	private String wbdname;
	private Long no_mandals;
	private Long no_villages;
	private Long Unset_est;
	private Integer Unset_est_ext;
	private Long Unset_inam;
	private Integer Unset_inam_ext;
	private Long Unsurveyed_est;
	private Integer Unsurveyed_est_ext;
	private Long Unsurveyed_Inam;
	private Integer Unsurveyed_Inam_ext;
	
	
	public UnSurveyedView() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UnSurveyedView(Integer cr_dist_code, String wbdname, Long no_mandals, Long no_villages, Long unset_est,
			Integer unset_est_ext, Long unset_inam, Integer unset_inam_ext, Long unsurveyed_est,
			Integer unsurveyed_est_ext, Long unsurveyed_Inam, Integer unsurveyed_Inam_ext) {
		super();
		this.cr_dist_code = cr_dist_code;
		this.wbdname = wbdname;
		this.no_mandals = no_mandals;
		this.no_villages = no_villages;
		Unset_est = unset_est;
		Unset_est_ext = unset_est_ext;
		Unset_inam = unset_inam;
		Unset_inam_ext = unset_inam_ext;
		Unsurveyed_est = unsurveyed_est;
		Unsurveyed_est_ext = unsurveyed_est_ext;
		Unsurveyed_Inam = unsurveyed_Inam;
		Unsurveyed_Inam_ext = unsurveyed_Inam_ext;
	}


	public Integer getCr_dist_code() {
		return cr_dist_code;
	}


	public void setCr_dist_code(Integer cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}


	public String getWbdname() {
		return wbdname;
	}


	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}


	public Long getNo_mandals() {
		return no_mandals;
	}


	public void setNo_mandals(Long no_mandals) {
		this.no_mandals = no_mandals;
	}


	public Long getNo_villages() {
		return no_villages;
	}


	public void setNo_villages(Long no_villages) {
		this.no_villages = no_villages;
	}


	public Long getUnset_est() {
		return Unset_est;
	}


	public void setUnset_est(Long unset_est) {
		Unset_est = unset_est;
	}


	public Integer getUnset_est_ext() {
		return Unset_est_ext;
	}


	public void setUnset_est_ext(Integer unset_est_ext) {
		Unset_est_ext = unset_est_ext;
	}


	public Long getUnset_inam() {
		return Unset_inam;
	}


	public void setUnset_inam(Long unset_inam) {
		Unset_inam = unset_inam;
	}


	public Integer getUnset_inam_ext() {
		return Unset_inam_ext;
	}


	public void setUnset_inam_ext(Integer unset_inam_ext) {
		Unset_inam_ext = unset_inam_ext;
	}


	public Long getUnsurveyed_est() {
		return Unsurveyed_est;
	}


	public void setUnsurveyed_est(Long unsurveyed_est) {
		Unsurveyed_est = unsurveyed_est;
	}


	public Integer getUnsurveyed_est_ext() {
		return Unsurveyed_est_ext;
	}


	public void setUnsurveyed_est_ext(Integer unsurveyed_est_ext) {
		Unsurveyed_est_ext = unsurveyed_est_ext;
	}


	public Long getUnsurveyed_Inam() {
		return Unsurveyed_Inam;
	}


	public void setUnsurveyed_Inam(Long unsurveyed_Inam) {
		Unsurveyed_Inam = unsurveyed_Inam;
	}


	public Integer getUnsurveyed_Inam_ext() {
		return Unsurveyed_Inam_ext;
	}


	public void setUnsurveyed_Inam_ext(Integer unsurveyed_Inam_ext) {
		Unsurveyed_Inam_ext = unsurveyed_Inam_ext;
	}


	@Override
	public String toString() {
		return "UnSurveyedView [cr_dist_code=" + cr_dist_code + ", wbdname=" + wbdname + ", no_mandals=" + no_mandals
				+ ", no_villages=" + no_villages + ", Unset_est=" + Unset_est + ", Unset_est_ext=" + Unset_est_ext
				+ ", Unset_inam=" + Unset_inam + ", Unset_inam_ext=" + Unset_inam_ext + ", Unsurveyed_est="
				+ Unsurveyed_est + ", Unsurveyed_est_ext=" + Unsurveyed_est_ext + ", Unsurveyed_Inam=" + Unsurveyed_Inam
				+ ", Unsurveyed_Inam_ext=" + Unsurveyed_Inam_ext + "]";
	}
	
	

}
