package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="villsec_rev_v",schema="ecrop2024")
public class VillageForHO {
	

	
				@Id
				private int vscode;
				private String vsname;
				public int getVscode() {
					return vscode;
				}
				public void setVscode(int vscode) {
					this.vscode = vscode;
				}
				public String getVsname() {
					return vsname;
				}
				public void setVsname(String vsname) {
					this.vsname = vsname;
				}
				
				
	}



