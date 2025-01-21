package com.eseed.entity;

public class RbkVroAuthComplModel {

	private String  wbdname;
	private String  wbmname;
	private String wbvname;
	private String occupname;
	private String  cr_farmeruid;
	private String bookingid;
	private String kh_no;
	private String cultdesc;
	private String varietyname; 
	private String cr_sno;
	private String cr_mix_unmix_ext; 
	private String cr_crop; 
	private String ekyc;
	private String cropname;
	private String  cropduration;
	private String   vaaauth;
	
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
	public String getCr_farmeruid() {
		return cr_farmeruid;
	}
	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public String getKh_no() {
		return kh_no;
	}
	public void setKh_no(String kh_no) {
		this.kh_no = kh_no;
	}
	public String getCultdesc() {
		return cultdesc;
	}
	public void setCultdesc(String cultdesc) {
		this.cultdesc = cultdesc;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public String getCr_mix_unmix_ext() {
		return cr_mix_unmix_ext;
	}
	public void setCr_mix_unmix_ext(String cr_mix_unmix_ext) {
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
	}
	public String getCr_crop() {
		return cr_crop;
	}
	public void setCr_crop(String cr_crop) {
		this.cr_crop = cr_crop;
	}
	public String getEkyc() {
		return ekyc;
	}
	public void setEkyc(String ekyc) {
		this.ekyc = ekyc;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getCropduration() {
		return cropduration;
	}
	public void setCropduration(String cropduration) {
		this.cropduration = cropduration;
	}
	public String getVaaauth() {
		return vaaauth;
	}
	public void setVaaauth(String vaaauth) {
		this.vaaauth = vaaauth;
	}
	public RbkVroAuthComplModel(String wbdname, String wbmname, String wbvname, String occupname, String cr_farmeruid,
			String bookingid, String kh_no, String cultdesc, String varietyname, String cr_sno, String cr_mix_unmix_ext,
			String cr_crop, String ekyc, String cropname, String cropduration, String vaaauth) {
		super();
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.occupname = occupname;
		this.cr_farmeruid = cr_farmeruid;
		this.bookingid = bookingid;
		this.kh_no = kh_no;
		this.cultdesc = cultdesc;
		this.varietyname = varietyname;
		this.cr_sno = cr_sno;
		this.cr_mix_unmix_ext = cr_mix_unmix_ext;
		this.cr_crop = cr_crop;
		this.ekyc = ekyc;
		this.cropname = cropname;
		this.cropduration = cropduration;
		this.vaaauth = vaaauth;
	}
	public RbkVroAuthComplModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RbkVroAuthComplModel [wbdname=" + wbdname + ", wbmname=" + wbmname + ", wbvname=" + wbvname
				+ ", occupname=" + occupname + ", cr_farmeruid=" + cr_farmeruid + ", bookingid=" + bookingid
				+ ", kh_no=" + kh_no + ", cultdesc=" + cultdesc + ", varietyname=" + varietyname + ", cr_sno=" + cr_sno
				+ ", cr_mix_unmix_ext=" + cr_mix_unmix_ext + ", cr_crop=" + cr_crop + ", ekyc=" + ekyc + ", cropname="
				+ cropname + ", cropduration=" + cropduration + ", vaaauth=" + vaaauth + "]";
	}
	
	
	
	
	
}
