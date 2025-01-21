package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cropwise {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer dcode;
	private Integer mcode;
	private String mname;
	private Integer cropcode;
	private Integer cr_crop;
	private Integer crpid;
	private BigDecimal cr_year;
	private BigDecimal normalarea;
	private BigDecimal targetarea;
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
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Integer getCropcode() {
		return cropcode;
	}
	public void setCropcode(Integer cropcode) {
		this.cropcode = cropcode;
	}
	public Integer getCr_crop() {
		return cr_crop;
	}
	public void setCr_crop(Integer cr_crop) {
		this.cr_crop = cr_crop;
	}
	public Integer getCrpid() {
		return crpid;
	}
	public void setCrpid(Integer crpid) {
		this.crpid = crpid;
	}
	public BigDecimal getCr_year() {
		return cr_year;
	}
	public void setCr_year(BigDecimal cr_year) {
		this.cr_year = cr_year;
	}
	public BigDecimal getNormalarea() {
		return normalarea;
	}
	public void setNormalarea(BigDecimal normalarea) {
		this.normalarea = normalarea;
	}
	public BigDecimal getTargetarea() {
		return targetarea;
	}
	public void setTargetarea(BigDecimal targetarea) {
		this.targetarea = targetarea;
	}
	
}
	