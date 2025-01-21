package com.eseed.entity;

import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity
public class EmployeeList {
	private String vname;
	private String	rbkuserid;
	private Integer emp_code;
	private String emp_name;
	private String designation;
	private BigDecimal mobile;
	private String email;
	private Character status;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String aadhaar_id;
	public EmployeeList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeList(String vname, String rbkuserid, Integer emp_code, String emp_name, String designation,
			BigDecimal mobile, String email, String aadhaar_id) {
		super();
		this.vname = vname;
		this.rbkuserid = rbkuserid;
		this.emp_code = emp_code;
		this.emp_name = emp_name;
		this.designation = designation;
		this.mobile = mobile;
		this.email = email;
		this.aadhaar_id = aadhaar_id;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getRbkuserid() {
		return rbkuserid;
	}
	public void setRbkuserid(String rbkuserid) {
		this.rbkuserid = rbkuserid;
	}
	public Integer getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(Integer emp_code) {
		this.emp_code = emp_code;
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
	public String getAadhaar_id() {
		return aadhaar_id;
	}
	public void setAadhaar_id(String aadhaar_id) {
		this.aadhaar_id = aadhaar_id;
	}
	@Override
	public String toString() {
		return "EmployeeList [vname=" + vname + ", rbkuserid=" + rbkuserid + ", emp_code=" + emp_code + ", emp_name="
				+ emp_name + ", designation=" + designation + ", mobile=" + mobile + ", email=" + email
				+ ", aadhaar_id=" + aadhaar_id + "]";
	}
	

}
