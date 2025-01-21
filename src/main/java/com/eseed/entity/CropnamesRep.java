package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropnames")
public class CropnamesRep {
	
		@Id
	    private int cropid;
	    private String cropname;
	    private String cropnameeng; 
	    
		public CropnamesRep() {
			
		}

		public CropnamesRep(int cropid, String cropname, String cropnameeng) {
			super();
			this.cropid = cropid;
			this.cropname = cropname;
			this.cropnameeng = cropnameeng;
		}

		public int getCropid() {
			return cropid;
		}

		public void setCropid(int cropid) {
			this.cropid = cropid;
		}

		public String getCropname() {
			return cropname;
		}

		public void setCropname(String cropname) {
			this.cropname = cropname;
		}

		public String getCropnameeng() {
			return cropnameeng;
		}

		public void setCropnameeng(String cropnameeng) {
			this.cropnameeng = cropnameeng;
		}


		@Override
		public String toString() {
			return "CropnamesRep [cropid=" + cropid + ", cropname=" + cropname + ", cropnameeng=" + cropnameeng
					+ "]";
		}
	       
	}