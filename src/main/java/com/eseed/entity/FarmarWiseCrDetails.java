package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FarmarWiseCrDetails {

	@JsonProperty("District_ID")
	private BigDecimal crDistCode;  
	
	@JsonProperty("Mandal_ID")
    private BigDecimal crMandCode;   
	
	@JsonProperty("Village_ID")
    private Integer crVcode;   
	
	@JsonProperty("District_Name")
    private String dname;  
	
	@JsonProperty("Mandal_Name")
    private String mname;    
	
	@JsonProperty("Village_Name")
    private String vname;    
	
	@JsonProperty("Farmer_Name")
    private String farmerName;  
	
	@JsonProperty("UID_No")
    private String uidNo;     
	
	@JsonProperty("Father/Husband_Name")
    private String fatherOrHusbandName;
	
	@JsonProperty("bookingId")
    private Integer bookingId;   
	
	@JsonProperty("Khata_No")
    private BigDecimal khNo;  
	
	@JsonProperty("Survey_No")
    private String crSno;  
	
	@JsonProperty("Occupant_Extent")
    private BigDecimal occupantExtent; 
	
	@JsonProperty("Total_Extent")
    private BigDecimal totExtent;   
	
	@JsonProperty("Crop_Name")
    private String cropName;     
	
	@JsonProperty("VarietyName")
    private String varietyName; 
	
	@JsonProperty("Crop_Season")
    private Character crSeason; 
	
	@JsonProperty("CropYear")
    private BigDecimal crYear;  
	
	@JsonProperty("Area_Sown")
    private BigDecimal areaSown;  
	
	@JsonProperty("Sowing_Date")
    private Date sowingDate;
	
	@JsonProperty("Source_of_Irrigation")
    private String sourceOfIrrigation; 
	
	@JsonProperty("Record_Inserted_Date")
    private Date recordInsertedDate;      
	
	public BigDecimal getCrDistCode() {
		return crDistCode;
	}
	public void setCrDistCode(BigDecimal crDistCode) {
		this.crDistCode = crDistCode;
	}
	public BigDecimal getCrMandCode() {
		return crMandCode;
	}
	public void setCrMandCode(BigDecimal crMandCode) {
		this.crMandCode = crMandCode;
	}
	public Integer getCrVcode() {
		return crVcode;
	}
	public void setCrVcode(Integer crVcode) {
		this.crVcode = crVcode;
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
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getUidNo() {
		return uidNo;
	}
	public void setUidNo(String uidNo) {
		this.uidNo = uidNo;
	}
	public String getFatherOrHusbandName() {
		return fatherOrHusbandName;
	}
	public void setFatherOrHusbandName(String fatherOrHusbandName) {
		this.fatherOrHusbandName = fatherOrHusbandName;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public BigDecimal getKhNo() {
		return khNo;
	}
	public void setKhNo(BigDecimal khNo) {
		this.khNo = khNo;
	}
	public String getCrSno() {
		return crSno;
	}
	public void setCrSno(String crSno) {
		this.crSno = crSno;
	}
	public BigDecimal getOccupantExtent() {
		return occupantExtent;
	}
	public void setOccupantExtent(BigDecimal occupantExtent) {
		this.occupantExtent = occupantExtent;
	}
	public BigDecimal getTotExtent() {
		return totExtent;
	}
	public void setTotExtent(BigDecimal totExtent) {
		this.totExtent = totExtent;
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
	public Character getCrSeason() {
		return crSeason;
	}
	public void setCrSeason(Character crSeason) {
		this.crSeason = crSeason;
	}
	public BigDecimal getCrYear() {
		return crYear;
	}
	public void setCrYear(BigDecimal crYear) {
		this.crYear = crYear;
	}
	public BigDecimal getAreaSown() {
		return areaSown;
	}
	public void setAreaSown(BigDecimal areaSown) {
		this.areaSown = areaSown;
	}
	public Date getSowingDate() {
		return sowingDate;
	}
	public void setSowingDate(Date sowingDate) {
		this.sowingDate = sowingDate;
	}
	public String getSourceOfIrrigation() {
		return sourceOfIrrigation;
	}
	public void setSourceOfIrrigation(String sourceOfIrrigation) {
		this.sourceOfIrrigation = sourceOfIrrigation;
	}
	public Date getRecordInsertedDate() {
		return recordInsertedDate;
	}
	public void setRecordInsertedDate(Date recordInsertedDate) {
		this.recordInsertedDate = recordInsertedDate;
	}
	public FarmarWiseCrDetails(BigDecimal crDistCode, BigDecimal crMandCode, Integer crVcode, String dname,
			String mname, String vname, String farmerName, String uidNo, String fatherOrHusbandName, Integer bookingId,
			BigDecimal khNo, String crSno, BigDecimal occupantExtent, BigDecimal totExtent, String cropName,
			String varietyName, Character crSeason, BigDecimal crYear, BigDecimal areaSown, Date sowingDate,
			String sourceOfIrrigation, Date recordInsertedDate) {
		super();
		this.crDistCode = crDistCode;
		this.crMandCode = crMandCode;
		this.crVcode = crVcode;
		this.dname = dname;
		this.mname = mname;
		this.vname = vname;
		this.farmerName = farmerName;
		this.uidNo = uidNo;
		this.fatherOrHusbandName = fatherOrHusbandName;
		this.bookingId = bookingId;
		this.khNo = khNo;
		this.crSno = crSno;
		this.occupantExtent = occupantExtent;
		this.totExtent = totExtent;
		this.cropName = cropName;
		this.varietyName = varietyName;
		this.crSeason = crSeason;
		this.crYear = crYear;
		this.areaSown = areaSown;
		this.sowingDate = sowingDate;
		this.sourceOfIrrigation = sourceOfIrrigation;
		this.recordInsertedDate = recordInsertedDate;
	}
	public FarmarWiseCrDetails() {
	
	}
	@Override
	public String toString() {
		return "FarmarWiseCrDetails [crDistCode=" + crDistCode + ", crMandCode=" + crMandCode + ", crVcode=" + crVcode
				+ ", dname=" + dname + ", mname=" + mname + ", vname=" + vname + ", farmerName=" + farmerName
				+ ", uidNo=" + uidNo + ", fatherOrHusbandName=" + fatherOrHusbandName + ", bookingId=" + bookingId
				+ ", khNo=" + khNo + ", crSno=" + crSno + ", occupantExtent=" + occupantExtent + ", totExtent="
				+ totExtent + ", cropName=" + cropName + ", varietyName=" + varietyName + ", crSeason=" + crSeason
				+ ", crYear=" + crYear + ", areaSown=" + areaSown + ", sowingDate=" + sowingDate
				+ ", sourceOfIrrigation=" + sourceOfIrrigation + ", recordInsertedDate=" + recordInsertedDate + "]";
	}

    
    
}
