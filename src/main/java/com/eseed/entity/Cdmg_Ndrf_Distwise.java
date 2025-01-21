package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Cdmg_Ndrf_Distwise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		
	private String district;
	private BigDecimal sfmf_farmers;
	private BigDecimal sfmf_ext;
	private BigDecimal sfmf_rainfed_ipsamt;
	private BigDecimal sfmf_ir_farmers;
	private BigDecimal sfmf_ir_ext;
	private BigDecimal sfmf_ir_ipsamt;
	private BigDecimal of_farmers;
	private BigDecimal of_ext;
	private BigDecimal of_ipsamt_rainfed;
	private BigDecimal of_ir_farmers;
	private BigDecimal of_ir_ext;
	private BigDecimal of_ipsamt_ir;
	
	public Cdmg_Ndrf_Distwise(String district, BigDecimal sfmf_farmers, BigDecimal sfmf_ext,
			BigDecimal sfmf_rainfed_ipsamt, BigDecimal sfmf_ir_farmers, BigDecimal sfmf_ir_ext,
			BigDecimal sfmf_ir_ipsamt, BigDecimal of_farmers, BigDecimal of_ext, BigDecimal of_ipsamt_rainfed,
			BigDecimal of_ir_farmers, BigDecimal of_ir_ext, BigDecimal of_ipsamt_ir) {
		super();
		this.district = district;
		this.sfmf_farmers = sfmf_farmers;
		this.sfmf_ext = sfmf_ext;
		this.sfmf_rainfed_ipsamt = sfmf_rainfed_ipsamt;
		this.sfmf_ir_farmers = sfmf_ir_farmers;
		this.sfmf_ir_ext = sfmf_ir_ext;
		this.sfmf_ir_ipsamt = sfmf_ir_ipsamt;
		this.of_farmers = of_farmers;
		this.of_ext = of_ext;
		this.of_ipsamt_rainfed = of_ipsamt_rainfed;
		this.of_ir_farmers = of_ir_farmers;
		this.of_ir_ext = of_ir_ext;
		this.of_ipsamt_ir = of_ipsamt_ir;
	}

	public Cdmg_Ndrf_Distwise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public BigDecimal getSfmf_farmers() {
		return sfmf_farmers;
	}

	public void setSfmf_farmers(BigDecimal sfmf_farmers) {
		this.sfmf_farmers = sfmf_farmers;
	}

	public BigDecimal getSfmf_ext() {
		return sfmf_ext;
	}

	public void setSfmf_ext(BigDecimal sfmf_ext) {
		this.sfmf_ext = sfmf_ext;
	}

	public BigDecimal getSfmf_rainfed_ipsamt() {
		return sfmf_rainfed_ipsamt;
	}

	public void setSfmf_rainfed_ipsamt(BigDecimal sfmf_rainfed_ipsamt) {
		this.sfmf_rainfed_ipsamt = sfmf_rainfed_ipsamt;
	}

	public BigDecimal getSfmf_ir_farmers() {
		return sfmf_ir_farmers;
	}

	public void setSfmf_ir_farmers(BigDecimal sfmf_ir_farmers) {
		this.sfmf_ir_farmers = sfmf_ir_farmers;
	}

	public BigDecimal getSfmf_ir_ext() {
		return sfmf_ir_ext;
	}

	public void setSfmf_ir_ext(BigDecimal sfmf_ir_ext) {
		this.sfmf_ir_ext = sfmf_ir_ext;
	}

	public BigDecimal getSfmf_ir_ipsamt() {
		return sfmf_ir_ipsamt;
	}

	public void setSfmf_ir_ipsamt(BigDecimal sfmf_ir_ipsamt) {
		this.sfmf_ir_ipsamt = sfmf_ir_ipsamt;
	}

	public BigDecimal getOf_farmers() {
		return of_farmers;
	}

	public void setOf_farmers(BigDecimal of_farmers) {
		this.of_farmers = of_farmers;
	}

	public BigDecimal getOf_ext() {
		return of_ext;
	}

	public void setOf_ext(BigDecimal of_ext) {
		this.of_ext = of_ext;
	}

	public BigDecimal getOf_ipsamt_rainfed() {
		return of_ipsamt_rainfed;
	}

	public void setOf_ipsamt_rainfed(BigDecimal of_ipsamt_rainfed) {
		this.of_ipsamt_rainfed = of_ipsamt_rainfed;
	}

	public BigDecimal getOf_ir_farmers() {
		return of_ir_farmers;
	}

	public void setOf_ir_farmers(BigDecimal of_ir_farmers) {
		this.of_ir_farmers = of_ir_farmers;
	}

	public BigDecimal getOf_ir_ext() {
		return of_ir_ext;
	}

	public void setOf_ir_ext(BigDecimal of_ir_ext) {
		this.of_ir_ext = of_ir_ext;
	}

	public BigDecimal getOf_ipsamt_ir() {
		return of_ipsamt_ir;
	}

	public void setOf_ipsamt_ir(BigDecimal of_ipsamt_ir) {
		this.of_ipsamt_ir = of_ipsamt_ir;
	}

	@Override
	public String toString() {
		return "Cdmg_Ndrf_Distwise [district=" + district + ", sfmf_farmers=" + sfmf_farmers + ", sfmf_ext=" + sfmf_ext
				+ ", sfmf_rainfed_ipsamt=" + sfmf_rainfed_ipsamt + ", sfmf_ir_farmers=" + sfmf_ir_farmers
				+ ", sfmf_ir_ext=" + sfmf_ir_ext + ", sfmf_ir_ipsamt=" + sfmf_ir_ipsamt + ", of_farmers=" + of_farmers
				+ ", of_ext=" + of_ext + ", of_ipsamt_rainfed=" + of_ipsamt_rainfed + ", of_ir_farmers=" + of_ir_farmers
				+ ", of_ir_ext=" + of_ir_ext + ", of_ipsamt_ir=" + of_ipsamt_ir + "]";
	}
	
	

}
