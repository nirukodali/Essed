package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DAHFddap {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private Long tmandals;
	private Long tvillages;
	private Long dagri_mandals;
	private Long dagri_villages;
//	private String dagrinormalarea;
	private Number dagri_ext;
	private Long dagri_farmers;
	private Long dhorti_mandals;
	private Long dhorti_villages;
	private Number dhorti_ext;
	private Long dhorti_farmers;
//	private String dhortinormalarea;
//	private String dfish_mandals;
//	private String dfish_villages;
//	private String dfish_farmers;
//	private String dfish_ext;
	private Long dseri_mandals;
	private Long dseri_villages;
	private Number dseri_ext;
	private Long dseri_farmers;
//	private String dsnormalarea;
//	private String dfisheriesnormalarea;
//	private String dfnormalarea;
	private Long dsoc_mandals;
	private Long dsoc_villages;
	private Number dsoc_ext;
	private Long dsoc_farmers;
//	private String dsocnormalarea;
	private Number distcode;
	
	
	public DAHFddap() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DAHFddap(String wbdname, Long tmandals, Long tvillages, Long dagri_mandals, Long dagri_villages,
			Number dagri_ext, Long dagri_farmers, Long dhorti_mandals, Long dhorti_villages, Number dhorti_ext,
			Long dhorti_farmers, Long dseri_mandals, Long dseri_villages, Number dseri_ext, Long dseri_farmers,
			Long dsoc_mandals, Long dsoc_villages, Number dsoc_ext, Long dsoc_farmers, Number distcode) {
		super();
		this.wbdname = wbdname;
		this.tmandals = tmandals;
		this.tvillages = tvillages;
		this.dagri_mandals = dagri_mandals;
		this.dagri_villages = dagri_villages;
		this.dagri_ext = dagri_ext;
		this.dagri_farmers = dagri_farmers;
		this.dhorti_mandals = dhorti_mandals;
		this.dhorti_villages = dhorti_villages;
		this.dhorti_ext = dhorti_ext;
		this.dhorti_farmers = dhorti_farmers;
		this.dseri_mandals = dseri_mandals;
		this.dseri_villages = dseri_villages;
		this.dseri_ext = dseri_ext;
		this.dseri_farmers = dseri_farmers;
		this.dsoc_mandals = dsoc_mandals;
		this.dsoc_villages = dsoc_villages;
		this.dsoc_ext = dsoc_ext;
		this.dsoc_farmers = dsoc_farmers;
		this.distcode = distcode;
	}


	public String getWbdname() {
		return wbdname;
	}


	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}


	public Long getTmandals() {
		return tmandals;
	}


	public void setTmandals(Long tmandals) {
		this.tmandals = tmandals;
	}


	public Long getTvillages() {
		return tvillages;
	}


	public void setTvillages(Long tvillages) {
		this.tvillages = tvillages;
	}


	public Long getDagri_mandals() {
		return dagri_mandals;
	}


	public void setDagri_mandals(Long dagri_mandals) {
		this.dagri_mandals = dagri_mandals;
	}


	public Long getDagri_villages() {
		return dagri_villages;
	}


	public void setDagri_villages(Long dagri_villages) {
		this.dagri_villages = dagri_villages;
	}


	public Number getDagri_ext() {
		return dagri_ext;
	}


	public void setDagri_ext(Number dagri_ext) {
		this.dagri_ext = dagri_ext;
	}


	public Long getDagri_farmers() {
		return dagri_farmers;
	}


	public void setDagri_farmers(Long dagri_farmers) {
		this.dagri_farmers = dagri_farmers;
	}


	public Long getDhorti_mandals() {
		return dhorti_mandals;
	}


	public void setDhorti_mandals(Long dhorti_mandals) {
		this.dhorti_mandals = dhorti_mandals;
	}


	public Long getDhorti_villages() {
		return dhorti_villages;
	}


	public void setDhorti_villages(Long dhorti_villages) {
		this.dhorti_villages = dhorti_villages;
	}


	public Number getDhorti_ext() {
		return dhorti_ext;
	}


	public void setDhorti_ext(Number dhorti_ext) {
		this.dhorti_ext = dhorti_ext;
	}


	public Long getDhorti_farmers() {
		return dhorti_farmers;
	}


	public void setDhorti_farmers(Long dhorti_farmers) {
		this.dhorti_farmers = dhorti_farmers;
	}


	public Long getDseri_mandals() {
		return dseri_mandals;
	}


	public void setDseri_mandals(Long dseri_mandals) {
		this.dseri_mandals = dseri_mandals;
	}


	public Long getDseri_villages() {
		return dseri_villages;
	}


	public void setDseri_villages(Long dseri_villages) {
		this.dseri_villages = dseri_villages;
	}


	public Number getDseri_ext() {
		return dseri_ext;
	}


	public void setDseri_ext(Number dseri_ext) {
		this.dseri_ext = dseri_ext;
	}


	public Long getDseri_farmers() {
		return dseri_farmers;
	}


	public void setDseri_farmers(Long dseri_farmers) {
		this.dseri_farmers = dseri_farmers;
	}


	public Long getDsoc_mandals() {
		return dsoc_mandals;
	}


	public void setDsoc_mandals(Long dsoc_mandals) {
		this.dsoc_mandals = dsoc_mandals;
	}


	public Long getDsoc_villages() {
		return dsoc_villages;
	}


	public void setDsoc_villages(Long dsoc_villages) {
		this.dsoc_villages = dsoc_villages;
	}


	public Number getDsoc_ext() {
		return dsoc_ext;
	}


	public void setDsoc_ext(Number dsoc_ext) {
		this.dsoc_ext = dsoc_ext;
	}


	public Long getDsoc_farmers() {
		return dsoc_farmers;
	}


	public void setDsoc_farmers(Long dsoc_farmers) {
		this.dsoc_farmers = dsoc_farmers;
	}


	public Number getDistcode() {
		return distcode;
	}


	public void setDistcode(Number distcode) {
		this.distcode = distcode;
	}


	@Override
	public String toString() {
		return "DAHFddap [wbdname=" + wbdname + ", tmandals=" + tmandals + ", tvillages=" + tvillages
				+ ", dagri_mandals=" + dagri_mandals + ", dagri_villages=" + dagri_villages + ", dagri_ext=" + dagri_ext
				+ ", dagri_farmers=" + dagri_farmers + ", dhorti_mandals=" + dhorti_mandals + ", dhorti_villages="
				+ dhorti_villages + ", dhorti_ext=" + dhorti_ext + ", dhorti_farmers=" + dhorti_farmers
				+ ", dseri_mandals=" + dseri_mandals + ", dseri_villages=" + dseri_villages + ", dseri_ext=" + dseri_ext
				+ ", dseri_farmers=" + dseri_farmers + ", dsoc_mandals=" + dsoc_mandals + ", dsoc_villages="
				+ dsoc_villages + ", dsoc_ext=" + dsoc_ext + ", dsoc_farmers=" + dsoc_farmers + ", distcode=" + distcode
				+ "]";
	}
	
	
	
}
