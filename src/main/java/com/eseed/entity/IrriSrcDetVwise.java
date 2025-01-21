package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class IrriSrcDetVwise {
	private String dname;
	private String mname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String vname;
	private Long bwf;
	private BigDecimal bwe;
	private Long lf;
	private BigDecimal le;
	private Long cf;
	private BigDecimal ce;
	private Long tf;
	private BigDecimal te;
	private Long of;
	private BigDecimal oe;
	private Long rf;
	private BigDecimal re;

	public IrriSrcDetVwise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IrriSrcDetVwise(String dname, String mname, String vname, Long bwf, BigDecimal bwe, Long lf, BigDecimal le,
			Long cf, BigDecimal ce, Long tf, BigDecimal te, Long of, BigDecimal oe, Long rf, BigDecimal re) {
		super();
		this.dname = dname;
		this.mname = mname;
		this.vname = vname;
		this.bwf = bwf;
		this.bwe = bwe;
		this.lf = lf;
		this.le = le;
		this.cf = cf;
		this.ce = ce;
		this.tf = tf;
		this.te = te;
		this.of = of;
		this.oe = oe;
		this.rf = rf;
		this.re = re;
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

	public Long getBwf() {
		return bwf;
	}

	public void setBwf(Long bwf) {
		this.bwf = bwf;
	}

	public BigDecimal getBwe() {
		return bwe;
	}

	public void setBwe(BigDecimal bwe) {
		this.bwe = bwe;
	}

	public Long getLf() {
		return lf;
	}

	public void setLf(Long lf) {
		this.lf = lf;
	}

	public BigDecimal getLe() {
		return le;
	}

	public void setLe(BigDecimal le) {
		this.le = le;
	}

	public Long getCf() {
		return cf;
	}

	public void setCf(Long cf) {
		this.cf = cf;
	}

	public BigDecimal getCe() {
		return ce;
	}

	public void setCe(BigDecimal ce) {
		this.ce = ce;
	}

	public Long getTf() {
		return tf;
	}

	public void setTf(Long tf) {
		this.tf = tf;
	}

	public BigDecimal getTe() {
		return te;
	}

	public void setTe(BigDecimal te) {
		this.te = te;
	}

	public Long getOf() {
		return of;
	}

	public void setOf(Long of) {
		this.of = of;
	}

	public BigDecimal getOe() {
		return oe;
	}

	public void setOe(BigDecimal oe) {
		this.oe = oe;
	}

	public Long getRf() {
		return rf;
	}

	public void setRf(Long rf) {
		this.rf = rf;
	}

	public BigDecimal getRe() {
		return re;
	}

	public void setRe(BigDecimal re) {
		this.re = re;
	}

	@Override
	public String toString() {
		return "IrriSrcDetVwise [dname=" + dname + ", mname=" + mname + ", vname=" + vname + ", bwf=" + bwf + ", bwe="
				+ bwe + ", lf=" + lf + ", le=" + le + ", cf=" + cf + ", ce=" + ce + ", tf=" + tf + ", te=" + te
				+ ", of=" + of + ", oe=" + oe + ", rf=" + rf + ", re=" + re + "]";
	}

}
