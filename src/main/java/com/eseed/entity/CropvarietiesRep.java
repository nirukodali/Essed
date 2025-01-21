package com.eseed.entity;


public class CropvarietiesRep {

	    private String cropname;
	    private int varietycode;
	    private String varietyname;
	    private int cropcode;
	    private int releasedays;
	    private Integer newreleasedays;
	    private String grpname;
	    private int cropgrpid;
	    private String cropnameeng;
		public String getCropname() {
			return cropname;
		}
		public void setCropname(String cropname) {
			this.cropname = cropname;
		}
		public int getVarietycode() {
			return varietycode;
		}
		public void setVarietycode(int varietycode) {
			this.varietycode = varietycode;
		}
		public String getVarietyname() {
			return varietyname;
		}
		public void setVarietyname(String varietyname) {
			this.varietyname = varietyname;
		}
		public int getCropcode() {
			return cropcode;
		}
		public void setCropcode(int cropcode) {
			this.cropcode = cropcode;
		}
		public int getReleasedays() {
			return releasedays;
		}
		public void setReleasedays(int releasedays) {
			this.releasedays = releasedays;
		}
		public Integer getNewreleasedays() {
			return newreleasedays;
		}
		public void setNewreleasedays(Integer newreleasedays) {
			this.newreleasedays = newreleasedays;
		}
		public String getGrpname() {
			return grpname;
		}
		public void setGrpname(String grpname) {
			this.grpname = grpname;
		}
		public int getCropgrpid() {
			return cropgrpid;
		}
		public void setCropgrpid(int cropgrpid) {
			this.cropgrpid = cropgrpid;
		}
		public String getCropnameeng() {
			return cropnameeng;
		}
		public void setCropnameeng(String cropnameeng) {
			this.cropnameeng = cropnameeng;
		}
		@Override
		public String toString() {
			return "CropvarietiesRep [cropname=" + cropname + ", varietycode=" + varietycode + ", varietyname="
					+ varietyname + ", cropcode=" + cropcode + ", releasedays=" + releasedays + ", newreleasedays="
					+ newreleasedays + ", grpname=" + grpname + ", cropgrpid=" + cropgrpid + ", cropnameeng="
					+ cropnameeng + "]";
		}
	    
	    
	}
