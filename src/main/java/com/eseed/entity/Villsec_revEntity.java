package com.eseed.entity;




public class Villsec_revEntity {
	
	private String vscode;
	
	private String vsname;

	
	
	
	public String getVscode() {
		return vscode;
	}

	public void setVscode(String vscode) {
		this.vscode = vscode;
	}

	public String getVsname() {
		return vsname;
	}

	public void setVsname(String vsname) {
		this.vsname = vsname;
	}

	public Villsec_revEntity(String sql, String vsname) {
		super();
		this.vscode = sql;
		this.vsname = vsname;
	}

	@Override
	public String toString() {
		return "Villsec_revEntity [vscode=" + vscode + ", vsname=" + vsname + "]";
	}
	
	

}
