package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.transaction.Transactional;

@Entity
@Transactional
public class wholeSurveyNoMandWise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String lgdvname;
	private Integer cr_wsno;

	public wholeSurveyNoMandWise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public wholeSurveyNoMandWise(String lgdvname, Integer cr_wsno) {
		super();
		this.lgdvname = lgdvname;
		this.cr_wsno = cr_wsno;
	}

	public String getLgdvname() {
		return lgdvname;
	}

	public void setLgdvname(String lgdvname) {
		this.lgdvname = lgdvname;
	}

	public Integer getCr_wsno() {
		return cr_wsno;
	}

	public void setCr_wsno(Integer cr_wsno) {
		this.cr_wsno = cr_wsno;
	}

	@Override
	public String toString() {
		return "wholeSurveyNoMandWise [lgdvname=" + lgdvname + ", cr_wsno=" + cr_wsno + "]";
	}

}
