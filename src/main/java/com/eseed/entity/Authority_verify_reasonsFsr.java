package com.eseed.entity;

import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cr_authdetails_mand_mv_")
public class Authority_verify_reasonsFsr {
	
	@Id
    private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
