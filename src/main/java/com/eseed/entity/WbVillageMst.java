package com.eseed.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wbvillage_mst")
public class WbVillageMst {
    @Id
    @Column(name = "wbvcode")
    private Long wbvcode;
    private String wbvname;
	public Long getWbvcode() {
		return wbvcode;
	}
	public void setWbvcode(Long wbvcode) {
		this.wbvcode = wbvcode;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}

    // Other fields corresponding to columns in the table
}