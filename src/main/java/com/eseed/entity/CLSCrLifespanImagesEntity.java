package com.eseed.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_lifespan_images", schema = "cropimages")
public class CLSCrLifespanImagesEntity {
	
	private String part_key;
	
	private Integer cr_dist_code;
	
	private Integer cr_mand_code;
	
	private Integer cr_vcode;
	
	private Integer cr_year;
	
	private String imei;
	
	@Id
	private Integer cr_stagecode;
	
	private String userid;
	
	private String photo;
	
	private Integer dcode;
	
	private Integer mcode;
	
	private Integer cropcode;
	
	private BigDecimal longitude;
	
	private BigDecimal latitude;
	
	private LocalDateTime dt_crt;
	
	private Character drc_appr_status;
	
	private String drc_clientip;
	
	private String drc_appr_userid;
	
	private String drc_remarks;
	
	private LocalDateTime drc_appr_dt;
	
	private Integer recid;
	
	private Long randomnumber;
	
	private Character ps_appr_status;
	
	private String ps_clientip;
	
	private String ps_appr_userid;
	
	private String ps_remarks;
	
	private LocalDateTime ps_appr_dt;
	
	private Character dho_appr_status;
	
	private String dho_clientip;
	
	private String dho_appr_userid;
	
	private String dho_remarks;
	
	private LocalDateTime dho_appr_dt;

	public String getPart_key() {
		return part_key;
	}

	public void setPart_key(String part_key) {
		this.part_key = part_key;
	}

	public Integer getCr_dist_code() {
		return cr_dist_code;
	}

	public void setCr_dist_code(Integer cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}

	public Integer getCr_mand_code() {
		return cr_mand_code;
	}

	public void setCr_mand_code(Integer cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}

	public Integer getCr_vcode() {
		return cr_vcode;
	}

	public void setCr_vcode(Integer cr_vcode) {
		this.cr_vcode = cr_vcode;
	}

	public Integer getCr_year() {
		return cr_year;
	}

	public void setCr_year(Integer cr_year) {
		this.cr_year = cr_year;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Integer getCr_stagecode() {
		return cr_stagecode;
	}

	public void setCr_stagecode(Integer cr_stagecode) {
		this.cr_stagecode = cr_stagecode;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public Integer getMcode() {
		return mcode;
	}

	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}

	public Integer getCropcode() {
		return cropcode;
	}

	public void setCropcode(Integer cropcode) {
		this.cropcode = cropcode;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public LocalDateTime getDt_crt() {
		return dt_crt;
	}

	public void setDt_crt(LocalDateTime dt_crt) {
		this.dt_crt = dt_crt;
	}

	public Character getDrc_appr_status() {
		return drc_appr_status;
	}

	public void setDrc_appr_status(Character drc_appr_status) {
		this.drc_appr_status = drc_appr_status;
	}

	public String getDrc_clientip() {
		return drc_clientip;
	}

	public void setDrc_clientip(String drc_clientip) {
		this.drc_clientip = drc_clientip;
	}

	public String getDrc_appr_userid() {
		return drc_appr_userid;
	}

	public void setDrc_appr_userid(String drc_appr_userid) {
		this.drc_appr_userid = drc_appr_userid;
	}

	public String getDrc_remarks() {
		return drc_remarks;
	}

	public void setDrc_remarks(String drc_remarks) {
		this.drc_remarks = drc_remarks;
	}

	public LocalDateTime getDrc_appr_dt() {
		return drc_appr_dt;
	}

	public void setDrc_appr_dt(LocalDateTime drc_appr_dt) {
		this.drc_appr_dt = drc_appr_dt;
	}

	public Integer getRecid() {
		return recid;
	}

	public void setRecid(Integer recid) {
		this.recid = recid;
	}

	public Long getRandomnumber() {
		return randomnumber;
	}

	public void setRandomnumber(Long randomnumber) {
		this.randomnumber = randomnumber;
	}

	public Character getPs_appr_status() {
		return ps_appr_status;
	}

	public void setPs_appr_status(Character ps_appr_status) {
		this.ps_appr_status = ps_appr_status;
	}

	public String getPs_clientip() {
		return ps_clientip;
	}

	public void setPs_clientip(String ps_clientip) {
		this.ps_clientip = ps_clientip;
	}

	public String getPs_appr_userid() {
		return ps_appr_userid;
	}

	public void setPs_appr_userid(String ps_appr_userid) {
		this.ps_appr_userid = ps_appr_userid;
	}

	public String getPs_remarks() {
		return ps_remarks;
	}

	public void setPs_remarks(String ps_remarks) {
		this.ps_remarks = ps_remarks;
	}

	public LocalDateTime getPs_appr_dt() {
		return ps_appr_dt;
	}

	public void setPs_appr_dt(LocalDateTime ps_appr_dt) {
		this.ps_appr_dt = ps_appr_dt;
	}

	public Character getDho_appr_status() {
		return dho_appr_status;
	}

	public void setDho_appr_status(Character dho_appr_status) {
		this.dho_appr_status = dho_appr_status;
	}

	public String getDho_clientip() {
		return dho_clientip;
	}

	public void setDho_clientip(String dho_clientip) {
		this.dho_clientip = dho_clientip;
	}

	public String getDho_appr_userid() {
		return dho_appr_userid;
	}

	public void setDho_appr_userid(String dho_appr_userid) {
		this.dho_appr_userid = dho_appr_userid;
	}

	public String getDho_remarks() {
		return dho_remarks;
	}

	public void setDho_remarks(String dho_remarks) {
		this.dho_remarks = dho_remarks;
	}

	public LocalDateTime getDho_appr_dt() {
		return dho_appr_dt;
	}

	public void setDho_appr_dt(LocalDateTime dho_appr_dt) {
		this.dho_appr_dt = dho_appr_dt;
	}

}
