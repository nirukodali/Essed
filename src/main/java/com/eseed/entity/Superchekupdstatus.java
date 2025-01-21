package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Superchekupdstatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private String wbmname;
	private String wbvname;
	private Integer bookingid;
	private String occup_name;
	private String occup_fname;
	private String cropname;
	private String varietyname;
	private String cr_sow_date; 
	private Integer kh_no;
	private String cr_sno;
	private String supercheck_userid; 
	private String remarks;
	private String reason;
	private String vaa_sup_rem;
	private String mao_remarks;
	private String mro_remarks;
	public Superchekupdstatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Superchekupdstatus(String wbdname, String wbmname, String wbvname, Integer bookingid, String occup_name,
			String occup_fname, String cropname, String varietyname, String cr_sow_date, Integer kh_no, String cr_sno,
			String supercheck_userid, String remarks, String reason, String vaa_sup_rem, String mao_remarks,
			String mro_remarks) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.bookingid = bookingid;
		this.occup_name = occup_name;
		this.occup_fname = occup_fname;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.cr_sow_date = cr_sow_date;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.supercheck_userid = supercheck_userid;
		this.remarks = remarks;
		this.reason = reason;
		this.vaa_sup_rem = vaa_sup_rem;
		this.mao_remarks = mao_remarks;
		this.mro_remarks = mro_remarks;
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
	public Integer getBookingid() {
		return bookingid;
	}
	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}
	public String getOccup_name() {
		return occup_name;
	}
	public void setOccup_name(String occup_name) {
		this.occup_name = occup_name;
	}
	public String getOccup_fname() {
		return occup_fname;
	}
	public void setOccup_fname(String occup_fname) {
		this.occup_fname = occup_fname;
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
	public Integer getKh_no() {
		return kh_no;
	}
	public void setKh_no(Integer kh_no) {
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getVaa_sup_rem() {
		return vaa_sup_rem;
	}
	public void setVaa_sup_rem(String vaa_sup_rem) {
		this.vaa_sup_rem = vaa_sup_rem;
	}
	public String getMao_remarks() {
		return mao_remarks;
	}
	public void setMao_remarks(String mao_remarks) {
		this.mao_remarks = mao_remarks;
	}
	public String getMro_remarks() {
		return mro_remarks;
	}
	public void setMro_remarks(String mro_remarks) {
		this.mro_remarks = mro_remarks;
	}
	@Override
	public String toString() {
		return "Superchekupdstatus [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname
				+ ", bookingid=" + bookingid + ", occup_name=" + occup_name + ", occup_fname=" + occup_fname
				+ ", cropname=" + cropname + ", varietyname=" + varietyname + ", cr_sow_date=" + cr_sow_date
				+ ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", supercheck_userid=" + supercheck_userid + ", remarks="
				+ remarks + ", reason=" + reason + ", vaa_sup_rem=" + vaa_sup_rem + ", mao_remarks=" + mao_remarks
				+ ", mro_remarks=" + mro_remarks + "]";
	}

}
