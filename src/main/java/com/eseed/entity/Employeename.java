package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

@Entity
@Table(name="cr_emp_profile")
public class Employeename {
	
	@Id
	@Column(name="aadhaar_id")
    private String aadhaar_id;
	
	@Column(name="mcode")
    private Integer mcode;
	
	@Column(name="dcode")
	private Integer dcode;
	
	@Column(name="vcode")
    private Integer vcode;
	@Min(value = 4, message = "Enter a valid employeecode")
	@Column(name="emp_code")
    private Integer emp_code;
	
	@Column(name="mobile")
    private Long mobile;
	@Email(message = "Email should be valid")
	@Column(name="email")
    private String email;
	
	@Column(name="emp_name")
    private String emp_name;
	
	@Column(name="designation")
    private String designation;

	@Transient
	private String incharge;
    
	public Employeename() {
		
	}

	public String getAadhaar_id() {
		return aadhaar_id;
	}

	public void setAadhaar_id(String aadhaar_id) {
		this.aadhaar_id = aadhaar_id;
	}

	public Integer getMcode() {
		return mcode;
	}

	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public Integer getVcode() {
		return vcode;
	}

	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}

	public Integer getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(Integer emp_code) {
		this.emp_code = emp_code;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	

	public String getIncharge() {
		return incharge;
	}

	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}
	
	

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employeename [aadhaar_id=" + aadhaar_id + ", mcode=" + mcode + ", dcode=" + dcode + ", vcode=" + vcode
				+ ", emp_code=" + emp_code + ", mobile=" + mobile + ", email=" + email + ", emp_name=" + emp_name
				+ ", getAadhaar_id()=" + getAadhaar_id() + ", getMcode()=" + getMcode() + ", getDcode()=" + getDcode()
				+ ", getVcode()=" + getVcode() + ", getEmp_code()=" + getEmp_code() + ", getMobile()=" + getMobile()
				+ ", getEmail()=" + getEmail() + ", getEmp_name()=" + getEmp_name() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}