package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropgroups")
public class CropgroupsFCWR {
	
		@Id
	    private int cropgrpid;
	    private String grpname;

		public CropgroupsFCWR() {
			
		}
				
		public CropgroupsFCWR(int cropgrpid, String grpname,String grpnameeng) {
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
			return "CropgroupsFCWR [cropgrpid=" + cropgrpid + ", grpname=" + grpname + "]";
		}

		
	       
	}