package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class JowarMaizeEntity {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private String wbdname;
    private String wbmname;
    private String wbvname;
    private String occupname; 
    private Integer bookingid; 
    private String cr_farmeruid; 
    private BigDecimal mobileno; 
    private String caste;
    private BigDecimal kh_no; 
    private String cr_sno; 
    private BigDecimal cr_mix_unmix_ext; 
    private String cropname; 
    private String varietyname; 
    private Character ekyc; 
    private BigDecimal not_damaged_ext; 
    private BigDecimal input_sub_ext ;
    private BigDecimal damaged_ext ;
    private Integer est_production ;
    private Integer grain_damage_percent ;
    private Character input_sub_cover ;
    private String bankacno ;
    private String bankname ;
    private String ifsc_code ;
    private String photo ;
	public JowarMaizeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JowarMaizeEntity(String wbdname, String wbmname, String wbvname, String occupname, Integer bookingid,
			String cr_farmeruid, BigDecimal mobileno, String caste, BigDecimal kh_no, String cr_sno,
			BigDecimal cr_mix_unmix_ext, String cropname, String varietyname, Character ekyc, BigDecimal not_damaged_ext,
			BigDecimal input_sub_ext, BigDecimal damaged_ext, Integer est_production, Integer grain_damage_percent,
			Character input_sub_cover, String bankacno, String bankname, String ifsc_code, String photo) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.occupname = occupname;
		this.bookingid = bookingid;
		this.cr_farmeruid = cr_farmeruid;
		this.mobileno = mobileno;
		this.caste = caste;
		this.kh_no = kh_no;
		this.cr_sno = cr_sno;
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		this.cropname = cropname;
		this.varietyname = varietyname;
		this.ekyc = ekyc;
		this.not_damaged_ext = not_damaged_ext;
		this.input_sub_ext = input_sub_ext;
		this.damaged_ext = damaged_ext;
		this.est_production = est_production;
		this.grain_damage_percent = grain_damage_percent;
		this.input_sub_cover = input_sub_cover;
		this.bankacno = bankacno;
		this.bankname = bankname;
		this.ifsc_code = ifsc_code;
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "JowarMaizeEntity [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", occupname="
				+ occupname + ", bookingid=" + bookingid + ", cr_farmeruid=" + cr_farmeruid + ", mobileno=" + mobileno
				+ ", caste=" + caste + ", kh_no=" + kh_no + ", cr_sno=" + cr_sno + ", cr_mix_unmix_ext="
				+ cr_mix_unmix_ext + ", cropname=" + cropname + ", varietyname=" + varietyname + ", ekyc=" + ekyc
				+ ", not_damaged_ext=" + not_damaged_ext + ", input_sub_ext=" + input_sub_ext + ", damaged_ext="
				+ damaged_ext + ", est_production=" + est_production + ", grain_damage_percent=" + grain_damage_percent
				+ ", input_sub_cover=" + input_sub_cover + ", bankacno=" + bankacno + ", bankname=" + bankname
				+ ", ifsc_code=" + ifsc_code + ", photo=" + photo + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getWbdname() {
		return wbdname;
	}
	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}
	public String getWbmname() {
		return wbmname;
	}
	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}
	public String getWbvname() {
		return wbvname;
	}
	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}
	public String getOccupname() {
		return occupname;
	}
	public void setOccupname(String occupname) {
		this.occupname = occupname;
	}
	public Integer getBookingid() {
		return bookingid;
	}
	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}
	public String getCr_farmeruid() {
		return cr_farmeruid;
	}
	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}
	public BigDecimal getMobileno() {
		return mobileno;
	}
	public void setMobileno(BigDecimal mobileno) {
		this.mobileno = mobileno;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
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
	public BigDecimal getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}
	public void setCr_mix_unmix_ext(BigDecimal cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	public Character getEkyc() {
		return ekyc;
	}
	public void setEkyc(Character ekyc) {
		this.ekyc = ekyc;
	}
	public BigDecimal getNot_damaged_ext() {
		return not_damaged_ext;
	}
	public void setNot_damaged_ext(BigDecimal not_damaged_ext) {
		this.not_damaged_ext = not_damaged_ext;
	}
	public BigDecimal getInput_sub_ext() {
		return input_sub_ext;
	}
	public void setInput_sub_ext(BigDecimal input_sub_ext) {
		this.input_sub_ext = input_sub_ext;
	}
	public BigDecimal getDamaged_ext() {
		return damaged_ext;
	}
	public void setDamaged_ext(BigDecimal damaged_ext) {
		this.damaged_ext = damaged_ext;
	}
	public Integer getEst_production() {
		return est_production;
	}
	public void setEst_production(Integer est_production) {
		this.est_production = est_production;
	}
	public Integer getGrain_damage_percent() {
		return grain_damage_percent;
	}
	public void setGrain_damage_percent(Integer grain_damage_percent) {
		this.grain_damage_percent = grain_damage_percent;
	}
	public Character getInput_sub_cover() {
		return input_sub_cover;
	}
	public void setInput_sub_cover(Character input_sub_cover) {
		this.input_sub_cover = input_sub_cover;
	}
	public String getBankacno() {
		return bankacno;
	}
	public void setBankacno(String bankacno) {
		this.bankacno = bankacno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
    
    
}
