package com.eseed.entity;

import java.security.Timestamp;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_rbk_map_logs")
public class Emplogsentity {

	@Column(name = "dcode")
	private Integer dcode;

	@Column(name = "mcode")
	private Integer mcode;

	@Column(name = "vcode")
	private Integer vcode;

	@Column(name = "rbkcode")
	private Integer rbkcode;
	@Id
	@Column(name = "empcode")
	private Integer empcode;

	@Column(name = "rbkuserid")
	private String rbkuserid;

	@Column(name = "wbdcode")
	private Integer wbdcode;

	@Column(name = "wbmcode")
	private Integer wbmcode;
	
	@Column(name = "to_date")
	private java.sql.Timestamp to_date;

	public java.sql.Timestamp getTo_date() {
		return to_date;
	}

	public void setTo_date(java.sql.Timestamp to_date) {
		this.to_date = to_date;
	}

	public Emplogsentity() {
		// TODO Auto-generated constructor stub
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

	public Integer getVcode() {
		return vcode;
	}

	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}

	public Integer getRbkcode() {
		return rbkcode;
	}

	public void setRbkcode(Integer rbkcode) {
		this.rbkcode = rbkcode;
	}

	public Integer getEmpcode() {
		return empcode;
	}

	public void setEmpcode(Integer empcode) {
		this.empcode = empcode;
	}

	public String getRbkuserid() {
		return rbkuserid;
	}

	public void setRbkuserid(String rbkuserid) {
		this.rbkuserid = rbkuserid;
	}

	public Integer getWbdcode() {
		return wbdcode;
	}

	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}

	public Integer getWbmcode() {
		return wbmcode;
	}

	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}

	@Override
	public String toString() {
		return "Emplogsentity [dcode=" + dcode + ", mcode=" + mcode + ", vcode=" + vcode + ", rbkcode=" + rbkcode
				+ ", empcode=" + empcode + ", rbkuserid=" + rbkuserid + ", wbdcode=" + wbdcode + ", wbmcode=" + wbmcode
				+ ", getDcode()=" + getDcode() + ", getMcode()=" + getMcode() + ", getVcode()=" + getVcode()
				+ ", getRbkcode()=" + getRbkcode() + ", getEmpcode()=" + getEmpcode() + ", getRbkuserid()="
				+ getRbkuserid() + ", getWbdcode()=" + getWbdcode() + ", getWbmcode()=" + getWbmcode() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
