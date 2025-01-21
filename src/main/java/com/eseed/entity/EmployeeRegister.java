package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cr_emp_profile", schema = "ecrop2024")
public class EmployeeRegister {

	@Id
	@NotBlank(message = "Aadhaar Number cannot be blank")
	@Pattern(regexp = "[0-9]{12}", message = "Aadhaar ID should be a 12-digit number")
	@Column(name = "aadhaar_id")
	private String aadhaarId;

	@Column(name = "mcode")
	private Integer mcode;

	@Column(name = "dcode")
	private Integer dcode;

	@NotNull(message = "Employee Code cannot be blank")
//	@Digits(integer = 5, fraction = 0, message = "Enter a valid employee code with at least 4 digits")
	@Min(value = 1000, message = "Enter a valid employee code with at least 4 digits")
	@Column(name = "emp_code")
	private Integer empCode;

	@NotNull(message = "Mobile number cannot be blank")
	@DecimalMin(value = "1000000000", message = "Mobile number should be a 10-digit number")
	@DecimalMax(value = "9999999999", message = "Mobile number should be a 10-digit number")
	@Column(name = "mobile")
	private BigDecimal mobile;

	@NotBlank(message = "Email cannot be blank")
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Email should be valid")
	@Column(name = "email")
	private String email;

	@NotBlank(message = "Employee name cannot be blank")
	@Pattern(regexp = "^[a-zA-Z .]+$", message = "Employee name should contain only alphabetical characters, spaces, and dots")
	@Size(min = 2, max = 50, message = "Employee name should be between 2 and 50 characters")
	@Column(name = "emp_name")
	private String emp_name;

	@NotBlank(message = "Designation cannot be null")
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "cr_dist_code")
	private int wbdcode ;
	
	@Column(name = "cr_mand_code")
	private int wbmcode ;

	public String getAadhaarId() {
		return aadhaarId;
	}

	public void setAadhaarId(String aadhaarId) {
		this.aadhaarId = aadhaarId;
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

	public Integer getEmpCode() {
		return empCode;
	}

	public void setEmpCode(Integer empCode) {
		this.empCode = empCode;
	}

	public BigDecimal getMobile() {
		return mobile;
	}

	public void setMobile(BigDecimal mobile) {
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getWbdcode() {
		return wbdcode;
	}

	public void setWbdcode(int wbdcode) {
		this.wbdcode = wbdcode;
	}

	public int getWbmcode() {
		return wbmcode;
	}

	public void setWbmcode(int wbmcode) {
		this.wbmcode = wbmcode;
	}

	public EmployeeRegister(
			@NotBlank(message = "Aadhaar Number cannot be blank") @Pattern(regexp = "[0-9]{12}", message = "Aadhaar ID should be a 12-digit number") String aadhaarId,
			Integer mcode, Integer dcode,
			@NotNull(message = "Employee Code cannot be blank") @Min(value = 1000, message = "Enter a valid employee code with at least 4 digits") Integer empCode,
			@NotNull(message = "Mobile number cannot be blank") @DecimalMin(value = "1000000000", message = "Mobile number should be a 10-digit number") @DecimalMax(value = "9999999999", message = "Mobile number should be a 10-digit number") BigDecimal mobile,
			@NotBlank(message = "Email cannot be blank") @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Email should be valid") String email,
			@NotBlank(message = "Employee name cannot be blank") @Pattern(regexp = "^[a-zA-Z .]+$", message = "Employee name should contain only alphabetical characters, spaces, and dots") @Size(min = 2, max = 50, message = "Employee name should be between 2 and 50 characters") String emp_name,
			@NotBlank(message = "Designation cannot be null") String designation, int wbdcode, int wbmcode) {
		super();
		this.aadhaarId = aadhaarId;
		this.mcode = mcode;
		this.dcode = dcode;
		this.empCode = empCode;
		this.mobile = mobile;
		this.email = email;
		this.emp_name = emp_name;
		this.designation = designation;
		this.wbdcode = wbdcode;
		this.wbmcode = wbmcode;
	}

	public EmployeeRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeRegister [aadhaarId=" + aadhaarId + ", mcode=" + mcode + ", dcode=" + dcode + ", empCode="
				+ empCode + ", mobile=" + mobile + ", email=" + email + ", emp_name=" + emp_name + ", designation="
				+ designation + ", wbdcode=" + wbdcode + ", wbmcode=" + wbmcode + "]";
	}


}