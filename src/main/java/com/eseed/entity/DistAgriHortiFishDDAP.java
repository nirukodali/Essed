package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DistAgriHortiFishDDAP {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private String tmandals;
	private String tvillages;
	private String dagri_mandals;
	private String dagri_villages;
	private String dagrinormalarea;
	private String dagri_farmers;
	private String dagri_ext;
	private String dhorti_mandals;
	private String dhorti_villages;
	private String dhortinormalarea;
	private String dhorti_farmers;
	private String dhorti_ext;
	private String dfish_mandals;
	private String dfish_villages;
	private String dfish_farmers;
	private String dfish_ext;
	private String dseri_mandals;
	private String dseri_villages;
	private String dseri_farmers;
	private String dseri_ext;
	private String dsnormalarea;
	private String dfisheriesnormalarea;
	private String dfnormalarea;
	private String dsoc_farmers;
	private String dsoc_ext;
	private String dsoc_villages;
	private String dsoc_mandals;
	private String dsocnormalarea;
	
	
	public DistAgriHortiFishDDAP() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DistAgriHortiFishDDAP(String wbdname, String tmandals, String tvillages, String dagri_mandals,
			String dagri_villages, String dagrinormalarea, String dagri_farmers, String dagri_ext,
			String dhorti_mandals, String dhorti_villages, String dhortinormalarea, String dhorti_farmers,
			String dhorti_ext, String dfish_mandals, String dfish_villages, String dfish_farmers, String dfish_ext,
			String dseri_mandals, String dseri_villages, String dseri_farmers, String dseri_ext, String dsnormalarea,
			String dfisheriesnormalarea, String dfnormalarea, String dsoc_farmers, String dsoc_ext,
			String dsoc_villages, String dsoc_mandals, String dsocnormalarea) {
		super();
		this.wbdname = wbdname;
		this.tmandals = tmandals;
		this.tvillages = tvillages;
		this.dagri_mandals = dagri_mandals;
		this.dagri_villages = dagri_villages;
		this.dagrinormalarea = dagrinormalarea;
		this.dagri_farmers = dagri_farmers;
		this.dagri_ext = dagri_ext;
		this.dhorti_mandals = dhorti_mandals;
		this.dhorti_villages = dhorti_villages;
		this.dhortinormalarea = dhortinormalarea;
		this.dhorti_farmers = dhorti_farmers;
		this.dhorti_ext = dhorti_ext;
		this.dfish_mandals = dfish_mandals;
		this.dfish_villages = dfish_villages;
		this.dfish_farmers = dfish_farmers;
		this.dfish_ext = dfish_ext;
		this.dseri_mandals = dseri_mandals;
		this.dseri_villages = dseri_villages;
		this.dseri_farmers = dseri_farmers;
		this.dseri_ext = dseri_ext;
		this.dsnormalarea = dsnormalarea;
		this.dfisheriesnormalarea = dfisheriesnormalarea;
		this.dfnormalarea = dfnormalarea;
		this.dsoc_farmers = dsoc_farmers;
		this.dsoc_ext = dsoc_ext;
		this.dsoc_villages = dsoc_villages;
		this.dsoc_mandals = dsoc_mandals;
		this.dsocnormalarea = dsocnormalarea;
	}


	public String getWbdname() {
		return wbdname;
	}


	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}


	public String getTmandals() {
		return tmandals;
	}


	public void setTmandals(String tmandals) {
		this.tmandals = tmandals;
	}


	public String getTvillages() {
		return tvillages;
	}


	public void setTvillages(String tvillages) {
		this.tvillages = tvillages;
	}


	public String getDagri_mandals() {
		return dagri_mandals;
	}


	public void setDagri_mandals(String dagri_mandals) {
		this.dagri_mandals = dagri_mandals;
	}


	public String getDagri_villages() {
		return dagri_villages;
	}


	public void setDagri_villages(String dagri_villages) {
		this.dagri_villages = dagri_villages;
	}


	public String getDagrinormalarea() {
		return dagrinormalarea;
	}


	public void setDagrinormalarea(String dagrinormalarea) {
		this.dagrinormalarea = dagrinormalarea;
	}


	public String getDagri_farmers() {
		return dagri_farmers;
	}


	public void setDagri_farmers(String dagri_farmers) {
		this.dagri_farmers = dagri_farmers;
	}


	public String getDagri_ext() {
		return dagri_ext;
	}


	public void setDagri_ext(String dagri_ext) {
		this.dagri_ext = dagri_ext;
	}


	public String getDhorti_mandals() {
		return dhorti_mandals;
	}


	public void setDhorti_mandals(String dhorti_mandals) {
		this.dhorti_mandals = dhorti_mandals;
	}


	public String getDhorti_villages() {
		return dhorti_villages;
	}


	public void setDhorti_villages(String dhorti_villages) {
		this.dhorti_villages = dhorti_villages;
	}


	public String getDhortinormalarea() {
		return dhortinormalarea;
	}


	public void setDhortinormalarea(String dhortinormalarea) {
		this.dhortinormalarea = dhortinormalarea;
	}


	public String getDhorti_farmers() {
		return dhorti_farmers;
	}


	public void setDhorti_farmers(String dhorti_farmers) {
		this.dhorti_farmers = dhorti_farmers;
	}


	public String getDhorti_ext() {
		return dhorti_ext;
	}


	public void setDhorti_ext(String dhorti_ext) {
		this.dhorti_ext = dhorti_ext;
	}


	public String getDfish_mandals() {
		return dfish_mandals;
	}


	public void setDfish_mandals(String dfish_mandals) {
		this.dfish_mandals = dfish_mandals;
	}


	public String getDfish_villages() {
		return dfish_villages;
	}


	public void setDfish_villages(String dfish_villages) {
		this.dfish_villages = dfish_villages;
	}


	public String getDfish_farmers() {
		return dfish_farmers;
	}


	public void setDfish_farmers(String dfish_farmers) {
		this.dfish_farmers = dfish_farmers;
	}


	public String getDfish_ext() {
		return dfish_ext;
	}


	public void setDfish_ext(String dfish_ext) {
		this.dfish_ext = dfish_ext;
	}


	public String getDseri_mandals() {
		return dseri_mandals;
	}


	public void setDseri_mandals(String dseri_mandals) {
		this.dseri_mandals = dseri_mandals;
	}


	public String getDseri_villages() {
		return dseri_villages;
	}


	public void setDseri_villages(String dseri_villages) {
		this.dseri_villages = dseri_villages;
	}


	public String getDseri_farmers() {
		return dseri_farmers;
	}


	public void setDseri_farmers(String dseri_farmers) {
		this.dseri_farmers = dseri_farmers;
	}


	public String getDseri_ext() {
		return dseri_ext;
	}


	public void setDseri_ext(String dseri_ext) {
		this.dseri_ext = dseri_ext;
	}


	public String getDsnormalarea() {
		return dsnormalarea;
	}


	public void setDsnormalarea(String dsnormalarea) {
		this.dsnormalarea = dsnormalarea;
	}


	public String getDfisheriesnormalarea() {
		return dfisheriesnormalarea;
	}


	public void setDfisheriesnormalarea(String dfisheriesnormalarea) {
		this.dfisheriesnormalarea = dfisheriesnormalarea;
	}


	public String getDfnormalarea() {
		return dfnormalarea;
	}


	public void setDfnormalarea(String dfnormalarea) {
		this.dfnormalarea = dfnormalarea;
	}


	public String getDsoc_farmers() {
		return dsoc_farmers;
	}


	public void setDsoc_farmers(String dsoc_farmers) {
		this.dsoc_farmers = dsoc_farmers;
	}


	public String getDsoc_ext() {
		return dsoc_ext;
	}


	public void setDsoc_ext(String dsoc_ext) {
		this.dsoc_ext = dsoc_ext;
	}


	public String getDsoc_villages() {
		return dsoc_villages;
	}


	public void setDsoc_villages(String dsoc_villages) {
		this.dsoc_villages = dsoc_villages;
	}


	public String getDsoc_mandals() {
		return dsoc_mandals;
	}


	public void setDsoc_mandals(String dsoc_mandals) {
		this.dsoc_mandals = dsoc_mandals;
	}


	public String getDsocnormalarea() {
		return dsocnormalarea;
	}


	public void setDsocnormalarea(String dsocnormalarea) {
		this.dsocnormalarea = dsocnormalarea;
	}


	@Override
	public String toString() {
		return "DistAgriHortiFishDDAP [wbdname=" + wbdname + ", tmandals=" + tmandals + ", tvillages=" + tvillages
				+ ", dagri_mandals=" + dagri_mandals + ", dagri_villages=" + dagri_villages + ", dagrinormalarea="
				+ dagrinormalarea + ", dagri_farmers=" + dagri_farmers + ", dagri_ext=" + dagri_ext
				+ ", dhorti_mandals=" + dhorti_mandals + ", dhorti_villages=" + dhorti_villages + ", dhortinormalarea="
				+ dhortinormalarea + ", dhorti_farmers=" + dhorti_farmers + ", dhorti_ext=" + dhorti_ext
				+ ", dfish_mandals=" + dfish_mandals + ", dfish_villages=" + dfish_villages + ", dfish_farmers="
				+ dfish_farmers + ", dfish_ext=" + dfish_ext + ", dseri_mandals=" + dseri_mandals + ", dseri_villages="
				+ dseri_villages + ", dseri_farmers=" + dseri_farmers + ", dseri_ext=" + dseri_ext + ", dsnormalarea="
				+ dsnormalarea + ", dfisheriesnormalarea=" + dfisheriesnormalarea + ", dfnormalarea=" + dfnormalarea
				+ ", dsoc_farmers=" + dsoc_farmers + ", dsoc_ext=" + dsoc_ext + ", dsoc_villages=" + dsoc_villages
				+ ", dsoc_mandals=" + dsoc_mandals + ", dsocnormalarea=" + dsocnormalarea + "]";
	}
	
	
}
