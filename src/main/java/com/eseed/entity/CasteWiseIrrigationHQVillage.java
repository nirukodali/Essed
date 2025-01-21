package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CasteWiseIrrigationHQVillage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private String wbmname;
	private String wbvname;
	private Number sc_conventional_farmers_total;
	private Number sc_conventional_ext_total;
	private Number st_conventional_farmers_total;
	private Number st_conventional_ext_total;
	private Number bc_conventional_farmers_total;
	private Number bc_conventional_ext_total;
	private Number gen_conventional_farmers_total;
	private Number gen_conventional_ext_total;
	
	private Number sc_dripirr_farmers_total;
	private Number sc_dripirr_ext_total;
	private Number st_dripirr_farmers_total;
	private Number st_dripirr_ext_total;
	private Number bc_dripirr_farmers_total;
	private Number bc_dripirr_ext_total;
	private Number gen_dripirr_farmers_total;
	private Number gen_dripirr_ext_total;
	
	private Number sc_sprinkler_farmers_total;
	private Number sc_sprinkler_ext_total;
	private Number st_sprinkler_farmers_total;
	private Number st_sprinkler_ext_total;
	private Number bc_sprinkler_farmers_total;
	private Number bc_sprinkler_ext_total;
	private Number gen_sprinkler_farmers_total;
	private Number gen_sprinkler_ext_total;
	
	
	public CasteWiseIrrigationHQVillage() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CasteWiseIrrigationHQVillage(String wbdname, String wbmname, String wbvname,
			Number sc_conventional_farmers_total, Number sc_conventional_ext_total,
			Number st_conventional_farmers_total, Number st_conventional_ext_total,
			Number bc_conventional_farmers_total, Number bc_conventional_ext_total,
			Number gen_conventional_farmers_total, Number gen_conventional_ext_total, Number sc_dripirr_farmers_total,
			Number sc_dripirr_ext_total, Number st_dripirr_farmers_total, Number st_dripirr_ext_total,
			Number bc_dripirr_farmers_total, Number bc_dripirr_ext_total, Number gen_dripirr_farmers_total,
			Number gen_dripirr_ext_total, Number sc_sprinkler_farmers_total, Number sc_sprinkler_ext_total,
			Number st_sprinkler_farmers_total, Number st_sprinkler_ext_total, Number bc_sprinkler_farmers_total,
			Number bc_sprinkler_ext_total, Number gen_sprinkler_farmers_total, Number gen_sprinkler_ext_total) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.sc_conventional_farmers_total = sc_conventional_farmers_total;
		this.sc_conventional_ext_total = sc_conventional_ext_total;
		this.st_conventional_farmers_total = st_conventional_farmers_total;
		this.st_conventional_ext_total = st_conventional_ext_total;
		this.bc_conventional_farmers_total = bc_conventional_farmers_total;
		this.bc_conventional_ext_total = bc_conventional_ext_total;
		this.gen_conventional_farmers_total = gen_conventional_farmers_total;
		this.gen_conventional_ext_total = gen_conventional_ext_total;
		this.sc_dripirr_farmers_total = sc_dripirr_farmers_total;
		this.sc_dripirr_ext_total = sc_dripirr_ext_total;
		this.st_dripirr_farmers_total = st_dripirr_farmers_total;
		this.st_dripirr_ext_total = st_dripirr_ext_total;
		this.bc_dripirr_farmers_total = bc_dripirr_farmers_total;
		this.bc_dripirr_ext_total = bc_dripirr_ext_total;
		this.gen_dripirr_farmers_total = gen_dripirr_farmers_total;
		this.gen_dripirr_ext_total = gen_dripirr_ext_total;
		this.sc_sprinkler_farmers_total = sc_sprinkler_farmers_total;
		this.sc_sprinkler_ext_total = sc_sprinkler_ext_total;
		this.st_sprinkler_farmers_total = st_sprinkler_farmers_total;
		this.st_sprinkler_ext_total = st_sprinkler_ext_total;
		this.bc_sprinkler_farmers_total = bc_sprinkler_farmers_total;
		this.bc_sprinkler_ext_total = bc_sprinkler_ext_total;
		this.gen_sprinkler_farmers_total = gen_sprinkler_farmers_total;
		this.gen_sprinkler_ext_total = gen_sprinkler_ext_total;
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


	public Number getSc_conventional_farmers_total() {
		return sc_conventional_farmers_total;
	}


	public void setSc_conventional_farmers_total(Number sc_conventional_farmers_total) {
		this.sc_conventional_farmers_total = sc_conventional_farmers_total;
	}


	public Number getSc_conventional_ext_total() {
		return sc_conventional_ext_total;
	}


	public void setSc_conventional_ext_total(Number sc_conventional_ext_total) {
		this.sc_conventional_ext_total = sc_conventional_ext_total;
	}


	public Number getSt_conventional_farmers_total() {
		return st_conventional_farmers_total;
	}


	public void setSt_conventional_farmers_total(Number st_conventional_farmers_total) {
		this.st_conventional_farmers_total = st_conventional_farmers_total;
	}


	public Number getSt_conventional_ext_total() {
		return st_conventional_ext_total;
	}


	public void setSt_conventional_ext_total(Number st_conventional_ext_total) {
		this.st_conventional_ext_total = st_conventional_ext_total;
	}


	public Number getBc_conventional_farmers_total() {
		return bc_conventional_farmers_total;
	}


	public void setBc_conventional_farmers_total(Number bc_conventional_farmers_total) {
		this.bc_conventional_farmers_total = bc_conventional_farmers_total;
	}


	public Number getBc_conventional_ext_total() {
		return bc_conventional_ext_total;
	}


	public void setBc_conventional_ext_total(Number bc_conventional_ext_total) {
		this.bc_conventional_ext_total = bc_conventional_ext_total;
	}


	public Number getGen_conventional_farmers_total() {
		return gen_conventional_farmers_total;
	}


	public void setGen_conventional_farmers_total(Number gen_conventional_farmers_total) {
		this.gen_conventional_farmers_total = gen_conventional_farmers_total;
	}


	public Number getGen_conventional_ext_total() {
		return gen_conventional_ext_total;
	}


	public void setGen_conventional_ext_total(Number gen_conventional_ext_total) {
		this.gen_conventional_ext_total = gen_conventional_ext_total;
	}


	public Number getSc_dripirr_farmers_total() {
		return sc_dripirr_farmers_total;
	}


	public void setSc_dripirr_farmers_total(Number sc_dripirr_farmers_total) {
		this.sc_dripirr_farmers_total = sc_dripirr_farmers_total;
	}


	public Number getSc_dripirr_ext_total() {
		return sc_dripirr_ext_total;
	}


	public void setSc_dripirr_ext_total(Number sc_dripirr_ext_total) {
		this.sc_dripirr_ext_total = sc_dripirr_ext_total;
	}


	public Number getSt_dripirr_farmers_total() {
		return st_dripirr_farmers_total;
	}


	public void setSt_dripirr_farmers_total(Number st_dripirr_farmers_total) {
		this.st_dripirr_farmers_total = st_dripirr_farmers_total;
	}


	public Number getSt_dripirr_ext_total() {
		return st_dripirr_ext_total;
	}


	public void setSt_dripirr_ext_total(Number st_dripirr_ext_total) {
		this.st_dripirr_ext_total = st_dripirr_ext_total;
	}


	public Number getBc_dripirr_farmers_total() {
		return bc_dripirr_farmers_total;
	}


	public void setBc_dripirr_farmers_total(Number bc_dripirr_farmers_total) {
		this.bc_dripirr_farmers_total = bc_dripirr_farmers_total;
	}


	public Number getBc_dripirr_ext_total() {
		return bc_dripirr_ext_total;
	}


	public void setBc_dripirr_ext_total(Number bc_dripirr_ext_total) {
		this.bc_dripirr_ext_total = bc_dripirr_ext_total;
	}


	public Number getGen_dripirr_farmers_total() {
		return gen_dripirr_farmers_total;
	}


	public void setGen_dripirr_farmers_total(Number gen_dripirr_farmers_total) {
		this.gen_dripirr_farmers_total = gen_dripirr_farmers_total;
	}


	public Number getGen_dripirr_ext_total() {
		return gen_dripirr_ext_total;
	}


	public void setGen_dripirr_ext_total(Number gen_dripirr_ext_total) {
		this.gen_dripirr_ext_total = gen_dripirr_ext_total;
	}


	public Number getSc_sprinkler_farmers_total() {
		return sc_sprinkler_farmers_total;
	}


	public void setSc_sprinkler_farmers_total(Number sc_sprinkler_farmers_total) {
		this.sc_sprinkler_farmers_total = sc_sprinkler_farmers_total;
	}


	public Number getSc_sprinkler_ext_total() {
		return sc_sprinkler_ext_total;
	}


	public void setSc_sprinkler_ext_total(Number sc_sprinkler_ext_total) {
		this.sc_sprinkler_ext_total = sc_sprinkler_ext_total;
	}


	public Number getSt_sprinkler_farmers_total() {
		return st_sprinkler_farmers_total;
	}


	public void setSt_sprinkler_farmers_total(Number st_sprinkler_farmers_total) {
		this.st_sprinkler_farmers_total = st_sprinkler_farmers_total;
	}


	public Number getSt_sprinkler_ext_total() {
		return st_sprinkler_ext_total;
	}


	public void setSt_sprinkler_ext_total(Number st_sprinkler_ext_total) {
		this.st_sprinkler_ext_total = st_sprinkler_ext_total;
	}


	public Number getBc_sprinkler_farmers_total() {
		return bc_sprinkler_farmers_total;
	}


	public void setBc_sprinkler_farmers_total(Number bc_sprinkler_farmers_total) {
		this.bc_sprinkler_farmers_total = bc_sprinkler_farmers_total;
	}


	public Number getBc_sprinkler_ext_total() {
		return bc_sprinkler_ext_total;
	}


	public void setBc_sprinkler_ext_total(Number bc_sprinkler_ext_total) {
		this.bc_sprinkler_ext_total = bc_sprinkler_ext_total;
	}


	public Number getGen_sprinkler_farmers_total() {
		return gen_sprinkler_farmers_total;
	}


	public void setGen_sprinkler_farmers_total(Number gen_sprinkler_farmers_total) {
		this.gen_sprinkler_farmers_total = gen_sprinkler_farmers_total;
	}


	public Number getGen_sprinkler_ext_total() {
		return gen_sprinkler_ext_total;
	}


	public void setGen_sprinkler_ext_total(Number gen_sprinkler_ext_total) {
		this.gen_sprinkler_ext_total = gen_sprinkler_ext_total;
	}


	@Override
	public String toString() {
		return "CasteWiseIrrigationHQVillage [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname
				+ ", sc_conventional_farmers_total=" + sc_conventional_farmers_total + ", sc_conventional_ext_total="
				+ sc_conventional_ext_total + ", st_conventional_farmers_total=" + st_conventional_farmers_total
				+ ", st_conventional_ext_total=" + st_conventional_ext_total + ", bc_conventional_farmers_total="
				+ bc_conventional_farmers_total + ", bc_conventional_ext_total=" + bc_conventional_ext_total
				+ ", gen_conventional_farmers_total=" + gen_conventional_farmers_total + ", gen_conventional_ext_total="
				+ gen_conventional_ext_total + ", sc_dripirr_farmers_total=" + sc_dripirr_farmers_total
				+ ", sc_dripirr_ext_total=" + sc_dripirr_ext_total + ", st_dripirr_farmers_total="
				+ st_dripirr_farmers_total + ", st_dripirr_ext_total=" + st_dripirr_ext_total
				+ ", bc_dripirr_farmers_total=" + bc_dripirr_farmers_total + ", bc_dripirr_ext_total="
				+ bc_dripirr_ext_total + ", gen_dripirr_farmers_total=" + gen_dripirr_farmers_total
				+ ", gen_dripirr_ext_total=" + gen_dripirr_ext_total + ", sc_sprinkler_farmers_total="
				+ sc_sprinkler_farmers_total + ", sc_sprinkler_ext_total=" + sc_sprinkler_ext_total
				+ ", st_sprinkler_farmers_total=" + st_sprinkler_farmers_total + ", st_sprinkler_ext_total="
				+ st_sprinkler_ext_total + ", bc_sprinkler_farmers_total=" + bc_sprinkler_farmers_total
				+ ", bc_sprinkler_ext_total=" + bc_sprinkler_ext_total + ", gen_sprinkler_farmers_total="
				+ gen_sprinkler_farmers_total + ", gen_sprinkler_ext_total=" + gen_sprinkler_ext_total + "]";
	}

	
	
}
