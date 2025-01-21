package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SuperCHKAlloc {
	private String dname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String supercheck_userid;
	private Long count;

	public SuperCHKAlloc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuperCHKAlloc(String dname, String supercheck_userid, Long count) {
		super();
		this.dname = dname;
		this.supercheck_userid = supercheck_userid;
		this.count = count;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getSupercheck_userid() {
		return supercheck_userid;
	}

	public void setSupercheck_userid(String supercheck_userid) {
		this.supercheck_userid = supercheck_userid;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "SuperCHKAlloc [dname=" + dname + ", supercheck_userid=" + supercheck_userid + ", count=" + count + "]";
	}
}
