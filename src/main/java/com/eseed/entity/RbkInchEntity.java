package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_rbk_map_incharges")
public class RbkInchEntity {

	@Id
	@Column(name = "rbkcode")
	private Integer rbkcode;
	
	@Column(name = "rbkuserid")
	private Integer rbkuserid;
	
	@Column(name = "dcode")
	private Integer dcode;
	
	@Column(name = "mcode")
	private Integer mcode;
	
	@Column(name = "empcode")
	private Integer empcode;

	@Column(name = "inchargests")
	private Integer inchargests;

	@Override
	public String toString() {
		return "RbkInchEntity [dcode=" + dcode + ", mcode=" + mcode + ", rbkcode=" + rbkcode + ", empcode=" + empcode
				+ ", rbkuserid=" + rbkuserid + ", inchargests=" + inchargests + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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

	public Integer getRbkuserid() {
		return rbkuserid;
	}

	public void setRbkuserid(Integer rbkuserid) {
		this.rbkuserid = rbkuserid;
	}

	public Integer getInchargests() {
		return inchargests;
	}

	public void setInchargests(Integer inchargests) {
		this.inchargests = inchargests;
	}
	
	
}
