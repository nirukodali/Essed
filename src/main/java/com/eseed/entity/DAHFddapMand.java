package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DAHFddapMand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbmname;
	private Long tvillages;
	private Long magri_villages;
	private Number magri_ext;
	private Long magri_farmers;
	private Long mhorti_villages;
	private Number mhorti_ext;
	private Long mhorti_farmers;
	private Long mseri_villages;
	private Number mseri_ext;
	private Long mseri_farmers;
	private Long msoc_villages;
	private Number msoc_ext;
	private Long msoc_farmers;
	private Number distcode;
	private Integer wbmcode;
	
	
	public DAHFddapMand() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DAHFddapMand(String wbmname, Long tvillages, Long magri_villages, Number magri_ext, Long magri_farmers,
			Long mhorti_villages, Number mhorti_ext, Long mhorti_farmers, Long mseri_villages, Number mseri_ext,
			Long mseri_farmers, Long msoc_villages, Number msoc_ext, Long msoc_farmers, Number distcode,
			Integer wbmcode) {
		super();
		this.wbmname = wbmname;
		this.tvillages = tvillages;
		this.magri_villages = magri_villages;
		this.magri_ext = magri_ext;
		this.magri_farmers = magri_farmers;
		this.mhorti_villages = mhorti_villages;
		this.mhorti_ext = mhorti_ext;
		this.mhorti_farmers = mhorti_farmers;
		this.mseri_villages = mseri_villages;
		this.mseri_ext = mseri_ext;
		this.mseri_farmers = mseri_farmers;
		this.msoc_villages = msoc_villages;
		this.msoc_ext = msoc_ext;
		this.msoc_farmers = msoc_farmers;
		this.distcode = distcode;
		this.wbmcode = wbmcode;
	}


	public String getWbmname() {
		return wbmname;
	}


	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}


	public Long getTvillages() {
		return tvillages;
	}


	public void setTvillages(Long tvillages) {
		this.tvillages = tvillages;
	}


	public Long getMagri_villages() {
		return magri_villages;
	}


	public void setMagri_villages(Long magri_villages) {
		this.magri_villages = magri_villages;
	}


	public Number getMagri_ext() {
		return magri_ext;
	}


	public void setMagri_ext(Number magri_ext) {
		this.magri_ext = magri_ext;
	}


	public Long getMagri_farmers() {
		return magri_farmers;
	}


	public void setMagri_farmers(Long magri_farmers) {
		this.magri_farmers = magri_farmers;
	}


	public Long getMhorti_villages() {
		return mhorti_villages;
	}


	public void setMhorti_villages(Long mhorti_villages) {
		this.mhorti_villages = mhorti_villages;
	}


	public Number getMhorti_ext() {
		return mhorti_ext;
	}


	public void setMhorti_ext(Number mhorti_ext) {
		this.mhorti_ext = mhorti_ext;
	}


	public Long getMhorti_farmers() {
		return mhorti_farmers;
	}


	public void setMhorti_farmers(Long mhorti_farmers) {
		this.mhorti_farmers = mhorti_farmers;
	}


	public Long getMseri_villages() {
		return mseri_villages;
	}


	public void setMseri_villages(Long mseri_villages) {
		this.mseri_villages = mseri_villages;
	}


	public Number getMseri_ext() {
		return mseri_ext;
	}


	public void setMseri_ext(Number mseri_ext) {
		this.mseri_ext = mseri_ext;
	}


	public Long getMseri_farmers() {
		return mseri_farmers;
	}


	public void setMseri_farmers(Long mseri_farmers) {
		this.mseri_farmers = mseri_farmers;
	}


	public Long getMsoc_villages() {
		return msoc_villages;
	}


	public void setMsoc_villages(Long msoc_villages) {
		this.msoc_villages = msoc_villages;
	}


	public Number getMsoc_ext() {
		return msoc_ext;
	}


	public void setMsoc_ext(Number msoc_ext) {
		this.msoc_ext = msoc_ext;
	}


	public Long getMsoc_farmers() {
		return msoc_farmers;
	}


	public void setMsoc_farmers(Long msoc_farmers) {
		this.msoc_farmers = msoc_farmers;
	}


	public Number getDistcode() {
		return distcode;
	}


	public void setDistcode(Number distcode) {
		this.distcode = distcode;
	}


	public Integer getWbmcode() {
		return wbmcode;
	}


	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}


	@Override
	public String toString() {
		return "DAHFddapMand [wbmname=" + wbmname + ", tvillages=" + tvillages + ", magri_villages=" + magri_villages
				+ ", magri_ext=" + magri_ext + ", magri_farmers=" + magri_farmers + ", mhorti_villages="
				+ mhorti_villages + ", mhorti_ext=" + mhorti_ext + ", mhorti_farmers=" + mhorti_farmers
				+ ", mseri_villages=" + mseri_villages + ", mseri_ext=" + mseri_ext + ", mseri_farmers=" + mseri_farmers
				+ ", msoc_villages=" + msoc_villages + ", msoc_ext=" + msoc_ext + ", msoc_farmers=" + msoc_farmers
				+ ", distcode=" + distcode + ", wbmcode=" + wbmcode + "]";
	}
}
