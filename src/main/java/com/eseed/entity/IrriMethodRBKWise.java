package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class IrriMethodRBKWise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private String wbmname;
	private String wbvname;
	private Long cf;
	private Integer ce;
	private Long df;
	private Integer de;
	private Long sf;
	private Integer se;
	private Long rf;
	private Integer re;

	public IrriMethodRBKWise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IrriMethodRBKWise(String wbdname, String wbmname, String wbvname, Long cf, Integer ce, Long df, Integer de,
			Long sf, Integer se, Long rf, Integer re) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.cf = cf;
		this.ce = ce;
		this.df = df;
		this.de = de;
		this.sf = sf;
		this.se = se;
		this.rf = rf;
		this.re = re;
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

	public Long getCf() {
		return cf;
	}

	public void setCf(Long cf) {
		this.cf = cf;
	}

	public Integer getCe() {
		return ce;
	}

	public void setCe(Integer ce) {
		this.ce = ce;
	}

	public Long getDf() {
		return df;
	}

	public void setDf(Long df) {
		this.df = df;
	}

	public Integer getDe() {
		return de;
	}

	public void setDe(Integer de) {
		this.de = de;
	}

	public Long getSf() {
		return sf;
	}

	public void setSf(Long sf) {
		this.sf = sf;
	}

	public Integer getSe() {
		return se;
	}

	public void setSe(Integer se) {
		this.se = se;
	}

	public Long getRf() {
		return rf;
	}

	public void setRf(Long rf) {
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
		return "IrriMethodRBKWise [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", cf=" + cf
				+ ", ce=" + ce + ", df=" + df + ", de=" + de + ", sf=" + sf + ", se=" + se + ", rf=" + rf + ", re=" + re
				+ "]";
	}

}
