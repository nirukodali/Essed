package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DistWisecCropinsuranceClaims {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String unitcode;
	private String wbdname;
	private String wbdcode;
	private String cropcode;
	private String cropname;
	private String claim;
	private String bookedext;
	private String claim_amount;
	private String farmers;
	
	
	public DistWisecCropinsuranceClaims() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DistWisecCropinsuranceClaims(String unitcode, String wbdname, String wbdcode, String cropcode,
			String cropname, String claim, String bookedext, String claim_amount, String farmers) {
		super();
		this.unitcode = unitcode;
		this.wbdname = wbdname;
		this.wbdcode = wbdcode;
		this.cropcode = cropcode;
		this.cropname = cropname;
		this.claim = claim;
		this.bookedext = bookedext;
		this.claim_amount = claim_amount;
		this.farmers = farmers;
	}


	public String getUnitcode() {
		return unitcode;
	}


	public void setUnitcode(String unitcode) {
		this.unitcode = unitcode;
	}


	public String getWbdname() {
		return wbdname;
	}


	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}


	public String getWbdcode() {
		return wbdcode;
	}


	public void setWbdcode(String wbdcode) {
		this.wbdcode = wbdcode;
	}


	public String getCropcode() {
		return cropcode;
	}


	public void setCropcode(String cropcode) {
		this.cropcode = cropcode;
	}


	public String getCropname() {
		return cropname;
	}


	public void setCropname(String cropname) {
		this.cropname = cropname;
	}


	public String getClaim() {
		return claim;
	}


	public void setClaim(String claim) {
		this.claim = claim;
	}


	public String getBookedext() {
		return bookedext;
	}


	public void setBookedext(String bookedext) {
		this.bookedext = bookedext;
	}


	public String getClaim_amount() {
		return claim_amount;
	}


	public void setClaim_amount(String claim_amount) {
		this.claim_amount = claim_amount;
	}


	public String getFarmers() {
		return farmers;
	}


	public void setFarmers(String farmers) {
		this.farmers = farmers;
	}


	@Override
	public String toString() {
		return "DistWisecCropinsuranceClaims [unitcode=" + unitcode + ", wbdname=" + wbdname + ", wbdcode=" + wbdcode
				+ ", cropcode=" + cropcode + ", cropname=" + cropname + ", claim=" + claim + ", bookedext=" + bookedext
				+ ", claim_amount=" + claim_amount + ", farmers=" + farmers + "]";
	}
	

}
