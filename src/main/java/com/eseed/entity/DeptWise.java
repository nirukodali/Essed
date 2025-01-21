package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DeptWise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String mname;
	private BigDecimal agri_cultivable_land;
	private BigDecimal a_vaaauthextent;
	private BigDecimal a_vroauthextent;
	private BigDecimal a_ekycbookedext;
	
	private BigDecimal hcultivable_land;
	private BigDecimal h_vaaauthextent;
	private BigDecimal h_vroauthextent;
	private BigDecimal h_ekycbookedext;
	
	private BigDecimal seri_cultivable_land;
	private BigDecimal s_vaaauthextent;
	private BigDecimal s_vroauthextent;
	private BigDecimal s_ekycbookedext;
	
	private BigDecimal soc_forestry_cultivable_land;
	private BigDecimal r_vaaauthextent;
	private BigDecimal r_vroauthextent;
	private BigDecimal r_ekycbookedext;
	
	public DeptWise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptWise(String dname, BigDecimal agri_cultivable_land, BigDecimal a_vaaauthextent, BigDecimal a_vroauthextent,
			BigDecimal a_ekycbookedext, BigDecimal hcultivable_land, BigDecimal h_vaaauthextent, BigDecimal h_vroauthextent,
			BigDecimal h_ekycbookedext, BigDecimal seri_cultivable_land, BigDecimal s_vaaauthextent, BigDecimal s_vroauthextent,
			BigDecimal s_ekycbookedext, BigDecimal soc_forestry_cultivable_land, BigDecimal r_vaaauthextent,
			BigDecimal r_vroauthextent, BigDecimal r_ekycbookedext) {
		super();
		this.dname = dname;
		this.agri_cultivable_land = agri_cultivable_land;
		this.a_vaaauthextent = a_vaaauthextent;
		this.a_vroauthextent = a_vroauthextent;
		this.a_ekycbookedext = a_ekycbookedext;
		this.hcultivable_land = hcultivable_land;
		this.h_vaaauthextent = h_vaaauthextent;
		this.h_vroauthextent = h_vroauthextent;
		this.h_ekycbookedext = h_ekycbookedext;
		this.seri_cultivable_land = seri_cultivable_land;
		this.s_vaaauthextent = s_vaaauthextent;
		this.s_vroauthextent = s_vroauthextent;
		this.s_ekycbookedext = s_ekycbookedext;
		this.soc_forestry_cultivable_land = soc_forestry_cultivable_land;
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

	public BigDecimal getAgri_cultivable_land() {
		return agri_cultivable_land;
	}

	public void setAgri_cultivable_land(BigDecimal agri_cultivable_land) {
		this.agri_cultivable_land = agri_cultivable_land;
	}

	public BigDecimal getA_vaaauthextent() {
		return a_vaaauthextent;
	}

	public void setA_vaaauthextent(BigDecimal a_vaaauthextent) {
		this.a_vaaauthextent = a_vaaauthextent;
	}

	public BigDecimal getA_vroauthextent() {
		return a_vroauthextent;
	}

	public void setA_vroauthextent(BigDecimal a_vroauthextent) {
		this.a_vroauthextent = a_vroauthextent;
	}

	public BigDecimal getA_ekycbookedext() {
		return a_ekycbookedext;
	}

	public void setA_ekycbookedext(BigDecimal a_ekycbookedext) {
		this.a_ekycbookedext = a_ekycbookedext;
	}

	public BigDecimal getHcultivable_land() {
		return hcultivable_land;
	}

	public void setHcultivable_land(BigDecimal hcultivable_land) {
		this.hcultivable_land = hcultivable_land;
	}

	public BigDecimal getH_vaaauthextent() {
		return h_vaaauthextent;
	}

	public void setH_vaaauthextent(BigDecimal h_vaaauthextent) {
		this.h_vaaauthextent = h_vaaauthextent;
	}

	public BigDecimal getH_vroauthextent() {
		return h_vroauthextent;
	}

	public void setH_vroauthextent(BigDecimal h_vroauthextent) {
		this.h_vroauthextent = h_vroauthextent;
	}

	public BigDecimal getH_ekycbookedext() {
		return h_ekycbookedext;
	}

	public void setH_ekycbookedext(BigDecimal h_ekycbookedext) {
		this.h_ekycbookedext = h_ekycbookedext;
	}

	public BigDecimal getSeri_cultivable_land() {
		return seri_cultivable_land;
	}

	public void setSeri_cultivable_land(BigDecimal seri_cultivable_land) {
		this.seri_cultivable_land = seri_cultivable_land;
	}

	public BigDecimal getS_vaaauthextent() {
		return s_vaaauthextent;
	}

	public void setS_vaaauthextent(BigDecimal s_vaaauthextent) {
		this.s_vaaauthextent = s_vaaauthextent;
	}

	public BigDecimal getS_vroauthextent() {
		return s_vroauthextent;
	}

	public void setS_vroauthextent(BigDecimal s_vroauthextent) {
		this.s_vroauthextent = s_vroauthextent;
	}

	public BigDecimal getS_ekycbookedext() {
		return s_ekycbookedext;
	}

	public void setS_ekycbookedext(BigDecimal s_ekycbookedext) {
		this.s_ekycbookedext = s_ekycbookedext;
	}

	public BigDecimal getSoc_forestry_cultivable_land() {
		return soc_forestry_cultivable_land;
	}

	public void setSoc_forestry_cultivable_land(BigDecimal soc_forestry_cultivable_land) {
		this.soc_forestry_cultivable_land = soc_forestry_cultivable_land;
	}

	public BigDecimal getR_vaaauthextent() {
		return r_vaaauthextent;
	}

	public void setR_vaaauthextent(BigDecimal r_vaaauthextent) {
		this.r_vaaauthextent = r_vaaauthextent;
	}

	public BigDecimal getR_vroauthextent() {
		return r_vroauthextent;
	}

	public void setR_vroauthextent(BigDecimal r_vroauthextent) {
		this.r_vroauthextent = r_vroauthextent;
	}

	public BigDecimal getR_ekycbookedext() {
		return r_ekycbookedext;
	}

	public void setR_ekycbookedext(BigDecimal r_ekycbookedext) {
		this.r_ekycbookedext = r_ekycbookedext;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "DeptWise [dname=" + dname + ", agri_cultivable_land=" + agri_cultivable_land + ", a_vaaauthextent="
				+ a_vaaauthextent + ", a_vroauthextent=" + a_vroauthextent + ", a_ekycbookedext=" + a_ekycbookedext
				+ ", hcultivable_land=" + hcultivable_land + ", h_vaaauthextent=" + h_vaaauthextent
				+ ", h_vroauthextent=" + h_vroauthextent + ", h_ekycbookedext=" + h_ekycbookedext
				+ ", seri_cultivable_land=" + seri_cultivable_land + ", s_vaaauthextent=" + s_vaaauthextent
				+ ", s_vroauthextent=" + s_vroauthextent + ", s_ekycbookedext=" + s_ekycbookedext
				+ ", soc_forestry_cultivable_land=" + soc_forestry_cultivable_land + ", r_vaaauthextent="
				+ r_vaaauthextent + ", r_vroauthextent=" + r_vroauthextent + ", r_ekycbookedext=" + r_ekycbookedext
				+ "]";
	}
	
}
