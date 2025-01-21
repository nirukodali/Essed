package com.eseed.entity;

public class Rep_VSDistrictCDIntfModel {

private String	dcode;
private String 	mcode;
private String 	vcode;
private String 	dname;
private String	mname;
private String	vname;
private String	cname;
private String	address;

public Rep_VSDistrictCDIntfModel() {
	super();
	// TODO Auto-generated constructor stub
}

public Rep_VSDistrictCDIntfModel(String dcode, String mcode, String vcode, String dname, String mname, String vname,
		String cname, String address) {
	super();
	this.dcode = dcode;
	this.mcode = mcode;
	this.vcode = vcode;
	this.dname = dname;
	this.mname = mname;
	this.vname = vname;
	this.cname = cname;
	this.address = address;
}

public String getDcode() {
	return dcode;
}

public void setDcode(String dcode) {
	this.dcode = dcode;
}

public String getMcode() {
	return mcode;
}

public void setMcode(String mcode) {
	this.mcode = mcode;
}

public String getVcode() {
	return vcode;
}

public void setVcode(String vcode) {
	this.vcode = vcode;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}

public String getVname() {
	return vname;
}

public void setVname(String vname) {
	this.vname = vname;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Rep_VSDistrictCDIntfModel [dcode=" + dcode + ", mcode=" + mcode + ", vcode=" + vcode + ", dname=" + dname
			+ ", mname=" + mname + ", vname=" + vname + ", cname=" + cname + ", address=" + address + "]";
}



}
