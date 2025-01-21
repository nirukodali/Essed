package com.eseed.entity;

import java.math.BigDecimal; 
import org.hibernate.annotations.Formula;

public class SearchFormByKhataAndSurveryNo {
	                 
	private int bookingid;   
	private int dcode;
	private int mcode;
	private BigDecimal cr_dist_code;   
	private BigDecimal cr_mand_code;    
	private int cr_vcode;    
	private BigDecimal cr_year;    
	private char cr_season;   
	@Formula(value="concat('XXXXXXX',substr(cr_farmeruid,9,4))")
	private String cr_farmeruid; 
	private char owner_tenant;
	private String oc_name;    
	private String oc_fname;    
	private BigDecimal mobileno;    
	private int age;    
	private String email;    
	private BigDecimal kh_no;    
	private String cr_sno;    
	private BigDecimal tot_extent;     
	private BigDecimal cultivable_land;   
	private BigDecimal uncultivable_land;
	private int cr_month;   
	private int cr_sow_type;   
	private int cr_crop;
	private BigDecimal cr_mix_unmix_ext;   
	private String cr_no;
	private BigDecimal cr_w_draw;   
	private int cr_irr_type;   
	private BigDecimal wtr_tax;
	private BigDecimal longitude;   
	private BigDecimal latitude;
	private String cropname; 
	private String data_src;
	private String varietyname;
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
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
	public BigDecimal getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(BigDecimal cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	public BigDecimal getCr_mand_code() {
		return cr_mand_code;
	}
	public void setCr_mand_code(BigDecimal cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}
	public int getCr_vcode() {
		return cr_vcode;
	}
	public void setCr_vcode(int cr_vcode) {
		this.cr_vcode = cr_vcode;
	}
	public BigDecimal getCr_year() {
		return cr_year;
	}
	public void setCr_year(BigDecimal cr_year) {
		this.cr_year = cr_year;
	}
	public char getCr_season() {
		return cr_season;
	}
	public void setCr_season(char cr_season) {
		this.cr_season = cr_season;
	}
	public String getCr_farmeruid() {
		return cr_farmeruid;
	}
	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}
	public char getOwner_tenant() {
		return owner_tenant;
	}
	public void setOwner_tenant(char owner_tenant) {
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
	public BigDecimal getMobileno() {
		return mobileno;
	}
	public void setMobileno(BigDecimal mobileno) {
		this.mobileno = mobileno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigDecimal getKh_no() {
		return kh_no;
	}
	public void setKh_no(BigDecimal kh_no) {
		this.kh_no = kh_no;
	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public BigDecimal getTot_extent() {
		return tot_extent;
	}
	public void setTot_extent(BigDecimal tot_extent) {
		this.tot_extent = tot_extent;
	}
	public BigDecimal getCultivable_land() {
		return cultivable_land;
	}
	public void setCultivable_land(BigDecimal cultivable_land) {
		this.cultivable_land = cultivable_land;
	}
	public BigDecimal getUncultivable_land() {
		return uncultivable_land;
	}
	public void setUncultivable_land(BigDecimal uncultivable_land) {
		this.uncultivable_land = uncultivable_land;
	}
	public int getCr_month() {
		return cr_month;
	}
	public void setCr_month(int cr_month) {
		this.cr_month = cr_month;
	}
	public int getCr_sow_type() {
		return cr_sow_type;
	}
	public void setCr_sow_type(int cr_sow_type) {
		this.cr_sow_type = cr_sow_type;
	}
	public int getCr_crop() {
		return cr_crop;
	}
	public void setCr_crop(int cr_crop) {
		this.cr_crop = cr_crop;
	}
	public BigDecimal getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}
	public void setCr_mix_unmix_ext(BigDecimal cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
	}
	public String getCr_no() {
		return cr_no;
	}
	public void setCr_no(String cr_no) {
		this.cr_no = cr_no;
	}
	public BigDecimal getCr_w_draw() {
		return cr_w_draw;
	}
	public void setCr_w_draw(BigDecimal cr_w_draw) {
		this.cr_w_draw = cr_w_draw;
	}
	public int getCr_irr_type() {
		return cr_irr_type;
	}
	public void setCr_irr_type(int cr_irr_type) {
		this.cr_irr_type = cr_irr_type;
	}
	public BigDecimal getWtr_tax() {
		return wtr_tax;
	}
	public void setWtr_tax(BigDecimal wtr_tax) {
		this.wtr_tax = wtr_tax;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getData_src() {
		return data_src;
	}
	public void setData_src(String data_src) {
		this.data_src = data_src;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	
}
