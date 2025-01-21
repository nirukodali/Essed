package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class LandSummary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String  wbedname;
	private String wbemname;
	private String  wbevname;
	private BigDecimal cultivableextent;
	private BigDecimal objectionalextent;
	private BigDecimal ccrcextent;
	private BigDecimal rofrextent;
	private BigDecimal nonwbextent;
	private BigDecimal efishext; 
	private BigDecimal maoallocated;
	private BigDecimal vaaselected;
	private BigDecimal cultivatorextent;
	private BigDecimal bookedextent;
	public LandSummary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LandSummary(String wbedname, String wbemname, String wbevname, BigDecimal cultivableextent,
			BigDecimal objectionalextent, BigDecimal ccrcextent, BigDecimal rofrextent, BigDecimal nonwbextent,
			BigDecimal efishext, BigDecimal maoallocated, BigDecimal vaaselected, BigDecimal cultivatorextent,
			BigDecimal bookedextent) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.cultivableextent = cultivableextent;
		this.objectionalextent = objectionalextent;
		this.ccrcextent = ccrcextent;
		this.rofrextent = rofrextent;
		this.nonwbextent = nonwbextent;
		this.efishext = efishext;
		this.maoallocated = maoallocated;
		this.vaaselected = vaaselected;
		this.cultivatorextent = cultivatorextent;
		this.bookedextent = bookedextent;
	}
	public String getWbedname() {
		return wbedname;
	}
	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}
	public String getWbemname() {
		return wbemname;
	}
	public void setWbemname(String wbemname) {
		this.wbemname = wbemname;
	}
	public String getWbevname() {
		return wbevname;
	}
	public void setWbevname(String wbevname) {
		this.wbevname = wbevname;
	}
	public BigDecimal getCultivableextent() {
		return cultivableextent;
	}
	public void setCultivableextent(BigDecimal cultivableextent) {
		this.cultivableextent = cultivableextent;
	}
	public BigDecimal getObjectionalextent() {
		return objectionalextent;
	}
	public void setObjectionalextent(BigDecimal objectionalextent) {
		this.objectionalextent = objectionalextent;
	}
	public BigDecimal getCcrcextent() {
		return ccrcextent;
	}
	public void setCcrcextent(BigDecimal ccrcextent) {
		this.ccrcextent = ccrcextent;
	}
	public BigDecimal getRofrextent() {
		return rofrextent;
	}
	public void setRofrextent(BigDecimal rofrextent) {
		this.rofrextent = rofrextent;
	}
	public BigDecimal getNonwbextent() {
		return nonwbextent;
	}
	public void setNonwbextent(BigDecimal nonwbextent) {
		this.nonwbextent = nonwbextent;
	}
	public BigDecimal getEfishext() {
		return efishext;
	}
	public void setEfishext(BigDecimal efishext) {
		this.efishext = efishext;
	}
	public BigDecimal getMaoallocated() {
		return maoallocated;
	}
	public void setMaoallocated(BigDecimal maoallocated) {
		this.maoallocated = maoallocated;
	}
	public BigDecimal getVaaselected() {
		return vaaselected;
	}
	public void setVaaselected(BigDecimal vaaselected) {
		this.vaaselected = vaaselected;
	}
	public BigDecimal getCultivatorextent() {
		return cultivatorextent;
	}
	public void setCultivatorextent(BigDecimal cultivatorextent) {
		this.cultivatorextent = cultivatorextent;
	}
	public BigDecimal getBookedextent() {
		return bookedextent;
	}
	public void setBookedextent(BigDecimal bookedextent) {
		this.bookedextent = bookedextent;
	}
	@Override
	public String toString() {
		return "LandSummary [wbedname=" + wbedname + ", wbemname=" + wbemname + ", wbevname=" + wbevname
				+ ", cultivableextent=" + cultivableextent + ", objectionalextent=" + objectionalextent
				+ ", ccrcextent=" + ccrcextent + ", rofrextent=" + rofrextent + ", nonwbextent=" + nonwbextent
				+ ", efishext=" + efishext + ", maoallocated=" + maoallocated + ", vaaselected=" + vaaselected
				+ ", cultivatorextent=" + cultivatorextent + ", bookedextent=" + bookedextent + "]";
	}
	

}
