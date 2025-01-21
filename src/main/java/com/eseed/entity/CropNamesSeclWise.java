package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CropNamesSeclWise {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String vname;
    private String vscode;
    private BigDecimal bookedext;
    private BigDecimal farmers;
    private BigDecimal cr_dist_code;
    private BigDecimal cr_mand_code;
	public CropNamesSeclWise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropNamesSeclWise(String vname, String vscode, BigDecimal bookedext, BigDecimal farmers) {
		super();
		this.vname = vname;
		this.vscode = vscode;
		this.bookedext = bookedext;
		this.farmers = farmers;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVscode() {
		return vscode;
	}
	public void setVscode(String vscode) {
		this.vscode = vscode;
	}
	public BigDecimal getBookedext() {
		return bookedext;
	}
	public void setBookedext(BigDecimal bookedext) {
		this.bookedext = bookedext;
	}
	public BigDecimal getFarmers() {
		return farmers;
	}
	public void setFarmers(BigDecimal farmers) {
		this.farmers = farmers;
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
	@Override
	public String toString() {
		return "CropNamesSeclWise [vname=" + vname + ", vscode=" + vscode + ", bookedext=" + bookedext + ", farmers="
				+ farmers + "]";
	}
    

    
}
