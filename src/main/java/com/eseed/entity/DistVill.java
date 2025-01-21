package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DistVill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String mname;
	private String vname;
	private Long totallps;
	private Long lps_downloaded;
	private Number tvil_ext;
	private Number vil_ext_downloaded;
	
	
	public DistVill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DistVill(String dname, String mname, String vname, Long totallps, Long lps_downloaded, BigDecimal tvil_ext,
			BigDecimal vil_ext_downloaded) {
		super();
		this.dname = dname;
		this.mname = mname;
		this.vname = vname;
		this.totallps = totallps;
		this.lps_downloaded = lps_downloaded;
		this.tvil_ext = tvil_ext;
		this.vil_ext_downloaded = vil_ext_downloaded;
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
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Long getTotallps() {
		return totallps;
	}
	public void setTotallps(Long totallps) {
		this.totallps = totallps;
	}
	public Long getLps_downloaded() {
		return lps_downloaded;
	}
	public void setLps_downloaded(Long lps_downloaded) {
		this.lps_downloaded = lps_downloaded;
	}
	public Number getTvil_ext() {
		return tvil_ext;
	}
	public void setTvil_ext(Number tvil_ext) {
		this.tvil_ext = tvil_ext;
	}
	public Number getVil_ext_downloaded() {
		return vil_ext_downloaded;
	}
	public void setVil_ext_downloaded(Number vil_ext_downloaded) {
		this.vil_ext_downloaded = vil_ext_downloaded;
	}
	@Override
	public String toString() {
		return "DistVill [dname=" + dname + ", mname=" + mname + ", vname=" + vname + ", totallps=" + totallps
				+ ", lps_downloaded=" + lps_downloaded + ", tvil_ext=" + tvil_ext + ", vil_ext_downloaded="
				+ vil_ext_downloaded + "]";
	}
	
	
	
	
}
