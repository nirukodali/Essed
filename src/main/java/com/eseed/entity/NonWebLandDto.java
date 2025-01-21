package com.eseed.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class NonWebLandDto {
	private Integer kh_no;
	
	@NotBlank(message = "rson should not be null")
	private String rson;
	
	@NotBlank(message = "occupname  should not be null or empty")
	private String occupname;
	
	@NotBlank(message = "occupfname should not be null or empty")
	private String occupfname;
	
	@NotBlank(message = "Survey No should not be null or empty")
	private String cr_sno;
	
	@NotBlank(message = "oc_name should not be null or empty")
	private String oc_name;
	
	@NotBlank(message = "oc_fname should not be null or empty")
	private String oc_fname;

	@NotNull(message = "UID No should not be null")
	private String cr_farmeruid;

	private Long mobileno;
	
	@NotNull(message = "tot_extent should not be null")
	private Double tot_extent;

//	   @NotNull(message="occupant_extent should not be null")
	private Double occupant_extent;

	private String gender;

	private Integer anubhavadar_extent;

	private int cr_vcode;

	public String getOc_name() {
		return oc_name;
	}

	public void setOc_name(String oc_name) {
		this.oc_name = oc_name;
	}

	public String getOc_fname() {
		return oc_fname;
	}

	public void setOc_fname(String oc_fname) {
		this.oc_fname = oc_fname;
	}

	public int getCr_vcode() {
		return cr_vcode;
	}

	public void setCr_vcode(int cr_vcode) {
		this.cr_vcode = cr_vcode;
	}

	public String getCr_farmeruid() {
		return cr_farmeruid;
	}

	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}

	public Integer getKh_no() {
		return kh_no;
	}

	public void setKh_no(Integer kh_no) {
		this.kh_no = kh_no;
	}

	public Double getTot_extent() {
		return tot_extent;
	}

	public void setTot_extent(Double tot_extent) {
		this.tot_extent = tot_extent;
	}

	public String getOccupname() {
		return occupname;
	}

	public void setOccupname(String occupname) {
		this.occupname = occupname;
	}

	public String getOccupfname() {
		return occupfname;
	}

	public void setOccupfname(String occupfname) {
		this.occupfname = occupfname;
	}

	public String getCr_sno() {
		return cr_sno;
	}

	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAnubhavadar_extent() {
		return anubhavadar_extent;
	}

	public void setAnubhavadar_extent(Integer anubhavadar_extent) {
		this.anubhavadar_extent = anubhavadar_extent;
	}

	public String getRson() {
		return rson;
	}

	public void setRson(String rson) {
		this.rson = rson;
	}

	public Double getOccupant_extent() {
		return occupant_extent;
	}

	public void setOccupant_extent(Double occupant_extent) {
		this.occupant_extent = occupant_extent;
	}

	

}
