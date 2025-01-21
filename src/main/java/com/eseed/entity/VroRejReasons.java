package com.eseed.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vro_rej_reasons")

public class VroRejReasons {
    @Id
    @Column(name = "code")
    private int code;
    private String reason;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

    // Other fields corresponding to columns in the table
}