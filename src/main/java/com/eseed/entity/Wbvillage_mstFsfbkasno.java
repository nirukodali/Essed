package com.eseed.entity;

import javax.persistence.Entity; 
import javax.persistence.Id;
@Entity
public class Wbvillage_mstFsfbkasno {
	@Id
	private int wbmcode;

	public int getWbmcode() {
		return wbmcode;
	}

	public void setWbmcode(int wbmcode) {
		this.wbmcode = wbmcode;
	}
	

}
