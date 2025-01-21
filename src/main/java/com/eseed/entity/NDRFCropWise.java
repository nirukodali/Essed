package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NDRFCropWise {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String cropnameeng;
	private Long sfmf_farmers;
	private Number sfmf_ext;
	private Number sfmf_rainfed_ipsamt;
	private Long sfmf_ir_farmers;
	private Number sfmf_ir_ext;
	private Number sfmf_ir_ipsamt;
	private Long of_farmers;
	private Number of_ext;
	private Number of_ipsamt_rainfed;
	private Long of_ir_farmers;
	private Number of_ir_ext;
	private Number of_ipsamt_ir;
	
	
	public NDRFCropWise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public NDRFCropWise(String cropnameeng, Long sfmf_farmers, Number sfmf_ext, Number sfmf_rainfed_ipsamt,
			Long sfmf_ir_farmers, Number sfmf_ir_ext, Number sfmf_ir_ipsamt, Long of_farmers, Number of_ext,
			Number of_ipsamt_rainfed, Long of_ir_farmers, Number of_ir_ext, Number of_ipsamt_ir) {
		super();
		this.cropnameeng = cropnameeng;
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


	public String getCropnameeng() {
		return cropnameeng;
	}


	public void setCropnameeng(String cropnameeng) {
		this.cropnameeng = cropnameeng;
	}


	public Long getSfmf_farmers() {
		return sfmf_farmers;
	}


	public void setSfmf_farmers(Long sfmf_farmers) {
		this.sfmf_farmers = sfmf_farmers;
	}


	public Number getSfmf_ext() {
		return sfmf_ext;
	}


	public void setSfmf_ext(Number sfmf_ext) {
		this.sfmf_ext = sfmf_ext;
	}


	public Number getSfmf_rainfed_ipsamt() {
		return sfmf_rainfed_ipsamt;
	}


	public void setSfmf_rainfed_ipsamt(Number sfmf_rainfed_ipsamt) {
		this.sfmf_rainfed_ipsamt = sfmf_rainfed_ipsamt;
	}


	public Long getSfmf_ir_farmers() {
		return sfmf_ir_farmers;
	}


	public void setSfmf_ir_farmers(Long sfmf_ir_farmers) {
		this.sfmf_ir_farmers = sfmf_ir_farmers;
	}


	public Number getSfmf_ir_ext() {
		return sfmf_ir_ext;
	}


	public void setSfmf_ir_ext(Number sfmf_ir_ext) {
		this.sfmf_ir_ext = sfmf_ir_ext;
	}


	public Number getSfmf_ir_ipsamt() {
		return sfmf_ir_ipsamt;
	}


	public void setSfmf_ir_ipsamt(Number sfmf_ir_ipsamt) {
		this.sfmf_ir_ipsamt = sfmf_ir_ipsamt;
	}


	public Long getOf_farmers() {
		return of_farmers;
	}


	public void setOf_farmers(Long of_farmers) {
		this.of_farmers = of_farmers;
	}


	public Number getOf_ext() {
		return of_ext;
	}


	public void setOf_ext(Number of_ext) {
		this.of_ext = of_ext;
	}


	public Number getOf_ipsamt_rainfed() {
		return of_ipsamt_rainfed;
	}


	public void setOf_ipsamt_rainfed(Number of_ipsamt_rainfed) {
		this.of_ipsamt_rainfed = of_ipsamt_rainfed;
	}


	public Long getOf_ir_farmers() {
		return of_ir_farmers;
	}


	public void setOf_ir_farmers(Long of_ir_farmers) {
		this.of_ir_farmers = of_ir_farmers;
	}


	public Number getOf_ir_ext() {
		return of_ir_ext;
	}


	public void setOf_ir_ext(Number of_ir_ext) {
		this.of_ir_ext = of_ir_ext;
	}


	public Number getOf_ipsamt_ir() {
		return of_ipsamt_ir;
	}


	public void setOf_ipsamt_ir(Number of_ipsamt_ir) {
		this.of_ipsamt_ir = of_ipsamt_ir;
	}


	@Override
	public String toString() {
		return "NDRFCropWise [cropnameeng=" + cropnameeng + ", sfmf_farmers=" + sfmf_farmers + ", sfmf_ext=" + sfmf_ext
				+ ", sfmf_rainfed_ipsamt=" + sfmf_rainfed_ipsamt + ", sfmf_ir_farmers=" + sfmf_ir_farmers
				+ ", sfmf_ir_ext=" + sfmf_ir_ext + ", sfmf_ir_ipsamt=" + sfmf_ir_ipsamt + ", of_farmers=" + of_farmers
				+ ", of_ext=" + of_ext + ", of_ipsamt_rainfed=" + of_ipsamt_rainfed + ", of_ir_farmers=" + of_ir_farmers
				+ ", of_ir_ext=" + of_ir_ext + ", of_ipsamt_ir=" + of_ipsamt_ir + "]";
	}
}
