package com.eseed.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Otptransactions {
	private String vsdname;
	private String vsmname;
	private String vname;
	private Integer dcode;
	private Integer mcode;
	private Integer vcode;
	private String farmername;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer transactionid;
	private Integer otp_id;
	private String variety;
	private Long qtylifted;
	private Date statusts;
	private Integer cropyear;
	private String season;
	public Otptransactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Otptransactions(String vsdname, String vsmname, String vname, Integer dcode, Integer mcode, Integer vcode,
			String farmername, Integer transactionid, Integer otp_id, String variety, Long qtylifted, Date statusts,
			Integer cropyear, String season) {
		super();
		this.vsdname = vsdname;
		this.vsmname = vsmname;
		this.vname = vname;
		this.dcode = dcode;
		this.mcode = mcode;
		this.vcode = vcode;
		this.farmername = farmername;
		this.transactionid = transactionid;
		this.otp_id = otp_id;
		this.variety = variety;
		this.qtylifted = qtylifted;
		this.statusts = statusts;
		this.cropyear = cropyear;
		this.season = season;
	}
	public String getVsdname() {
		return vsdname;
	}
	public void setVsdname(String vsdname) {
		this.vsdname = vsdname;
	}
	public String getVsmname() {
		return vsmname;
	}
	public void setVsmname(String vsmname) {
		this.vsmname = vsmname;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
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
	public Integer getVcode() {
		return vcode;
	}
	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}
	public String getFarmername() {
		return farmername;
	}
	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}
	public Integer getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(Integer transactionid) {
		this.transactionid = transactionid;
	}
	public Integer getOtp_id() {
		return otp_id;
	}
	public void setOtp_id(Integer otp_id) {
		this.otp_id = otp_id;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public Long getQtylifted() {
		return qtylifted;
	}
	public void setQtylifted(Long qtylifted) {
		this.qtylifted = qtylifted;
	}
	public Date getStatusts() {
		return statusts;
	}
	public void setStatusts(Date statusts) {
		this.statusts = statusts;
	}
	public Integer getCropyear() {
		return cropyear;
	}
	public void setCropyear(Integer cropyear) {
		this.cropyear = cropyear;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	@Override
	public String toString() {
		return "Otptransactions [vsdname=" + vsdname + ", vsmname=" + vsmname + ", vname=" + vname + ", dcode=" + dcode
				+ ", mcode=" + mcode + ", vcode=" + vcode + ", farmername=" + farmername + ", transactionid="
				+ transactionid + ", otp_id=" + otp_id + ", variety=" + variety + ", qtylifted=" + qtylifted
				+ ", statusts=" + statusts + ", cropyear=" + cropyear + ", season=" + season + "]";
	}
	
}
