package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class DataSourceVillWiseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String cr_dist_code;
	private String cr_mand_code;
	private String cr_vcode;
	private String	dname;
	private String	mname;
	private String wbevname;
	private String totvillages;
	private String rofr_cnt; 
	private String peri_cnt; 
	private String efish_cnt;
	private String efishdownloaded;
	private String 	efishnotdownloaded;
	private String	wb_cnt;
	private String weblanddownloaded;
	private String weblandnotdownloaded;
	private String	ccrc_cnt;
	private String ccrcdownloaded;
	private String ccrcnotdownloaded;
	private String rofrdownloaded;
	private String rofrnotdownloaded;
	private String perennialdownloaded;
	private String perennialnotdownloaded;
	public String getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(String cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	public String getCr_mand_code() {
		return cr_mand_code;
	}
	public void setCr_mand_code(String cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}
	public String getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(String cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getWbevname() {
		return wbevname;
	}
	public void setWbevname(String wbevname) {
		this.wbevname = wbevname;
	}
	public String getTotvillages() {
		return totvillages;
	}
	public void setTotvillages(String totvillages) {
		this.totvillages = totvillages;
	}
	public String getRofr_cnt() {
		return rofr_cnt;
	}
	public void setRofr_cnt(String rofr_cnt) {
		this.rofr_cnt = rofr_cnt;
	}
	public String getPeri_cnt() {
		return peri_cnt;
	}
	public void setPeri_cnt(String peri_cnt) {
		this.peri_cnt = peri_cnt;
	}
	public String getEfish_cnt() {
		return efish_cnt;
	}
	public void setEfish_cnt(String efish_cnt) {
		this.efish_cnt = efish_cnt;
	}
	public String getEfishdownloaded() {
		return efishdownloaded;
	}
	public void setEfishdownloaded(String efishdownloaded) {
		this.efishdownloaded = efishdownloaded;
	}
	public String getEfishnotdownloaded() {
		return efishnotdownloaded;
	}
	public void setEfishnotdownloaded(String efishnotdownloaded) {
		this.efishnotdownloaded = efishnotdownloaded;
	}
	public String getWb_cnt() {
		return wb_cnt;
	}
	public void setWb_cnt(String wb_cnt) {
		this.wb_cnt = wb_cnt;
	}
	public String getWeblanddownloaded() {
		return weblanddownloaded;
	}
	public void setWeblanddownloaded(String weblanddownloaded) {
		this.weblanddownloaded = weblanddownloaded;
	}
	public String getWeblandnotdownloaded() {
		return weblandnotdownloaded;
	}
	public void setWeblandnotdownloaded(String weblandnotdownloaded) {
		this.weblandnotdownloaded = weblandnotdownloaded;
	}
	public String getCcrc_cnt() {
		return ccrc_cnt;
	}
	public void setCcrc_cnt(String ccrc_cnt) {
		this.ccrc_cnt = ccrc_cnt;
	}
	public String getCcrcdownloaded() {
		return ccrcdownloaded;
	}
	public void setCcrcdownloaded(String ccrcdownloaded) {
		this.ccrcdownloaded = ccrcdownloaded;
	}
	public String getCcrcnotdownloaded() {
		return ccrcnotdownloaded;
	}
	public void setCcrcnotdownloaded(String ccrcnotdownloaded) {
		this.ccrcnotdownloaded = ccrcnotdownloaded;
	}
	public String getRofrdownloaded() {
		return rofrdownloaded;
	}
	public void setRofrdownloaded(String rofrdownloaded) {
		this.rofrdownloaded = rofrdownloaded;
	}
	public String getRofrnotdownloaded() {
		return rofrnotdownloaded;
	}
	public void setRofrnotdownloaded(String rofrnotdownloaded) {
		this.rofrnotdownloaded = rofrnotdownloaded;
	}
	public String getPerennialdownloaded() {
		return perennialdownloaded;
	}
	public void setPerennialdownloaded(String perennialdownloaded) {
		this.perennialdownloaded = perennialdownloaded;
	}
	public String getPerennialnotdownloaded() {
		return perennialnotdownloaded;
	}
	public void setPerennialnotdownloaded(String perennialnotdownloaded) {
		this.perennialnotdownloaded = perennialnotdownloaded;
	}
	@Override
	public String toString() {
		return "DataSourceVillWiseModel [cr_dist_code=" + cr_dist_code + ", cr_mand_code=" + cr_mand_code
				+ ", cr_vcode=" + cr_vcode + ", dname=" + dname + ", mname=" + mname + ", wbevname=" + wbevname
				+ ", totvillages=" + totvillages + ", rofr_cnt=" + rofr_cnt + ", peri_cnt=" + peri_cnt + ", efish_cnt="
				+ efish_cnt + ", efishdownloaded=" + efishdownloaded + ", efishnotdownloaded=" + efishnotdownloaded
				+ ", wb_cnt=" + wb_cnt + ", weblanddownloaded=" + weblanddownloaded + ", weblandnotdownloaded="
				+ weblandnotdownloaded + ", ccrc_cnt=" + ccrc_cnt + ", ccrcdownloaded=" + ccrcdownloaded
				+ ", ccrcnotdownloaded=" + ccrcnotdownloaded + ", rofrdownloaded=" + rofrdownloaded
				+ ", rofrnotdownloaded=" + rofrnotdownloaded + ", perennialdownloaded=" + perennialdownloaded
				+ ", perennialnotdownloaded=" + perennialnotdownloaded + "]";
	}
	public DataSourceVillWiseModel(String cr_dist_code, String cr_mand_code, String cr_vcode, String dname,
			String mname, String wbevname, String totvillages, String rofr_cnt, String peri_cnt, String efish_cnt,
			String efishdownloaded, String efishnotdownloaded, String wb_cnt, String weblanddownloaded,
			String weblandnotdownloaded, String ccrc_cnt, String ccrcdownloaded, String ccrcnotdownloaded,
			String rofrdownloaded, String rofrnotdownloaded, String perennialdownloaded,
			String perennialnotdownloaded) {
		super();
		this.cr_dist_code = cr_dist_code;
		this.cr_mand_code = cr_mand_code;
		this.cr_vcode = cr_vcode;
		this.dname = dname;
		this.mname = mname;
		this.wbevname = wbevname;
		this.totvillages = totvillages;
		this.rofr_cnt = rofr_cnt;
		this.peri_cnt = peri_cnt;
		this.efish_cnt = efish_cnt;
		this.efishdownloaded = efishdownloaded;
		this.efishnotdownloaded = efishnotdownloaded;
		this.wb_cnt = wb_cnt;
		this.weblanddownloaded = weblanddownloaded;
		this.weblandnotdownloaded = weblandnotdownloaded;
		this.ccrc_cnt = ccrc_cnt;
		this.ccrcdownloaded = ccrcdownloaded;
		this.ccrcnotdownloaded = ccrcnotdownloaded;
		this.rofrdownloaded = rofrdownloaded;
		this.rofrnotdownloaded = rofrnotdownloaded;
		this.perennialdownloaded = perennialdownloaded;
		this.perennialnotdownloaded = perennialnotdownloaded;
	}
	public DataSourceVillWiseModel() {
		super();
	}
	
	
	
	
}
