package com.eseed.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vro_rej_details")
public class VroRejDetailsEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookingid")
	private Integer bookingid;
	
	@Column(name = "cr_dist_code")
	private Integer cr_dist_code;
	
	@Column(name = "cr_mand_code")
	private Integer cr_mand_code;

	@Column(name = "cr_vcode")
	private Integer cr_vcode;

	@Column(name = "cr_crop")
	private Integer cr_crop;
	
	@Column(name = "cr_no")
	private String cr_no;   
	
	@Column(name = "variety")
	private Integer variety;
	
	@Column(name = "kh_no")
	private Integer kh_no;

	@Column(name = "cr_sno")
	private String cr_sno;

	@Column(name = "cr_sow_dt")
	private Date cr_sow_dt;

	@Column(name = "rej_reason")
	private Integer rej_reason;

	@Column(name = "part_key")
	private String part_key;

	@Column(name = "crt_user")
	private String crt_user;

	@Column(name = "clientip")
	private String clientip;
	
	

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

	public Integer getBookingid() {
		return bookingid;
	}

	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}

	public Integer getCr_crop() {
		return cr_crop;
	}

	public void setCr_crop(Integer cr_crop) {
		this.cr_crop = cr_crop;
	}

	public String getCr_no() {
		return cr_no;
	}

	public void setCr_no(String cr_no) {
		this.cr_no = cr_no;
	}

	public Integer getVariety() {
		return variety;
	}

	public void setVariety(Integer variety) {
		this.variety = variety;
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

	public Date getCr_sow_dt() {
		return cr_sow_dt;
	}

	public void setCr_sow_dt(Date cr_sow_dt) {
		this.cr_sow_dt = cr_sow_dt;
	}

	public Integer getRej_reason() {
		return rej_reason;
	}

	public void setRej_reason(Integer rej_reason) {
		this.rej_reason = rej_reason;
	}

	public String getPart_key() {
		return part_key;
	}

	public void setPart_key(String part_key) {
		this.part_key = part_key;
	}

	public String getCrt_user() {
		return crt_user;
	}

	public void setCrt_user(String crt_user) {
		this.crt_user = crt_user;
	}

	public String getClientip() {
		return clientip;
	}

	public void setClientip(String clientip) {
		this.clientip = clientip;
	}
	
	@Override
	public String toString() {
		return "VroRejDetailsEntity [cr_dist_code=" + cr_dist_code + ", cr_mand_code=" + cr_mand_code + ", cr_vcode="
				+ cr_vcode + ", bookingid=" + bookingid + ", cr_crop=" + cr_crop + ", cr_no=" + cr_no + ", variety="
				+ variety + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", cr_sow_dt=" + cr_sow_dt + ", rej_reason="
				+ rej_reason + ", part_key=" + part_key + ", crt_user=" + crt_user + ", clientip=" + clientip + "]";
	}
	
}
