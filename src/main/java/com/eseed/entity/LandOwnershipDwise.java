package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LandOwnershipDwise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private Long pf;
	private Integer pe;
	private Long cf;
	private Integer ce;
	private Long ef;
	private Integer ee;
	private Long ccf;
	private Integer cce;
	
	
	public LandOwnershipDwise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LandOwnershipDwise(String dname, Long pf, Integer pe, Long cf, Integer ce, Long ef, Integer ee, Long ccf,
			Integer cce) {
		super();
		this.dname = dname;
		this.pf = pf;
		this.pe = pe;
		this.cf = cf;
		this.ce = ce;
		this.ef = ef;
		this.ee = ee;
		this.ccf = ccf;
		this.cce = cce;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Long getPf() {
		return pf;
	}


	public void setPf(Long pf) {
		this.pf = pf;
	}


	public Integer getPe() {
		return pe;
	}


	public void setPe(Integer pe) {
		this.pe = pe;
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


	public Long getEf() {
		return ef;
	}


	public void setEf(Long ef) {
		this.ef = ef;
	}


	public Integer getEe() {
		return ee;
	}


	public void setEe(Integer ee) {
		this.ee = ee;
	}


	public Long getCcf() {
		return ccf;
	}


	public void setCcf(Long ccf) {
		this.ccf = ccf;
	}


	public Integer getCce() {
		return cce;
	}


	public void setCce(Integer cce) {
		this.cce = cce;
	}


	@Override
	public String toString() {
		return "LandOwnershipDwise [dname=" + dname + ", pf=" + pf + ", pe=" + pe + ", cf=" + cf + ", ce=" + ce
				+ ", ef=" + ef + ", ee=" + ee + ", ccf=" + ccf + ", cce=" + cce + "]";
	}
	
	
	

}
