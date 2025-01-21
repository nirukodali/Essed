package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BenfComag {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String mname;
	private String vname;
	private String seedvariety;
	private String farmername;
	private String fathername;
	private Integer dcode;
	private Integer mcode;
	private String socialstatus;
	private String mobileno;
	private Integer vcode;
	private String varietycode;
	private Number totextent;
	private Character status;
	private Long qty_recd;
	private Double qty_kgs;
	
	public BenfComag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BenfComag(String dname, String mname, String vname, String seedvariety, String farmername, String fathername,
			Integer dcode, Integer mcode, String socialstatus, String mobileno, Integer vcode, String varietycode,
			Number totextent, Character status, Long qty_recd, Double qty_kgs) {
		super();
		this.dname = dname;
		this.mname = mname;
		this.vname = vname;
		this.seedvariety = seedvariety;
		this.farmername = farmername;
		this.fathername = fathername;
		this.dcode = dcode;
		this.mcode = mcode;
		this.socialstatus = socialstatus;
		this.mobileno = mobileno;
		this.vcode = vcode;
		this.varietycode = varietycode;
		this.totextent = totextent;
		this.status = status;
		this.qty_recd = qty_recd;
		this.qty_kgs = qty_kgs;
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

	public String getSeedvariety() {
		return seedvariety;
	}

	public void setSeedvariety(String seedvariety) {
		this.seedvariety = seedvariety;
	}

	public String getFarmername() {
		return farmername;
	}

	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public Integer getMcode() {
		return mcode;
	}

	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}

	public String getSocialstatus() {
		return socialstatus;
	}

	public void setSocialstatus(String socialstatus) {
		this.socialstatus = socialstatus;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public Integer getVcode() {
		return vcode;
	}

	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}

	public String getVarietycode() {
		return varietycode;
	}

	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
	}

	public Number getTotextent() {
		return totextent;
	}

	public void setTotextent(Number totextent) {
		this.totextent = totextent;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Long getQty_recd() {
		return qty_recd;
	}

	public void setQty_recd(Long qty_recd) {
		this.qty_recd = qty_recd;
	}

	public Double getQty_kgs() {
		return qty_kgs;
	}

	public void setQty_kgs(Double qty_kgs) {
		this.qty_kgs = qty_kgs;
	}

	@Override
	public String toString() {
		return "BenfComag [dname=" + dname + ", mname=" + mname + ", vname=" + vname + ", seedvariety=" + seedvariety
				+ ", farmername=" + farmername + ", fathername=" + fathername + ", dcode=" + dcode + ", mcode=" + mcode
				+ ", socialstatus=" + socialstatus + ", mobileno=" + mobileno + ", vcode=" + vcode + ", varietycode="
				+ varietycode + ", totextent=" + totextent + ", status=" + status + ", qty_recd=" + qty_recd
				+ ", qty_kgs=" + qty_kgs + "]";
	}
	

}
