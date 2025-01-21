package com.eseed.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "cr_booking_nwb", schema = "ecrop2024")
public class NonWebLandData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingid")
	private Integer bookingId;

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	private String part_key;
	private int cr_dist_code;
	
	private int cr_mand_code;
	@NotNull(message = "Village  should not be null")

	private int cr_vcode;
	@NotNull(message = "Crop Year should not be null")

	private int cr_year;

	private String cr_season;

	private String cr_farmeruid;

	private String owner_tenant;

	private Long mobileno;

	private int kh_no;

	@NotNull(message = "tot_extent should not be null")
	private Double tot_extent;
	@NotNull(message = "occupant_extent should not be null")
	private Double occupant_extent;

	private String occupname;

	private String occupfname;

	private String cr_sno;
	
	private int dcode;
	
	private int mcode;

	public String getData_src() {
		return data_src;
	}

	public void setData_src(String data_src) {
		this.data_src = data_src;
	}

	private String entry_by;

	private String oc_name;

	private String oc_fname;
	
	private String data_src;

	@Column(name = "entry_date")
	private Timestamp entryDate;

	private String gender;

	private Integer anubhavadar_extent;

	private Integer cr_wsno;
	private Integer regno;
	private Integer sjointoccupant;
	

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

	public String getPart_key() {
		return part_key;
	}

	public void setPart_key(String part_key) {
		this.part_key = part_key;
	}

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

	public void setCr_season(String cr_season) {
		this.cr_season = cr_season;
	}

	public String getCr_farmeruid() {
		return cr_farmeruid;
	}

	public void setCr_farmeruid(String cr_farmeruid) {
		this.cr_farmeruid = cr_farmeruid;
	}

	public String getOwner_tenant() {
		return owner_tenant;
	}

	public void setOwner_tenant(String owner_tenant) {
		this.owner_tenant = owner_tenant;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}

	public Integer getKh_no() {
		return kh_no;
	}

	public void setKh_no(Integer kh_no) {
		this.kh_no = kh_no;
	}

	public Double getTot_extent() {
		return tot_extent;
	}

	public void setTot_extent(Double tot_extent) {
		this.tot_extent = tot_extent;
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

	public String getCr_sno() {
		return cr_sno;
	}

	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}

	public String getEntry_by() {
		return entry_by;
	}

	public void setEntry_by(String entry_by) {
		this.entry_by = entry_by;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAnubhavadar_extent() {
		return anubhavadar_extent;
	}

	public void setAnubhavadar_extent(Integer anubhavadar_extent) {
		this.anubhavadar_extent = anubhavadar_extent;
	}

	public Integer getCr_wsno() {
		return cr_wsno;
	}

	public void setCr_wsno(Integer cr_wsno) {
		this.cr_wsno = cr_wsno;
	}

	public Timestamp getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
	}

	public Double getOccupant_extent() {
		return occupant_extent;
	}

	public void setOccupant_extent(Double occupant_extent) {
		this.occupant_extent = occupant_extent;
	}

	public void setKh_no(int kh_no) {
		this.kh_no = kh_no;
	}

	public Integer getRegno() {
		return regno;
	}

	public void setRegno(Integer regno) {
		this.regno = regno;
	}

	public Integer getSjointoccupant() {
		return sjointoccupant;
	}

	public void setSjointoccupant(Integer sjointoccupant) {
		this.sjointoccupant = sjointoccupant;
	}

	
	
}
