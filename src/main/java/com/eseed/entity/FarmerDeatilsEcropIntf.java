package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FarmerDeatilsEcropIntf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String vname;
	private String owner_tenant;
	private String oc_name;
	private String oc_fname;
	private String kh_no;
	private String cr_sno;
	private String tot_extent;
	private String occupant_extent;
	private String cropname;
	private String cr_mix_unmix_ext;
	private String mobileno;
	private String age;
	
	
	public FarmerDeatilsEcropIntf() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FarmerDeatilsEcropIntf(String vname, String owner_tenant, String oc_name, String oc_fname, String kh_no,
			String cr_sno, String tot_extent, String occupant_extent, String cropname, String cr_mix_unmix_ext,
			String mobileno, String age) {
		super();
		this.vname = vname;
		this.owner_tenant = owner_tenant;
		this.oc_name = oc_name;
		this.oc_fname = oc_fname;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.tot_extent = tot_extent;
		this.occupant_extent = occupant_extent;
		this.cropname = cropname;
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		this.mobileno = mobileno;
		this.age = age;
	}


	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}


	public String getOwner_tenant() {
		return owner_tenant;
	}


	public void setOwner_tenant(String owner_tenant) {
		this.owner_tenant = owner_tenant;
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


	public String getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}


	public void setCr_mix_unmix_ext(String cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
	}


	public String getMobileno() {
		return mobileno;
	}


	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "FarmerDeatilsEcropIntf [vname=" + vname + ", owner_tenant=" + owner_tenant + ", oc_name=" + oc_name
				+ ", oc_fname=" + oc_fname + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", tot_extent=" + tot_extent
				+ ", occupant_extent=" + occupant_extent + ", cropname=" + cropname + ", cr_mix_unmix_ext="
				+ cr_mix_unmix_ext + ", mobileno=" + mobileno + ", age=" + age + "]";
	}
	
}
	
	
