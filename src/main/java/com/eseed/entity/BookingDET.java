package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BookingDET {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String lgdvname;
	private String vname;
	private String bookingid;
	private String occupname;
	private String occupfname;
	private String kh_no;
	private String cr_sno;
	private String cropname;
	private String varietyname;
	private String cr_mix_unmix_ext;
	private String seed_production;
	
	
	public BookingDET() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BookingDET(String lgdvname, String vname, String bookingid, String occupname, String occupfname,
			String kh_no, String cr_sno, String cropname, String varietyname, String cr_mix_unmix_ext,
			String seed_production) {
		super();
		this.lgdvname = lgdvname;
		this.vname = vname;
		this.bookingid = bookingid;
		this.occupname = occupname;
		this.occupfname = occupfname;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		this.seed_production = seed_production;
	}


	public String getLgdvname() {
		return lgdvname;
	}


	public void setLgdvnam(String lgdvname) {
		this.lgdvname = lgdvname;
	}


	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}


	public String getBookingid() {
		return bookingid;
	}


	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
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


	public String getSeed_production() {
		return seed_production;
	}


	public void setSeed_production(String seed_production) {
		this.seed_production = seed_production;
	}


	@Override
	public String toString() {
		return "BookingDET [lgdvname=" + lgdvname + ", vname=" + vname + ", bookingid=" + bookingid + ", occupname="
				+ occupname + ", occupfname=" + occupfname + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", cropname="
				+ cropname + ", varietyname=" + varietyname + ", cr_mix_unmix_ext=" + cr_mix_unmix_ext
				+ ", seed_production=" + seed_production + "]";
	}

	
}
