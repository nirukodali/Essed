package com.eseed.entity;

public class SurveyNodetIntfModel {
	
private String 	 cr_dist_code;
private String	 cr_mand_code;
private String	 wbvname;
private String	 cr_farmeruid;
private String	 farmername;
private String	 fathername;
private String	 occupname;
private String	 occupfname;
private String	 kh_no;
private String	 cr_sno;
private String	 tot_extent;
private String	 occup_extent;
private String	 regno;
private String	  cultivator_type;
private String	  sjointoccupant;
private String	  cultivable_land;
private String	  uncultivable_land;
private String	  dcode;
private String	  mcode;
private String	  mobileno;
private String	  part_key ;


public SurveyNodetIntfModel() {
	super();
	// TODO Auto-generated constructor stub
}


public SurveyNodetIntfModel(String cr_dist_code, String cr_mand_code, String wbvname, String cr_farmeruid,
		String farmername, String fathername, String occupname, String occupfname, String kh_no, String cr_sno,
		String tot_extent, String occup_extent, String regno, String cultivator_type, String sjointoccupant,
		String cultivable_land, String uncultivable_land, String dcode, String mcode, String mobileno,
		String part_key) {
	super();
	this.cr_dist_code = cr_dist_code;
	this.cr_mand_code = cr_mand_code;
	this.wbvname = wbvname;
	this.cr_farmeruid = cr_farmeruid;
	this.farmername = farmername;
	this.fathername = fathername;
	this.occupname = occupname;
	this.occupfname = occupfname;
	this.kh_no = kh_no;
	this.cr_sno = cr_sno;
	this.tot_extent = tot_extent;
	this.occup_extent = occup_extent;
	this.regno = regno;
	this.cultivator_type = cultivator_type;
	this.sjointoccupant = sjointoccupant;
	this.cultivable_land = cultivable_land;
	this.uncultivable_land = uncultivable_land;
	this.dcode = dcode;
	this.mcode = mcode;
	this.mobileno = mobileno;
	this.part_key = part_key;
}


public String getCr_dist_code() {
	return cr_dist_code;
}


public void setCr_dist_code(String cr_dist_code) {
	this.cr_dist_code = cr_dist_code;
}


public String getCr_mand_code() {
	return cr_mand_code;
}


public void setCr_mand_code(String cr_mand_code) {
	this.cr_mand_code = cr_mand_code;
}


public String getWbvname() {
	return wbvname;
}


public void setWbvname(String wbvname) {
	this.wbvname = wbvname;
}


public String getCr_farmeruid() {
	return cr_farmeruid;
}


public void setCr_farmeruid(String cr_farmeruid) {
	this.cr_farmeruid = cr_farmeruid;
}


public String getFarmername() {
	return farmername;
}


public void setFarmername(String farmername) {
	this.farmername = farmername;
}


public String getFathername() {
	return fathername;
}


public void setFathername(String fathername) {
	this.fathername = fathername;
}


public String getOccupname() {
	return occupname;
}


public void setOccupname(String occupname) {
	this.occupname = occupname;
}


public String getOccupfname() {
	return occupfname;
}


public void setOccupfname(String occupfname) {
	this.occupfname = occupfname;
}


public String getKh_no() {
	return kh_no;
}


public void setKh_no(String kh_no) {
	this.kh_no = kh_no;
}


public String getCr_sno() {
	return cr_sno;
}


public void setCr_sno(String cr_sno) {
	this.cr_sno = cr_sno;
}


public String getTot_extent() {
	return tot_extent;
}


public void setTot_extent(String tot_extent) {
	this.tot_extent = tot_extent;
}


public String getOccup_extent() {
	return occup_extent;
}


public void setOccup_extent(String occup_extent) {
	this.occup_extent = occup_extent;
}


public String getRegno() {
	return regno;
}


public void setRegno(String regno) {
	this.regno = regno;
}


public String getCultivator_type() {
	return cultivator_type;
}


public void setCultivator_type(String cultivator_type) {
	this.cultivator_type = cultivator_type;
}


public String getSjointoccupant() {
	return sjointoccupant;
}


public void setSjointoccupant(String sjointoccupant) {
	this.sjointoccupant = sjointoccupant;
}


public String getCultivable_land() {
	return cultivable_land;
}


public void setCultivable_land(String cultivable_land) {
	this.cultivable_land = cultivable_land;
}


public String getUncultivable_land() {
	return uncultivable_land;
}


public void setUncultivable_land(String uncultivable_land) {
	this.uncultivable_land = uncultivable_land;
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


public String getMobileno() {
	return mobileno;
}


public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}


public String getPart_key() {
	return part_key;
}


public void setPart_key(String part_key) {
	this.part_key = part_key;
}


@Override
public String toString() {
	return "SurveyNodetIntfModel [cr_dist_code=" + cr_dist_code + ", cr_mand_code=" + cr_mand_code + ", wbvname="
			+ wbvname + ", cr_farmeruid=" + cr_farmeruid + ", farmername=" + farmername + ", fathername=" + fathername
			+ ", occupname=" + occupname + ", occupfname=" + occupfname + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno
			+ ", tot_extent=" + tot_extent + ", occup_extent=" + occup_extent + ", regno=" + regno
			+ ", cultivator_type=" + cultivator_type + ", sjointoccupant=" + sjointoccupant + ", cultivable_land="
			+ cultivable_land + ", uncultivable_land=" + uncultivable_land + ", dcode=" + dcode + ", mcode=" + mcode
			+ ", mobileno=" + mobileno + ", part_key=" + part_key + "]";
}


}
