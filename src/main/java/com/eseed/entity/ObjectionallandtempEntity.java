package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cr_booking_objlands" , schema = "ecrop2024",uniqueConstraints={
	    @UniqueConstraint(columnNames = {"cr_sno", "cr_vcode", "kh_no"})
	})

public class ObjectionallandtempEntity {

	@Id
	private String cr_sno;
	
	
	private BigDecimal kh_no;
	
	private Integer cr_dist_code;
	
	private Integer cr_mand_code;
	
	private Integer cr_vcode;
	
	private BigDecimal sug_extent;
	
	public BigDecimal getSug_extent() {
		return sug_extent;
	}

	public void setSug_extent(BigDecimal sug_extent) {
		this.sug_extent = sug_extent;
	}

	

	public Integer getCr_dist_code() {
		return cr_dist_code;
	}

	public void setCr_dist_code(Integer cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}

	public Integer getCr_mand_code() {
		return cr_mand_code;
	}

	public void setCr_mand_code(Integer cr_mand_code) {
		this.cr_mand_code = cr_mand_code;
	}

	public Integer getCr_vcode() {
		return cr_vcode;
	}

	public void setCr_vcode(Integer cr_vcode) {
		this.cr_vcode = cr_vcode;
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

}
