package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class BlockedEfishExtent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbvname;
	private String ocname;
	private String ocfname;
	private String farmer_name;
	private String father_name;
	private String survey_no;
	private String kh_no;
	private String tot_extent;
	private String occupant_extent;
	private BigDecimal avail_ext;
	private String mapped_extent;
	public BlockedEfishExtent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BlockedEfishExtent(String wbvname, String ocname, String ocfname, String farmer_name, String father_name,
			String survey_no, String kh_no, String tot_extent, String occupant_extent, BigDecimal avail_ext) {
		super();
		this.wbvname = wbvname;
		this.ocname = ocname;
		this.ocfname = ocfname;
		this.farmer_name = farmer_name;
		this.father_name = father_name;
		this.survey_no = survey_no;
		this.kh_no = kh_no;
		this.tot_extent = tot_extent;
		this.occupant_extent = occupant_extent;
		this.avail_ext = avail_ext;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public String getOcname() {
		return ocname;
	}
	public void setOcname(String ocname) {
		this.ocname = ocname;
	}
	public String getOcfname() {
		return ocfname;
	}
	public void setOcfname(String ocfname) {
		this.ocfname = ocfname;
	}
	public String getFarmer_name() {
		return farmer_name;
	}
	public void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getSurvey_no() {
		return survey_no;
	}
	public void setSurvey_no(String survey_no) {
		this.survey_no = survey_no;
	}
	public String getKh_no() {
		return kh_no;
	}
	public void setKh_no(String kh_no) {
		this.kh_no = kh_no;
	}
	public String getTot_extent() {
		return tot_extent;
	}
	public void setTot_extent(String tot_extent) {
		this.tot_extent = tot_extent;
	}
	public String getOccupant_extent() {
		return occupant_extent;
	}
	public void setOccupant_extent(String occupant_extent) {
		this.occupant_extent = occupant_extent;
	}
	public BigDecimal getAvail_ext() {
		return avail_ext;
	}
	public void setAvail_ext(BigDecimal avail_ext) {
		this.avail_ext = avail_ext;
	}
	public String getMapped_extent() {
		return mapped_extent;
	}
	public void setMapped_extent(String mapped_extent) {
		this.mapped_extent = mapped_extent;
	}
	@Override
	public String toString() {
		return "BlockedEfishExtent [wbvname=" + wbvname + ", ocname=" + ocname + ", ocfname=" + ocfname
				+ ", farmer_name=" + farmer_name + ", father_name=" + father_name + ", survey_no=" + survey_no
				+ ", kh_no=" + kh_no + ", tot_extent=" + tot_extent + ", occupant_extent=" + occupant_extent
				+ ", avail_ext=" + avail_ext + "]";
	}
	
	
}
