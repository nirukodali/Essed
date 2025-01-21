package com.eseed.entity;

public class SuperChk_rejReportModel {
	private String bookedext;
	private String wsrcdesc;
	private String ekycfarmername;
	private String wbdname;
	private String wbmname;
	private String wbvname;
	private String bookingid;
	private String supercheck_userid;
	private String occupname;
	private String occupfname;
	private String oc_name;
	private String oc_fname;
	private String remarks;
	private String reason;
	private String cr_vcode;
	private String cr_sno;
	private String cr_crop;
	private String kh_no;
	private String cr_no; 
	private String cropname;
	private String varietyname;
	private String cr_sow_date;
	private String vcode;
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
	public String getEkycfarmername() {
		return ekycfarmername;
	}
	public void setEkycfarmername(String ekycfarmername) {
		this.ekycfarmername = ekycfarmername;
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
	public String getSupercheck_userid() {
		return supercheck_userid;
	}
	public void setSupercheck_userid(String supercheck_userid) {
		this.supercheck_userid = supercheck_userid;
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
	public String getOc_name() {
		return oc_name;
	}
	public void setOc_name(String oc_name) {
		this.oc_name = oc_name;
	}
	public String getOc_fname() {
		return oc_fname;
	}
	public void setOc_fname(String oc_fname) {
		this.oc_fname = oc_fname;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(String cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public String getCr_crop() {
		return cr_crop;
	}
	public void setCr_crop(String cr_crop) {
		this.cr_crop = cr_crop;
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
	public String getVcode() {
		return vcode;
	}
	public void setVcode(String vcode) {
		this.vcode = vcode;
	}
	public SuperChk_rejReportModel(String bookedext, String wsrcdesc, String ekycfarmername, String wbdname,
			String wbmname, String wbvname, String bookingid, String supercheck_userid, String occupname,
			String occupfname, String oc_name, String oc_fname, String remarks, String reason, String cr_vcode,
			String cr_sno, String cr_crop, String kh_no, String cr_no, String cropname, String varietyname,
			String cr_sow_date, String vcode) {
		super();
		this.bookedext = bookedext;
		this.wsrcdesc = wsrcdesc;
		this.ekycfarmername = ekycfarmername;
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.bookingid = bookingid;
		this.supercheck_userid = supercheck_userid;
		this.occupname = occupname;
		this.occupfname = occupfname;
		this.oc_name = oc_name;
		this.oc_fname = oc_fname;
		this.remarks = remarks;
		this.reason = reason;
		this.cr_vcode = cr_vcode;
		this.cr_sno = cr_sno;
		this.cr_crop = cr_crop;
		this.kh_no = kh_no;
		this.cr_no = cr_no;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.cr_sow_date = cr_sow_date;
		this.vcode = vcode;
	}
	public SuperChk_rejReportModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SuperChk_rejReportModel [bookedext=" + bookedext + ", wsrcdesc=" + wsrcdesc + ", ekycfarmername="
				+ ekycfarmername + ", wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname
				+ ", bookingid=" + bookingid + ", supercheck_userid=" + supercheck_userid + ", occupname=" + occupname
				+ ", occupfname=" + occupfname + ", oc_name=" + oc_name + ", oc_fname=" + oc_fname + ", remarks="
				+ remarks + ", reason=" + reason + ", cr_vcode=" + cr_vcode + ", cr_sno=" + cr_sno + ", cr_crop="
				+ cr_crop + ", kh_no=" + kh_no + ", cr_no=" + cr_no + ", cropname=" + cropname + ", varietyname="
				+ varietyname + ", cr_sow_date=" + cr_sow_date + ", vcode=" + vcode + "]";
	}
	
	
}
