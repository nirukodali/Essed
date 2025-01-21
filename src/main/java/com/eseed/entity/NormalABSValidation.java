package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NormalABSValidation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String rbkname;
	private Long totpushed;
	private long updcnt;
	
	
	public NormalABSValidation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public NormalABSValidation(String dname, String rbkname, Long totpushed, long updcnt) {
		super();
		this.dname = dname;
		this.rbkname = rbkname;
		this.totpushed = totpushed;
		this.updcnt = updcnt;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getRbkname() {
		return rbkname;
	}


	public void setRbkname(String rbkname) {
		this.rbkname = rbkname;
	}


	public Long getTotpushed() {
		return totpushed;
	}


	public void setTotpushed(Long totpushed) {
		this.totpushed = totpushed;
	}


	public Long getUpdcnt() {
		return updcnt;
	}


	public void setUpdcnt(Long updcnt) {
		this.updcnt = updcnt;
	}


	@Override
	public String toString() {
		return "NormalABSValidation [dname=" + dname + ", rbkname=" + rbkname + ", totpushed=" + totpushed + ", updcnt="
				+ updcnt + "]";
	}
}
