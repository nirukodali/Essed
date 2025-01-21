package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WhatsNew {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer slno;
	private String news;
	private String dt_crt;
	private Character status;
	public WhatsNew() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WhatsNew(Integer slno, String news, String dt_crt, Character status) {
		super();
		this.slno = slno;
		this.news = news;
		this.dt_crt = dt_crt;
		this.status = status;
	}
	public Integer getSlno() {
		return slno;
	}
	public void setSlno(Integer slno) {
		this.slno = slno;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public String getDt_crt() {
		return dt_crt;
	}
	public void setDt_crt(String dt_crt) {
		this.dt_crt = dt_crt;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "WhatsNew [slno=" + slno + ", news=" + news + ", dt_crt=" + dt_crt + ", status=" + status + "]";
	}


}
