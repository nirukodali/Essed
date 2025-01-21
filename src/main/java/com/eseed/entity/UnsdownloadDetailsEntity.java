package com.eseed.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "unsdownloaddetails", schema = "ecrop2024")
public class UnsdownloadDetailsEntity {
@Id
	private int vcode;
	private String userid;
	private int no_of_records;
	private String ipaddress;
	private Timestamp downloadtime;
	private Timestamp datedownload;
	private int cropyear;
	private Character season;

	public int getVcode() {
		return vcode;
	}

	public void setVcode(int vcode) {
		this.vcode = vcode;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getNo_of_records() {
		return no_of_records;
	}

	public void setNo_of_records(int no_of_records) {
		this.no_of_records = no_of_records;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public Timestamp getDownloadtime() {
		return downloadtime;
	}

	public void setDownloadtime(Timestamp downloadtime) {
		this.downloadtime = downloadtime;
	}

	public Timestamp getDatedownload() {
		return datedownload;
	}

	public void setDatedownload(Timestamp datedownload) {
		this.datedownload = datedownload;
	}

	public int getCropyear() {
		return cropyear;
	}

	public void setCropyear(int cropyear) {
		this.cropyear = cropyear;
	}

	public Character getSeason() {
		return season;
	}

	public void setSeason(Character season) {
		this.season = season;
	}

}
