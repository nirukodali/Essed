package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TypeFarmingDetVwise {
	private String wbedname;
	private String wbemname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbevname;
	private Long conv_farmers;
	private BigDecimal con_ext;
	private Long nat_farmers;
	private BigDecimal nat_ext;
	private Long org_farmers;
	private BigDecimal org_ext;

	public TypeFarmingDetVwise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeFarmingDetVwise(String wbedname, String wbemname, String wbevname, Long conv_farmers, BigDecimal con_ext,
			Long nat_farmers, BigDecimal nat_ext, Long org_farmers, BigDecimal org_ext) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.conv_farmers = conv_farmers;
		this.con_ext = con_ext;
		this.nat_farmers = nat_farmers;
		this.nat_ext = nat_ext;
		this.org_farmers = org_farmers;
		this.org_ext = org_ext;
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

	public Long getConv_farmers() {
		return conv_farmers;
	}

	public void setConv_farmers(Long conv_farmers) {
		this.conv_farmers = conv_farmers;
	}

	public BigDecimal getCon_ext() {
		return con_ext;
	}

	public void setCon_ext(BigDecimal con_ext) {
		this.con_ext = con_ext;
	}

	public Long getNat_farmers() {
		return nat_farmers;
	}

	public void setNat_farmers(Long nat_farmers) {
		this.nat_farmers = nat_farmers;
	}

	public BigDecimal getNat_ext() {
		return nat_ext;
	}

	public void setNat_ext(BigDecimal nat_ext) {
		this.nat_ext = nat_ext;
	}

	public Long getOrg_farmers() {
		return org_farmers;
	}

	public void setOrg_farmers(Long org_farmers) {
		this.org_farmers = org_farmers;
	}

	public BigDecimal getOrg_ext() {
		return org_ext;
	}

	public void setOrg_ext(BigDecimal org_ext) {
		this.org_ext = org_ext;
	}

	@Override
	public String toString() {
		return "TypeFarmingDetVwise [wbedname=" + wbedname + ", wbemname=" + wbemname + ", wbevname=" + wbevname
				+ ", conv_farmers=" + conv_farmers + ", con_ext=" + con_ext + ", nat_farmers=" + nat_farmers
				+ ", nat_ext=" + nat_ext + ", org_farmers=" + org_farmers + ", org_ext=" + org_ext + "]";
	}

}
