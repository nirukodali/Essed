package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DamagedExtDDAP {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private String wbedname;
	private String wbemname;
	private String wbevname;
	private BigDecimal  no_of_farmers;
	 private BigDecimal  booked_ext;
	private BigDecimal  damaged_ext;
	
	
	
	public DamagedExtDDAP() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getWbedname() {
		return wbedname;
	}
	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}
	public BigDecimal getNo_of_farmers() {
		return no_of_farmers;
	}
	public void setNo_of_farmers(BigDecimal no_of_farmers) {
		this.no_of_farmers = no_of_farmers;
	}
	public BigDecimal getBooked_ext() {
		return booked_ext;
	}
	public void setBooked_ext(BigDecimal booked_ext) { 
		this.booked_ext = booked_ext;
	}
	public BigDecimal getDamaged_ext() {
		return damaged_ext;
	}
	public void setDamaged_ext(BigDecimal damaged_ext) {
		this.damaged_ext = damaged_ext;
	}


	public DamagedExtDDAP(String wbedname, String wbemname, String wbevname, BigDecimal no_of_farmers,
			BigDecimal booked_ext, BigDecimal damaged_ext) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.no_of_farmers = no_of_farmers;
		this.booked_ext = booked_ext;
		this.damaged_ext = damaged_ext;
	}
	
	

}
