package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crop_irrg_wsrc_v")
public class CropIrrgEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "irgdesc")
	private String irgdesc;

	@Column(name = "irgcode")
	private Integer irgcode;

	@Column(name = "wsrccode")
	private Integer wsrccode;

	public String getIrgdesc() {
		return irgdesc;
	}

	public void setIrgdesc(String irgdesc) {
		this.irgdesc = irgdesc;
	}

	public Integer getIrgcode() {
		return irgcode;
	}

	public void setIrgcode(Integer irgcode) {
		this.irgcode = irgcode;
	}

	public Integer getWsrccode() {
		return wsrccode;
	}

	public void setWsrccode(Integer wsrccode) {
		this.wsrccode = wsrccode;
	}

	@Override
	public String toString() {
		return "CropIrrgEntity [irgdesc=" + irgdesc + ", irgcode=" + irgcode + ", wsrccode=" + wsrccode + "]";
	}

}
