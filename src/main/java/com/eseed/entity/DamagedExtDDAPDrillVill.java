package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DamagedExtDDAPDrillVill {
	private String wbedname;
	private String wbemname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbevname;
	private String cropname;
	private String cropnameeng;
	private Number bookedext;
	private Number damaged_ext;
	public DamagedExtDDAPDrillVill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DamagedExtDDAPDrillVill(String wbedname, String wbemname, String wbevname, String cropname,
			String cropnameeng, Number bookedext, Number damaged_ext) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.cropname = cropname;
		this.cropnameeng = cropnameeng;
		this.bookedext = bookedext;
		this.damaged_ext = damaged_ext;
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
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getCropnameeng() {
		return cropnameeng;
	}
	public void setCropnameeng(String cropnameeng) {
		this.cropnameeng = cropnameeng;
	}
	public Number getBookedext() {
		return bookedext;
	}
	public void setBookedext(Number bookedext) {
		this.bookedext = bookedext;
	}
	public Number getDamaged_ext() {
		return damaged_ext;
	}
	public void setDamaged_ext(Number damaged_ext) {
		this.damaged_ext = damaged_ext;
	}
	@Override
	public String toString() {
		return "DamagedExtDDAPDrillVill [wbedname=" + wbedname + ", wbemname=" + wbemname + ", wbevname=" + wbevname
				+ ", cropname=" + cropname + ", cropnameeng=" + cropnameeng + ", bookedext=" + bookedext
				+ ", damaged_ext=" + damaged_ext + "]";
	}
	

}
