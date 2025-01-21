package com.eseed.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DigitalAckEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mname;
	private BigInteger totsmscnt;
	private BigInteger sentsmscnt;
	private BigInteger remsmscnt;
	@Override
	public String toString() {
		return "DigitalAckEntity [mname=" + mname + ", totsmscnt=" + totsmscnt + ", sentsmscnt=" + sentsmscnt
				+ ", remsmscnt=" + remsmscnt + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public DigitalAckEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DigitalAckEntity(String mname, BigInteger totsmscnt, BigInteger sentsmscnt, BigInteger remsmscnt) {
		super();
		this.mname = mname;
		this.totsmscnt = totsmscnt;
		this.sentsmscnt = sentsmscnt;
		this.remsmscnt = remsmscnt;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public BigInteger getTotsmscnt() {
		return totsmscnt;
	}
	public void setTotsmscnt(BigInteger totsmscnt) {
		this.totsmscnt = totsmscnt;
	}
	public BigInteger getSentsmscnt() {
		return sentsmscnt;
	}
	public void setSentsmscnt(BigInteger sentsmscnt) {
		this.sentsmscnt = sentsmscnt;
	}
	public BigInteger getRemsmscnt() {
		return remsmscnt;
	}
	public void setRemsmscnt(BigInteger remsmscnt) {
		this.remsmscnt = remsmscnt;
	}

	
}
