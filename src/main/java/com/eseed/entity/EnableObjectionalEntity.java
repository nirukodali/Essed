package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "enable_obj_lands" , schema = "ecrop2024")

public class EnableObjectionalEntity {
	
	@Id
	private Integer rec_id;
	
	private Integer cr_dist_code;
	
	private Integer cr_mand_code;
	
	private Integer cr_vcode;
	
	private BigDecimal kh_no;
	
	private BigDecimal sug_ext;
	
	private String cr_sno;
	
	private BigDecimal occup_extent;
	
	private Integer dcode;
	
	private Integer mcode;
	
	private Integer vscode;
	
	
	
	
	public Integer getVscode() {
		return vscode;
	}

	public void setVscode(Integer vscode) {
		this.vscode = vscode;
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

	public BigDecimal getOccup_extent() {
		return occup_extent;
	}

	public void setOccup_extent(BigDecimal occup_extent) {
		this.occup_extent = occup_extent;
	}

	public Integer getRec_id() {
		return rec_id;
	}

	public void setRec_id(Integer rec_id) {
		this.rec_id = rec_id;
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

	public BigDecimal getKh_no() {
		return kh_no;
	}

	public void setKh_no(BigDecimal kh_no) {
		this.kh_no = kh_no;
	}

	public BigDecimal getSug_ext() {
		return sug_ext;
	}

	public void setSug_ext(BigDecimal sug_ext) {
		this.sug_ext = sug_ext;
	}

	public String getCr_sno() {
		return cr_sno;
	}

	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	

}
