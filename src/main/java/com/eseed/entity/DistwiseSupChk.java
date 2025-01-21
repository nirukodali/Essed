package com.eseed.entity;

import java.math.BigDecimal; 


public class DistwiseSupChk {
    private BigDecimal cr_dist_code;
    private String dname;
    private Long dho_allotted;
    private Long dh_found_correct;
    private Long dh_found_incorrect;
    private Long ho_allotted;
    private Long ho_found_correct;
    private Long ho_found_incorrect;
	public BigDecimal getCr_dist_code() {
		return cr_dist_code;
	}
	public void setCr_dist_code(BigDecimal cr_dist_code) {
		this.cr_dist_code = cr_dist_code;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Long getDho_allotted() {
		return dho_allotted;
	}
	public void setDho_allotted(Long dho_allotted) {
		this.dho_allotted = dho_allotted;
	}
	public Long getDh_found_correct() {
		return dh_found_correct;
	}
	public void setDh_found_correct(Long dh_found_correct) {
		this.dh_found_correct = dh_found_correct;
	}
	public Long getDh_found_incorrect() {
		return dh_found_incorrect;
	}
	public void setDh_found_incorrect(Long dh_found_incorrect) {
		this.dh_found_incorrect = dh_found_incorrect;
	}
	public Long getHo_allotted() {
		return ho_allotted;
	}
	public void setHo_allotted(Long ho_allotted) {
		this.ho_allotted = ho_allotted;
	}
	public Long getHo_found_correct() {
		return ho_found_correct;
	}
	public void setHo_found_correct(Long ho_found_correct) {
		this.ho_found_correct = ho_found_correct;
	}
	public Long getHo_found_incorrect() {
		return ho_found_incorrect;
	}
	public void setHo_found_incorrect(Long ho_found_incorrect) {
		this.ho_found_incorrect = ho_found_incorrect;
	}
	@Override
	public String toString() {
		return "DistwiseSupChk [cr_dist_code=" + cr_dist_code + ", dname=" + dname + ", dho_allotted=" + dho_allotted
				+ ", dh_found_correct=" + dh_found_correct + ", dh_found_incorrect=" + dh_found_incorrect
				+ ", ho_allotted=" + ho_allotted + ", ho_found_correct=" + ho_found_correct + ", ho_found_incorrect="
				+ ho_found_incorrect + "]";
	}
    
    
    
}
