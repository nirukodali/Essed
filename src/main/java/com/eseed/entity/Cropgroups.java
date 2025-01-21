package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cropgroups {
	
		@Id
	    private int cropgrpid;
	    private String grpname;
	        
		public Cropgroups() {
			
		}
				
		public Cropgroups(int cropgrpid, String grpname) {
			super();
			this.cropgrpid = cropgrpid;
			this.grpname = grpname;
		}

		public int getCropgrpid() {
			return cropgrpid;
		}
		public void setCropgrpid(int cropgrpid) {
			this.cropgrpid = cropgrpid;
		}
		
		public String getGrpname() {
			return grpname;
		}
		public void setGrpname(String grpname) {
			this.grpname = grpname;
		}

		@Override
		public String toString() {
			return "Cropgroups [cropgrpid=" + cropgrpid + ", grpname=" + grpname + "]";
		}
	    
	       
	}