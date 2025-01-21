package com.eseed.entity;

import java.math.BigDecimal;

public class DigitalSmsEntity {
	
	private int bookingid;
	private BigDecimal kh_no;
	private String cr_sno;
	private BigDecimal cr_mix_unmix_ext;
	private String cropname;
	private String varietyname;
	private String occupname;
	private BigDecimal smsmobileno;
	private String wbdname;
	private String wbmname;
	private String wbvname;
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
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
	public BigDecimal getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}
	public void setCr_mix_unmix_ext(BigDecimal cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
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
	public String getOccupname() {
		return occupname;
	}
	public void setOccupname(String occupname) {
		this.occupname = occupname;
	}
	public BigDecimal getSmsmobileno() {
		return smsmobileno;
	}
	public void setSmsmobileno(BigDecimal smsmobileno) {
		this.smsmobileno = smsmobileno;
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
	@Override
	public String toString() {
		return "DigitalSmsEntity [bookingid=" + bookingid + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno
				+ ", cr_mix_unmix_ext=" + cr_mix_unmix_ext + ", cropname=" + cropname + ", varietyname=" + varietyname
				+ ", occupname=" + occupname + ", smsmobileno=" + smsmobileno + ", wbdname=" + wbdname + ", wbmname="
				+ wbmname + ", wbvname=" + wbvname + "]";
	}
	

}
