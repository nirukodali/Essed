package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DamagedExtDDAPDrillMand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbedname;
	private String wbemname;
	private String cropname;
	private String cropnameeng;
	private Number bookedext;
	private Number damaged_ext;
	private Number dcode;
	private Number mcode;
	public DamagedExtDDAPDrillMand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DamagedExtDDAPDrillMand(String wbedname, String wbemname, String cropname, String cropnameeng,
			Number bookedext, Number damaged_ext, Number dcode, Number mcode) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.cropname = cropname;
		this.cropnameeng = cropnameeng;
		this.bookedext = bookedext;
		this.damaged_ext = damaged_ext;
		this.dcode = dcode;
		this.mcode = mcode;
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
	public Number getDcode() {
		return dcode;
	}
	public void setDcode(Number dcode) {
		this.dcode = dcode;
	}
	public Number getMcode() {
		return mcode;
	}
	public void setMcode(Number mcode) {
		this.mcode = mcode;
	}
	@Override
	public String toString() {
		return "DamagedExtDDAPDrillMand [wbedname=" + wbedname + ", wbemname=" + wbemname + ", cropname=" + cropname
				+ ", cropnameeng=" + cropnameeng + ", bookedext=" + bookedext + ", damaged_ext=" + damaged_ext
				+ ", dcode=" + dcode + ", mcode=" + mcode + "]";
	}
	

}
