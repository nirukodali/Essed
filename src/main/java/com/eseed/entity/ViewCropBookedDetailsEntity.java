package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class ViewCropBookedDetailsEntity {
	
//	cr_w_draw   source of irrigation
//	irrmethod  irrigation method
//	cropseed_scheme   farming type
	
	private BigDecimal khathaNo;
  
	private String surveyNo;
	
	private Integer bookingId;

	private String farmerid;

	private BigDecimal totExtent;
	
	private String farmerName;   
	
	private String farmerFatherName;

	private String varietyName;

	private BigDecimal totalExtent;
	
	private String irrMethodDesc;
	
	private String waterSource;

	private String cropNature;

	private Date sowDt;

	private String farmingType;

	private Integer crcrop;
	
	private Integer variety;
	
	private Integer wbldCode;
	
	private BigDecimal mandCode;
	
	private BigDecimal cropYear;
	
	private String season;
	
	private String cropid;
	
	private String dname;
	
	private String mname;
	
	private String vname;
	
	private String cropName;
	
	private BigDecimal waterid;
	
	private Integer cropNatId;
	
	private Character cropseedid;
	
	private BigDecimal cr_w_draw;
	
	public BigDecimal getKhathaNo() {
		return khathaNo;
	}

	public void setKhathaNo(BigDecimal khathaNo) {
		this.khathaNo = khathaNo;
	}

	public String getSurveyNo() {
		return surveyNo;
	}

	public void setSurveyNo(String surveyNo) {
		this.surveyNo = surveyNo;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getFarmerid() {
		return farmerid;
	}

	public void setFarmerid(String farmerid) {
		this.farmerid = farmerid;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getFarmerFatherName() {
		return farmerFatherName;
	}

	public void setFarmerFatherName(String farmerFatherName) {
		this.farmerFatherName = farmerFatherName;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getVarietyName() {
		return varietyName;
	}

	public void setVarietyName(String varietyName) {
		this.varietyName = varietyName;
	}

	public BigDecimal getTotalExtent() {
		return totalExtent;
	}

	public void setTotalExtent(BigDecimal totalExtent) {
		this.totalExtent = totalExtent;
	}

	public String getWaterSource() {
		return waterSource;
	}

	public void setWaterSource(String waterSource) {
		this.waterSource = waterSource;
	}

	public String getCropNature() {
		return cropNature;
	}

	public void setCropNature(String cropNature) {
		this.cropNature = cropNature;
	}

	public Date getSowDt() {
		return sowDt;
	}

	public void setSowDt(Date sowDt) {
		this.sowDt = sowDt;
	}

	public String getFarmingType() {
		return farmingType;
	}

	public void setFarmingType(String farmingType) {
		this.farmingType = farmingType;
	}

	public Integer getCrcrop() {
		return crcrop;
	}

	public void setCrcrop(Integer crcrop) {
		this.crcrop = crcrop;
	}

	public Integer getVariety() {
		return variety;
	}

	public void setVariety(Integer variety) {
		this.variety = variety;
	}

	public Integer getWbldCode() {
		return wbldCode;
	}

	public void setWbldCode(Integer wbldCode) {
		this.wbldCode = wbldCode;
	}

	public BigDecimal getMandCode() {
		return mandCode;
	}

	public void setMandCode(BigDecimal mandCode) {
		this.mandCode = mandCode;
	}

	public BigDecimal getCropYear() {
		return cropYear;
	}

	public void setCropYear(BigDecimal cropYear) {
		this.cropYear = cropYear;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getCropid() {
		return cropid;
	}

	public void setCropid(String cropid) {
		this.cropid = cropid;
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

	public BigDecimal getWaterid() {
		return waterid;
	}

	public void setWaterid(BigDecimal waterid) {
		this.waterid = waterid;
	}

	public Integer getCropNatId() {
		return cropNatId;
	}

	public void setCropNatId(Integer cropNatId) {
		this.cropNatId = cropNatId;
	}

	public Character getCropseedid() {
		return cropseedid;
	}

	public void setCropseedid(Character cropseedid) {
		this.cropseedid = cropseedid;
	}

	public BigDecimal getCr_w_draw() {
		return cr_w_draw;
	}

	public void setCr_w_draw(BigDecimal cr_w_draw) {
		this.cr_w_draw = cr_w_draw;
	}
	
	public String getIrrMethodDesc() {
		return irrMethodDesc;
	}

	public void setIrrMethodDesc(String irrMethodDesc) {
		this.irrMethodDesc = irrMethodDesc;
	}

	

	public BigDecimal getTotExtent() {
		return totExtent;
	}

	public void setTotExtent(BigDecimal totExtent) {
		this.totExtent = totExtent;
	}

	@Override
	public String toString() {
		return "ViewCropBookedDetailsEntity [khathaNo=" + khathaNo + ", surveyNo=" + surveyNo + ", bookingId="
				+ bookingId + ", farmerid=" + farmerid + ", totExtent=" + totExtent + ", farmerName=" + farmerName
				+ ", farmerFatherName=" + farmerFatherName + ", varietyName=" + varietyName + ", totalExtent="
				+ totalExtent + ", irrMethodDesc=" + irrMethodDesc + ", waterSource=" + waterSource + ", cropNature="
				+ cropNature + ", sowDt=" + sowDt + ", farmingType=" + farmingType + ", crcrop=" + crcrop + ", variety="
				+ variety + ", wbldCode=" + wbldCode + ", mandCode=" + mandCode + ", cropYear=" + cropYear + ", season="
				+ season + ", cropid=" + cropid + ", dname=" + dname + ", mname=" + mname + ", vname=" + vname
				+ ", cropName=" + cropName + ", waterid=" + waterid + ", cropNatId=" + cropNatId + ", cropseedid="
				+ cropseedid + ", cr_w_draw=" + cr_w_draw + "]";
	}

	public ViewCropBookedDetailsEntity(BigDecimal khathaNo, String surveyNo, Integer bookingId, String farmerid,
			BigDecimal totExtent, String farmerName, String farmerFatherName, String varietyName, BigDecimal totalExtent,
			String irrMethodDesc, String waterSource, String cropNature, Date sowDt, String farmingType, Integer crcrop,
			Integer variety, Integer wbldCode, BigDecimal mandCode, BigDecimal cropYear, String season, String cropid,
			String dname, String mname, String vname, String cropName, BigDecimal waterid, Integer cropNatId,
			Character cropseedid, BigDecimal cr_w_draw) {
		super();
		this.khathaNo = khathaNo;
		this.surveyNo = surveyNo;
		this.bookingId = bookingId;
		this.farmerid = farmerid;
		this.totExtent = totExtent;
		this.farmerName = farmerName;
		this.farmerFatherName = farmerFatherName;
		this.varietyName = varietyName;
		this.totalExtent = totalExtent;
		this.irrMethodDesc = irrMethodDesc;
		this.waterSource = waterSource;
		this.cropNature = cropNature;
		this.sowDt = sowDt;
		this.farmingType = farmingType;
		this.crcrop = crcrop;
		this.variety = variety;
		this.wbldCode = wbldCode;
		this.mandCode = mandCode;
		this.cropYear = cropYear;
		this.season = season;
		this.cropid = cropid;
		this.dname = dname;
		this.mname = mname;
		this.vname = vname;
		this.cropName = cropName;
		this.waterid = waterid;
		this.cropNatId = cropNatId;
		this.cropseedid = cropseedid;
		this.cr_w_draw = cr_w_draw;
	}
	
	public ViewCropBookedDetailsEntity() {
    }
}
