package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_rbk_map")
public class RbkEntity {

	@Id
	@Column(name = "rbkuserid")
	private String rbkuserid;

	@Column(name = "mcode")
	private Integer mcode;

	@Column(name = "dcode")
	private Integer dcode;

	@Column(name = "vcode")
	private Integer vcode;

	@Column(name = "rbkcode")
	private Integer rbkcode;
	
	@Column(name = "wbdcode")
	private Integer wbdcode;
	
	@Column(name = "wbmcode")
	private Integer wbmcode;

	@Column(name = "empcode")
	private Integer empcode;

	@Column(name = "incharge_sts")
	private String incharge_sts;

	public RbkEntity() {

	}

	public String getRbkuserid() {
		return rbkuserid;
	}

	public void setRbkuserid(String rbkuserid) {
		this.rbkuserid = rbkuserid;
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

	public Integer getRbkcode() {
		return rbkcode;
	}

	public void setRbkcode(Integer rbkcode) {
		this.rbkcode = rbkcode;
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

	public Integer getEmpcode() {
		return empcode;
	}

	public void setEmpcode(Integer empcode) {
		this.empcode = empcode;
	}

	public String getIncharge_sts() {
		return incharge_sts;
	}

	public void setIncharge_sts(String incharge_sts) {
		this.incharge_sts = incharge_sts;
	}

	@Override
	public String toString() {
		return "RbkEntity [rbkuserid=" + rbkuserid + ", mcode=" + mcode + ", dcode=" + dcode + ", vcode=" + vcode
				+ ", rbkcode=" + rbkcode + ", wbdcode=" + wbdcode + ", wbmcode=" + wbmcode + ", empcode=" + empcode
				+ ", incharge_sts=" + incharge_sts + ", getRbkuserid()=" + getRbkuserid() + ", getMcode()=" + getMcode()
				+ ", getDcode()=" + getDcode() + ", getVcode()=" + getVcode() + ", getRbkcode()=" + getRbkcode()
				+ ", getWbdcode()=" + getWbdcode() + ", getWbmcode()=" + getWbmcode() + ", getEmpcode()=" + getEmpcode()
				+ ", getIncharge_sts()=" + getIncharge_sts() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
