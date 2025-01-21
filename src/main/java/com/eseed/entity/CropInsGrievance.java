package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CropInsGrievance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private String wbmname;
	private String  wbvname;
	private String claimid;
	private String claim_type;
	private String gri_type;
	private String old_cropname;
	private String new_cropname;
	private String old_varietyname;
	private String new_varietyname;
	private String old_extent;
	private String new_extent;
	private String old_name;
	private String new_name;
	private String old_uid;
	private String newuid ;
	private String remarks;
	public CropInsGrievance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropInsGrievance(String wbdname, String wbmname, String wbvname, String claimid, String claim_type,
			String gri_type, String old_cropname, String new_cropname, String old_varietyname, String new_varietyname,
			String old_extent, String new_extent, String old_name, String new_name, String old_uid, String newuid,
			String remarks) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.claimid = claimid;
		this.claim_type = claim_type;
		this.gri_type = gri_type;
		this.old_cropname = old_cropname;
		this.new_cropname = new_cropname;
		this.old_varietyname = old_varietyname;
		this.new_varietyname = new_varietyname;
		this.old_extent = old_extent;
		this.new_extent = new_extent;
		this.old_name = old_name;
		this.new_name = new_name;
		this.old_uid = old_uid;
		this.newuid = newuid;
		this.remarks = remarks;
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
	public String getClaimid() {
		return claimid;
	}
	public void setClaimid(String claimid) {
		this.claimid = claimid;
	}
	public String getClaim_type() {
		return claim_type;
	}
	public void setClaim_type(String claim_type) {
		this.claim_type = claim_type;
	}
	public String getGri_type() {
		return gri_type;
	}
	public void setGri_type(String gri_type) {
		this.gri_type = gri_type;
	}
	public String getOld_cropname() {
		return old_cropname;
	}
	public void setOld_cropname(String old_cropname) {
		this.old_cropname = old_cropname;
	}
	public String getNew_cropname() {
		return new_cropname;
	}
	public void setNew_cropname(String new_cropname) {
		this.new_cropname = new_cropname;
	}
	public String getOld_varietyname() {
		return old_varietyname;
	}
	public void setOld_varietyname(String old_varietyname) {
		this.old_varietyname = old_varietyname;
	}
	public String getNew_varietyname() {
		return new_varietyname;
	}
	public void setNew_varietyname(String new_varietyname) {
		this.new_varietyname = new_varietyname;
	}
	public String getOld_extent() {
		return old_extent;
	}
	public void setOld_extent(String old_extent) {
		this.old_extent = old_extent;
	}
	public String getNew_extent() {
		return new_extent;
	}
	public void setNew_extent(String new_extent) {
		this.new_extent = new_extent;
	}
	public String getOld_name() {
		return old_name;
	}
	public void setOld_name(String old_name) {
		this.old_name = old_name;
	}
	public String getNew_name() {
		return new_name;
	}
	public void setNew_name(String new_name) {
		this.new_name = new_name;
	}
	public String getOld_uid() {
		return old_uid;
	}
	public void setOld_uid(String old_uid) {
		this.old_uid = old_uid;
	}
	public String getNewuid() {
		return newuid;
	}
	public void setNewuid(String newuid) {
		this.newuid = newuid;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "CropInsGrievance [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", claimid="
				+ claimid + ", claim_type=" + claim_type + ", gri_type=" + gri_type + ", old_cropname=" + old_cropname
				+ ", new_cropname=" + new_cropname + ", old_varietyname=" + old_varietyname + ", new_varietyname="
				+ new_varietyname + ", old_extent=" + old_extent + ", new_extent=" + new_extent + ", old_name="
				+ old_name + ", new_name=" + new_name + ", old_uid=" + old_uid + ", newuid=" + newuid + ", remarks="
				+ remarks + "]";
	}

}
