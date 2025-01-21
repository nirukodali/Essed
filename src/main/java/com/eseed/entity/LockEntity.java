package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class LockEntity {
	
	private String cr_no;
	private String cultdesc_loclang;
	private String cultdesc;
	private String ftype_short;
	private int variety;
	private String varietyname;
	private String occupname;
	private String occupfname;
	private Date cr_sow_date;
	private String cr_farmeruid;
	private BigDecimal cr_dist_code;
	private BigDecimal cr_mand_code;
	private int cr_vcode;
	private String wbdname;
	private String wbmname;
	private String wbvname;
	private BigDecimal kh_no;
	private int bookingid;
	private Character vaaauth;
	private Character vroauth;
	private Character ekyc;
	private String naturedesc;
	private String uid;
//	private Date harvest_date;
//	private String updatedby;
	private String cr_sno;
	private BigDecimal cr_mix_unmix_ext;
	private int cr_crop;
	private Character cropins;
	private String cropname;
	private String wsrcdesc;
	private String ins_scheme;
	private String cropduration;
	private BigDecimal smsmobileno;
	//private int unlock_reason;
	private BigDecimal unlockedext;
	private BigDecimal lockedext;
	private int crop_duration_days;
	private int releasedays;
	
	public String getCr_no() {
		return cr_no;
	}
	public void setCr_no(String cr_no) {
		this.cr_no = cr_no;
	}
	public String getCultdesc_loclang() {
		return cultdesc_loclang;
	}
	public void setCultdesc_loclang(String cultdesc_loclang) {
		this.cultdesc_loclang = cultdesc_loclang;
	}
	public String getCultdesc() {
		return cultdesc;
	}
	public void setCultdesc(String cultdesc) {
		this.cultdesc = cultdesc;
	}
	public String getFtype_short() {
		return ftype_short;
	}
	public void setFtype_short(String ftype_short) {
		this.ftype_short = ftype_short;
	}
	public int getVariety() {
		return variety;
	}
	public void setVariety(int variety) {
		this.variety = variety;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	public String getOccupname() {
		return occupname;
	}
	public void setOccupname(String occupname) {
		this.occupname = occupname;
	}
	public String getOccupfname() {
		return occupfname;
	}
	public void setOccupfname(String occupfname) {
		this.occupfname = occupfname;
	}
	public Date getCr_sow_date() {
		return cr_sow_date;
	}
	public void setCr_sow_date(Date cr_sow_date) {
		this.cr_sow_date = cr_sow_date;
	}
	public String getWbdname() {
		return wbdname;
	}
	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}
	public String getWbmname() {
		return wbmname;
	}
	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public BigDecimal getKh_no() {
		return kh_no;
	}
	public void setKh_no(BigDecimal kh_no) {
		this.kh_no = kh_no;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public Character getVaaauth() {
		return vaaauth;
	}
	public void setVaaauth(Character vaaauth) {
		this.vaaauth = vaaauth;
	}
	public Character getVroauth() {
		return vroauth;
	}
	public void setVroauth(Character vroauth) {
		this.vroauth = vroauth;
	}
	public Character getEkyc() {
		return ekyc;
	}
	public void setEkyc(Character ekyc) {
		this.ekyc = ekyc;
	}
	public String getNaturedesc() {
		return naturedesc;
	}
	public void setNaturedesc(String naturedesc) {
		this.naturedesc = naturedesc;
	}
	public String getCr_farmeruid() {
		return cr_farmeruid;
	}
	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}
//	public Date getHarvest_date() {
//		return harvest_date;
//	}
//	public void setHarvest_date(Date harvest_date) {
//		this.harvest_date = harvest_date;
//	}
//	public String getUpdatedby() {
//		return updatedby;
//	}
//	public void setUpdatedby(String updatedby) {
//		this.updatedby = updatedby;
//	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public BigDecimal getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}
	public void setCr_mix_unmix_ext(BigDecimal cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
	}
	public int getCr_crop() {
		return cr_crop;
	}
	public void setCr_crop(int cr_crop) {
		this.cr_crop = cr_crop;
	}
	public Character getCropins() {
		return cropins;
	}
	public void setCropins(Character cropins) {
		this.cropins = cropins;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getWsrcdesc() {
		return wsrcdesc;
	}
	public void setWsrcdesc(String wsrcdesc) {
		this.wsrcdesc = wsrcdesc;
	}
	public String getIns_scheme() {
		return ins_scheme;
	}
	public void setIns_scheme(String ins_scheme) {
		this.ins_scheme = ins_scheme;
	}
	public BigDecimal getSmsmobileno() {
		return smsmobileno;
	}
	public void setSmsmobileno(BigDecimal smsmobileno) {
		this.smsmobileno = smsmobileno;
	}
//	public int getUnlock_reason() {
//		return unlock_reason;
//	}
//	public void setUnlock_reason(int unlock_reason) {
//		this.unlock_reason = unlock_reason;
//	}
	public BigDecimal getUnlockedext() {
		return unlockedext;
	}
	public void setUnlockedext(BigDecimal unlockedext) {
		this.unlockedext = unlockedext;
	}
	public BigDecimal getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(BigDecimal cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	public BigDecimal getCr_mand_code() {
		return cr_mand_code;
	}
	public void setCr_mand_code(BigDecimal cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}
	public int getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(int cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCropduration() {
		return cropduration;
	}
	public void setCropduration(String cropduration) {
		this.cropduration = cropduration;
	}
	public BigDecimal getLockedext() {
		return lockedext;
	}
	public void setLockedext(BigDecimal lockedext) {
		this.lockedext = lockedext;
	}
	public int getCrop_duration_days() {
		return crop_duration_days;
	}
	public void setCrop_duration_days(int crop_duration_days) {
		this.crop_duration_days = crop_duration_days;
	}
	public int getReleasedays() {
		return releasedays;
	}
	public void setReleasedays(int releasedays) {
		this.releasedays = releasedays;
	}
	
	

}
