package com.eseed.entity;


import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cropnames")
public class CropnamesFcbd {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int cropid;
	    private String cropname;
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
	   
	}