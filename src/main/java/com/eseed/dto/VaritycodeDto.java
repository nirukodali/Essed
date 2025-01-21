package com.eseed.dto;

public class VaritycodeDto {

	private String varietycode;
	private String name;

	public String getVarietycode() {
		return varietycode;
	}

	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "VaritycodeDto [varietycode=" + varietycode + ", name=" + name + ", getVarietycode()=" + getVarietycode()
				+ ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
