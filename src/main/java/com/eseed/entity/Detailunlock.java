package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Detailunlock {
@Id
@GeneratedValue( strategy = GenerationType.AUTO)
	private String bookingid;	
	private BigDecimal ext;
	private BigDecimal mao_ho_appr;
	private BigDecimal mao_appr_ext;
	private String unlock_reason;
	private String dt_unlock_ext;
	private String unlockedext;
	private String dt_mao_unlock_appr;
	private String mao_unlock_remarks;
	private String updateby;
	private String oc_name;
	private String cr_farmeruid;
	private String oc_fname;
	private String owner_tenant;
	private String kh_no;
	private String cr_sno;
	private String cropname;
	private String varietyname;
	private String cr_mix_unmix_ext;
	private String  cr_sow_type;
	private String cropnature;
	private String watersource;
	private String irrmethoddesc;
	private String  seed_production; 
	private String farmingtype;
	private String photo;
	private String wbemname;
	private String wbvname;
	private BigDecimal mobileno;
	private Integer age;
	 private Integer  approval;

	public Detailunlock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detailunlock(String bookingid, String oc_name, String cr_farmeruid, String oc_fname,
			String owner_tenant, String kh_no, String cr_sno, String cropname, String varietyname,
			String cr_mix_unmix_ext, String cr_sow_type, String cropnature, String watersource, String irrmethoddesc,
			String seed_production, String farmingtype, String photo) {
		super();
		this.bookingid = bookingid;
		this.oc_name = oc_name;
		this.cr_farmeruid = cr_farmeruid;
		this.oc_fname = oc_fname;
		this.owner_tenant = owner_tenant;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		this.cr_sow_type = cr_sow_type;
		this.cropnature = cropnature;
		this.watersource = watersource;
		this.irrmethoddesc = irrmethoddesc;
		this.seed_production = seed_production;
		this.farmingtype = farmingtype;
		this.photo = photo;
	}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public String getOc_name() {
		return oc_name;
	}
	public void setOc_name(String oc_name) {
		this.oc_name = oc_name;
	}
	public String getCr_farmeruid() {
		return cr_farmeruid;
	}
	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}
	public String getOc_fname() {
		return oc_fname;
	}
	public void setOc_fname(String oc_fname) {
		this.oc_fname = oc_fname;
	}
	public String getOwner_tenant() {
		return owner_tenant;
	}
	public void setOwner_tenant(String owner_tenant) {
		this.owner_tenant = owner_tenant;
	}
	public String getKh_no() {
		return kh_no;
	}
	public void setKh_no(String kh_no) {
		this.kh_no = kh_no;
	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	public String getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}
	public void setCr_mix_unmix_ext(String cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
	}
	public String getCr_sow_type() {
		return cr_sow_type;
	}
	public void setCr_sow_type(String cr_sow_type) {
		this.cr_sow_type = cr_sow_type;
	}
	public String getCropnature() {
		return cropnature;
	}
	public void setCropnature(String cropnature) {
		this.cropnature = cropnature;
	}
	public String getWatersource() {
		return watersource;
	}
	public void setWatersource(String watersource) {
		this.watersource = watersource;
	}
	public String getIrrmethoddesc() {
		return irrmethoddesc;
	}
	public void setIrrmethoddesc(String irrmethoddesc) {
		this.irrmethoddesc = irrmethoddesc;
	}
	public String getSeed_production() {
		return seed_production;
	}
	public void setSeed_production(String seed_production) {
		this.seed_production = seed_production;
	}
	public String getFarmingtype() {
		return farmingtype;
	}
	public void setFarmingtype(String farmingtype) {
		this.farmingtype = farmingtype;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getWbemname() {
		return wbemname;
	}
	public void setWbemname(String wbemname) {
		this.wbemname = wbemname;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	
	public BigDecimal getMobileno() {
		return mobileno;
	}
	public void setMobileno(BigDecimal mobileno) {
		this.mobileno = mobileno;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public BigDecimal getExt() {
		return ext;
	}
	public void setExt(BigDecimal ext) {
		this.ext = ext;
	}
	public BigDecimal getMao_ho_appr() {
		return mao_ho_appr;
	}
	public void setMao_ho_appr(BigDecimal mao_ho_appr) {
		this.mao_ho_appr = mao_ho_appr;
	}
	public BigDecimal getMao_appr_ext() {
		return mao_appr_ext;
	}
	public void setMao_appr_ext(BigDecimal mao_appr_ext) {
		this.mao_appr_ext = mao_appr_ext;
	}
	public String getUnlock_reason() {
		return unlock_reason;
	}
	public void setUnlock_reason(String unlock_reason) {
		this.unlock_reason = unlock_reason;
	}
	public String getDt_unlock_ext() {
		return dt_unlock_ext;
	}
	public void setDt_unlock_ext(String dt_unlock_ext) {
		this.dt_unlock_ext = dt_unlock_ext;
	}
	public String getUnlockedext() {
		return unlockedext;
	}
	public void setUnlockedext(String unlockedext) {
		this.unlockedext = unlockedext;
	}
	public String getDt_mao_unlock_appr() {
		return dt_mao_unlock_appr;
	}
	public void setDt_mao_unlock_appr(String dt_mao_unlock_appr) {
		this.dt_mao_unlock_appr = dt_mao_unlock_appr;
	}
	public String getMao_unlock_remarks() {
		return mao_unlock_remarks;
	}
	public void setMao_unlock_remarks(String mao_unlock_remarks) {
		this.mao_unlock_remarks = mao_unlock_remarks;
	}
	public String getUpdateby() {
		return updateby;
	}
	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}
	public Integer getApproval() {
		return approval;
	}
	public void setApproval(Integer approval) {
		this.approval = approval;
	}
	
	
}
