package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DistrictWiseDigiAck {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private Long totSmsCnt;
	private Long sentSmsCnt;
	private Long remSmsCnt;
	
	public DistrictWiseDigiAck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistrictWiseDigiAck(String dname, Long totSmsCnt, Long sentSmsCnt, Long remSmsCnt) {
		super();
		this.dname = dname;
		this.totSmsCnt = totSmsCnt;
		this.sentSmsCnt = sentSmsCnt;
		this.remSmsCnt = remSmsCnt;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Long getTotSmsCnt() {
		return totSmsCnt;
	}

	public void setTotSmsCnt(Long totSmsCnt) {
		this.totSmsCnt = totSmsCnt;
	}

	public Long getSentSmsCnt() {
		return sentSmsCnt;
	}

	public void setSentSmsCnt(Long sentSmsCnt) {
		this.sentSmsCnt = sentSmsCnt;
	}

	public Long getRemSmsCnt() {
		return remSmsCnt;
	}

	public void setRemSmsCnt(Long remSmsCnt) {
		this.remSmsCnt = remSmsCnt;
	}

	@Override
	public String toString() {
		return "DistrictWiseDigiAck [dname=" + dname + ", totSmsCnt=" + totSmsCnt + ", sentSmsCnt=" + sentSmsCnt
				+ ", remSmsCnt=" + remSmsCnt + "]";
	}
	

	
}
