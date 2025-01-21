package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="village_crop_normalareas",schema="ecrop2024")
public class Updation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="season")
	private String season;
	
	@Column(name="cropyear")
	private int cropYear;
	
	@Column(name="dcode")
	private int dcode;
	
	@Column(name="mcode")
	private int mcode;
	
	@Column(name="vcode")
	private int vcode;
	
	@Column(name="normalarea")
	private float normalArea;
	
	@Column(name="targetarea")
	private float targetArea;
	
//	@OneToOne
//	@JoinColumn(name = "wbvname", insertable = false, updatable = false)
//	private WbMaster wbMaster;

	public Updation() {
		super();
	}

	public Updation(String season, int cropYear, int dcode, int mcode, int vcode, float normalArea,
			float targetArea ) {
		super();
		this.season = season;
		this.cropYear = cropYear;
		this.dcode = dcode;
		this.mcode = mcode;
		this.vcode = vcode;
		this.normalArea = normalArea;
		this.targetArea = targetArea;
	//	this.wbMaster = wbMaster;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public int getCropYear() {
		return cropYear;
	}

	public void setCropYear(int cropYear) {
		this.cropYear = cropYear;
	}

	public int getDcode() {
		return dcode;
	}

	public void setDcode(int dcode) {
		this.dcode = dcode;
	}

	public int getMcode() {
		return mcode;
	}

	public void setMcode(int mcode) {
		this.mcode = mcode;
	}

	public int getVcode() {
		return vcode;
	}

	public void setVcode(int vcode) {
		this.vcode = vcode;
	}

	public float getNormalArea() {
		return normalArea;
	}

	public void setNormalArea(float normalArea) {
		this.normalArea = normalArea;
	}

	public float getTargetArea() {
		return targetArea;
	}

	public void setTargetArea(float targetArea) {
		this.targetArea = targetArea;
	}

//	public WbMaster getWbMaster() {
//		return wbMaster;
//	}

//	public void setWbMaster(WbMaster wbMaster) {
//		this.wbMaster = wbMaster;
//	}

	@Override
	public String toString() {
		return "Updation [season=" + season + ", cropYear=" + cropYear + ", dcode=" + dcode + ", mcode=" + mcode
				+ ", vcode=" + vcode + ", normalArea=" + normalArea + ", targetArea=" + targetArea +  "]";
	}
	
	
	
}
