package com.eseed.entity;

import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cr_variety_master")
public class Cr_variety_masterFsr {

			@Id
			private int varietycode;

			public int getVarietycode() {
				return varietycode;
			}

			public void setVarietycode(int varietycode) {
				this.varietycode = varietycode;
			}
			
			
			
}			
			
			
			
		    
