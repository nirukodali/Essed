package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RbkSurveyNoMapping {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	private String vname;
	private String	wbvname;
	private String srno_userid;
	private BigDecimal Mao_allotted_ext;
	private BigDecimal vaa_allotted_ext;
	public RbkSurveyNoMapping() {
		super();
	}
	
	public RbkSurveyNoMapping(String srno_userid, BigDecimal mao_allotted_ext, BigDecimal vaa_allotted_ext) {
		super();
		this.srno_userid = srno_userid;
		Mao_allotted_ext = mao_allotted_ext;
		this.vaa_allotted_ext = vaa_allotted_ext;
	}
	
	

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getSrno_userid() {
		return srno_userid;
	}
	public void setSrno_userid(String srno_userid) {
		this.srno_userid = srno_userid;
	}
	public BigDecimal getMao_allotted_ext() {
		return Mao_allotted_ext;
	}
	public void setMao_allotted_ext(BigDecimal mao_allotted_ext) {
		Mao_allotted_ext = mao_allotted_ext;
	}
	public BigDecimal getVaa_allotted_ext() {
		return vaa_allotted_ext;
	}
	public void setVaa_allotted_ext(BigDecimal vaa_allotted_ext) {
		this.vaa_allotted_ext = vaa_allotted_ext;
	}

	public String getWbvname() {
		return wbvname;
	}

	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	

}
