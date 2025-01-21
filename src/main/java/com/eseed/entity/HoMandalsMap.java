package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "homandalsmap")
public class HoMandalsMap {
	
	@Id
	@NotNull(message="Mcode Should not be Empty.")
	@Column(name="mcode")
	private Integer hmcode;

	@Column(name="dcode")
	private Integer hdcode;
	
	@NotNull(message="Hqcode Should not be Empty.")
	@Column(name="hqcode")
	private Integer hqcode;
	

	public Integer getHdcode() {
		return hdcode;
	}

	public void setHdcode(Integer hdcode) {
		this.hdcode = hdcode;
	}

	public Integer getHqcode() {
		return hqcode;
	}

	public void setHqcode(Integer hqcode) {
		this.hqcode = hqcode;
	}

	public Integer getHmcode() {
		return hmcode;
	}

	public void setHmcode(Integer hmcode) {
		this.hmcode = hmcode;
	}
}
