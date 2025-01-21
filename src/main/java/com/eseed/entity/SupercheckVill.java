package com.eseed.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SupercheckVill {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private String wbvname;
	private BigInteger hod_allotted;
	private BigInteger hod_approved;
	private BigInteger hod_rejected;
	private BigInteger hod_updated;
	
	private BigInteger dao_allotted;
	private BigInteger dao_approved;
	private BigInteger dao_rejected;
	private BigInteger dao_updated;
	
	private BigInteger ada_allotted;
	private BigInteger ada_approved;
	private BigInteger ada_rejected;
	private BigInteger ada_updated;
	
	private BigInteger mao_allotted;
	private BigInteger mao_approved;
	private BigInteger mao_rejected;
	private BigInteger mao_updated;
	
	private BigInteger dho_allotted;
	private BigInteger dho_approved;
	private BigInteger dho_rejected;
	private BigInteger dho_updated;
	
	private BigInteger ho_allotted;
	private BigInteger ho_approved;
	private BigInteger ho_rejected;
	private BigInteger ho_updated;
	
	private BigInteger rdo_allotted;
	private BigInteger rdo_approved;
	private BigInteger rdo_rejected;
	private BigInteger rdo_updated;
	
	private BigInteger tah_allotted;
	private BigInteger tah_approved;
	private BigInteger tah_rejected;
	private BigInteger tah_updated;
	
	private BigInteger dc_allotted;
	private BigInteger dc_approved;
	private BigInteger dc_rejected;
	private BigInteger dc_updated;
	
	private BigInteger jc_allotted;
	private BigInteger jc_approved;
	private BigInteger jc_rejected;
	private BigInteger jc_updated;
	
	private String cr_dist_code;
	private String cr_mand_code;
	private Integer mcode;
	private String dname;
	private String mname;
	public SupercheckVill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SupercheckVill(String wbvname, BigInteger hod_allotted, BigInteger hod_approved, BigInteger hod_rejected,
			BigInteger hod_updated, BigInteger dao_allotted, BigInteger dao_approved, BigInteger dao_rejected,
			BigInteger dao_updated, BigInteger ada_allotted, BigInteger ada_approved, BigInteger ada_rejected,
			BigInteger ada_updated, BigInteger mao_allotted, BigInteger mao_approved, BigInteger mao_rejected,
			BigInteger mao_updated, BigInteger dho_allotted, BigInteger dho_approved, BigInteger dho_rejected,
			BigInteger dho_updated, BigInteger ho_allotted, BigInteger ho_approved, BigInteger ho_rejected,
			BigInteger ho_updated, BigInteger rdo_allotted, BigInteger rdo_approved, BigInteger rdo_rejected,
			BigInteger rdo_updated, BigInteger tah_allotted, BigInteger tah_approved, BigInteger tah_rejected,
			BigInteger tah_updated, BigInteger dc_allotted, BigInteger dc_approved, BigInteger dc_rejected,
			BigInteger dc_updated, BigInteger jc_allotted, BigInteger jc_approved, BigInteger jc_rejected,
			BigInteger jc_updated, String cr_dist_code, String cr_mand_code, Integer mcode, String dname,
			String mname) {
		super();
		this.wbvname = wbvname;
		this.hod_allotted = hod_allotted;
		this.hod_approved = hod_approved;
		this.hod_rejected = hod_rejected;
		this.hod_updated = hod_updated;
		this.dao_allotted = dao_allotted;
		this.dao_approved = dao_approved;
		this.dao_rejected = dao_rejected;
		this.dao_updated = dao_updated;
		this.ada_allotted = ada_allotted;
		this.ada_approved = ada_approved;
		this.ada_rejected = ada_rejected;
		this.ada_updated = ada_updated;
		this.mao_allotted = mao_allotted;
		this.mao_approved = mao_approved;
		this.mao_rejected = mao_rejected;
		this.mao_updated = mao_updated;
		this.dho_allotted = dho_allotted;
		this.dho_approved = dho_approved;
		this.dho_rejected = dho_rejected;
		this.dho_updated = dho_updated;
		this.ho_allotted = ho_allotted;
		this.ho_approved = ho_approved;
		this.ho_rejected = ho_rejected;
		this.ho_updated = ho_updated;
		this.rdo_allotted = rdo_allotted;
		this.rdo_approved = rdo_approved;
		this.rdo_rejected = rdo_rejected;
		this.rdo_updated = rdo_updated;
		this.tah_allotted = tah_allotted;
		this.tah_approved = tah_approved;
		this.tah_rejected = tah_rejected;
		this.tah_updated = tah_updated;
		this.dc_allotted = dc_allotted;
		this.dc_approved = dc_approved;
		this.dc_rejected = dc_rejected;
		this.dc_updated = dc_updated;
		this.jc_allotted = jc_allotted;
		this.jc_approved = jc_approved;
		this.jc_rejected = jc_rejected;
		this.jc_updated = jc_updated;
		this.cr_dist_code = cr_dist_code;
		this.cr_mand_code = cr_mand_code;
		this.mcode = mcode;
		this.dname = dname;
		this.mname = mname;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public BigInteger getHod_allotted() {
		return hod_allotted;
	}
	public void setHod_allotted(BigInteger hod_allotted) {
		this.hod_allotted = hod_allotted;
	}
	public BigInteger getHod_approved() {
		return hod_approved;
	}
	public void setHod_approved(BigInteger hod_approved) {
		this.hod_approved = hod_approved;
	}
	public BigInteger getHod_rejected() {
		return hod_rejected;
	}
	public void setHod_rejected(BigInteger hod_rejected) {
		this.hod_rejected = hod_rejected;
	}
	public BigInteger getHod_updated() {
		return hod_updated;
	}
	public void setHod_updated(BigInteger hod_updated) {
		this.hod_updated = hod_updated;
	}
	public BigInteger getDao_allotted() {
		return dao_allotted;
	}
	public void setDao_allotted(BigInteger dao_allotted) {
		this.dao_allotted = dao_allotted;
	}
	public BigInteger getDao_approved() {
		return dao_approved;
	}
	public void setDao_approved(BigInteger dao_approved) {
		this.dao_approved = dao_approved;
	}
	public BigInteger getDao_rejected() {
		return dao_rejected;
	}
	public void setDao_rejected(BigInteger dao_rejected) {
		this.dao_rejected = dao_rejected;
	}
	public BigInteger getDao_updated() {
		return dao_updated;
	}
	public void setDao_updated(BigInteger dao_updated) {
		this.dao_updated = dao_updated;
	}
	public BigInteger getAda_allotted() {
		return ada_allotted;
	}
	public void setAda_allotted(BigInteger ada_allotted) {
		this.ada_allotted = ada_allotted;
	}
	public BigInteger getAda_approved() {
		return ada_approved;
	}
	public void setAda_approved(BigInteger ada_approved) {
		this.ada_approved = ada_approved;
	}
	public BigInteger getAda_rejected() {
		return ada_rejected;
	}
	public void setAda_rejected(BigInteger ada_rejected) {
		this.ada_rejected = ada_rejected;
	}
	public BigInteger getAda_updated() {
		return ada_updated;
	}
	public void setAda_updated(BigInteger ada_updated) {
		this.ada_updated = ada_updated;
	}
	public BigInteger getMao_allotted() {
		return mao_allotted;
	}
	public void setMao_allotted(BigInteger mao_allotted) {
		this.mao_allotted = mao_allotted;
	}
	public BigInteger getMao_approved() {
		return mao_approved;
	}
	public void setMao_approved(BigInteger mao_approved) {
		this.mao_approved = mao_approved;
	}
	public BigInteger getMao_rejected() {
		return mao_rejected;
	}
	public void setMao_rejected(BigInteger mao_rejected) {
		this.mao_rejected = mao_rejected;
	}
	public BigInteger getMao_updated() {
		return mao_updated;
	}
	public void setMao_updated(BigInteger mao_updated) {
		this.mao_updated = mao_updated;
	}
	public BigInteger getDho_allotted() {
		return dho_allotted;
	}
	public void setDho_allotted(BigInteger dho_allotted) {
		this.dho_allotted = dho_allotted;
	}
	public BigInteger getDho_approved() {
		return dho_approved;
	}
	public void setDho_approved(BigInteger dho_approved) {
		this.dho_approved = dho_approved;
	}
	public BigInteger getDho_rejected() {
		return dho_rejected;
	}
	public void setDho_rejected(BigInteger dho_rejected) {
		this.dho_rejected = dho_rejected;
	}
	public BigInteger getDho_updated() {
		return dho_updated;
	}
	public void setDho_updated(BigInteger dho_updated) {
		this.dho_updated = dho_updated;
	}
	public BigInteger getHo_allotted() {
		return ho_allotted;
	}
	public void setHo_allotted(BigInteger ho_allotted) {
		this.ho_allotted = ho_allotted;
	}
	public BigInteger getHo_approved() {
		return ho_approved;
	}
	public void setHo_approved(BigInteger ho_approved) {
		this.ho_approved = ho_approved;
	}
	public BigInteger getHo_rejected() {
		return ho_rejected;
	}
	public void setHo_rejected(BigInteger ho_rejected) {
		this.ho_rejected = ho_rejected;
	}
	public BigInteger getHo_updated() {
		return ho_updated;
	}
	public void setHo_updated(BigInteger ho_updated) {
		this.ho_updated = ho_updated;
	}
	public BigInteger getRdo_allotted() {
		return rdo_allotted;
	}
	public void setRdo_allotted(BigInteger rdo_allotted) {
		this.rdo_allotted = rdo_allotted;
	}
	public BigInteger getRdo_approved() {
		return rdo_approved;
	}
	public void setRdo_approved(BigInteger rdo_approved) {
		this.rdo_approved = rdo_approved;
	}
	public BigInteger getRdo_rejected() {
		return rdo_rejected;
	}
	public void setRdo_rejected(BigInteger rdo_rejected) {
		this.rdo_rejected = rdo_rejected;
	}
	public BigInteger getRdo_updated() {
		return rdo_updated;
	}
	public void setRdo_updated(BigInteger rdo_updated) {
		this.rdo_updated = rdo_updated;
	}
	public BigInteger getTah_allotted() {
		return tah_allotted;
	}
	public void setTah_allotted(BigInteger tah_allotted) {
		this.tah_allotted = tah_allotted;
	}
	public BigInteger getTah_approved() {
		return tah_approved;
	}
	public void setTah_approved(BigInteger tah_approved) {
		this.tah_approved = tah_approved;
	}
	public BigInteger getTah_rejected() {
		return tah_rejected;
	}
	public void setTah_rejected(BigInteger tah_rejected) {
		this.tah_rejected = tah_rejected;
	}
	public BigInteger getTah_updated() {
		return tah_updated;
	}
	public void setTah_updated(BigInteger tah_updated) {
		this.tah_updated = tah_updated;
	}
	public BigInteger getDc_allotted() {
		return dc_allotted;
	}
	public void setDc_allotted(BigInteger dc_allotted) {
		this.dc_allotted = dc_allotted;
	}
	public BigInteger getDc_approved() {
		return dc_approved;
	}
	public void setDc_approved(BigInteger dc_approved) {
		this.dc_approved = dc_approved;
	}
	public BigInteger getDc_rejected() {
		return dc_rejected;
	}
	public void setDc_rejected(BigInteger dc_rejected) {
		this.dc_rejected = dc_rejected;
	}
	public BigInteger getDc_updated() {
		return dc_updated;
	}
	public void setDc_updated(BigInteger dc_updated) {
		this.dc_updated = dc_updated;
	}
	public BigInteger getJc_allotted() {
		return jc_allotted;
	}
	public void setJc_allotted(BigInteger jc_allotted) {
		this.jc_allotted = jc_allotted;
	}
	public BigInteger getJc_approved() {
		return jc_approved;
	}
	public void setJc_approved(BigInteger jc_approved) {
		this.jc_approved = jc_approved;
	}
	public BigInteger getJc_rejected() {
		return jc_rejected;
	}
	public void setJc_rejected(BigInteger jc_rejected) {
		this.jc_rejected = jc_rejected;
	}
	public BigInteger getJc_updated() {
		return jc_updated;
	}
	public void setJc_updated(BigInteger jc_updated) {
		this.jc_updated = jc_updated;
	}
	public String getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(String cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	public String getCr_mand_code() {
		return cr_mand_code;
	}
	public void setCr_mand_code(String cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}
	public Integer getMcode() {
		return mcode;
	}
	public void setMcode(Integer mcode) {
		this.mcode = mcode;
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
	@Override
	public String toString() {
		return "SupercheckVill [wbvname=" + wbvname + ", hod_allotted=" + hod_allotted + ", hod_approved="
				+ hod_approved + ", hod_rejected=" + hod_rejected + ", hod_updated=" + hod_updated + ", dao_allotted="
				+ dao_allotted + ", dao_approved=" + dao_approved + ", dao_rejected=" + dao_rejected + ", dao_updated="
				+ dao_updated + ", ada_allotted=" + ada_allotted + ", ada_approved=" + ada_approved + ", ada_rejected="
				+ ada_rejected + ", ada_updated=" + ada_updated + ", mao_allotted=" + mao_allotted + ", mao_approved="
				+ mao_approved + ", mao_rejected=" + mao_rejected + ", mao_updated=" + mao_updated + ", dho_allotted="
				+ dho_allotted + ", dho_approved=" + dho_approved + ", dho_rejected=" + dho_rejected + ", dho_updated="
				+ dho_updated + ", ho_allotted=" + ho_allotted + ", ho_approved=" + ho_approved + ", ho_rejected="
				+ ho_rejected + ", ho_updated=" + ho_updated + ", rdo_allotted=" + rdo_allotted + ", rdo_approved="
				+ rdo_approved + ", rdo_rejected=" + rdo_rejected + ", rdo_updated=" + rdo_updated + ", tah_allotted="
				+ tah_allotted + ", tah_approved=" + tah_approved + ", tah_rejected=" + tah_rejected + ", tah_updated="
				+ tah_updated + ", dc_allotted=" + dc_allotted + ", dc_approved=" + dc_approved + ", dc_rejected="
				+ dc_rejected + ", dc_updated=" + dc_updated + ", jc_allotted=" + jc_allotted + ", jc_approved="
				+ jc_approved + ", jc_rejected=" + jc_rejected + ", jc_updated=" + jc_updated + ", cr_dist_code="
				+ cr_dist_code + ", cr_mand_code=" + cr_mand_code + ", mcode=" + mcode + ", dname=" + dname + ", mname="
				+ mname + "]";
	}
	
	
	

}
