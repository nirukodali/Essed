package com.eseed.entity;

public class Rep_UserRegDetModel {

	
	private String mandalname;
	private String villagename;
	private String name;
	private String userid;
	private String mobile_phone;
	private String mcode;
	private String village;
	private String dcode;
	private String sec_type ;
	
	public Rep_UserRegDetModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rep_UserRegDetModel(String mandalname, String villagename, String name, String userid, String mobile_phone,
			String mcode, String village, String dcode, String sec_type) {
		super();
		this.mandalname = mandalname;
		this.villagename = villagename;
		this.name = name;
		this.userid = userid;
		this.mobile_phone = mobile_phone;
		this.mcode = mcode;
		this.village = village;
		this.dcode = dcode;
		this.sec_type = sec_type;
	}

	public String getMandalname() {
		return mandalname;
	}

	public void setMandalname(String mandalname) {
		this.mandalname = mandalname;
	}

	public String getVillagename() {
		return villagename;
	}

	public void setVillagename(String villagename) {
		this.villagename = villagename;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public String getMcode() {
		return mcode;
	}

	public void setMcode(String mcode) {
		this.mcode = mcode;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	public String getSec_type() {
		return sec_type;
	}

	public void setSec_type(String sec_type) {
		this.sec_type = sec_type;
	}

	@Override
	public String toString() {
		return "Rep_UserRegDetModel [mandalname=" + mandalname + ", villagename=" + villagename + ", name=" + name
				+ ", userid=" + userid + ", mobile_phone=" + mobile_phone + ", mcode=" + mcode + ", village=" + village
				+ ", dcode=" + dcode + ", sec_type=" + sec_type + "]";
	}
	
	
	
	
	
	
	
	
}
