package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepartmentWise {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	private String dname;
	private Long dcode;
	private Long cr_year;
	private Long cr_season;
	private Long agri_normalarea;
	private Long agri_cultivable_land; 
	private Long hnormalarea;
	private Long hcultivable_land;
	private Long seri_cultivable_land;
	private Long soc_forestry_normalarea;
	private Long soc_forestry_cultivable_land;
	private Long fodder_cultivable_land;
	private Long cr_dist_code;
	private Long a_vaaauthextent;
	private Long a_vroauthextent;
	private Long a_ekycbookedext;
	private Long h_vaaauthextent;
	private Long h_vroauthextent;
	private Long h_ekycbookedext;
	private Long s_vaaauthextent;
	private Long s_vroauthextent;
	private Long s_ekycbookedext;
	private Long r_vaaauthextent;
	private Long r_vroauthextent;
	private Long r_ekycbookedext;
	
	public DepartmentWise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentWise(String dname, Long dcode, Long cr_year, Long cr_season, Long agri_normalarea,
			Long agri_cultivable_land, Long hnormalarea, Long hcultivable_land, Long seri_cultivable_land,
			Long soc_forestry_normalarea, Long soc_forestry_cultivable_land, Long fodder_cultivable_land,
			Long cr_dist_code, Long a_vaaauthextent, Long a_vroauthextent, Long a_ekycbookedext, Long h_vaaauthextent,
			Long h_vroauthextent, Long h_ekycbookedext, Long s_vaaauthextent, Long s_vroauthextent,
			Long s_ekycbookedext, Long r_vaaauthextent, Long r_vroauthextent, Long r_ekycbookedext) {
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
		this.cr_dist_code = cr_dist_code;
		this.a_vaaauthextent = a_vaaauthextent;
		this.a_vroauthextent = a_vroauthextent;
		this.a_ekycbookedext = a_ekycbookedext;
		this.h_vaaauthextent = h_vaaauthextent;
		this.h_vroauthextent = h_vroauthextent;
		this.h_ekycbookedext = h_ekycbookedext;
		this.s_vaaauthextent = s_vaaauthextent;
		this.s_vroauthextent = s_vroauthextent;
		this.s_ekycbookedext = s_ekycbookedext;
		this.r_vaaauthextent = r_vaaauthextent;
		this.r_vroauthextent = r_vroauthextent;
		this.r_ekycbookedext = r_ekycbookedext;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Long getDcode() {
		return dcode;
	}

	public void setDcode(Long dcode) {
		this.dcode = dcode;
	}

	public Long getCr_year() {
		return cr_year;
	}

	public void setCr_year(Long cr_year) {
		this.cr_year = cr_year;
	}

	public Long getCr_season() {
		return cr_season;
	}

	public void setCr_season(Long cr_season) {
		this.cr_season = cr_season;
	}

	public Long getAgri_normalarea() {
		return agri_normalarea;
	}

	public void setAgri_normalarea(Long agri_normalarea) {
		this.agri_normalarea = agri_normalarea;
	}

	public Long getAgri_cultivable_land() {
		return agri_cultivable_land;
	}

	public void setAgri_cultivable_land(Long agri_cultivable_land) {
		this.agri_cultivable_land = agri_cultivable_land;
	}

	public Long getHnormalarea() {
		return hnormalarea;
	}

	public void setHnormalarea(Long hnormalarea) {
		this.hnormalarea = hnormalarea;
	}

	public Long getHcultivable_land() {
		return hcultivable_land;
	}

	public void setHcultivable_land(Long hcultivable_land) {
		this.hcultivable_land = hcultivable_land;
	}

	public Long getSeri_cultivable_land() {
		return seri_cultivable_land;
	}

	public void setSeri_cultivable_land(Long seri_cultivable_land) {
		this.seri_cultivable_land = seri_cultivable_land;
	}

	public Long getSoc_forestry_normalarea() {
		return soc_forestry_normalarea;
	}

	public void setSoc_forestry_normalarea(Long soc_forestry_normalarea) {
		this.soc_forestry_normalarea = soc_forestry_normalarea;
	}

	public Long getSoc_forestry_cultivable_land() {
		return soc_forestry_cultivable_land;
	}

	public void setSoc_forestry_cultivable_land(Long soc_forestry_cultivable_land) {
		this.soc_forestry_cultivable_land = soc_forestry_cultivable_land;
	}

	public Long getFodder_cultivable_land() {
		return fodder_cultivable_land;
	}

	public void setFodder_cultivable_land(Long fodder_cultivable_land) {
		this.fodder_cultivable_land = fodder_cultivable_land;
	}

	public Long getCr_dist_code() {
		return cr_dist_code;
	}

	public void setCr_dist_code(Long cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}

	public Long getA_vaaauthextent() {
		return a_vaaauthextent;
	}

	public void setA_vaaauthextent(Long a_vaaauthextent) {
		this.a_vaaauthextent = a_vaaauthextent;
	}

	public Long getA_vroauthextent() {
		return a_vroauthextent;
	}

	public void setA_vroauthextent(Long a_vroauthextent) {
		this.a_vroauthextent = a_vroauthextent;
	}

	public Long getA_ekycbookedext() {
		return a_ekycbookedext;
	}

	public void setA_ekycbookedext(Long a_ekycbookedext) {
		this.a_ekycbookedext = a_ekycbookedext;
	}

	public Long getH_vaaauthextent() {
		return h_vaaauthextent;
	}

	public void setH_vaaauthextent(Long h_vaaauthextent) {
		this.h_vaaauthextent = h_vaaauthextent;
	}

	public Long getH_vroauthextent() {
		return h_vroauthextent;
	}

	public void setH_vroauthextent(Long h_vroauthextent) {
		this.h_vroauthextent = h_vroauthextent;
	}

	public Long getH_ekycbookedext() {
		return h_ekycbookedext;
	}

	public void setH_ekycbookedext(Long h_ekycbookedext) {
		this.h_ekycbookedext = h_ekycbookedext;
	}

	public Long getS_vaaauthextent() {
		return s_vaaauthextent;
	}

	public void setS_vaaauthextent(Long s_vaaauthextent) {
		this.s_vaaauthextent = s_vaaauthextent;
	}

	public Long getS_vroauthextent() {
		return s_vroauthextent;
	}

	public void setS_vroauthextent(Long s_vroauthextent) {
		this.s_vroauthextent = s_vroauthextent;
	}

	public Long getS_ekycbookedext() {
		return s_ekycbookedext;
	}

	public void setS_ekycbookedext(Long s_ekycbookedext) {
		this.s_ekycbookedext = s_ekycbookedext;
	}

	public Long getR_vaaauthextent() {
		return r_vaaauthextent;
	}

	public void setR_vaaauthextent(Long r_vaaauthextent) {
		this.r_vaaauthextent = r_vaaauthextent;
	}

	public Long getR_vroauthextent() {
		return r_vroauthextent;
	}

	public void setR_vroauthextent(Long r_vroauthextent) {
		this.r_vroauthextent = r_vroauthextent;
	}

	public Long getR_ekycbookedext() {
		return r_ekycbookedext;
	}

	public void setR_ekycbookedext(Long r_ekycbookedext) {
		this.r_ekycbookedext = r_ekycbookedext;
	}

	@Override
	public String toString() {
		return "DepartmentWise [dname=" + dname + ", dcode=" + dcode + ", cr_year=" + cr_year + ", cr_season="
				+ cr_season + ", agri_normalarea=" + agri_normalarea + ", agri_cultivable_land=" + agri_cultivable_land
				+ ", hnormalarea=" + hnormalarea + ", hcultivable_land=" + hcultivable_land + ", seri_cultivable_land="
				+ seri_cultivable_land + ", soc_forestry_normalarea=" + soc_forestry_normalarea
				+ ", soc_forestry_cultivable_land=" + soc_forestry_cultivable_land + ", fodder_cultivable_land="
				+ fodder_cultivable_land + ", cr_dist_code=" + cr_dist_code + ", a_vaaauthextent=" + a_vaaauthextent
				+ ", a_vroauthextent=" + a_vroauthextent + ", a_ekycbookedext=" + a_ekycbookedext + ", h_vaaauthextent="
				+ h_vaaauthextent + ", h_vroauthextent=" + h_vroauthextent + ", h_ekycbookedext=" + h_ekycbookedext
				+ ", s_vaaauthextent=" + s_vaaauthextent + ", s_vroauthextent=" + s_vroauthextent + ", s_ekycbookedext="
				+ s_ekycbookedext + ", r_vaaauthextent=" + r_vaaauthextent + ", r_vroauthextent=" + r_vroauthextent
				+ ", r_ekycbookedext=" + r_ekycbookedext + "]";
	} 
	
	

}
