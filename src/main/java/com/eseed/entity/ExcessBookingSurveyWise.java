package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExcessBookingSurveyWise {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
private Integer id;
	
	private String wbedname;
	private String wbemname;
	private String wbevname;
	private String vname;
	private Long yet_to_attempt;
	private Long approved_by_mao; 
	private Long deleted;
	
	
	public ExcessBookingSurveyWise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExcessBookingSurveyWise(String wbedname, String wbemname, String wbevname, String vname, Long yet_to_attempt,
			Long approved_by_mao, Long deleted) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.vname = vname;
		this.yet_to_attempt = yet_to_attempt;
		this.approved_by_mao = approved_by_mao;
		this.deleted = deleted;
	}
	public String getWbedname() {
		return wbedname;
	}
	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}
	public String getWbemname() {
		return wbemname;
	}
	public void setWbemname(String wbemname) {
		this.wbemname = wbemname;
	}
	public String getWbevname() {
		return wbevname;
	}
	public void setWbevname(String wbevname) {
		this.wbevname = wbevname;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Long getYet_to_attempt() {
		return yet_to_attempt;
	}
	public void setYet_to_attempt(Long yet_to_attempt) {
		this.yet_to_attempt = yet_to_attempt;
	}
	public Long getApproved_by_mao() {
		return approved_by_mao;
	}
	public void setApproved_by_mao(Long approved_by_mao) {
		this.approved_by_mao = approved_by_mao;
	}
	public Long getDeleted() {
		return deleted;
	}
	public void setDeleted(Long deleted) {
		this.deleted = deleted;
	}
	@Override
	public String toString() {
		return "ExcessBookingSurveyWise [wbedname=" + wbedname + ", wbemname=" + wbemname + ", wbevname=" + wbevname
				+ ", vname=" + vname + ", yet_to_attempt=" + yet_to_attempt + ", approved_by_mao=" + approved_by_mao
				+ ", deleted=" + deleted + "]";
	}

}
