package com.eseed.entity;

public class nonwebViewModel {
	
	private String wbdname;
	private String wbmname;
	private String 	wbvname;
	private String kh_no;
	private String cr_sno;
	private String oc_name;
	private String oc_fname;
	private String cr_farmeruid;
	private String tot_extent;
	private String occupant_extent;
	private String occupname;
	private String occupfname;
	private String gender;
	private String mobileno;

	
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
	public String getCr_farmeruid() {
		return cr_farmeruid;
	}
	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}
	public String getTot_extent() {
		return tot_extent;
	}
	public void setTot_extent(String tot_extent) {
		this.tot_extent = tot_extent;
	}
	public String getOccupant_extent() {
		return occupant_extent;
	}
	public void setOccupant_extent(String occupant_extent) {
		this.occupant_extent = occupant_extent;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public nonwebViewModel(String wbdname, String wbmname, String wbvname, String kh_no, String cr_sno, String oc_name,
			String oc_fname, String cr_farmeruid, String tot_extent, String occupant_extent, String occupname,
			String occupfname, String gender, String mobileno) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.oc_name = oc_name;
		this.oc_fname = oc_fname;
		this.cr_farmeruid = cr_farmeruid;
		this.tot_extent = tot_extent;
		this.occupant_extent = occupant_extent;
		this.occupname = occupname;
		this.occupfname = occupfname;
		this.gender = gender;
		this.mobileno = mobileno;
	}
	public nonwebViewModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "nonwebViewModel [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", kh_no="
				+ kh_no + ", cr_sno=" + cr_sno + ", oc_name=" + oc_name + ", oc_fname=" + oc_fname + ", cr_farmeruid="
				+ cr_farmeruid + ", tot_extent=" + tot_extent + ", occupant_extent=" + occupant_extent + ", occupname="
				+ occupname + ", occupfname=" + occupfname + ", gender=" + gender + ", mobileno=" + mobileno + "]";
	}
		
	
}
