package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CropInsAbstractt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String district;
	private String mandal;
	private String rbkname;
	private BigDecimal yb_farmers;
	private BigDecimal yb_extent;
	private BigDecimal yb_claimamt;
	private BigDecimal wb_farmers;
	private BigDecimal wb_extent;
	private BigDecimal wb_claimamt;
	public CropInsAbstractt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropInsAbstractt(String district, String mandal, String rbkname, BigDecimal yb_farmers, BigDecimal yb_extent,
			BigDecimal yb_claimamt, BigDecimal wb_farmers, BigDecimal wb_extent, BigDecimal wb_claimamt) {
		super();
		this.district = district;
		this.mandal = mandal;
		this.rbkname = rbkname;
		this.yb_farmers = yb_farmers;
		this.yb_extent = yb_extent;
		this.yb_claimamt = yb_claimamt;
		this.wb_farmers = wb_farmers;
		this.wb_extent = wb_extent;
		this.wb_claimamt = wb_claimamt;
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
	public String getRbkname() {
		return rbkname;
	}
	public void setRbkname(String rbkname) {
		this.rbkname = rbkname;
	}
	public BigDecimal getYb_farmers() {
		return yb_farmers;
	}
	public void setYb_farmers(BigDecimal yb_farmers) {
		this.yb_farmers = yb_farmers;
	}
	public BigDecimal getYb_extent() {
		return yb_extent;
	}
	public void setYb_extent(BigDecimal yb_extent) {
		this.yb_extent = yb_extent;
	}
	public BigDecimal getYb_claimamt() {
		return yb_claimamt;
	}
	public void setYb_claimamt(BigDecimal yb_claimamt) {
		this.yb_claimamt = yb_claimamt;
	}
	public BigDecimal getWb_farmers() {
		return wb_farmers;
	}
	public void setWb_farmers(BigDecimal wb_farmers) {
		this.wb_farmers = wb_farmers;
	}
	public BigDecimal getWb_extent() {
		return wb_extent;
	}
	public void setWb_extent(BigDecimal wb_extent) {
		this.wb_extent = wb_extent;
	}
	public BigDecimal getWb_claimamt() {
		return wb_claimamt;
	}
	public void setWb_claimamt(BigDecimal wb_claimamt) {
		this.wb_claimamt = wb_claimamt;
	}
	@Override
	public String toString() {
		return "CropInsAbstractt [district=" + district + ", mandal=" + mandal + ", rbkname=" + rbkname
				+ ", yb_farmers=" + yb_farmers + ", yb_extent=" + yb_extent + ", yb_claimamt=" + yb_claimamt
				+ ", wb_farmers=" + wb_farmers + ", wb_extent=" + wb_extent + ", wb_claimamt=" + wb_claimamt + "]";
	}
	
	

}
