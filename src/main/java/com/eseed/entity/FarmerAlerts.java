package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FarmerAlerts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer slno;
	private String message;
	private String dt_create;
	private Character status;
	public FarmerAlerts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FarmerAlerts(Integer slno, String message, String dt_create, Character status) {
		super();
		this.slno = slno;
		this.message = message;
		this.dt_create = dt_create;
		this.status = status;
	}
	public Integer getSlno() {
		return slno;
	}
	public void setSlno(Integer slno) {
		this.slno = slno;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDt_create() {
		return dt_create;
	}
	public void setDt_create(String dt_create) {
		this.dt_create = dt_create;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "FarmerAlerts [slno=" + slno + ", message=" + message + ", dt_create=" + dt_create + ", status=" + status
				+ "]";
	}
	

	
	
}
