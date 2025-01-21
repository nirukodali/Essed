package com.eseed.entity;

public class RepPernnialMand {
	private String oc_name;
	private String oc_fname;
	private String owner_tenant;
	private String kh_no; 
	private String cr_sno;
	private String cropname;
	private String cr_mix_unmix_ext; 
	private Integer age;
	private String mobileno ;
	public RepPernnialMand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RepPernnialMand(String oc_name, String oc_fname, String owner_tenant, String kh_no, String cr_sno,
			String cropname, String cr_mix_unmix_ext, Integer age, String mobileno) {
		super();
		this.oc_name = oc_name;
		this.oc_fname = oc_fname;
		this.owner_tenant = owner_tenant;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.cropname = cropname;
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		this.age = age;
		this.mobileno = mobileno;
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
	public String getOwner_tenant() {
		return owner_tenant;
	}
	public void setOwner_tenant(String owner_tenant) {
		this.owner_tenant = owner_tenant;
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
	public String getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}
	public void setCr_mix_unmix_ext(String cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "RepPernnialMand [oc_name=" + oc_name + ", oc_fname=" + oc_fname + ", owner_tenant=" + owner_tenant
				+ ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", cropname=" + cropname + ", cr_mix_unmix_ext="
				+ cr_mix_unmix_ext + ", age=" + age + ", mobileno=" + mobileno + "]";
	}
	

}
