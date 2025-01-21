package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SuperCheckIntf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mname;
	private String dao_allotted;
	private String dao_approved;
	private String dao_rejected;
	private String dao_updated;

	private String ada_allotted;
	private String ada_approved;
	private String ada_rejected;
	private String ada_updated;
	
	private String mao_allotted;
	private String mao_approved;
	private String mao_rejected;
	private String mao_updated;
	
	private String dho_allotted;
	private String dho_approved;
	private String dho_rejected;
	private String dho_updated;
	
	private String ho_allotted;
	private String ho_approved;
	private String ho_rejected;
	private String ho_updated;
	
	private String rdo_allotted;
	private String rdo_approved;
	private String rdo_rejected;
	private String rdo_updated;
	
	private String tah_allotted;
	private String tah_approved;
	private String tah_rejected;
	private String tah_updated;
	
	private String jc_allotted;
	private String jc_approved;
	private String jc_rejected;
	private String jc_updated;

	private String dc_allotted;
	private String dc_approved;
	private String dc_rejected;
	private String dc_updated;

	private String hod_allotted;
	private String hod_approved;
	private String hod_rejected;
	private String hod_updated;
	
	
	public SuperCheckIntf() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getDao_allotted() {
		return dao_allotted;
	}


	public void setDao_allotted(String dao_allotted) {
		this.dao_allotted = dao_allotted;
	}


	public String getDao_approved() {
		return dao_approved;
	}


	public void setDao_approved(String dao_approved) {
		this.dao_approved = dao_approved;
	}


	public String getDao_rejected() {
		return dao_rejected;
	}


	public void setDao_rejected(String dao_rejected) {
		this.dao_rejected = dao_rejected;
	}


	public String getDao_updated() {
		return dao_updated;
	}


	public void setDao_updated(String dao_updated) {
		this.dao_updated = dao_updated;
	}


	public String getAda_allotted() {
		return ada_allotted;
	}


	public void setAda_allotted(String ada_allotted) {
		this.ada_allotted = ada_allotted;
	}


	public String getAda_approved() {
		return ada_approved;
	}


	public void setAda_approved(String ada_approved) {
		this.ada_approved = ada_approved;
	}


	public String getAda_rejected() {
		return ada_rejected;
	}


	public void setAda_rejected(String ada_rejected) {
		this.ada_rejected = ada_rejected;
	}


	public String getAda_updated() {
		return ada_updated;
	}


	public void setAda_updated(String ada_updated) {
		this.ada_updated = ada_updated;
	}


	public String getMao_allotted() {
		return mao_allotted;
	}


	public void setMao_allotted(String mao_allotted) {
		this.mao_allotted = mao_allotted;
	}


	public String getMao_approved() {
		return mao_approved;
	}


	public void setMao_approved(String mao_approved) {
		this.mao_approved = mao_approved;
	}


	public String getMao_rejected() {
		return mao_rejected;
	}


	public void setMao_rejected(String mao_rejected) {
		this.mao_rejected = mao_rejected;
	}


	public String getMao_updated() {
		return mao_updated;
	}


	public void setMao_updated(String mao_updated) {
		this.mao_updated = mao_updated;
	}


	public String getDho_allotted() {
		return dho_allotted;
	}


	public void setDho_allotted(String dho_allotted) {
		this.dho_allotted = dho_allotted;
	}


	public String getDho_approved() {
		return dho_approved;
	}


	public void setDho_approved(String dho_approved) {
		this.dho_approved = dho_approved;
	}


	public String getDho_rejected() {
		return dho_rejected;
	}


	public void setDho_rejected(String dho_rejected) {
		this.dho_rejected = dho_rejected;
	}


	public String getDho_updated() {
		return dho_updated;
	}


	public void setDho_updated(String dho_updated) {
		this.dho_updated = dho_updated;
	}


	public String getHo_allotted() {
		return ho_allotted;
	}


	public void setHo_allotted(String ho_allotted) {
		this.ho_allotted = ho_allotted;
	}


	public String getHo_approved() {
		return ho_approved;
	}


	public void setHo_approved(String ho_approved) {
		this.ho_approved = ho_approved;
	}


	public String getHo_rejected() {
		return ho_rejected;
	}


	public void setHo_rejected(String ho_rejected) {
		this.ho_rejected = ho_rejected;
	}


	public String getHo_updated() {
		return ho_updated;
	}


	public void setHo_updated(String ho_updated) {
		this.ho_updated = ho_updated;
	}


	public String getRdo_allotted() {
		return rdo_allotted;
	}


	public void setRdo_allotted(String rdo_allotted) {
		this.rdo_allotted = rdo_allotted;
	}


	public String getRdo_approved() {
		return rdo_approved;
	}


	public void setRdo_approved(String rdo_approved) {
		this.rdo_approved = rdo_approved;
	}


	public String getRdo_rejected() {
		return rdo_rejected;
	}


	public void setRdo_rejected(String rdo_rejected) {
		this.rdo_rejected = rdo_rejected;
	}


	public String getRdo_updated() {
		return rdo_updated;
	}


	public void setRdo_updated(String rdo_updated) {
		this.rdo_updated = rdo_updated;
	}


	public String getTah_allotted() {
		return tah_allotted;
	}


	public void setTah_allotted(String tah_allotted) {
		this.tah_allotted = tah_allotted;
	}


	public String getTah_approved() {
		return tah_approved;
	}


	public void setTah_approved(String tah_approved) {
		this.tah_approved = tah_approved;
	}


	public String getTah_rejected() {
		return tah_rejected;
	}


	public void setTah_rejected(String tah_rejected) {
		this.tah_rejected = tah_rejected;
	}


	public String getTah_updated() {
		return tah_updated;
	}


	public void setTah_updated(String tah_updated) {
		this.tah_updated = tah_updated;
	}


	public String getJc_allotted() {
		return jc_allotted;
	}


	public void setJc_allotted(String jc_allotted) {
		this.jc_allotted = jc_allotted;
	}


	public String getJc_approved() {
		return jc_approved;
	}


	public void setJc_approved(String jc_approved) {
		this.jc_approved = jc_approved;
	}


	public String getJc_rejected() {
		return jc_rejected;
	}


	public void setJc_rejected(String jc_rejected) {
		this.jc_rejected = jc_rejected;
	}


	public String getJc_updated() {
		return jc_updated;
	}


	public void setJc_updated(String jc_updated) {
		this.jc_updated = jc_updated;
	}


	public String getDc_allotted() {
		return dc_allotted;
	}


	public void setDc_allotted(String dc_allotted) {
		this.dc_allotted = dc_allotted;
	}


	public String getDc_approved() {
		return dc_approved;
	}


	public void setDc_approved(String dc_approved) {
		this.dc_approved = dc_approved;
	}


	public String getDc_rejected() {
		return dc_rejected;
	}


	public void setDc_rejected(String dc_rejected) {
		this.dc_rejected = dc_rejected;
	}


	public String getDc_updated() {
		return dc_updated;
	}


	public void setDc_updated(String dc_updated) {
		this.dc_updated = dc_updated;
	}


	public String getHod_allotted() {
		return hod_allotted;
	}


	public void setHod_allotted(String hod_allotted) {
		this.hod_allotted = hod_allotted;
	}


	public String getHod_approved() {
		return hod_approved;
	}


	public void setHod_approved(String hod_approved) {
		this.hod_approved = hod_approved;
	}


	public String getHod_rejected() {
		return hod_rejected;
	}


	public void setHod_rejected(String hod_rejected) {
		this.hod_rejected = hod_rejected;
	}


	public String getHod_updated() {
		return hod_updated;
	}


	public void setHod_updated(String hod_updated) {
		this.hod_updated = hod_updated;
	}


	@Override
	public String toString() {
		return "SuperCheckIntf [mname=" + mname + ", dao_allotted=" + dao_allotted + ", dao_approved=" + dao_approved
				+ ", dao_rejected=" + dao_rejected + ", dao_updated=" + dao_updated + ", ada_allotted=" + ada_allotted
				+ ", ada_approved=" + ada_approved + ", ada_rejected=" + ada_rejected + ", ada_updated=" + ada_updated
				+ ", mao_allotted=" + mao_allotted + ", mao_approved=" + mao_approved + ", mao_rejected=" + mao_rejected
				+ ", mao_updated=" + mao_updated + ", dho_allotted=" + dho_allotted + ", dho_approved=" + dho_approved
				+ ", dho_rejected=" + dho_rejected + ", dho_updated=" + dho_updated + ", ho_allotted=" + ho_allotted
				+ ", ho_approved=" + ho_approved + ", ho_rejected=" + ho_rejected + ", ho_updated=" + ho_updated
				+ ", rdo_allotted=" + rdo_allotted + ", rdo_approved=" + rdo_approved + ", rdo_rejected=" + rdo_rejected
				+ ", rdo_updated=" + rdo_updated + ", tah_allotted=" + tah_allotted + ", tah_approved=" + tah_approved
				+ ", tah_rejected=" + tah_rejected + ", tah_updated=" + tah_updated + ", jc_allotted=" + jc_allotted
				+ ", jc_approved=" + jc_approved + ", jc_rejected=" + jc_rejected + ", jc_updated=" + jc_updated
				+ ", dc_allotted=" + dc_allotted + ", dc_approved=" + dc_approved + ", dc_rejected=" + dc_rejected
				+ ", dc_updated=" + dc_updated + ", hod_allotted=" + hod_allotted + ", hod_approved=" + hod_approved
				+ ", hod_rejected=" + hod_rejected + ", hod_updated=" + hod_updated + ", getMname()=" + getMname()
				+ ", getDao_allotted()=" + getDao_allotted() + ", getDao_approved()=" + getDao_approved()
				+ ", getDao_rejected()=" + getDao_rejected() + ", getDao_updated()=" + getDao_updated()
				+ ", getAda_allotted()=" + getAda_allotted() + ", getAda_approved()=" + getAda_approved()
				+ ", getAda_rejected()=" + getAda_rejected() + ", getAda_updated()=" + getAda_updated()
				+ ", getMao_allotted()=" + getMao_allotted() + ", getMao_approved()=" + getMao_approved()
				+ ", getMao_rejected()=" + getMao_rejected() + ", getMao_updated()=" + getMao_updated()
				+ ", getDho_allotted()=" + getDho_allotted() + ", getDho_approved()=" + getDho_approved()
				+ ", getDho_rejected()=" + getDho_rejected() + ", getDho_updated()=" + getDho_updated()
				+ ", getHo_allotted()=" + getHo_allotted() + ", getHo_approved()=" + getHo_approved()
				+ ", getHo_rejected()=" + getHo_rejected() + ", getHo_updated()=" + getHo_updated()
				+ ", getRdo_allotted()=" + getRdo_allotted() + ", getRdo_approved()=" + getRdo_approved()
				+ ", getRdo_rejected()=" + getRdo_rejected() + ", getRdo_updated()=" + getRdo_updated()
				+ ", getTah_allotted()=" + getTah_allotted() + ", getTah_approved()=" + getTah_approved()
				+ ", getTah_rejected()=" + getTah_rejected() + ", getTah_updated()=" + getTah_updated()
				+ ", getJc_allotted()=" + getJc_allotted() + ", getJc_approved()=" + getJc_approved()
				+ ", getJc_rejected()=" + getJc_rejected() + ", getJc_updated()=" + getJc_updated()
				+ ", getDc_allotted()=" + getDc_allotted() + ", getDc_approved()=" + getDc_approved()
				+ ", getDc_rejected()=" + getDc_rejected() + ", getDc_updated()=" + getDc_updated()
				+ ", getHod_allotted()=" + getHod_allotted() + ", getHod_approved()=" + getHod_approved()
				+ ", getHod_rejected()=" + getHod_rejected() + ", getHod_updated()=" + getHod_updated()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	
}
