package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Deceased_Legal_heir_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	
	private String wbvname;
	private String cr_sno;
	private String kh_no;
	private String bookingid;
	private String oc_name;
	private String oc_fname;
	private String sug_occupname;
	private String sug_occupfname;
	private String vro_appr;
	private String mro_appr;
	private String ada_appr;
	private String occup_name;
	private String occup_fname;
	private String cr_farmeruid;
	private String sug_farmeruid;
	private String relation;
	
	public Deceased_Legal_heir_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deceased_Legal_heir_Details(String wbvname, String cr_sno, String kh_no, String bookingid, String oc_name,
			String oc_fname, String sug_occupname, String sug_occupfname, String vro_appr, String mro_appr,
			String ada_appr, String occup_name, String occup_fname, String cr_farmeruid, String sug_farmeruid,
			String relation) {
		super();
		this.wbvname = wbvname;
		this.cr_sno = cr_sno;
		this.kh_no = kh_no;
		this.bookingid = bookingid;
		this.oc_name = oc_name;
		this.oc_fname = oc_fname;
		this.sug_occupname = sug_occupname;
		this.sug_occupfname = sug_occupfname;
		this.vro_appr = vro_appr;
		this.mro_appr = mro_appr;
		this.ada_appr = ada_appr;
		this.occup_name = occup_name;
		this.occup_fname = occup_fname;
		this.cr_farmeruid = cr_farmeruid;
		this.sug_farmeruid = sug_farmeruid;
		this.relation = relation;
	}

	public String getWbvname() {
		return wbvname;
	}

	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}

	public String getCr_sno() {
		return cr_sno;
	}

	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}

	public String getKh_no() {
		return kh_no;
	}

	public void setKh_no(String kh_no) {
		this.kh_no = kh_no;
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

	public String getOc_fname() {
		return oc_fname;
	}

	public void setOc_fname(String oc_fname) {
		this.oc_fname = oc_fname;
	}

	public String getSug_occupname() {
		return sug_occupname;
	}

	public void setSug_occupname(String sug_occupname) {
		this.sug_occupname = sug_occupname;
	}

	public String getSug_occupfname() {
		return sug_occupfname;
	}

	public void setSug_occupfname(String sug_occupfname) {
		this.sug_occupfname = sug_occupfname;
	}

	public String getVro_appr() {
		return vro_appr;
	}

	public void setVro_appr(String vro_appr) {
		this.vro_appr = vro_appr;
	}

	public String getMro_appr() {
		return mro_appr;
	}

	public void setMro_appr(String mro_appr) {
		this.mro_appr = mro_appr;
	}

	public String getAda_appr() {
		return ada_appr;
	}

	public void setAda_appr(String ada_appr) {
		this.ada_appr = ada_appr;
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

	public String getCr_farmeruid() {
		return cr_farmeruid;
	}

	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}

	public String getSug_farmeruid() {
		return sug_farmeruid;
	}

	public void setSug_farmeruid(String sug_farmeruid) {
		this.sug_farmeruid = sug_farmeruid;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Override
	public String toString() {
		return "Deceased_Legal_heir_Details [wbvname=" + wbvname + ", cr_sno=" + cr_sno + ", kh_no=" + kh_no
				+ ", bookingid=" + bookingid + ", oc_name=" + oc_name + ", oc_fname=" + oc_fname + ", sug_occupname="
				+ sug_occupname + ", sug_occupfname=" + sug_occupfname + ", vro_appr=" + vro_appr + ", mro_appr="
				+ mro_appr + ", ada_appr=" + ada_appr + ", occup_name=" + occup_name + ", occup_fname=" + occup_fname
				+ ", cr_farmeruid=" + cr_farmeruid + ", sug_farmeruid=" + sug_farmeruid + ", relation=" + relation
				+ "]";
	}
	
		
}
