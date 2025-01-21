package com.eseed.entity;

public class AllocationSurveyNoModel {

	private String lgdvname;
	private String kh_no;
	private String cr_sno;
	private String tot_extent;
	private String geo_reffered;
	private String data_src;
	public AllocationSurveyNoModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllocationSurveyNoModel(String lgdvname, String kh_no, String cr_sno, String tot_extent, String geo_reffered,
			String data_src) {
		super();
		this.lgdvname = lgdvname;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.tot_extent = tot_extent;
		this.geo_reffered = geo_reffered;
		this.data_src = data_src;
	}
	public String getLgdvname() {
		return lgdvname;
	}
	public void setLgdvname(String lgdvname) {
		this.lgdvname = lgdvname;
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
	public String getTot_extent() {
		return tot_extent;
	}
	public void setTot_extent(String tot_extent) {
		this.tot_extent = tot_extent;
	}
	public String getGeo_reffered() {
		return geo_reffered;
	}
	public void setGeo_reffered(String geo_reffered) {
		this.geo_reffered = geo_reffered;
	}
	public String getData_src() {
		return data_src;
	}
	public void setData_src(String data_src) {
		this.data_src = data_src;
	}
	@Override
	public String toString() {
		return "AllocationSurveyNoModel [lgdvname=" + lgdvname + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno
				+ ", tot_extent=" + tot_extent + ", geo_reffered=" + geo_reffered + ", data_src=" + data_src + "]";
	}
	
	
}
