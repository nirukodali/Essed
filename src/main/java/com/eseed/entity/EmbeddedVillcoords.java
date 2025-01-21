package com.eseed.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmbeddedVillcoords  implements Serializable{

	@Column(name="wbdcode")
	private Integer wbdcode;
	
	@Column(name = "wbmcode")
	private Integer wbmcode;
	
	@Column(name = "wbvcode")
	private Integer wbvcode;
	
	public Integer getWbdcode() {
		return wbdcode;
	}
	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}
	public Integer getWbmcode() {
		return wbmcode;
	}
	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}
	public Integer getWbvcode() {
		return wbvcode;
	}
	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}

}
