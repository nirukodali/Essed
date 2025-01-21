package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CropBookingDetailsADA {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long bookingid;
	    private String oc_name;
	    private String cr_farmeruid;
	    private String oc_fname;
	    private Character owner_tenant;
	    private BigDecimal kh_no;
	    private String cr_sno;
	    private String cropname;
	    private String varietyname;
	    private BigDecimal cr_mix_unmix_ext;
	    private Date cr_sow_date;
	    private String cropnature;
	    private String watersource;
	    private String irrmethoddesc;
	    private String photo;
		public CropBookingDetailsADA() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CropBookingDetailsADA(Long bookingid, String oc_name, String cr_farmeruid, String oc_fname,
				Character owner_tenant, BigDecimal kh_no, String cr_sno, String cropname, String varietyname,
				BigDecimal cr_mix_unmix_ext, Date cr_sow_date, String cropnature, String watersource,
				String irrmethoddesc, String photo) {
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
			this.cr_sow_date = cr_sow_date;
			this.cropnature = cropnature;
			this.watersource = watersource;
			this.irrmethoddesc = irrmethoddesc;
			this.photo = photo;
		}
		public Long getBookingid() {
			return bookingid;
		}
		public void setBookingid(Long bookingid) {
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
		public Character getOwner_tenant() {
			return owner_tenant;
		}
		public void setOwner_tenant(Character owner_tenant) {
			this.owner_tenant = owner_tenant;
		}
		public BigDecimal getKh_no() {
			return kh_no;
		}
		public void setKh_no(BigDecimal kh_no) {
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
		public BigDecimal getCr_mix_unmix_ext() {
			return cr_mix_unmix_ext;
		}
		public void setCr_mix_unmix_ext(BigDecimal cr_mix_unmix_ext) {
			this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		}
		public Date getCr_sow_date() {
			return cr_sow_date;
		}
		public void setCr_sow_date(Date cr_sow_date) {
			this.cr_sow_date = cr_sow_date;
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
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		@Override
		public String toString() {
			return "CropBookingDetailsADA [bookingid=" + bookingid + ", oc_name=" + oc_name + ", cr_farmeruid="
					+ cr_farmeruid + ", oc_fname=" + oc_fname + ", owner_tenant=" + owner_tenant + ", kh_no=" + kh_no
					+ ", cr_sno=" + cr_sno + ", cropname=" + cropname + ", varietyname=" + varietyname
					+ ", cr_mix_unmix_ext=" + cr_mix_unmix_ext + ", cr_sow_date=" + cr_sow_date + ", cropnature="
					+ cropnature + ", watersource=" + watersource + ", irrmethoddesc=" + irrmethoddesc + ", photo="
					+ photo + "]";
		}
		
	    
	    
}
