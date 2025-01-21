package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crop_irrg_wsrc_v")
public class CropIrrigationWaterSources {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int irgcode;
	
	private int wsrccode;
	
	private String irgdesc;

	public int getIrgcode() {
		return irgcode;
	}

	public void setIrgcode(int irgcode) {
		this.irgcode = irgcode;
	}

	public int getWsrccode() {
		return wsrccode;
	}

	public void setWsrccode(int wsrccode) {
		this.wsrccode = wsrccode;
	}

	public String getIrgdesc() {
		return irgdesc;
	}

	public void setIrgdesc(String irgdesc) {
		this.irgdesc = irgdesc;
	}

	@Override
	public String toString() {
		return "CropIrrigationWaterSources [irgcode=" + irgcode + ", wsrccode=" + wsrccode + ", irgdesc=" + irgdesc
				+ "]";
	}
	
	
	
	
	

}
