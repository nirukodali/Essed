package com.eseed.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cropnames")
public class CropnamesFCVR {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int cropid;
	    private String cropname;
	    private String cropnameeng;
	    @OneToOne(cascade=CascadeType.PERSIST)
		@JoinColumn(name="grpcode")//-------------joins with cropgrpid in RepCropnames
		private CropgroupsFCVR cropgroupsFCVR;
		
		public CropnamesFCVR() {
		}

		public CropnamesFCVR(int cropid, String cropname, String cropnameeng, CropgroupsFCVR cropgroupsFCVR) {
			super();
			this.cropid = cropid;
			this.cropname = cropname;
			this.cropnameeng = cropnameeng;
			this.cropgroupsFCVR = cropgroupsFCVR;
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

		public CropgroupsFCVR getCropgroupsFCVR() {
			return cropgroupsFCVR;
		}
		public void setRepCropgroupsCG(CropgroupsFCVR cropgroupsFCVR) {
			this.cropgroupsFCVR = cropgroupsFCVR;
		}

		@Override
		public String toString() {
			return "CropnamesFCVR [cropid=" + cropid + ", cropname=" + cropname + ", cropnameeng=" + cropnameeng
					+ ", cropgroupsFCVR=" + cropgroupsFCVR + "]";
		}

	}