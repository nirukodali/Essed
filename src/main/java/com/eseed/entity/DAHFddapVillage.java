package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DAHFddapVillage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String vname;
	private Number agribookedext;
	private Long vagri_farmers;
	private Number hortibookedext;
	private Long vhorti_farmers;
	private Number seribookedext;
	private Long vseri_farmers;
	private Number wbdcode;
	private Number wbmcode;
	
	
	
	public DAHFddapVillage() {
		super();
		// TODO Auto-generated constructor stub
	}



	public DAHFddapVillage(String vname, Number agribookedext, Long vagri_farmers, Number hortibookedext,
			Long vhorti_farmers, Number seribookedext, Long vseri_farmers, Number wbdcode, Number wbmcode) {
		super();
		this.vname = vname;
		this.agribookedext = agribookedext;
		this.vagri_farmers = vagri_farmers;
		this.hortibookedext = hortibookedext;
		this.vhorti_farmers = vhorti_farmers;
		this.seribookedext = seribookedext;
		this.vseri_farmers = vseri_farmers;
		this.wbdcode = wbdcode;
		this.wbmcode = wbmcode;
	}



	public String getVname() {
		return vname;
	}



	public void setVname(String vname) {
		this.vname = vname;
	}



	public Number getAgribookedext() {
		return agribookedext;
	}



	public void setAgribookedext(Number agribookedext) {
		this.agribookedext = agribookedext;
	}



	public Long getVagri_farmers() {
		return vagri_farmers;
	}



	public void setVagri_farmers(Long vagri_farmers) {
		this.vagri_farmers = vagri_farmers;
	}



	public Number getHortibookedext() {
		return hortibookedext;
	}



	public void setHortibookedext(Number hortibookedext) {
		this.hortibookedext = hortibookedext;
	}



	public Long getVhorti_farmers() {
		return vhorti_farmers;
	}



	public void setVhorti_farmers(Long vhorti_farmers) {
		this.vhorti_farmers = vhorti_farmers;
	}



	public Number getSeribookedext() {
		return seribookedext;
	}



	public void setSeribookedext(Number seribookedext) {
		this.seribookedext = seribookedext;
	}



	public Long getVseri_farmers() {
		return vseri_farmers;
	}



	public void setVseri_farmers(Long vseri_farmers) {
		this.vseri_farmers = vseri_farmers;
	}



	public Number getWbdcode() {
		return wbdcode;
	}



	public void setWbdcode(Number wbdcode) {
		this.wbdcode = wbdcode;
	}



	public Number getWbmcode() {
		return wbmcode;
	}



	public void setWbmcode(Number wbmcode) {
		this.wbmcode = wbmcode;
	}



	@Override
	public String toString() {
		return "DAHFddapVillage [vname=" + vname + ", agribookedext=" + agribookedext + ", vagri_farmers="
				+ vagri_farmers + ", hortibookedext=" + hortibookedext + ", vhorti_farmers=" + vhorti_farmers
				+ ", seribookedext=" + seribookedext + ", vseri_farmers=" + vseri_farmers + ", wbdcode=" + wbdcode
				+ ", wbmcode=" + wbmcode + "]";
	}
}
