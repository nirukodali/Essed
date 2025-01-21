package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MaoAuthVaaVroekyc {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	private String updatedby;
	private Integer cr_crop;
	private String vname; 
	private String rbkname;
	private Long totalbookings;
	private BigDecimal totextent;
	private Long vaaauthcount;
	private BigDecimal vaaauthextent;
	private Long vroauthcount;
	private BigDecimal vroauthextent;
	private Long totekycbookings;
	private Long totfarmercount;
	private Long ekycfarmercount;
	private BigDecimal ekycbookedext;
	public MaoAuthVaaVroekyc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public Integer getCr_crop() {
		return cr_crop;
	}
	public void setCr_crop(Integer cr_crop) {
		this.cr_crop = cr_crop;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getRbkname() {
		return rbkname;
	}
	public void setRbkname(String rbkname) {
		this.rbkname = rbkname;
	}
	public Long getTotalbookings() {
		return totalbookings;
	}
	public void setTotalbookings(Long totalbookings) {
		this.totalbookings = totalbookings;
	}
	public BigDecimal getTotextent() {
		return totextent;
	}
	public void setTotextent(BigDecimal totextent) {
		this.totextent = totextent;
	}
	public Long getVaaauthcount() {
		return vaaauthcount;
	}
	public void setVaaauthcount(Long vaaauthcount) {
		this.vaaauthcount = vaaauthcount;
	}
	public BigDecimal getVaaauthextent() {
		return vaaauthextent;
	}
	public void setVaaauthextent(BigDecimal vaaauthextent) {
		this.vaaauthextent = vaaauthextent;
	}
	public Long getVroauthcount() {
		return vroauthcount;
	}
	public void setVroauthcount(Long vroauthcount) {
		this.vroauthcount = vroauthcount;
	}
	public BigDecimal getVroauthextent() {
		return vroauthextent;
	}
	public void setVroauthextent(BigDecimal vroauthextent) {
		this.vroauthextent = vroauthextent;
	}
	public Long getTotekycbookings() {
		return totekycbookings;
	}
	public void setTotekycbookings(Long totekycbookings) {
		this.totekycbookings = totekycbookings;
	}
	public Long getTotfarmercount() {
		return totfarmercount;
	}
	public void setTotfarmercount(Long totfarmercount) {
		this.totfarmercount = totfarmercount;
	}
	public Long getEkycfarmercount() {
		return ekycfarmercount;
	}
	public void setEkycfarmercount(Long ekycfarmercount) {
		this.ekycfarmercount = ekycfarmercount;
	}
	public BigDecimal getEkycbookedext() {
		return ekycbookedext;
	}
	public void setEkycbookedext(BigDecimal ekycbookedext) {
		this.ekycbookedext = ekycbookedext;
	}
	@Override
	public String toString() {
		return "MaoAuthVaaVroekyc [id=" + id + ", updatedby=" + updatedby + ", cr_crop=" + cr_crop + ", vname=" + vname
				+ ", rbkname=" + rbkname + ", totalbookings=" + totalbookings + ", totextent=" + totextent
				+ ", vaaauthcount=" + vaaauthcount + ", vaaauthextent=" + vaaauthextent + ", vroauthcount="
				+ vroauthcount + ", vroauthextent=" + vroauthextent + ", totekycbookings=" + totekycbookings
				+ ", totfarmercount=" + totfarmercount + ", ekycfarmercount=" + ekycfarmercount + ", ekycbookedext="
				+ ekycbookedext + "]";
	}
	

}
