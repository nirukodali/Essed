package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_details_efish_2023")
public class EfishdetailEntity {

	@Id
	@Column(name="recid")
	private Integer recid;
	
	public Integer getRecid() {
		return recid;
	}

	public void setRecid(Integer recid) {
		this.recid = recid;
	}

	@Column(name="cr_sno")
	private String cr_sno;
	
	@Column(name="kh_no")
	private String kh_no;
	
	@Column(name="pattadar_name")
	private String pattadar_name;
	
	@Column(name="pattadar_father_name")
	private String pattadar_father_name;
	
	
	
	
	
	@Column(name="total_extent")
	private String total_extent;
	
	@Column(name="occupant_name")
	private String occupant_name;
	
	@Column(name="occupant_father_name")
	private String occupant_father_name;

	@Column(name="mapped_extent")
	private String mapped_extent;

	public String getMapped_extent() {
		return mapped_extent;
	}

	public void setMapped_extent(String mapped_extent) {
		this.mapped_extent = mapped_extent;
	}

	public String getCr_sno() {
		return cr_sno;
	}

	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}

	public String getKh_no() {
		return kh_no;
	}

	public void setKh_no(String kh_no) {
		this.kh_no = kh_no;
	}

	public String getPattadar_name() {
		return pattadar_name;
	}

	public void setPattadar_name(String pattadar_name) {
		this.pattadar_name = pattadar_name;
	}

	public String getPattadar_father_name() {
		return pattadar_father_name;
	}

	public void setPattadar_father_name(String pattadar_father_name) {
		this.pattadar_father_name = pattadar_father_name;
	}

	
	public String getTotal_extent() {
		return total_extent;
	}

	public void setTotal_extent(String total_extent) {
		this.total_extent = total_extent;
	}

	public String getOccupant_name() {
		return occupant_name;
	}

	public void setOccupant_name(String occupant_name) {
		this.occupant_name = occupant_name;
	}

	public String getOccupant_father_name() {
		return occupant_father_name;
	}

	public void setOccupant_father_name(String occupant_father_name) {
		this.occupant_father_name = occupant_father_name;
	}
	
}
