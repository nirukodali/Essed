package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class SuperCheckRecordsAlloted {
	private String mname;
	private String vname;
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Id
	private String bookingid;
	private String kh_no;
	private String cr_no;
	private String occupname;
	private String ekycfarmername;
	private String occupfname;
	private String occupant_extent;
	private String cropname;
	private String varietyname;
	private String cr_sow_date;
	private String cr_mix_unmix_ext;
	private String wsrcdesc;
	private String exception_type;
	
	public SuperCheckRecordsAlloted() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SuperCheckRecordsAlloted(String mname, String vname, String bookingid, String kh_no, String cr_no,
			String occupname, String ekycfarmername, String occupfname, String occupant_extent, String cropname,
			String varietyname, String cr_sow_date, String cr_mix_unmix_ext, String wsrcdesc, String exception_type) {
		super();
		this.mname = mname;
		this.vname = vname;
		this.bookingid = bookingid;
		this.kh_no = kh_no;
		this.cr_no = cr_no;
		this.occupname = occupname;
		this.ekycfarmername = ekycfarmername;
		this.occupfname = occupfname;
		this.occupant_extent = occupant_extent;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.cr_sow_date = cr_sow_date;
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		this.wsrcdesc = wsrcdesc;
		this.exception_type = exception_type;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
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
	public String getKh_no() {
		return kh_no;
	}
	public void setKh_no(String kh_no) {
		this.kh_no = kh_no;
	}
	public String getCr_no() {
		return cr_no;
	}
	public void setCr_no(String cr_no) {
		this.cr_no = cr_no;
	}
	public String getOccupname() {
		return occupname;
	}
	public void setOccupname(String occupname) {
		this.occupname = occupname;
	}
	public String getEkycfarmername() {
		return ekycfarmername;
	}
	public void setEkycfarmername(String ekycfarmername) {
		this.ekycfarmername = ekycfarmername;
	}
	public String getOccupfname() {
		return occupfname;
	}
	public void setOccupfname(String occupfname) {
		this.occupfname = occupfname;
	}
	public String getOccupant_extent() {
		return occupant_extent;
	}
	public void setOccupant_extent(String occupant_extent) {
		this.occupant_extent = occupant_extent;
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
	public String getCr_sow_date() {
		return cr_sow_date;
	}
	public void setCr_sow_date(String cr_sow_date) {
		this.cr_sow_date = cr_sow_date;
	}
	public String getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}
	public void setCr_mix_unmix_ext(String cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
	}
	public String getWsrcdesc() {
		return wsrcdesc;
	}
	public void setWsrcdesc(String wsrcdesc) {
		this.wsrcdesc = wsrcdesc;
	}
	public String getException_type() {
		return exception_type;
	}
	public void setException_type(String exception_type) {
		this.exception_type = exception_type;
	}
	
	@Override
	public String toString() {
		return "SuperCheckRecordsAlloted [mname=" + mname + ", vname=" + vname + ", bookingid=" + bookingid + ", kh_no="
				+ kh_no + ", cr_no=" + cr_no + ", occupname=" + occupname + ", ekycfarmername=" + ekycfarmername
				+ ", occupfname=" + occupfname + ", occupant_extent=" + occupant_extent + ", cropname=" + cropname
				+ ", varietyname=" + varietyname + ", cr_sow_date=" + cr_sow_date + ", cr_mix_unmix_ext="
				+ cr_mix_unmix_ext + ", wsrcdesc=" + wsrcdesc + ", exception_type=" + exception_type + "]";
	}
	
	

}