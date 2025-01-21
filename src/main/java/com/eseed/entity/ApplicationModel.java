package com.eseed.entity;

public class ApplicationModel {
	
	private String cropyear;

	public ApplicationModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplicationModel(String cropyear) {
		super();
		this.cropyear = cropyear;
	}

	public String getCropyear() {
		return cropyear;
	}

	public void setCropyear(String cropyear) {
		this.cropyear = cropyear;
	}

	@Override
	public String toString() {
		return "ApplicationModel [cropyear=" + cropyear + "]";
	}
	
	

}
