package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wbvillage_mst")
public class WbVillageMastEntity {
	
	@Column(name="wbdcode")
	private Integer wbdcode;
	
	@Column(name="wbdname")
	private String wbdname;
	
	@Column(name="wbmcode")
	private Integer wbmcode;
	
	@Column(name="wbmname")
	private String wbmname;
	
	@Id
	@Column(name="wbvcode")
	private Integer wbvcode;
	
	@Column(name="wbvname")
	private String wbvname;
	
	@Column(name="dcode")
	private Integer dcode;
	
	@Column(name="mcode")
	private Integer mcode;
	
	@Column(name="vcode")
	private Integer vcode;
	
	@Column(name="wbevname")
	private String wbevname;

	public WbVillageMastEntity() {
		
	}

	@Override
	public String toString() {
		return "WbVillageEntity [wbdcode=" + wbdcode + ", wbdname=" + wbdname + ", wbmcode=" + wbmcode + ", wbmname="
				+ wbmname + ", wbvcode=" + wbvcode + ", wbvname=" + wbvname + ", dcode=" + dcode + ", mcode=" + mcode
				+ ", vcode=" + vcode + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getWbevname() {
		return wbevname;
	}

	public void setWbevname(String wbevname) {
		this.wbevname = wbevname;
	}

	public Integer getWbdcode() {
		return wbdcode;
	}

	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}

	public String getWbdname() {
		return wbdname;
	}

	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}

	public Integer getWbmcode() {
		return wbmcode;
	}

	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}

	public String getWbmname() {
		return wbmname;
	}

	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}

	public Integer getWbvcode() {
		return wbvcode;
	}

	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}

	public String getWbvname() {
		return wbvname;
	}

	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public Integer getMcode() {
		return mcode;
	}

	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}

	public Integer getVcode() {
		return vcode;
	}

	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}
	
	

}
