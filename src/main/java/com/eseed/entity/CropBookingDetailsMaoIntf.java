package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CropBookingDetailsMaoIntf {
@Id
@GeneratedValue( strategy = GenerationType.AUTO)
	private String bookingid;
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
	private Date cr_sow_date;
	private String  seed_production; 
	private String farmingtype;
	private String photo;
	private String vname;
	private BigDecimal mobile;
	private String ekycfarmername;
	public CropBookingDetailsMaoIntf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropBookingDetailsMaoIntf(String bookingid, String oc_name, String cr_farmeruid, String oc_fname,
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
	public Date getCr_sow_date() {
		return cr_sow_date;
	}
	public void setCr_sow_date(Date cr_sow_date) {
		this.cr_sow_date = cr_sow_date;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public BigDecimal getMobile() {
		return mobile;
	}
	public void setMobile(BigDecimal mobile) {
		this.mobile = mobile;
	}
	public String getEkycfarmername() {
		return ekycfarmername;
	}
	public void setEkycfarmername(String ekycfarmername) {
		this.ekycfarmername = ekycfarmername;
	}
	@Override
	public String toString() {
		return "CropBookingDetailsMaoIntf [bookingid=" + bookingid + ", oc_name=" + oc_name + ", cr_farmeruid="
				+ cr_farmeruid + ", oc_fname=" + oc_fname + ", owner_tenant=" + owner_tenant + ", kh_no=" + kh_no
				+ ", cr_sno=" + cr_sno + ", cropname=" + cropname + ", varietyname=" + varietyname
				+ ", cr_mix_unmix_ext=" + cr_mix_unmix_ext + ", cr_sow_type=" + cr_sow_type + ", cropnature="
				+ cropnature + ", watersource=" + watersource + ", irrmethoddesc=" + irrmethoddesc + ", cr_sow_date="
				+ cr_sow_date + ", seed_production=" + seed_production + ", farmingtype=" + farmingtype + ", photo="
				+ photo + ", vname=" + vname + ", mobile=" + mobile + ", ekycfarmername=" + ekycfarmername + "]";
	}
	
	
}
