package com.eseed.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CropBookingDetailsPhotoDDAP {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String bookingid;
	private String oc_name;
	private String data_src;
	private String cr_farmeruid;
	private String oc_fname;
	private String kh_no;
	private String cr_sno;
	private String cropname;
	private String varietyname;
	private String cr_mix_unmix_ext;
	private String cr_sow_date;
	private String cropnature;
	private String watersource;
	private String irrmethoddesc;

	public CropBookingDetailsPhotoDDAP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CropBookingDetailsPhotoDDAP(String bookingid, String oc_name, String data_src, String cr_farmeruid,
			String oc_fname, String kh_no, String cr_sno, String cropname, String varietyname,
			String cr_mix_unmix_ext, String cr_sow_date, String cropnature, String watersource, String irrmethoddesc) {
		super();
		this.bookingid = bookingid;
		this.oc_name = oc_name;
		this.data_src = data_src;
		this.cr_farmeruid = cr_farmeruid;
		this.oc_fname = oc_fname;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		this.cr_sow_date = cr_sow_date;
		this.cropnature = cropnature;
		this.watersource = watersource;
		this.irrmethoddesc = irrmethoddesc;
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

	public String getData_src() {
		return data_src;
	}

	public void setData_src(String data_src) {
		this.data_src = data_src;
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

	public String getCr_sow_date() {
		return cr_sow_date;
	}

	public void setCr_sow_date(String cr_sow_date) {
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

	@Override
	public String toString() {
		return "CropBookingDetailsPhotoDDAP [bookingid=" + bookingid + ", oc_name=" + oc_name + ", data_src=" + data_src
				+ ", cr_farmeruid=" + cr_farmeruid + ", oc_fname=" + oc_fname + ", kh_no=" + kh_no + ", cr_sno="
				+ cr_sno + ", cropname=" + cropname + ", varietyname=" + varietyname + ", cr_mix_unmix_ext="
				+ cr_mix_unmix_ext + ", cr_sow_date=" + cr_sow_date + ", cropnature=" + cropnature + ", watersource="
				+ watersource + ", irrmethoddesc=" + irrmethoddesc + "]";
	}

}
