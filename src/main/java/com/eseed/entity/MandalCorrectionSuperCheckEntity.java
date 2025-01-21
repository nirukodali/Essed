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
public class MandalCorrectionSuperCheckEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dist_code;
	private Integer mand_code;
	private String wbmname;
	private BigDecimal totsupchecks;
	private BigInteger farmername;
	private BigInteger crop;
	private BigInteger variety;
	private BigInteger extent;
	private BigInteger cropseq;
	private BigInteger src_irr;
	private BigInteger cr_pattern;
	private BigInteger sow_date;
	private BigInteger farming_type;
	private BigInteger directly_forwarded;
	private BigInteger totbookings;
	private BigInteger maoapproved;
	private BigInteger maorejected;
	private BigInteger maoprocessed;
	private BigInteger tahrejected;
	private BigInteger tahapproved;
	private BigInteger tahprocessed;
	private BigInteger deletedCount;
	private BigInteger tot_corrections;
	@Override
	public String toString() {
		return "MandalCorrectionSuperCheckEntity [dist_code=" + dist_code + ", mand_code=" + mand_code + ", wbmname="
				+ wbmname + ", totsupchecks=" + totsupchecks + ", farmername=" + farmername + ", crop=" + crop
				+ ", variety=" + variety + ", extent=" + extent + ", cropseq=" + cropseq + ", src_irr=" + src_irr
				+ ", cr_pattern=" + cr_pattern + ", sow_date=" + sow_date + ", farming_type=" + farming_type
				+ ", directly_forwarded=" + directly_forwarded + ", totbookings=" + totbookings + ", maoapproved="
				+ maoapproved + ", maorejected=" + maorejected + ", maoprocessed=" + maoprocessed + ", tahrejected="
				+ tahrejected + ", tahapproved=" + tahapproved + ", tahprocessed=" + tahprocessed + ", deletedCount="
				+ deletedCount + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public MandalCorrectionSuperCheckEntity(Integer dist_code, Integer mand_code, String wbmname,
			BigDecimal totsupchecks, BigInteger farmername, BigInteger crop, BigInteger variety, BigInteger extent,
			BigInteger cropseq, BigInteger src_irr, BigInteger cr_pattern, BigInteger sow_date, BigInteger farming_type,
			BigInteger directly_forwarded, BigInteger totbookings, BigInteger maoapproved, BigInteger maorejected,
			BigInteger maoprocessed, BigInteger tahrejected, BigInteger tahapproved, BigInteger tahprocessed,
			BigInteger deletedCount) {
		super();
		this.dist_code = dist_code;
		this.mand_code = mand_code;
		this.wbmname = wbmname;
		this.totsupchecks = totsupchecks;
		this.farmername = farmername;
		this.crop = crop;
		this.variety = variety;
		this.extent = extent;
		this.cropseq = cropseq;
		this.src_irr = src_irr;
		this.cr_pattern = cr_pattern;
		this.sow_date = sow_date;
		this.farming_type = farming_type;
		this.directly_forwarded = directly_forwarded;
		this.totbookings = totbookings;
		this.maoapproved = maoapproved;
		this.maorejected = maorejected;
		this.maoprocessed = maoprocessed;
		this.tahrejected = tahrejected;
		this.tahapproved = tahapproved;
		this.tahprocessed = tahprocessed;
		this.deletedCount = deletedCount;
	}
	public MandalCorrectionSuperCheckEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getDist_code() {
		return dist_code;
	}
	public void setDist_code(Integer dist_code) {
		this.dist_code = dist_code;
	}
	public Integer getMand_code() {
		return mand_code;
	}
	public void setMand_code(Integer mand_code) {
		this.mand_code = mand_code;
	}
	public String getWbmname() {
		return wbmname;
	}
	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}
	public BigDecimal getTotsupchecks() {
		return totsupchecks;
	}
	public void setTotsupchecks(BigDecimal totsupchecks) {
		this.totsupchecks = totsupchecks;
	}
	public BigInteger getFarmername() {
		return farmername;
	}
	public void setFarmername(BigInteger farmername) {
		this.farmername = farmername;
	}
	public BigInteger getCrop() {
		return crop;
	}
	public void setCrop(BigInteger crop) {
		this.crop = crop;
	}
	public BigInteger getVariety() {
		return variety;
	}
	public void setVariety(BigInteger variety) {
		this.variety = variety;
	}
	public BigInteger getExtent() {
		return extent;
	}
	public void setExtent(BigInteger extent) {
		this.extent = extent;
	}
	public BigInteger getCropseq() {
		return cropseq;
	}
	public void setCropseq(BigInteger cropseq) {
		this.cropseq = cropseq;
	}
	public BigInteger getSrc_irr() {
		return src_irr;
	}
	public void setSrc_irr(BigInteger src_irr) {
		this.src_irr = src_irr;
	}
	public BigInteger getCr_pattern() {
		return cr_pattern;
	}
	public void setCr_pattern(BigInteger cr_pattern) {
		this.cr_pattern = cr_pattern;
	}
	public BigInteger getSow_date() {
		return sow_date;
	}
	public void setSow_date(BigInteger sow_date) {
		this.sow_date = sow_date;
	}
	public BigInteger getFarming_type() {
		return farming_type;
	}
	public void setFarming_type(BigInteger farming_type) {
		this.farming_type = farming_type;
	}
	public BigInteger getDirectly_forwarded() {
		return directly_forwarded;
	}
	public void setDirectly_forwarded(BigInteger directly_forwarded) {
		this.directly_forwarded = directly_forwarded;
	}
	public BigInteger getTotbookings() {
		return totbookings;
	}
	public void setTotbookings(BigInteger totbookings) {
		this.totbookings = totbookings;
	}
	public BigInteger getMaoapproved() {
		return maoapproved;
	}
	public void setMaoapproved(BigInteger maoapproved) {
		this.maoapproved = maoapproved;
	}
	public BigInteger getMaorejected() {
		return maorejected;
	}
	public void setMaorejected(BigInteger maorejected) {
		this.maorejected = maorejected;
	}
	public BigInteger getMaoprocessed() {
		return maoprocessed;
	}
	public void setMaoprocessed(BigInteger maoprocessed) {
		this.maoprocessed = maoprocessed;
	}
	public BigInteger getTahrejected() {
		return tahrejected;
	}
	public void setTahrejected(BigInteger tahrejected) {
		this.tahrejected = tahrejected;
	}
	public BigInteger getTahapproved() {
		return tahapproved;
	}
	public void setTahapproved(BigInteger tahapproved) {
		this.tahapproved = tahapproved;
	}
	public BigInteger getTahprocessed() {
		return tahprocessed;
	}
	public void setTahprocessed(BigInteger tahprocessed) {
		this.tahprocessed = tahprocessed;
	}
	public BigInteger getDeletedCount() {
		return deletedCount;
	}
	public void setDeletedCount(BigInteger deletedCount) {
		this.deletedCount = deletedCount;
	}
	public BigInteger getTot_corrections() {
		return tot_corrections;
	}
	public void setTot_corrections(BigInteger tot_corrections) {
		this.tot_corrections = tot_corrections;
	}

	
	
}
