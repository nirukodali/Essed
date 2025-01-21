package com.eseed.entity;

import javax.persistence.Entity; 
import javax.persistence.Id;
@Entity
public class Supercheck_exceptions_syear {

	@Id
	private String exception_catg;
	private String exception_type;
	public String getException_catg() {
		return exception_catg;
	}
	public void setException_catg(String exception_catg) {
		this.exception_catg = exception_catg;
	}
	public String getException_type() {
		return exception_type;
	}
	public void setException_type(String exception_type) {
		this.exception_type = exception_type;
	}
	
	
}
