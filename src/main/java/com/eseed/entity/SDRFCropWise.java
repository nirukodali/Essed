package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SDRFCropWise {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String cropnameeng;
	private Long sfmf_farmers;
	private Number sfmf_ext;
	private Number sfmf_ipsamt;
	private Long of_farmers;
	private Number of_ext;
	private Number of_ipsamt;
	private Integer cr_crop;
	
	
	public SDRFCropWise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SDRFCropWise(String cropnameeng, Long sfmf_farmers, Number sfmf_ext, Number sfmf_ipsamt, Long of_farmers,
			Number of_ext, Number of_ipsamt, Integer cr_crop) {
		super();
		this.cropnameeng = cropnameeng;
		this.sfmf_farmers = sfmf_farmers;
		this.sfmf_ext = sfmf_ext;
		this.sfmf_ipsamt = sfmf_ipsamt;
		this.of_farmers = of_farmers;
		this.of_ext = of_ext;
		this.of_ipsamt = of_ipsamt;
		this.cr_crop = cr_crop;
	}


	public String getCropnameeng() {
		return cropnameeng;
	}


	public void setCropnameeng(String cropnameeng) {
		this.cropnameeng = cropnameeng;
	}


	public Long getSfmf_farmers() {
		return sfmf_farmers;
	}


	public void setSfmf_farmers(Long sfmf_farmers) {
		this.sfmf_farmers = sfmf_farmers;
	}


	public Number getSfmf_ext() {
		return sfmf_ext;
	}


	public void setSfmf_ext(Number sfmf_ext) {
		this.sfmf_ext = sfmf_ext;
	}


	public Number getSfmf_ipsamt() {
		return sfmf_ipsamt;
	}


	public void setSfmf_ipsamt(Number sfmf_ipsamt) {
		this.sfmf_ipsamt = sfmf_ipsamt;
	}


	public Long getOf_farmers() {
		return of_farmers;
	}


	public void setOf_farmers(Long of_farmers) {
		this.of_farmers = of_farmers;
	}


	public Number getOf_ext() {
		return of_ext;
	}


	public void setOf_ext(Number of_ext) {
		this.of_ext = of_ext;
	}


	public Number getOf_ipsamt() {
		return of_ipsamt;
	}


	public void setOf_ipsamt(Number of_ipsamt) {
		this.of_ipsamt = of_ipsamt;
	}


	public Integer getCr_crop() {
		return cr_crop;
	}


	public void setCr_crop(Integer cr_crop) {
		this.cr_crop = cr_crop;
	}


	@Override
	public String toString() {
		return "SDRFCropWise [cropnameeng=" + cropnameeng + ", sfmf_farmers=" + sfmf_farmers + ", sfmf_ext=" + sfmf_ext
				+ ", sfmf_ipsamt=" + sfmf_ipsamt + ", of_farmers=" + of_farmers + ", of_ext=" + of_ext + ", of_ipsamt="
				+ of_ipsamt + ", cr_crop=" + cr_crop + "]";
	}
	

}
