package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class IrrigationMwise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbmname;
	private Integer cf;
	private Integer ce;
	private Integer df;
	private Integer de;
	private Integer sf;
	private Integer se;
	private Integer rf;
	private Integer re;
	
	
	public IrrigationMwise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IrrigationMwise(String wbmname, Integer cf, Integer ce, Integer df, Integer de, Integer sf, Integer se,
			Integer rf, Integer re) {
		super();
		this.wbmname = wbmname;
		this.cf = cf;
		this.ce = ce;
		this.df = df;
		this.de = de;
		this.sf = sf;
		this.se = se;
		this.rf = rf;
		this.re = re;
	}


	public String getWbmname() {
		return wbmname;
	}


	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
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


	@Override
	public String toString() {
		return "IrrigationMwise [wbmname=" + wbmname + ", cf=" + cf + ", ce=" + ce + ", df=" + df + ", de=" + de
				+ ", sf=" + sf + ", se=" + se + ", rf=" + rf + ", re=" + re + "]";
	} 
	

}
