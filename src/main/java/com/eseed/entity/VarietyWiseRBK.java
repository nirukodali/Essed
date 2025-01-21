package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class VarietyWiseRBK {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private String wbmname;
	private String wbvname;
	private String updatedby;
	private String vname;
	private String varietyname;
	private Long uid;
	private String ext;
	
	
	public VarietyWiseRBK() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VarietyWiseRBK(String wbdname, String wbmname, String wbvname, String updatedby, String vname,
			String varietyname, Long uid, String ext) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.updatedby = updatedby;
		this.vname = vname;
		this.varietyname = varietyname;
		this.uid = uid;
		this.ext = ext;
	}


	public String getWbdname() {
		return wbdname;
	}


	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}


	public String getWbmname() {
		return wbmname;
	}


	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}


	public String getWbvname() {
		return wbvname;
	}


	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}


	public String getUpdatedby() {
		return updatedby;
	}


	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}


	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}


	public String getVarietyname() {
		return varietyname;
	}


	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}


	public Long getUid() {
		return uid;
	}


	public void setUid(Long uid) {
		this.uid = uid;
	}


	public String getExt() {
		return ext;
	}


	public void setExt(String ext) {
		this.ext = ext;
	}


	@Override
	public String toString() {
		return "VarietyWiseRBK [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", updatedby="
				+ updatedby + ", vname=" + vname + ", varietyname=" + varietyname + ", uid=" + uid + ", ext=" + ext
				+ "]";
	}
	
	
	

}
