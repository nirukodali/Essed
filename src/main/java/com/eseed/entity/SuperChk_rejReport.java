package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SuperChk_rejReport {
	private String wbdname;
	private String wbmname;
	private String	wbvname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	bookingid;
	private String	occupname;
	private String ekycfarmername;
	private String occupfname;
	private String cropname;
	private String varietyname;
	private String  bookedext;
	private String wsrcdesc;
	private String cr_sow_date;
	private String kh_no;
	private String cr_sno;
	private String supercheck_userid;
	private String remarks;
	public SuperChk_rejReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuperChk_rejReport(String wbdname, String wbmname, String wbvname, String bookingid, String occupname,
			String ekycfarmername, String occupfname, String cropname, String varietyname, String bookedext,
			String wsrcdesc, String cr_sow_date, String kh_no, String cr_sno, String supercheck_userid,
			String remarks) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.bookingid = bookingid;
		this.occupname = occupname;
		this.ekycfarmername = ekycfarmername;
		this.occupfname = occupfname;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.bookedext = bookedext;
		this.wsrcdesc = wsrcdesc;
		this.cr_sow_date = cr_sow_date;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.supercheck_userid = supercheck_userid;
		this.remarks = remarks;
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
	public String getBookedext() {
		return bookedext;
	}
	public void setBookedext(String bookedext) {
		this.bookedext = bookedext;
	}
	public String getWsrcdesc() {
		return wsrcdesc;
	}
	public void setWsrcdesc(String wsrcdesc) {
		this.wsrcdesc = wsrcdesc;
	}
	public String getCr_sow_date() {
		return cr_sow_date;
	}
	public void setCr_sow_date(String cr_sow_date) {
		this.cr_sow_date = cr_sow_date;
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
	public String getSupercheck_userid() {
		return supercheck_userid;
	}
	public void setSupercheck_userid(String supercheck_userid) {
		this.supercheck_userid = supercheck_userid;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "SuperChk_rejReport [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname
				+ ", bookingid=" + bookingid + ", occupname=" + occupname + ", ekycfarmername=" + ekycfarmername
				+ ", occupfname=" + occupfname + ", cropname=" + cropname + ", varietyname=" + varietyname
				+ ", bookedext=" + bookedext + ", wsrcdesc=" + wsrcdesc + ", cr_sow_date=" + cr_sow_date + ", kh_no="
				+ kh_no + ", cr_sno=" + cr_sno + ", supercheck_userid=" + supercheck_userid + ", remarks=" + remarks
				+ "]";
	}
	

}
