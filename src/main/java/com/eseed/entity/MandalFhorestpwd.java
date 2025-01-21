package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mandal_2011_cs")
public class MandalFhorestpwd {
	

	
				@Id
				private int mcode;
				private String mname;
				public int getMcode() {
					return mcode;
				}
				public void setMcode(int mcode) {
					this.mcode = mcode;
				}
				public String getMname() {
					return mname;
				}
				public void setMname(String mname) {
					this.mname = mname;
				}
				@Override
				public String toString() {
					return "MandalFhorestpwd [mcode=" + mcode + ", mname=" + mname + "]";
				}
				
				
	}



