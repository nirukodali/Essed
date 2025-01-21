package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="unsurveyed_unsettled_det",schema="ecrop2024")
public class Unsurveyed_UnsettledDdetEntity {
	@Id
	@NotBlank(message="Aadhar number should not be null or empty")
	 private String cr_farmeruid;
	@NotNull(message="District should not be null or empty")
	private int cr_dist_code;
	@NotNull(message="Mandal should not be null or empty")

    private int  cr_mand_code ;
   private int  cr_vcode;
   private int  cr_year;
  private String  cr_season;
  private Character  owner_tenant;
   private String  oc_name;
    private String oc_fname;
	
    private String email;
  private Long mobileno;
  
   private String cr_sno;
   private Double  tot_extent;
   private String entry_by;
  private Timestamp  entry_date;
 
 private String imei;
 private String updatedby;
 private Timestamp  updateon;
 private String  ipaddress;
   private Character data_src;
   private Double  occupant_extent;
   private int  dcode;
   private int  mcode ;
  private String  occupname;
  private String  occupfname;
   // private int  soc_category;
   private String gender;
   private String crt_user;
   private Timestamp dt_crt;
   private Character landownership_type;
   private Character insertedby;
   private Character digitally_signed;
   private String cat_code;
  private Character  crb_dwn;
public int getCr_dist_code() {
	return cr_dist_code;
}
public void setCr_dist_code(int cr_dist_code) {
	this.cr_dist_code = cr_dist_code;
}
public int getCr_mand_code() {
	return cr_mand_code;
}
public void setCr_mand_code(int cr_mand_code) {
	this.cr_mand_code = cr_mand_code;
}
public int getCr_vcode() {
	return cr_vcode;
}
public void setCr_vcode(int cr_vcode) {
	this.cr_vcode = cr_vcode;
}
public int getCr_year() {
	return cr_year;
}
public void setCr_year(int cr_year) {
	this.cr_year = cr_year;
}
public String getCr_season() {
	return cr_season;
}
public void setCr_season(String cr_season2) {
	this.cr_season = cr_season2;
}
public String getCr_farmeruid() {
	return cr_farmeruid;
}
public void setCr_farmeruid(String cr_farmeruid) {
	this.cr_farmeruid = cr_farmeruid;
}
public Character getOwner_tenant() {
	return owner_tenant;
}
public void setOwner_tenant(Character owner_tenant) {
	this.owner_tenant = owner_tenant;
}
public String getOc_name() {
	return oc_name;
}
public void setOc_name(String oc_name) {
	this.oc_name = oc_name;
}
public String getOc_fname() {
	return oc_fname;
}
public void setOc_fname(String oc_fname) {
	this.oc_fname = oc_fname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getMobileno() {
	return mobileno;
}
public void setMobileno(Long mobileNo2) {
	this.mobileno = mobileNo2;
}
//public int getAge() {
//	return age;
//}
//public void setAge(int age) {
//	this.age = age;
//}
public String getCr_sno() {
	return cr_sno;
}
public void setCr_sno(String cr_sno) {
	this.cr_sno = cr_sno;
}
public Double getTot_extent() {
	return tot_extent;
}
public void setTot_extent(Double tot_extent) {
	this.tot_extent = tot_extent;
}
public String getEntry_by() {
	return entry_by;
}
public void setEntry_by(String entry_by) {
	this.entry_by = entry_by;
}
public Timestamp getEntry_date() {
	return entry_date;
}
public void setEntry_date(Timestamp entry_date) {
	this.entry_date = entry_date;
}
//public int getLongitude() {
//	return longitude;
//}
//public void setLongitude(int longitude) {
//	this.longitude = longitude;
//}
//public int getLatitude() {
//	return latitude;
//}
//public void setLatitude(int latitude) {
//	this.latitude = latitude;
//}
public String getImei() {
	return imei;
}
public void setImei(String imei) {
	this.imei = imei;
}
public String getUpdatedby() {
	return updatedby;
}
public void setUpdatedby(String updatedby) {
	this.updatedby = updatedby;
}
public Timestamp getUpdateon() {
	return updateon;
}
public void setUpdateon(Timestamp updateon) {
	this.updateon = updateon;
}
public String getIpaddress() {
	return ipaddress;
}
public void setIpaddress(String ipaddress) {
	this.ipaddress = ipaddress;
}
public Character getData_src() {
	return data_src;
}
public void setData_src(Character data_src) {
	this.data_src = data_src;
}
public Double getOccupant_extent() {
	return occupant_extent;
}
public void setOccupant_extent(Double occupant_extent) {
	this.occupant_extent = occupant_extent;
}
public int getDcode() {
	return dcode;
}
public void setDcode(int dcode) {
	this.dcode = dcode;
}
public int getMcode() {
	return mcode;
}
public void setMcode(int mcode) {
	this.mcode = mcode;
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
//public int getSoc_category() {
//	return soc_category;
//}
//public void setSoc_category(int soc_category) {
//	this.soc_category = soc_category;
//}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCrt_user() {
	return crt_user;
}
public void setCrt_user(String crt_user) {
	this.crt_user = crt_user;
}
public Timestamp getDt_crt() {
	return dt_crt;
}
public void setDt_crt(Timestamp dt_crt) {
	this.dt_crt = dt_crt;
}
public Character getLandownership_type() {
	return landownership_type;
}
public void setLandownership_type(Character landownership_type) {
	this.landownership_type = landownership_type;
}
public Character getInsertedby() {
	return insertedby;
}
public void setInsertedby(Character insertedby) {
	this.insertedby = insertedby;
}
public Character getDigitally_signed() {
	return digitally_signed;
}
public void setDigitally_signed(Character digitally_signed) {
	this.digitally_signed = digitally_signed;
}
public String getCat_code() {
	return cat_code;
}
public void setCat_code(String cat_code) {
	this.cat_code = cat_code;
}
public Character getCrb_dwn() {
	return crb_dwn;
}
public void setCrb_dwn(Character crb_dwn) {
	this.crb_dwn = crb_dwn;
}

}
