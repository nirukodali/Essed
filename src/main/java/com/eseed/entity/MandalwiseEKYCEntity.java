package com.eseed.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MandalwiseEKYCEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mname;
	private BigInteger farmername;
	private BigInteger vaa_agri_farmers;
	private BigInteger vro_agri_farmers;
	private BigInteger ekyc_agri_farmers;
	private BigDecimal vaa_agri_ext;
	private BigDecimal vro_agri_ext;
	private BigDecimal ekyc_agri_ext;
	private BigInteger vaa_horti_farmers;
	private BigInteger vro_horti_farmers;
	private BigInteger ekyc_horti_farmers;
	private BigDecimal vaa_horti_ext;
	private BigDecimal vro_horti_ext;
	private BigDecimal ekyc_horti_ext;
	private BigInteger vaa_seri_farmers;
	private BigInteger vro_seri_farmers;
	private BigInteger ekyc_seri_farmers;
	private BigDecimal vaa_seri_ext;
	private BigDecimal vro_seri_ext;
	private BigDecimal ekyc_seri_ext;
	private BigInteger vaa_forestry_farmers;
	private BigInteger vro_forestry_farmers;
	private BigInteger ekyc_forestry_farmers;
	private BigDecimal vaa_forestry_ext;
	private BigDecimal vro_forestry_ext;
	private BigDecimal ekyc_forestry_ext;
	@Override
	public String toString() {
		return "MandalwiseEKYCEntity [mname=" + mname + ", farmername=" + farmername + ", vaa_agri_farmers="
				+ vaa_agri_farmers + ", vro_agri_farmers=" + vro_agri_farmers + ", ekyc_agri_farmers="
				+ ekyc_agri_farmers + ", vaa_agri_ext=" + vaa_agri_ext + ", vro_agri_ext=" + vro_agri_ext
				+ ", ekyc_agri_ext=" + ekyc_agri_ext + ", vaa_horti_farmers=" + vaa_horti_farmers
				+ ", vro_horti_farmers=" + vro_horti_farmers + ", ekyc_horti_farmers=" + ekyc_horti_farmers
				+ ", vaa_horti_ext=" + vaa_horti_ext + ", vro_horti_ext=" + vro_horti_ext + ", ekyc_horti_ext="
				+ ekyc_horti_ext + ", vaa_seri_farmers=" + vaa_seri_farmers + ", vro_seri_farmers=" + vro_seri_farmers
				+ ", ekyc_seri_farmers=" + ekyc_seri_farmers + ", vaa_seri_ext=" + vaa_seri_ext + ", vro_seri_ext="
				+ vro_seri_ext + ", ekyc_seri_ext=" + ekyc_seri_ext + ", vaa_forestry_farmers=" + vaa_forestry_farmers
				+ ", vro_forestry_farmers=" + vro_forestry_farmers + ", ekyc_forestry_farmers=" + ekyc_forestry_farmers
				+ ", vaa_forestry_ext=" + vaa_forestry_ext + ", vro_forestry_ext=" + vro_forestry_ext
				+ ", ekyc_forestry_ext=" + ekyc_forestry_ext + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public BigInteger getFarmername() {
		return farmername;
	}
	public void setFarmername(BigInteger farmername) {
		this.farmername = farmername;
	}
	public BigInteger getVaa_agri_farmers() {
		return vaa_agri_farmers;
	}
	public void setVaa_agri_farmers(BigInteger vaa_agri_farmers) {
		this.vaa_agri_farmers = vaa_agri_farmers;
	}
	public BigInteger getVro_agri_farmers() {
		return vro_agri_farmers;
	}
	public void setVro_agri_farmers(BigInteger vro_agri_farmers) {
		this.vro_agri_farmers = vro_agri_farmers;
	}
	public BigInteger getEkyc_agri_farmers() {
		return ekyc_agri_farmers;
	}
	public void setEkyc_agri_farmers(BigInteger ekyc_agri_farmers) {
		this.ekyc_agri_farmers = ekyc_agri_farmers;
	}
	public BigDecimal getVaa_agri_ext() {
		return vaa_agri_ext;
	}
	public void setVaa_agri_ext(BigDecimal vaa_agri_ext) {
		this.vaa_agri_ext = vaa_agri_ext;
	}
	public BigDecimal getVro_agri_ext() {
		return vro_agri_ext;
	}
	public void setVro_agri_ext(BigDecimal vro_agri_ext) {
		this.vro_agri_ext = vro_agri_ext;
	}
	public BigDecimal getEkyc_agri_ext() {
		return ekyc_agri_ext;
	}
	public void setEkyc_agri_ext(BigDecimal ekyc_agri_ext) {
		this.ekyc_agri_ext = ekyc_agri_ext;
	}
	public BigInteger getVaa_horti_farmers() {
		return vaa_horti_farmers;
	}
	public void setVaa_horti_farmers(BigInteger vaa_horti_farmers) {
		this.vaa_horti_farmers = vaa_horti_farmers;
	}
	public BigInteger getVro_horti_farmers() {
		return vro_horti_farmers;
	}
	public void setVro_horti_farmers(BigInteger vro_horti_farmers) {
		this.vro_horti_farmers = vro_horti_farmers;
	}
	public BigInteger getEkyc_horti_farmers() {
		return ekyc_horti_farmers;
	}
	public void setEkyc_horti_farmers(BigInteger ekyc_horti_farmers) {
		this.ekyc_horti_farmers = ekyc_horti_farmers;
	}
	public BigDecimal getVaa_horti_ext() {
		return vaa_horti_ext;
	}
	public void setVaa_horti_ext(BigDecimal vaa_horti_ext) {
		this.vaa_horti_ext = vaa_horti_ext;
	}
	public BigDecimal getVro_horti_ext() {
		return vro_horti_ext;
	}
	public void setVro_horti_ext(BigDecimal vro_horti_ext) {
		this.vro_horti_ext = vro_horti_ext;
	}
	public BigDecimal getEkyc_horti_ext() {
		return ekyc_horti_ext;
	}
	public void setEkyc_horti_ext(BigDecimal ekyc_horti_ext) {
		this.ekyc_horti_ext = ekyc_horti_ext;
	}
	public BigInteger getVaa_seri_farmers() {
		return vaa_seri_farmers;
	}
	public void setVaa_seri_farmers(BigInteger vaa_seri_farmers) {
		this.vaa_seri_farmers = vaa_seri_farmers;
	}
	public BigInteger getVro_seri_farmers() {
		return vro_seri_farmers;
	}
	public void setVro_seri_farmers(BigInteger vro_seri_farmers) {
		this.vro_seri_farmers = vro_seri_farmers;
	}
	public BigInteger getEkyc_seri_farmers() {
		return ekyc_seri_farmers;
	}
	public void setEkyc_seri_farmers(BigInteger ekyc_seri_farmers) {
		this.ekyc_seri_farmers = ekyc_seri_farmers;
	}
	public BigDecimal getVaa_seri_ext() {
		return vaa_seri_ext;
	}
	public void setVaa_seri_ext(BigDecimal vaa_seri_ext) {
		this.vaa_seri_ext = vaa_seri_ext;
	}
	public BigDecimal getVro_seri_ext() {
		return vro_seri_ext;
	}
	public void setVro_seri_ext(BigDecimal vro_seri_ext) {
		this.vro_seri_ext = vro_seri_ext;
	}
	public BigDecimal getEkyc_seri_ext() {
		return ekyc_seri_ext;
	}
	public void setEkyc_seri_ext(BigDecimal ekyc_seri_ext) {
		this.ekyc_seri_ext = ekyc_seri_ext;
	}
	public BigInteger getVaa_forestry_farmers() {
		return vaa_forestry_farmers;
	}
	public void setVaa_forestry_farmers(BigInteger vaa_forestry_farmers) {
		this.vaa_forestry_farmers = vaa_forestry_farmers;
	}
	public BigInteger getVro_forestry_farmers() {
		return vro_forestry_farmers;
	}
	public void setVro_forestry_farmers(BigInteger vro_forestry_farmers) {
		this.vro_forestry_farmers = vro_forestry_farmers;
	}
	public BigInteger getEkyc_forestry_farmers() {
		return ekyc_forestry_farmers;
	}
	public void setEkyc_forestry_farmers(BigInteger ekyc_forestry_farmers) {
		this.ekyc_forestry_farmers = ekyc_forestry_farmers;
	}
	public BigDecimal getVaa_forestry_ext() {
		return vaa_forestry_ext;
	}
	public void setVaa_forestry_ext(BigDecimal vaa_forestry_ext) {
		this.vaa_forestry_ext = vaa_forestry_ext;
	}
	public BigDecimal getVro_forestry_ext() {
		return vro_forestry_ext;
	}
	public void setVro_forestry_ext(BigDecimal vro_forestry_ext) {
		this.vro_forestry_ext = vro_forestry_ext;
	}
	public BigDecimal getEkyc_forestry_ext() {
		return ekyc_forestry_ext;
	}
	public void setEkyc_forestry_ext(BigDecimal ekyc_forestry_ext) {
		this.ekyc_forestry_ext = ekyc_forestry_ext;
	}
	public MandalwiseEKYCEntity(String mname, BigInteger farmername, BigInteger vaa_agri_farmers,
			BigInteger vro_agri_farmers, BigInteger ekyc_agri_farmers, BigDecimal vaa_agri_ext, BigDecimal vro_agri_ext,
			BigDecimal ekyc_agri_ext, BigInteger vaa_horti_farmers, BigInteger vro_horti_farmers,
			BigInteger ekyc_horti_farmers, BigDecimal vaa_horti_ext, BigDecimal vro_horti_ext,
			BigDecimal ekyc_horti_ext, BigInteger vaa_seri_farmers, BigInteger vro_seri_farmers,
			BigInteger ekyc_seri_farmers, BigDecimal vaa_seri_ext, BigDecimal vro_seri_ext, BigDecimal ekyc_seri_ext,
			BigInteger vaa_forestry_farmers, BigInteger vro_forestry_farmers, BigInteger ekyc_forestry_farmers,
			BigDecimal vaa_forestry_ext, BigDecimal vro_forestry_ext, BigDecimal ekyc_forestry_ext) {
		super();
		this.mname = mname;
		this.farmername = farmername;
		this.vaa_agri_farmers = vaa_agri_farmers;
		this.vro_agri_farmers = vro_agri_farmers;
		this.ekyc_agri_farmers = ekyc_agri_farmers;
		this.vaa_agri_ext = vaa_agri_ext;
		this.vro_agri_ext = vro_agri_ext;
		this.ekyc_agri_ext = ekyc_agri_ext;
		this.vaa_horti_farmers = vaa_horti_farmers;
		this.vro_horti_farmers = vro_horti_farmers;
		this.ekyc_horti_farmers = ekyc_horti_farmers;
		this.vaa_horti_ext = vaa_horti_ext;
		this.vro_horti_ext = vro_horti_ext;
		this.ekyc_horti_ext = ekyc_horti_ext;
		this.vaa_seri_farmers = vaa_seri_farmers;
		this.vro_seri_farmers = vro_seri_farmers;
		this.ekyc_seri_farmers = ekyc_seri_farmers;
		this.vaa_seri_ext = vaa_seri_ext;
		this.vro_seri_ext = vro_seri_ext;
		this.ekyc_seri_ext = ekyc_seri_ext;
		this.vaa_forestry_farmers = vaa_forestry_farmers;
		this.vro_forestry_farmers = vro_forestry_farmers;
		this.ekyc_forestry_farmers = ekyc_forestry_farmers;
		this.vaa_forestry_ext = vaa_forestry_ext;
		this.vro_forestry_ext = vro_forestry_ext;
		this.ekyc_forestry_ext = ekyc_forestry_ext;
	}
	public MandalwiseEKYCEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
