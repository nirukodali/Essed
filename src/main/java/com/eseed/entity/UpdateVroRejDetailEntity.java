package com.eseed.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_details_r012023")
public class UpdateVroRejDetailEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vro_verify")
	private Integer vroVerify;
	
	@Column(name = "dt_vroverify")
	private Timestamp vroVerifiedDate;

	public Integer getVroVerify() {
		return vroVerify;
	}

	public void setVroVerify(Integer vroVerify) {
		this.vroVerify = vroVerify;
	}

	public Timestamp getVroVerifiedDate() {
		return vroVerifiedDate;
	}

	public void setVroVerifiedDate(Timestamp vroVerifiedDate) {
		this.vroVerifiedDate = vroVerifiedDate;
	}

	@Override
	public String toString() {
		return "UpdateVroRejDetailEntity [vroVerify=" + vroVerify + ", vroVerifiedDate=" + vroVerifiedDate + "]";
	}
	
	
}
