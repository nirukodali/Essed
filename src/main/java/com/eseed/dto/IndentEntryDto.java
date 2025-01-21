package com.eseed.dto;

public class IndentEntryDto {
	
	private String dcode;
	private String mcode;
	private String varietycode;
	private Float quantity;
	private Integer vscode;
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	public String getVarietycode() {
		return varietycode;
	}
	public void setVarietycode(String varietycode) {
		this.varietycode = varietycode;
	}
	public Float getQuantity() {
		return quantity;
	}
	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	public String getMcode() {
		return mcode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	public Integer getVscode() {
		return vscode;
	}
	public void setVscode(Integer vscode) {
		this.vscode = vscode;
	}
	@Override
	public String toString() {
		return "IndentEntryDto [dcode=" + dcode + ", mcode=" + mcode + ", varietycode=" + varietycode + ", quantity="
				+ quantity + ", vscode=" + vscode + "]";
	}
	
	

}
