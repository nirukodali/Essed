package com.eseed.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Authenticationabstract {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String mname;
	private Long benf_auth;
	private Long family_auth;
	private Long vaa_auth;
	private Integer cropyear;
	private Character season;
	private Integer dcode;
	private Character status;
	
	
	//AuthenticationAbstract2
	
	
	private BigInteger count;
    private BigInteger qty_recd;
	private Double ubsidyamt;
	private Integer mcode;
	//AuthenticationAbstract3
	private String name;
	private BigInteger cnt;
	private BigInteger qtyrecd;
	  private Double subsidyamt;
	public Authenticationabstract() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Authenticationabstract(String dname, String mname, Long benf_auth, Long family_auth, Long vaa_auth,
			Integer cropyear, Character season, Integer dcode, Character status, BigInteger count, BigInteger qty_recd,
			Double ubsidyamt, Integer mcode, String name, BigInteger cnt, BigInteger qtyrecd, Double subsidyamt) {
		super();
		this.dname = dname;
		this.mname = mname;
		this.benf_auth = benf_auth;
		this.family_auth = family_auth;
		this.vaa_auth = vaa_auth;
		this.cropyear = cropyear;
		this.season = season;
		this.dcode = dcode;
		this.status = status;
		this.count = count;
		this.qty_recd = qty_recd;
		this.ubsidyamt = ubsidyamt;
		this.mcode = mcode;
		this.name = name;
		this.cnt = cnt;
		this.qtyrecd = qtyrecd;
		this.subsidyamt = subsidyamt;
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
	public Long getBenf_auth() {
		return benf_auth;
	}
	public void setBenf_auth(Long benf_auth) {
		this.benf_auth = benf_auth;
	}
	public Long getFamily_auth() {
		return family_auth;
	}
	public void setFamily_auth(Long family_auth) {
		this.family_auth = family_auth;
	}
	public Long getVaa_auth() {
		return vaa_auth;
	}
	public void setVaa_auth(Long vaa_auth) {
		this.vaa_auth = vaa_auth;
	}
	public Integer getCropyear() {
		return cropyear;
	}
	public void setCropyear(Integer cropyear) {
		this.cropyear = cropyear;
	}
	public Character getSeason() {
		return season;
	}
	public void setSeason(Character season) {
		this.season = season;
	}
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public BigInteger getCount() {
		return count;
	}
	public void setCount(BigInteger count) {
		this.count = count;
	}
	public BigInteger getQty_recd() {
		return qty_recd;
	}
	public void setQty_recd(BigInteger qty_recd) {
		this.qty_recd = qty_recd;
	}
	public Double getUbsidyamt() {
		return ubsidyamt;
	}
	public void setUbsidyamt(Double ubsidyamt) {
		this.ubsidyamt = ubsidyamt;
	}
	public Integer getMcode() {
		return mcode;
	}
	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigInteger getCnt() {
		return cnt;
	}
	public void setCnt(BigInteger cnt) {
		this.cnt = cnt;
	}
	public BigInteger getQtyrecd() {
		return qtyrecd;
	}
	public void setQtyrecd(BigInteger qtyrecd) {
		this.qtyrecd = qtyrecd;
	}
	public Double getSubsidyamt() {
		return subsidyamt;
	}
	public void setSubsidyamt(Double subsidyamt) {
		this.subsidyamt = subsidyamt;
	}
	@Override
	public String toString() {
		return "Authenticationabstract [dname=" + dname + ", mname=" + mname + ", benf_auth=" + benf_auth
				+ ", family_auth=" + family_auth + ", vaa_auth=" + vaa_auth + ", cropyear=" + cropyear + ", season="
				+ season + ", dcode=" + dcode + ", status=" + status + ", count=" + count + ", qty_recd=" + qty_recd
				+ ", ubsidyamt=" + ubsidyamt + ", mcode=" + mcode + ", name=" + name + ", cnt=" + cnt + ", qtyrecd="
				+ qtyrecd + ", subsidyamt=" + subsidyamt + "]";
	}
	
	
}
