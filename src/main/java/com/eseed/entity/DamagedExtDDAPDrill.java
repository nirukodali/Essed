package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DamagedExtDDAPDrill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbedname;
	private Number bookedext;
	private Number damaged_ext;
	private String cropname;
	private Number dcode;
	private String cropnameeng;
	public DamagedExtDDAPDrill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DamagedExtDDAPDrill(String wbedname, Number bookedext, Number damaged_ext, String cropname, Number dcode,
			String cropnameeng) {
		super();
		this.wbedname = wbedname;
		this.bookedext = bookedext;
		this.damaged_ext = damaged_ext;
		this.cropname = cropname;
		this.dcode = dcode;
		this.cropnameeng = cropnameeng;
	}
	public String getWbedname() {
		return wbedname;
	}
	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
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
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public Number getDcode() {
		return dcode;
	}
	public void setDcode(Number dcode) {
		this.dcode = dcode;
	}
	public String getCropnameeng() {
		return cropnameeng;
	}
	public void setCropnameeng(String cropnameeng) {
		this.cropnameeng = cropnameeng;
	}
	@Override
	public String toString() {
		return "DamagedExtDDAPDrill [wbedname=" + wbedname + ", bookedext=" + bookedext + ", damaged_ext=" + damaged_ext
				+ ", cropname=" + cropname + ", dcode=" + dcode + ", cropnameeng=" + cropnameeng + "]";
	}

	
}
