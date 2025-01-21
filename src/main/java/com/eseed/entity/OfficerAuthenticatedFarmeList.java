package com.eseed.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OfficerAuthenticatedFarmeList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Double  subsidyamt;
	private Double  collectedamount;
	private String seedvariety;
	private Integer transactionid;
	private String  farmername;
	private String  issueduserid;
	private Integer  issuedbags;
	private  String dt_issue;
	private String  status;
	private String socialstatus;
	private String mobileno;
	private String username;
	private String authenticated_code;
	private Timestamp ts;
	private Integer cropyear;
	private String season;
	private Integer dcode;
	private Integer mcode;
	private String cropName;
	private String authType;
	public OfficerAuthenticatedFarmeList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Double getSubsidyamt() {
		return subsidyamt;
	}
	public void setSubsidyamt(Double subsidyamt) {
		this.subsidyamt = subsidyamt;
	}
	public Double getCollectedamount() {
		return collectedamount;
	}
	public void setCollectedamount(Double collectedamount) {
		this.collectedamount = collectedamount;
	}
	public String getSeedvariety() {
		return seedvariety;
	}
	public void setSeedvariety(String seedvariety) {
		this.seedvariety = seedvariety;
	}
	public Integer getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(Integer transactionid) {
		this.transactionid = transactionid;
	}
	public String getFarmername() {
		return farmername;
	}
	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}
	public String getIssueduserid() {
		return issueduserid;
	}
	public void setIssueduserid(String issueduserid) {
		this.issueduserid = issueduserid;
	}
	public Integer getIssuedbags() {
		return issuedbags;
	}
	public void setIssuedbags(Integer issuedbags) {
		this.issuedbags = issuedbags;
	}
	public String getDt_issue() {
		return dt_issue;
	}
	public void setDt_issue(String dt_issue) {
		this.dt_issue = dt_issue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSocialstatus() {
		return socialstatus;
	}
	public void setSocialstatus(String socialstatus) {
		this.socialstatus = socialstatus;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthenticated_code() {
		return authenticated_code;
	}
	public void setAuthenticated_code(String authenticated_code) {
		this.authenticated_code = authenticated_code;
	}
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	public Integer getCropyear() {
		return cropyear;
	}
	public void setCropyear(Integer cropyear) {
		this.cropyear = cropyear;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}
	public Integer getMcode() {
		return mcode;
	}
	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getAuthType() {
		return authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}
	@Override
	public String toString() {
		return "OfficerAuthenticatedFarmeList [subsidyamt=" + subsidyamt + ", collectedamount=" + collectedamount
				+ ", seedvariety=" + seedvariety + ", transactionid=" + transactionid + ", farmername=" + farmername
				+ ", issueduserid=" + issueduserid + ", issuedbags=" + issuedbags + ", dt_issue=" + dt_issue
				+ ", status=" + status + ", socialstatus=" + socialstatus + ", mobileno=" + mobileno + ", username="
				+ username + ", authenticated_code=" + authenticated_code + ", ts=" + ts + ", cropyear=" + cropyear
				+ ", season=" + season + ", dcode=" + dcode + ", mcode=" + mcode + ", cropName=" + cropName
				+ ", authType=" + authType + "]";
	}
	public OfficerAuthenticatedFarmeList(Double subsidyamt, Double collectedamount, String seedvariety,
			Integer transactionid, String farmername, String issueduserid, Integer issuedbags, String dt_issue,
			String status, String socialstatus, String mobileno, String username, String authenticated_code,
			Timestamp ts, Integer cropyear, String season, Integer dcode, Integer mcode, String cropName,
			String authType) {
		super();
		this.subsidyamt = subsidyamt;
		this.collectedamount = collectedamount;
		this.seedvariety = seedvariety;
		this.transactionid = transactionid;
		this.farmername = farmername;
		this.issueduserid = issueduserid;
		this.issuedbags = issuedbags;
		this.dt_issue = dt_issue;
		this.status = status;
		this.socialstatus = socialstatus;
		this.mobileno = mobileno;
		this.username = username;
		this.authenticated_code = authenticated_code;
		this.ts = ts;
		this.cropyear = cropyear;
		this.season = season;
		this.dcode = dcode;
		this.mcode = mcode;
		this.cropName = cropName;
		this.authType = authType;
	}
	
	
}
