package com.eseed.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_booking",schema = "ecrop2024")
public class Cultivator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingid")
	private Integer bookingId;

	@Column(name = "part_key")
	private String part_key;

	@Column(name = "cr_sno")
	private String crSno;

	@Column(name = "tot_extent")
	private Double totalExtent;

	@Column(name = "cr_farmeruid")
	private String aadharNo;

	@Column(name = "oc_fname")
	private String fatherName;

	@Column(name = "occupant_extent")
	private Double occupantExtent;

	@Column(name = "kh_no")
	private BigDecimal khNo;

	@Column(name = "oc_name")
	private String ocName;

	@Column(name = "cr_vcode")
	private Integer cr_vcode;

	@Column(name = "cr_year")
	private Integer cr_year;

	@Column(name = "cr_season")
	private String cr_season;

	@Column(name = "owner_tenant")
	private String owner_tenant;

	@Column(name = "refbookingid")
	private Integer refBookingId;

	@Column(name = "cultivator_type")
	private String cultivatorType;

	@Column(name = "anubhavadar_extent")
	private BigDecimal anubhavadarExtent;

	@Column(name = "cr_dist_code")
	private Integer crDistCode;

	@Column(name = "cr_mand_code")
	private Integer crMandCode;

@Column(name = "available_extent", insertable = false, updatable = false)
	
	private Float availableExtent;

	@Column(name = "updatedby", insertable = true, updatable = false)
	private String updatedby;

	@Column(name = "updateon", insertable = true, updatable = true)
	private Timestamp updateon;

	@Column(name = "downloaded", insertable = true, updatable = true)
	private String downloaded;
	
	@Column(name = "cult_updatedby")
	private String cult_updatedby;
	
	@Column(name = "cult_updateon", insertable = true, updatable = true)
	private Timestamp cult_updateon;
	
	@Column(name = "srno_userid")
	private String srno_userid;
	
	@Column(name = "dcode")
	private Integer dcode;

	@Column(name = "mcode")
	private Integer mcode;
	
	@Column(name="peri_status", insertable = true, updatable = true)
	private String peri_status;
	
	@Column(name = "regno", insertable = true, updatable = false)
    private Integer regno;

    @Column(name = "cr_wsno", insertable = true, updatable = false)
    private BigInteger cr_wsno;

    @Column(name = "geo_reffered", insertable = true, updatable = false)
    private String geo_reffered;

    @Column(name = "rec_id", insertable = true, updatable = false)
    private BigDecimal rec_id;

    @Column(name = "vs_sel", insertable = true, updatable = false)
    private String vs_sel;
    
    @Column(name = "occupname")
    private String occupname;

    @Column(name = "occupfname")
    private String occupfname;


    @Column(name = "data_src", insertable = true, updatable = false)
    private String data_src;
    
    @Column(name = "emp_code", insertable = true, updatable = false)
    private Integer emp_code;


    @Column(name = "mobileno", insertable = true, updatable = false)
    private BigDecimal mobileno;

    @Column(name = "sjointoccupant", insertable = true, updatable = false)
    private Integer sjointoccupant;

    @Column(name = "cr_tr_d_ext", insertable = true, updatable = false)
    private Double cr_tr_d_ext;
    
    @Column(name = "cr_tr_i_ext", insertable = true, updatable = false)
    private Double cr_tr_i_ext;
    
   
    
    
    public String getPeri_status() {
		return peri_status;
	}

	public void setPeri_status(String peri_status) {
		this.peri_status = peri_status;
	}

	public Integer getRegno() {
		return regno;
	}

	public void setRegno(Integer regno) {
		this.regno = regno;
	}

	public BigInteger getCr_wsno() {
		return cr_wsno;
	}

	public void setCr_wsno(BigInteger cr_wsno) {
		this.cr_wsno = cr_wsno;
	}

	public String getGeo_reffered() {
		return geo_reffered;
	}

	public void setGeo_reffered(String geo_reffered) {
		this.geo_reffered = geo_reffered;
	}

	public BigDecimal getRec_id() {
		return rec_id;
	}

	public void setRec_id(BigDecimal rec_id) {
		this.rec_id = rec_id;
	}

	public String getVs_sel() {
		return vs_sel;
	}

	public void setVs_sel(String vs_sel) {
		this.vs_sel = vs_sel;
	}

	public String getAnubhavadar_name() {
		return anubhavadar_name;
	}

	public void setAnubhavadar_name(String anubhavadar_name) {
		this.anubhavadar_name = anubhavadar_name;
	}

	@Column(name = "anubhavadar_name", insertable = true, updatable = false)
    private String anubhavadar_name;
    

	

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getPart_key() {
		return part_key;
	}

	public void setPart_key(String part_key) {
		this.part_key = part_key;
	}

	public String getCrSno() {
		return crSno;
	}

	public void setCrSno(String crSno) {
		this.crSno = crSno;
	}

	public Double getTotalExtent() {
		return totalExtent;
	}

	public void setTotalExtent(Double totalExtent) {
		this.totalExtent =  totalExtent;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Double getOccupantExtent() {
		return occupantExtent;
	}

	public void setOccupantExtent(Double occupantExtent) {
		this.occupantExtent = occupantExtent;
	}

	public BigDecimal getKhNo() {
		return khNo;
	}

	public void setKhNo(BigDecimal khNo) {
		this.khNo = khNo;
	}

	public String getOcName() {
		return ocName;
	}

	public void setOcName(String ocName) {
		this.ocName = ocName;
	}

	public Integer getCr_vcode() {
		return cr_vcode;
	}

	public void setCr_vcode(Integer cr_vcode) {
		this.cr_vcode = cr_vcode;
	}

	public Integer getCr_year() {
		return cr_year;
	}

	public void setCr_year(Integer cr_year) {
		this.cr_year = cr_year;
	}

	public String getCr_season() {
		return cr_season;
	}

	public void setCr_season(String cr_season) {
		this.cr_season = cr_season;
	}

	public String getOwner_tenant() {
		return owner_tenant;
	}

	public void setOwner_tenant(String owner_tenant) {
		this.owner_tenant = owner_tenant;
	}

	public Integer getRefBookingId() {
		return refBookingId;
	}

	public void setRefBookingId(Integer refBookingId) {
		this.refBookingId = refBookingId;
	}

	public String getCultivatorType() {
		return cultivatorType;
	}

	public void setCultivatorType(String cultivatorType) {
		this.cultivatorType = cultivatorType;
	}

	public BigDecimal getAnubhavadarExtent() {
		return anubhavadarExtent;
	}

	public void setAnubhavadarExtent(BigDecimal anubhavadarExtent) {
		this.anubhavadarExtent= anubhavadarExtent;
	}

	public Integer getCrDistCode() {
		return crDistCode;
	}

	public void setCrDistCode(Integer crDistCode) {
		this.crDistCode = crDistCode;
	}

	public Integer getCrMandCode() {
		return crMandCode;
	}

	public void setCrMandCode(Integer crMandCode) {
		this.crMandCode = crMandCode;
	}

	public Float getAvailableExtent() {
		return availableExtent;
	}

	public void setAvailableExtent(Float availableExtent) {
		this.availableExtent = Float.valueOf(String.format("%.5f", availableExtent));
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

	public String getDownloaded() {
		return downloaded;
	}

	public void setDownloaded(String downloaded) {
		this.downloaded = downloaded;
	}

	public String getCult_updatedby() {
		return cult_updatedby;
	}

	public void setCult_updatedby(String cult_updatedby) {
		this.cult_updatedby = cult_updatedby;
	}

	public Timestamp getCult_updateon() {
		return cult_updateon;
	}

	public void setCult_updateon(Timestamp cult_updateon) {
		this.cult_updateon = cult_updateon;
	}

	public String getSrno_userid() {
		return srno_userid;
	}

	public void setSrno_userid(String srno_userid) {
		this.srno_userid = srno_userid;
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

	public String getData_src() {
		return data_src;
	}

	public void setData_src(String data_src) {
		this.data_src = data_src;
	}

	public Integer getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(Integer emp_code) {
		this.emp_code = emp_code;
	}

	public BigDecimal getMobileno() {
		return mobileno;
	}

	public void setMobileno(BigDecimal mobileno) {
		this.mobileno = mobileno;
	}

	public Integer getSjointoccupant() {
		return sjointoccupant;
	}

	public void setSjointoccupant(Integer sjointoccupant) {
		this.sjointoccupant = sjointoccupant;
	}

	public Double getCr_tr_d_ext() {
		return cr_tr_d_ext;
	}

	public void setCr_tr_d_ext(Double cr_tr_d_ext) {
		this.cr_tr_d_ext = cr_tr_d_ext;
	}

	public Double getCr_tr_i_ext() {
		return cr_tr_i_ext;
	}

	public void setCr_tr_i_ext(Double cr_tr_i_ext) {
		this.cr_tr_i_ext = cr_tr_i_ext;
	}

	@Override
	public String toString() {
		return "Cultivator [bookingId=" + bookingId + ", part_key=" + part_key + ", crSno=" + crSno + ", totalExtent="
				+ totalExtent + ", aadharNo=" + aadharNo + ", fatherName=" + fatherName + ", occupantExtent="
				+ occupantExtent + ", khNo=" + khNo + ", ocName=" + ocName + ", cr_vcode=" + cr_vcode + ", cr_year="
				+ cr_year + ", cr_season=" + cr_season + ", owner_tenant=" + owner_tenant + ", refBookingId="
				+ refBookingId + ", cultivatorType=" + cultivatorType + ", anubhavadarExtent=" + anubhavadarExtent
				+ ", crDistCode=" + crDistCode + ", crMandCode=" + crMandCode + ", availableExtent=" + availableExtent
				+ ", updatedby=" + updatedby + ", updateon=" + updateon + ", downloaded=" + downloaded
				+ ", cult_updatedby=" + cult_updatedby + ", cult_updateon=" + cult_updateon + ", srno_userid="
				+ srno_userid + ", dcode=" + dcode + ", mcode=" + mcode + ", peri_status=" + peri_status + ", regno="
				+ regno + ", cr_wsno=" + cr_wsno + ", geo_reffered=" + geo_reffered + ", rec_id=" + rec_id + ", vs_sel="
				+ vs_sel + ", occupname=" + occupname + ", occupfname=" + occupfname + ", data_src=" + data_src
				+ ", emp_code=" + emp_code + ", mobileno=" + mobileno + ", sjointoccupant=" + sjointoccupant
				+ ", cr_tr_d_ext=" + cr_tr_d_ext + ", cr_tr_i_ext=" + cr_tr_i_ext + ", anubhavadar_name="
				+ anubhavadar_name + "]";
	}
	
	

}
