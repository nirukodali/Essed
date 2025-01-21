package com.eseed.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="pattmast_nonwebland",schema="ecrop2024")
public class PattMst_NonWebland  {
	
	@Id
	private int kh_no;


	private int cr_dist_code;


	private String part_key;

	private int cr_mand_code;

	private int cr_vcode;

	private int cr_year;

	private String cr_season;

	private String cr_farmeruid;

	private String owner_tenant;

	private Long mobileno;
	
	private int tot_extent;

	private String occupname;

	private String occupfname;

	private String cr_sno;

	private String entry_by;
	
	private String oc_name;
	
	private String oc_fname;

	
	@Column(name = "entry_date")
	private Timestamp entryDate;

	private String gender;

	private String reason;
	
	
	
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

	public String getPart_key() {
		return part_key;
	}

	public void setPart_key(String part_key) {
		this.part_key = part_key;
	}

	public int getCr_dist_code() {
		return cr_dist_code;
	}

	public void setCr_dist_code(int cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}

	public int getCr_mand_code() {
		return cr_mand_code;
	}

	public void setCr_mand_code(int cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}

	public int getCr_vcode() {
		return cr_vcode;
	}

	public void setCr_vcode(int cr_vcode) {
		this.cr_vcode = cr_vcode;
	}

	public int getCr_year() {
		return cr_year;
	}

	public void setCr_year(int cr_year) {
		this.cr_year = cr_year;
	}

	public String getCr_season() {
		return cr_season;
	}

	public void setCr_season(String cr_season) {
		this.cr_season = cr_season;
	}

	public String getCr_farmeruid() {
		return cr_farmeruid;
	}

	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}

	public String getOwner_tenant() {
		return owner_tenant;
	}

	public void setOwner_tenant(String owner_tenant) {
		this.owner_tenant = owner_tenant;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}

	public int getKh_no() {
		return kh_no;
	}

	public void setKh_no(int kh_no) {
		this.kh_no = kh_no;
	}

	public int getTot_extent() {
		return tot_extent;
	}

	public void setTot_extent(int tot_extent) {
		this.tot_extent = tot_extent;
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

	public String getCr_sno() {
		return cr_sno;
	}

	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}

	public String getEntry_by() {
		return entry_by;
	}

	public void setEntry_by(String entry_by) {
		this.entry_by = entry_by;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

//	public Integer getAnubhavadar_extent() {
//		return anubhavadar_extent;
//	}
//
//	public void setAnubhavadar_extent(Integer anubhavadar_extent) {
//		this.anubhavadar_extent = anubhavadar_extent;
//	}

//	public Long getCr_wsno() {
//		return cr_wsno;
//	}
//
//	public void setCr_wsno(Long cr_wsno) {
//		this.cr_wsno = cr_wsno;
//	}

	public Timestamp getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}


}
