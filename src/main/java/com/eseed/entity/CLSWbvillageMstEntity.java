package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wbvillage_mst", schema = "cropimages")
public class CLSWbvillageMstEntity {
	
	@Id
	private Integer wbdcode;
	
	private String wbdname;
	
	private Integer wbmcode;
	
	private String wbmname;
	
	private Integer wbvcode;
	
	private String wbvname;
	
	private Integer dcode;
	
	private Integer mcode;
	
	private Integer vcode;
	
	private Integer lgddcode;
	
	private String lgddname;
	
	private Integer lgdmcode;
	
	private String lgdmname;
	
	private Integer lgdvcode;
	
	private String lgdvname;
	
	private Integer vscode;
	
	private Character submerged;
	
	private String wbedname;
	
	private String wbemname;
	
	private String wbevname;
	
	private Integer lgdvcode_new;
	
	private Integer lgdvcode_old;
	
	private Character newupd;
	
	private Integer newwbdcode;
	
	private Integer newwbmcode;
	
	private Integer newwbvcode;
	
	private Integer oldwbdcode;
	
	private Integer oldwbmcode;
	
	private Integer oldwbvcode;
	
	private Character ecrop_dwn;
	
	private String dname;
	
	private String mname;
	
	private String dnameeng;
	
	private Character booking_completed;
	
	private Character jioreference;

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

	public Integer getLgddcode() {
		return lgddcode;
	}

	public void setLgddcode(Integer lgddcode) {
		this.lgddcode = lgddcode;
	}

	public String getLgddname() {
		return lgddname;
	}

	public void setLgddname(String lgddname) {
		this.lgddname = lgddname;
	}

	public Integer getLgdmcode() {
		return lgdmcode;
	}

	public void setLgdmcode(Integer lgdmcode) {
		this.lgdmcode = lgdmcode;
	}

	public String getLgdmname() {
		return lgdmname;
	}

	public void setLgdmname(String lgdmname) {
		this.lgdmname = lgdmname;
	}

	public Integer getLgdvcode() {
		return lgdvcode;
	}

	public void setLgdvcode(Integer lgdvcode) {
		this.lgdvcode = lgdvcode;
	}

	public String getLgdvname() {
		return lgdvname;
	}

	public void setLgdvname(String lgdvname) {
		this.lgdvname = lgdvname;
	}

	public Integer getVscode() {
		return vscode;
	}

	public void setVscode(Integer vscode) {
		this.vscode = vscode;
	}

	public Character getSubmerged() {
		return submerged;
	}

	public void setSubmerged(Character submerged) {
		this.submerged = submerged;
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

	public Integer getLgdvcode_new() {
		return lgdvcode_new;
	}

	public void setLgdvcode_new(Integer lgdvcode_new) {
		this.lgdvcode_new = lgdvcode_new;
	}

	public Integer getLgdvcode_old() {
		return lgdvcode_old;
	}

	public void setLgdvcode_old(Integer lgdvcode_old) {
		this.lgdvcode_old = lgdvcode_old;
	}

	public Character getNewupd() {
		return newupd;
	}

	public void setNewupd(Character newupd) {
		this.newupd = newupd;
	}

	public Integer getNewwbdcode() {
		return newwbdcode;
	}

	public void setNewwbdcode(Integer newwbdcode) {
		this.newwbdcode = newwbdcode;
	}

	public Integer getNewwbmcode() {
		return newwbmcode;
	}

	public void setNewwbmcode(Integer newwbmcode) {
		this.newwbmcode = newwbmcode;
	}

	public Integer getNewwbvcode() {
		return newwbvcode;
	}

	public void setNewwbvcode(Integer newwbvcode) {
		this.newwbvcode = newwbvcode;
	}

	public Integer getOldwbdcode() {
		return oldwbdcode;
	}

	public void setOldwbdcode(Integer oldwbdcode) {
		this.oldwbdcode = oldwbdcode;
	}

	public Integer getOldwbmcode() {
		return oldwbmcode;
	}

	public void setOldwbmcode(Integer oldwbmcode) {
		this.oldwbmcode = oldwbmcode;
	}

	public Integer getOldwbvcode() {
		return oldwbvcode;
	}

	public void setOldwbvcode(Integer oldwbvcode) {
		this.oldwbvcode = oldwbvcode;
	}

	public Character getEcrop_dwn() {
		return ecrop_dwn;
	}

	public void setEcrop_dwn(Character ecrop_dwn) {
		this.ecrop_dwn = ecrop_dwn;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getDnameeng() {
		return dnameeng;
	}

	public void setDnameeng(String dnameeng) {
		this.dnameeng = dnameeng;
	}

	public Character getBooking_completed() {
		return booking_completed;
	}

	public void setBooking_completed(Character booking_completed) {
		this.booking_completed = booking_completed;
	}

	public Character getJioreference() {
		return jioreference;
	}

	public void setJioreference(Character jioreference) {
		this.jioreference = jioreference;
	}
	
	
}
