package com.eseed.entity;


import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Villsec_rev_v {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int vcode;
	    private String wbvname;
		public int getVcode() {
			return vcode;
		}
		public void setVcode(int vcode) {
			this.vcode = vcode;
		}
		public String getWbvname() {
			return wbvname;
		}
		public void setWbvname(String wbvname) {
			this.wbvname = wbvname;
		}
	   
	}