package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class EfishDetailsRC {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String  wbvname;
	private String ocname;
	private String ocfname;
	private String farmer_name;
	private String father_name;
	private String survey_no;
	private String khno;
	private String occupant_extent;
	private String  tot_extent;
	private String  allowable_ext;
	
	public EfishDetailsRC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EfishDetailsRC(String wbvname, String ocname, String ocfname, String farmer_name, String father_name,
			String survey_no, String khno, String occupant_extent, String tot_extent, String allowable_ext) {
		super();
		this.wbvname = wbvname;
		this.ocname = ocname;
		this.ocfname = ocfname;
		this.farmer_name = farmer_name;
		this.father_name = father_name;
		this.survey_no = survey_no;
		this.khno = khno;
		this.occupant_extent = occupant_extent;
		this.tot_extent = tot_extent;
		this.allowable_ext = allowable_ext;
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

	public String getKhno() {
		return khno;
	}

	public void setKhno(String khno) {
		this.khno = khno;
	}

	public String getOccupant_extent() {
		return occupant_extent;
	}

	public void setOccupant_extent(String occupant_extent) {
		this.occupant_extent = occupant_extent;
	}

	public String getTot_extent() {
		return tot_extent;
	}

	public void setTot_extent(String tot_extent) {
		this.tot_extent = tot_extent;
	}

	public String getAllowable_ext() {
		return allowable_ext;
	}

	public void setAllowable_ext(String allowable_ext) {
		this.allowable_ext = allowable_ext;
	}

	@Override
	public String toString() {
		return "EfishDetailsRC [wbvname=" + wbvname + ", ocname=" + ocname + ", ocfname=" + ocfname + ", farmer_name="
				+ farmer_name + ", father_name=" + father_name + ", survey_no=" + survey_no + ", khno=" + khno
				+ ", occupant_extent=" + occupant_extent + ", tot_extent=" + tot_extent + ", allowable_ext="
				+ allowable_ext + "]";
	}
	

	
}
