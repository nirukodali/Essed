package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropgroups")
public class CropgroupsFCVR {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int cropgrpid;
	    private String grpname;
	    
		public CropgroupsFCVR() {
			
		}

		public CropgroupsFCVR(int cropgrpid, String grpname) {
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
			return "CropgroupsFCVR [cropgrpid=" + cropgrpid + ", grpname=" + grpname + "]";
		}

	}