package com.eseed.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class JointLpnosDAO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String district;
	private String mandal;
	private String village;
	private BigDecimal lpnos;
	private BigDecimal khatas; 
	private BigDecimal updated;
	private BigDecimal cr_dist_code;
	private BigDecimal cr_mand_code;
	private Integer cr_vcode;
	public JointLpnosDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JointLpnosDAO(String district, String mandal, String village, BigDecimal lpnos, BigDecimal khatas,
			BigDecimal updated, BigDecimal cr_dist_code, BigDecimal cr_mand_code, Integer cr_vcode) {
		super();
		this.district = district;
		this.mandal = mandal;
		this.village = village;
		this.lpnos = lpnos;
		this.khatas = khatas;
		this.updated = updated;
		this.cr_dist_code = cr_dist_code;
		this.cr_mand_code = cr_mand_code;
		this.cr_vcode = cr_vcode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public BigDecimal getLpnos() {
		return lpnos;
	}
	public void setLpnos(BigDecimal lpnos) {
		this.lpnos = lpnos;
	}
	public BigDecimal getKhatas() {
		return khatas;
	}
	public void setKhatas(BigDecimal khatas) {
		this.khatas = khatas;
	}
	public BigDecimal getUpdated() {
		return updated;
	}
	public void setUpdated(BigDecimal updated) {
		this.updated = updated;
	}
	public BigDecimal getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(BigDecimal cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	public BigDecimal getCr_mand_code() {
		return cr_mand_code;
	}
	public void setCr_mand_code(BigDecimal cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}
	public Integer getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(Integer cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	@Override
	public String toString() {
		return "JointLpnos [district=" + district + ", mandal=" + mandal + ", village=" + village + ", lpnos=" + lpnos
				+ ", khatas=" + khatas + ", updated=" + updated + ", cr_dist_code=" + cr_dist_code + ", cr_mand_code="
				+ cr_mand_code + ", cr_vcode=" + cr_vcode + "]";
	}
	
	
}
