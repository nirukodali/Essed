package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DDAPCorrectionSocialAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private Long farmername;
	private Long crop;
	private Long variety;
	private Long extent;
	private Long src_irr;
	private Long cr_pattern;
	private Long sow_date;
	private Long farming_type;
	private Long vaadeleted;
	private Long tot_corrections;
	private Long totbookings;
	private Long maoapproved;
	private Long maorejected;
	private Long maoprocessed;
	private Long tahapproved;
	private Long tahrejected;
	private Long tahprocessed;
	
	
	public DDAPCorrectionSocialAudit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DDAPCorrectionSocialAudit(String dname, Long farmername, Long crop, Long variety, Long extent, Long src_irr,
			Long cr_pattern, Long sow_date, Long farming_type, Long vaadeleted, Long tot_corrections, Long totbookings,
			Long maoapproved, Long maorejected, Long maoprocessed, Long tahapproved, Long tahrejected,
			Long tahprocessed) {
		super();
		this.dname = dname;
		this.farmername = farmername;
		this.crop = crop;
		this.variety = variety;
		this.extent = extent;
		this.src_irr = src_irr;
		this.cr_pattern = cr_pattern;
		this.sow_date = sow_date;
		this.farming_type = farming_type;
		this.vaadeleted = vaadeleted;
		this.tot_corrections = tot_corrections;
		this.totbookings = totbookings;
		this.maoapproved = maoapproved;
		this.maorejected = maorejected;
		this.maoprocessed = maoprocessed;
		this.tahapproved = tahapproved;
		this.tahrejected = tahrejected;
		this.tahprocessed = tahprocessed;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Long getFarmername() {
		return farmername;
	}


	public void setFarmername(Long farmername) {
		this.farmername = farmername;
	}


	public Long getCrop() {
		return crop;
	}


	public void setCrop(Long crop) {
		this.crop = crop;
	}


	public Long getVariety() {
		return variety;
	}


	public void setVariety(Long variety) {
		this.variety = variety;
	}


	public Long getExtent() {
		return extent;
	}


	public void setExtent(Long extent) {
		this.extent = extent;
	}


	public Long getSrc_irr() {
		return src_irr;
	}


	public void setSrc_irr(Long src_irr) {
		this.src_irr = src_irr;
	}


	public Long getCr_pattern() {
		return cr_pattern;
	}


	public void setCr_pattern(Long cr_pattern) {
		this.cr_pattern = cr_pattern;
	}


	public Long getSow_date() {
		return sow_date;
	}


	public void setSow_date(Long sow_date) {
		this.sow_date = sow_date;
	}


	public Long getFarming_type() {
		return farming_type;
	}


	public void setFarming_type(Long farming_type) {
		this.farming_type = farming_type;
	}


	public Long getVaadeleted() {
		return vaadeleted;
	}


	public void setVaadeleted(Long vaadeleted) {
		this.vaadeleted = vaadeleted;
	}


	public Long getTot_corrections() {
		return tot_corrections;
	}


	public void setTot_corrections(Long tot_corrections) {
		this.tot_corrections = tot_corrections;
	}


	public Long getTotbookings() {
		return totbookings;
	}


	public void setTotbookings(Long totbookings) {
		this.totbookings = totbookings;
	}


	public Long getMaoapproved() {
		return maoapproved;
	}


	public void setMaoapproved(Long maoapproved) {
		this.maoapproved = maoapproved;
	}


	public Long getMaorejected() {
		return maorejected;
	}


	public void setMaorejected(Long maorejected) {
		this.maorejected = maorejected;
	}


	public Long getMaoprocessed() {
		return maoprocessed;
	}


	public void setMaoprocessed(Long maoprocessed) {
		this.maoprocessed = maoprocessed;
	}


	public Long getTahapproved() {
		return tahapproved;
	}


	public void setTahapproved(Long tahapproved) {
		this.tahapproved = tahapproved;
	}


	public Long getTahrejected() {
		return tahrejected;
	}


	public void setTahrejected(Long tahrejected) {
		this.tahrejected = tahrejected;
	}


	public Long getTahprocessed() {
		return tahprocessed;
	}


	public void setTahprocessed(Long tahprocessed) {
		this.tahprocessed = tahprocessed;
	}


	@Override
	public String toString() {
		return "DDAPCorrectionSuperCHK [dname=" + dname + ", farmername=" + farmername + ", crop=" + crop + ", variety="
				+ variety + ", extent=" + extent + ", src_irr=" + src_irr + ", cr_pattern=" + cr_pattern + ", sow_date="
				+ sow_date + ", farming_type=" + farming_type + ", vaadeleted=" + vaadeleted + ", tot_corrections="
				+ tot_corrections + ", totbookings=" + totbookings + ", maoapproved=" + maoapproved + ", maorejected="
				+ maorejected + ", maoprocessed=" + maoprocessed + ", tahapproved=" + tahapproved + ", tahrejected="
				+ tahrejected + ", tahprocessed=" + tahprocessed + "]";
	}
	
	

}
