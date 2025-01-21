package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LandOwnershipVwise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbedname;
	private String wbemname;
	private String wbevname;
	private Long pf;
	private Integer pe;
	private Long cf;
	private Integer ce;
	private Long ef;
	private Integer ee;
	private Long ccf;
	private Integer cce;
	
	
	public LandOwnershipVwise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LandOwnershipVwise(String wbedname, String wbemname, String wbevname, Long pf, Integer pe, Long cf,
			Integer ce, Long ef, Integer ee, Long ccf, Integer cce) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.pf = pf;
		this.pe = pe;
		this.cf = cf;
		this.ce = ce;
		this.ef = ef;
		this.ee = ee;
		this.ccf = ccf;
		this.cce = cce;
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
		return "LandOwnershipVwise [wbedname=" + wbedname + ", wbemname=" + wbemname + ", wbevname=" + wbevname
				+ ", pf=" + pf + ", pe=" + pe + ", cf=" + cf + ", ce=" + ce + ", ef=" + ef + ", ee=" + ee + ", ccf="
				+ ccf + ", cce=" + cce + "]";
	}
	
	

}
