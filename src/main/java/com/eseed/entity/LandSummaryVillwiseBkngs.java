package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LandSummaryVillwiseBkngs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String cr_sno;
	private Integer kh_no;
	private String occupname;
	private BigDecimal occupant_extent;
	private String data_src;
	private String vaa_selection_flag;
	private BigDecimal cultivator_ext;
	private String download_flag;
	private BigDecimal booked_ext;
	private String cr_crop;
	private Integer variety;
	private String uploaded_date;
	private String  crop_no;
	private String sown_date;
	private String mao_alloc_status;
	
	
	public LandSummaryVillwiseBkngs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LandSummaryVillwiseBkngs(String cr_sno, Integer kh_no, String occupname, BigDecimal occupant_extent,
			String data_src, String vaa_selection_flag, BigDecimal cultivator_ext, String download_flag,
			BigDecimal booked_ext, String cr_crop, Integer variety, String uploaded_date, String crop_no,
			String sown_date) {
		super();
		this.cr_sno = cr_sno;
		this.kh_no = kh_no;
		this.occupname = occupname;
		this.occupant_extent = occupant_extent;
		this.data_src = data_src;
		this.vaa_selection_flag = vaa_selection_flag;
		this.cultivator_ext = cultivator_ext;
		this.download_flag = download_flag;
		this.booked_ext = booked_ext;
		this.cr_crop = cr_crop;
		this.variety = variety;
		this.uploaded_date = uploaded_date;
		this.crop_no = crop_no;
		this.sown_date = sown_date;
	}
	public String getCr_sno() {
		return cr_sno;
	}
	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
	public Integer getKh_no() {
		return kh_no;
	}
	public void setKh_no(Integer kh_no) {
		this.kh_no = kh_no;
	}
	public String getOccupname() {
		return occupname;
	}
	public void setOccupname(String occupname) {
		this.occupname = occupname;
	}
	public BigDecimal getOccupant_extent() {
		return occupant_extent;
	}
	public void setOccupant_extent(BigDecimal occupant_extent) {
		this.occupant_extent = occupant_extent;
	}
	public String getData_src() {
		return data_src;
	}
	public void setData_src(String data_src) {
		this.data_src = data_src;
	}
	public String getVaa_selection_flag() {
		return vaa_selection_flag;
	}
	public void setVaa_selection_flag(String vaa_selection_flag) {
		this.vaa_selection_flag = vaa_selection_flag;
	}
	public BigDecimal getCultivator_ext() {
		return cultivator_ext;
	}
	public void setCultivator_ext(BigDecimal cultivator_ext) {
		this.cultivator_ext = cultivator_ext;
	}
	public String getDownload_flag() {
		return download_flag;
	}
	public void setDownload_flag(String download_flag) {
		this.download_flag = download_flag;
	}
	public BigDecimal getBooked_ext() {
		return booked_ext;
	}
	public void setBooked_ext(BigDecimal booked_ext) {
		this.booked_ext = booked_ext;
	}
	public String getCr_crop() {
		return cr_crop;
	}
	public void setCr_crop(String cr_crop) {
		this.cr_crop = cr_crop;
	}
	public Integer getVariety() {
		return variety;
	}
	public void setVariety(Integer variety) {
		this.variety = variety;
	}
	public String getUploaded_date() {
		return uploaded_date;
	}
	public void setUploaded_date(String uploaded_date) {
		this.uploaded_date = uploaded_date;
	}
	public String getCrop_no() {
		return crop_no;
	}
	public void setCrop_no(String crop_no) {
		this.crop_no = crop_no;
	}
	public String getSown_date() {
		return sown_date;
	}
	public void setSown_date(String sown_date) {
		this.sown_date = sown_date;
	}
	public String getMao_alloc_status() {
		return mao_alloc_status;
	}
	public void setMao_alloc_status(String mao_alloc_status) {
		this.mao_alloc_status = mao_alloc_status;
	}
	@Override
	public String toString() {
		return "LandSummaryVillwiseBkngs [cr_sno=" + cr_sno + ", kh_no=" + kh_no + ", occupname=" + occupname
				+ ", occupant_extent=" + occupant_extent + ", data_src=" + data_src + ", vaa_selection_flag="
				+ vaa_selection_flag + ", cultivator_ext=" + cultivator_ext + ", download_flag=" + download_flag
				+ ", booked_ext=" + booked_ext + ", cr_crop=" + cr_crop + ", variety=" + variety + ", uploaded_date="
				+ uploaded_date + ", crop_no=" + crop_no + ", sown_date=" + sown_date + ", mao_alloc_status="
				+ mao_alloc_status + "]";
	}
	

}
