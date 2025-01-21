package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CasteWiseDIMOCrop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String wbdname;
	private String wbmname;
	private String wbvname;
	private String cropname;
	private Long sc_conventional_farmers;
	private Number sc_conventional_ext;
	private Long st_conventional_farmers;
	private Number st_conventional_ext;
	private Long bc_conventional_farmers;
	private Number bc_conventional_ext;
	private Long gen_conventional_farmers;
	private Number gen_conventional_ext;
	
	private Long sc_dripirr_farmers;
	private Number sc_dripirr_ext;
	private Long st_dripirr_farmers;
	private Number st_dripirr_ext;
	private Long bc_dripirr_farmers;
	private Number bc_dripirr_ext;
	private Long gen_dripirr_farmers;
	private Number gen_dripirr_ext;
	
	private Long sc_sprinkler_farmers;
	private Number sc_sprinkler_ext;
	private Long st_sprinkler_farmers;
	private Number st_sprinkler_ext;
	private Long bc_sprinkler_farmers;
	private Number bc_sprinkler_ext;
	private Long gen_sprinkler_farmers;
	private Number gen_sprinkler_ext;
	
	public CasteWiseDIMOCrop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CasteWiseDIMOCrop(String wbdname, String wbmname, String wbvname, String cropname,
			Long sc_conventional_farmers, Number sc_conventional_ext, Long st_conventional_farmers,
			Number st_conventional_ext, Long bc_conventional_farmers, Number bc_conventional_ext,
			Long gen_conventional_farmers, Number gen_conventional_ext, Long sc_dripirr_farmers, Number sc_dripirr_ext,
			Long st_dripirr_farmers, Number st_dripirr_ext, Long bc_dripirr_farmers, Number bc_dripirr_ext,
			Long gen_dripirr_farmers, Number gen_dripirr_ext, Long sc_sprinkler_farmers, Number sc_sprinkler_ext,
			Long st_sprinkler_farmers, Number st_sprinkler_ext, Long bc_sprinkler_farmers, Number bc_sprinkler_ext,
			Long gen_sprinkler_farmers, Number gen_sprinkler_ext) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.cropname = cropname;
		this.sc_conventional_farmers = sc_conventional_farmers;
		this.sc_conventional_ext = sc_conventional_ext;
		this.st_conventional_farmers = st_conventional_farmers;
		this.st_conventional_ext = st_conventional_ext;
		this.bc_conventional_farmers = bc_conventional_farmers;
		this.bc_conventional_ext = bc_conventional_ext;
		this.gen_conventional_farmers = gen_conventional_farmers;
		this.gen_conventional_ext = gen_conventional_ext;
		this.sc_dripirr_farmers = sc_dripirr_farmers;
		this.sc_dripirr_ext = sc_dripirr_ext;
		this.st_dripirr_farmers = st_dripirr_farmers;
		this.st_dripirr_ext = st_dripirr_ext;
		this.bc_dripirr_farmers = bc_dripirr_farmers;
		this.bc_dripirr_ext = bc_dripirr_ext;
		this.gen_dripirr_farmers = gen_dripirr_farmers;
		this.gen_dripirr_ext = gen_dripirr_ext;
		this.sc_sprinkler_farmers = sc_sprinkler_farmers;
		this.sc_sprinkler_ext = sc_sprinkler_ext;
		this.st_sprinkler_farmers = st_sprinkler_farmers;
		this.st_sprinkler_ext = st_sprinkler_ext;
		this.bc_sprinkler_farmers = bc_sprinkler_farmers;
		this.bc_sprinkler_ext = bc_sprinkler_ext;
		this.gen_sprinkler_farmers = gen_sprinkler_farmers;
		this.gen_sprinkler_ext = gen_sprinkler_ext;
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

	public String getCropname() {
		return cropname;
	}

	public void setCropname(String cropname) {
		this.cropname = cropname;
	}

	public Long getSc_conventional_farmers() {
		return sc_conventional_farmers;
	}

	public void setSc_conventional_farmers(Long sc_conventional_farmers) {
		this.sc_conventional_farmers = sc_conventional_farmers;
	}

	public Number getSc_conventional_ext() {
		return sc_conventional_ext;
	}

	public void setSc_conventional_ext(Number sc_conventional_ext) {
		this.sc_conventional_ext = sc_conventional_ext;
	}

	public Long getSt_conventional_farmers() {
		return st_conventional_farmers;
	}

	public void setSt_conventional_farmers(Long st_conventional_farmers) {
		this.st_conventional_farmers = st_conventional_farmers;
	}

	public Number getSt_conventional_ext() {
		return st_conventional_ext;
	}

	public void setSt_conventional_ext(Number st_conventional_ext) {
		this.st_conventional_ext = st_conventional_ext;
	}

	public Long getBc_conventional_farmers() {
		return bc_conventional_farmers;
	}

	public void setBc_conventional_farmers(Long bc_conventional_farmers) {
		this.bc_conventional_farmers = bc_conventional_farmers;
	}

	public Number getBc_conventional_ext() {
		return bc_conventional_ext;
	}

	public void setBc_conventional_ext(Number bc_conventional_ext) {
		this.bc_conventional_ext = bc_conventional_ext;
	}

	public Long getGen_conventional_farmers() {
		return gen_conventional_farmers;
	}

	public void setGen_conventional_farmers(Long gen_conventional_farmers) {
		this.gen_conventional_farmers = gen_conventional_farmers;
	}

	public Number getGen_conventional_ext() {
		return gen_conventional_ext;
	}

	public void setGen_conventional_ext(Number gen_conventional_ext) {
		this.gen_conventional_ext = gen_conventional_ext;
	}

	public Long getSc_dripirr_farmers() {
		return sc_dripirr_farmers;
	}

	public void setSc_dripirr_farmers(Long sc_dripirr_farmers) {
		this.sc_dripirr_farmers = sc_dripirr_farmers;
	}

	public Number getSc_dripirr_ext() {
		return sc_dripirr_ext;
	}

	public void setSc_dripirr_ext(Number sc_dripirr_ext) {
		this.sc_dripirr_ext = sc_dripirr_ext;
	}

	public Long getSt_dripirr_farmers() {
		return st_dripirr_farmers;
	}

	public void setSt_dripirr_farmers(Long st_dripirr_farmers) {
		this.st_dripirr_farmers = st_dripirr_farmers;
	}

	public Number getSt_dripirr_ext() {
		return st_dripirr_ext;
	}

	public void setSt_dripirr_ext(Number st_dripirr_ext) {
		this.st_dripirr_ext = st_dripirr_ext;
	}

	public Long getBc_dripirr_farmers() {
		return bc_dripirr_farmers;
	}

	public void setBc_dripirr_farmers(Long bc_dripirr_farmers) {
		this.bc_dripirr_farmers = bc_dripirr_farmers;
	}

	public Number getBc_dripirr_ext() {
		return bc_dripirr_ext;
	}

	public void setBc_dripirr_ext(Number bc_dripirr_ext) {
		this.bc_dripirr_ext = bc_dripirr_ext;
	}

	public Long getGen_dripirr_farmers() {
		return gen_dripirr_farmers;
	}

	public void setGen_dripirr_farmers(Long gen_dripirr_farmers) {
		this.gen_dripirr_farmers = gen_dripirr_farmers;
	}

	public Number getGen_dripirr_ext() {
		return gen_dripirr_ext;
	}

	public void setGen_dripirr_ext(Number gen_dripirr_ext) {
		this.gen_dripirr_ext = gen_dripirr_ext;
	}

	public Long getSc_sprinkler_farmers() {
		return sc_sprinkler_farmers;
	}

	public void setSc_sprinkler_farmers(Long sc_sprinkler_farmers) {
		this.sc_sprinkler_farmers = sc_sprinkler_farmers;
	}

	public Number getSc_sprinkler_ext() {
		return sc_sprinkler_ext;
	}

	public void setSc_sprinkler_ext(Number sc_sprinkler_ext) {
		this.sc_sprinkler_ext = sc_sprinkler_ext;
	}

	public Long getSt_sprinkler_farmers() {
		return st_sprinkler_farmers;
	}

	public void setSt_sprinkler_farmers(Long st_sprinkler_farmers) {
		this.st_sprinkler_farmers = st_sprinkler_farmers;
	}

	public Number getSt_sprinkler_ext() {
		return st_sprinkler_ext;
	}

	public void setSt_sprinkler_ext(Number st_sprinkler_ext) {
		this.st_sprinkler_ext = st_sprinkler_ext;
	}

	public Long getBc_sprinkler_farmers() {
		return bc_sprinkler_farmers;
	}

	public void setBc_sprinkler_farmers(Long bc_sprinkler_farmers) {
		this.bc_sprinkler_farmers = bc_sprinkler_farmers;
	}

	public Number getBc_sprinkler_ext() {
		return bc_sprinkler_ext;
	}

	public void setBc_sprinkler_ext(Number bc_sprinkler_ext) {
		this.bc_sprinkler_ext = bc_sprinkler_ext;
	}

	public Long getGen_sprinkler_farmers() {
		return gen_sprinkler_farmers;
	}

	public void setGen_sprinkler_farmers(Long gen_sprinkler_farmers) {
		this.gen_sprinkler_farmers = gen_sprinkler_farmers;
	}

	public Number getGen_sprinkler_ext() {
		return gen_sprinkler_ext;
	}

	public void setGen_sprinkler_ext(Number gen_sprinkler_ext) {
		this.gen_sprinkler_ext = gen_sprinkler_ext;
	}

	@Override
	public String toString() {
		return "CasteWiseDIMOCrop [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", cropname="
				+ cropname + ", sc_conventional_farmers=" + sc_conventional_farmers + ", sc_conventional_ext="
				+ sc_conventional_ext + ", st_conventional_farmers=" + st_conventional_farmers
				+ ", st_conventional_ext=" + st_conventional_ext + ", bc_conventional_farmers="
				+ bc_conventional_farmers + ", bc_conventional_ext=" + bc_conventional_ext
				+ ", gen_conventional_farmers=" + gen_conventional_farmers + ", gen_conventional_ext="
				+ gen_conventional_ext + ", sc_dripirr_farmers=" + sc_dripirr_farmers + ", sc_dripirr_ext="
				+ sc_dripirr_ext + ", st_dripirr_farmers=" + st_dripirr_farmers + ", st_dripirr_ext=" + st_dripirr_ext
				+ ", bc_dripirr_farmers=" + bc_dripirr_farmers + ", bc_dripirr_ext=" + bc_dripirr_ext
				+ ", gen_dripirr_farmers=" + gen_dripirr_farmers + ", gen_dripirr_ext=" + gen_dripirr_ext
				+ ", sc_sprinkler_farmers=" + sc_sprinkler_farmers + ", sc_sprinkler_ext=" + sc_sprinkler_ext
				+ ", st_sprinkler_farmers=" + st_sprinkler_farmers + ", st_sprinkler_ext=" + st_sprinkler_ext
				+ ", bc_sprinkler_farmers=" + bc_sprinkler_farmers + ", bc_sprinkler_ext=" + bc_sprinkler_ext
				+ ", gen_sprinkler_farmers=" + gen_sprinkler_farmers + ", gen_sprinkler_ext=" + gen_sprinkler_ext + "]";
	}
	
	
	
}
