package com.eseed.entity;

public class PattadarPojo {

	
	
	private String cr_sno;
	private String cr_vcode;
	private String kh_no;
	private String occupname;
	private String occupfname;
	private String occup_extent;
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public String getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(String cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	public String getKh_no() {
		return kh_no;
	}
	public void setKh_no(String kh_no) {
		this.kh_no = kh_no;
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
	public String getOccup_extent() {
		return occup_extent;
	}
	public void setOccup_extent(String occup_extent) {
		this.occup_extent = occup_extent;
	}
	@Override
	public String toString() {
		return "PattadarPojo [cr_sno=" + cr_sno + ", cr_vcode=" + cr_vcode + ", kh_no=" + kh_no + ", occupname="
				+ occupname + ", occupfname=" + occupfname + ", occup_extent=" + occup_extent + "]";
	}
	
	
	
}
