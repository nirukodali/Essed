package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DamagedEkycStatusDAO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String wbedname;
	private String wbemname;
	private Long ekycdone;
	private Long ekycnotdone;
	
	public DamagedEkycStatusDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DamagedEkycStatusDAO(String wbedname, String wbemname, Long ekycdone, Long ekycnotdone) {
		super();
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.ekycdone = ekycdone;
		this.ekycnotdone = ekycnotdone;
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

	public Long getEkycdone() {
		return ekycdone;
	}

	public void setEkycdone(Long ekycdone) {
		this.ekycdone = ekycdone;
	}

	public Long getEkycnotdone() {
		return ekycnotdone;
	}

	public void setEkycnotdone(Long ekycnotdone) {
		this.ekycnotdone = ekycnotdone;
	}

	@Override
	public String toString() {
		return "DamagedEkycStatusDAO [wbedname=" + wbedname + ", wbemname=" + wbemname + ", ekycdone=" + ekycdone
				+ ", ekycnotdone=" + ekycnotdone + "]";
	}
	
}
