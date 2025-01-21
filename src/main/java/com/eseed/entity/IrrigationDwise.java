package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class IrrigationDwise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private Integer cf;
	private Integer ce;
	private Integer df;
	private Integer de;
	private Integer sf;
	private Integer se;
	private Integer rf;
	private Integer re;
	
	private Integer wbdcode;
	
	
	public IrrigationDwise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IrrigationDwise(String wbdname, Integer cf, Integer ce, Integer df, Integer de, Integer sf, Integer se,
			Integer rf, Integer re, Integer wbdcode) {
		super();
		this.wbdname = wbdname;
		this.cf = cf;
		this.ce = ce;
		this.df = df;
		this.de = de;
		this.sf = sf;
		this.se = se;
		this.rf = rf;
		this.re = re;
		this.wbdcode = wbdcode;
	}


	public String getWbdname() {
		return wbdname;
	}


	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}


	public Integer getCf() {
		return cf;
	}


	public void setCf(Integer cf) {
		this.cf = cf;
	}


	public Integer getCe() {
		return ce;
	}


	public void setCe(Integer ce) {
		this.ce = ce;
	}


	public Integer getDf() {
		return df;
	}


	public void setDf(Integer df) {
		this.df = df;
	}


	public Integer getDe() {
		return de;
	}


	public void setDe(Integer de) {
		this.de = de;
	}


	public Integer getSf() {
		return sf;
	}


	public void setSf(Integer sf) {
		this.sf = sf;
	}


	public Integer getSe() {
		return se;
	}


	public void setSe(Integer se) {
		this.se = se;
	}


	public Integer getRf() {
		return rf;
	}


	public void setRf(Integer rf) {
		this.rf = rf;
	}


	public Integer getRe() {
		return re;
	}


	public void setRe(Integer re) {
		this.re = re;
	}


	public Integer getWbdcode() {
		return wbdcode;
	}


	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}


	@Override
	public String toString() {
		return "IrrigationDwise [wbdname=" + wbdname + ", cf=" + cf + ", ce=" + ce + ", df=" + df + ", de=" + de
				+ ", sf=" + sf + ", se=" + se + ", rf=" + rf + ", re=" + re + ", wbdcode=" + wbdcode + "]";
	}


	

	
}
