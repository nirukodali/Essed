package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ExtentBookedVSNormalAreaAbstract {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String dcode;
	private String cr_year;
	private String cr_season;
	private String agri_normalarea;
	private String agri_cultivable_land;
	private String hnormalarea;
	private String hcultivable_land;
	private String seri_cultivable_land;
	private String soc_forestry_normalarea;
	private String soc_forestry_cultivable_land;
	private String fodder_cultivable_land;
	
	public ExtentBookedVSNormalAreaAbstract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExtentBookedVSNormalAreaAbstract(String dname, String dcode, String cr_year, String cr_season,
			String agri_normalarea, String agri_cultivable_land, String hnormalarea, String hcultivable_land,
			String seri_cultivable_land, String soc_forestry_normalarea, String soc_forestry_cultivable_land,
			String fodder_cultivable_land) {
		super();
		this.dname = dname;
		this.dcode = dcode;
		this.cr_year = cr_year;
		this.cr_season = cr_season;
		this.agri_normalarea = agri_normalarea;
		this.agri_cultivable_land = agri_cultivable_land;
		this.hnormalarea = hnormalarea;
		this.hcultivable_land = hcultivable_land;
		this.seri_cultivable_land = seri_cultivable_land;
		this.soc_forestry_normalarea = soc_forestry_normalarea;
		this.soc_forestry_cultivable_land = soc_forestry_cultivable_land;
		this.fodder_cultivable_land = fodder_cultivable_land;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	public String getCr_year() {
		return cr_year;
	}

	public void setCr_year(String cr_year) {
		this.cr_year = cr_year;
	}

	public String getCr_season() {
		return cr_season;
	}

	public void setCr_season(String cr_season) {
		this.cr_season = cr_season;
	}

	public String getAgri_normalarea() {
		return agri_normalarea;
	}

	public void setAgri_normalarea(String agri_normalarea) {
		this.agri_normalarea = agri_normalarea;
	}

	public String getAgri_cultivable_land() {
		return agri_cultivable_land;
	}

	public void setAgri_cultivable_land(String agri_cultivable_land) {
		this.agri_cultivable_land = agri_cultivable_land;
	}

	public String getHnormalarea() {
		return hnormalarea;
	}

	public void setHnormalarea(String hnormalarea) {
		this.hnormalarea = hnormalarea;
	}

	public String getHcultivable_land() {
		return hcultivable_land;
	}

	public void setHcultivable_land(String hcultivable_land) {
		this.hcultivable_land = hcultivable_land;
	}

	public String getSeri_cultivable_land() {
		return seri_cultivable_land;
	}

	public void setSeri_cultivable_land(String seri_cultivable_land) {
		this.seri_cultivable_land = seri_cultivable_land;
	}

	public String getSoc_forestry_normalarea() {
		return soc_forestry_normalarea;
	}

	public void setSoc_forestry_normalarea(String soc_forestry_normalarea) {
		this.soc_forestry_normalarea = soc_forestry_normalarea;
	}

	public String getSoc_forestry_cultivable_land() {
		return soc_forestry_cultivable_land;
	}

	public void setSoc_forestry_cultivable_land(String soc_forestry_cultivable_land) {
		this.soc_forestry_cultivable_land = soc_forestry_cultivable_land;
	}

	public String getFodder_cultivable_land() {
		return fodder_cultivable_land;
	}

	public void setFodder_cultivable_land(String fodder_cultivable_land) {
		this.fodder_cultivable_land = fodder_cultivable_land;
	}

	@Override
	public String toString() {
		return "ExtentBookedVSNormalAreaAbstract [dname=" + dname + ", dcode=" + dcode + ", cr_year=" + cr_year
				+ ", cr_season=" + cr_season + ", agri_normalarea=" + agri_normalarea + ", agri_cultivable_land="
				+ agri_cultivable_land + ", hnormalarea=" + hnormalarea + ", hcultivable_land=" + hcultivable_land
				+ ", seri_cultivable_land=" + seri_cultivable_land + ", soc_forestry_normalarea="
				+ soc_forestry_normalarea + ", soc_forestry_cultivable_land=" + soc_forestry_cultivable_land
				+ ", fodder_cultivable_land=" + fodder_cultivable_land + "]";
	}

	
}