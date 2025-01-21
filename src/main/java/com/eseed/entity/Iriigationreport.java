package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Iriigationreport {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer dcode;
	private String dname;
	private Integer wbdcode;
	private Integer mcode;
	private String mname;
	private Integer wbmcode;
	private Integer cr_vcode;
	private String wbvname;
	private BigDecimal totext;
	private BigDecimal totextent_both;
	private BigDecimal cropname;
	private Integer cr_crop;
	private Integer grpcode;
	private BigDecimal cr_year;
	private String cr_season;
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Integer getWbdcode() {
		return wbdcode;
	}
	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}
	public Integer getMcode() {
		return mcode;
	}
	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Integer getWbmcode() {
		return wbmcode;
	}
	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}
	public Integer getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(Integer cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public BigDecimal getTotext() {
		return totext;
	}
	public void setTotext(BigDecimal totext) {
		this.totext = totext;
	}
	public BigDecimal getTotextent_both() {
		return totextent_both;
	}
	public void setTotextent_both(BigDecimal totextent_both) {
		this.totextent_both = totextent_both;
	}
	public BigDecimal getCropname() {
		return cropname;
	}
	public void setCropname(BigDecimal cropname) {
		this.cropname = cropname;
	}
	public Integer getCr_crop() {
		return cr_crop;
	}
	public void setCr_crop(Integer cr_crop) {
		this.cr_crop = cr_crop;
	}
	public Integer getGrpcode() {
		return grpcode;
	}
	public void setGrpcode(Integer grpcode) {
		this.grpcode = grpcode;
	}
	public BigDecimal getCr_year() {
		return cr_year;
	}
	public void setCr_year(BigDecimal cr_year) {
		this.cr_year = cr_year;
	}
	public String getCr_season() {
		return cr_season;
	}
	public void setCr_season(String cr_season) {
		this.cr_season = cr_season;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
}
	