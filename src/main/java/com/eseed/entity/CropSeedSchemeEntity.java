package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cropseed_scheme")
public class CropSeedSchemeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cropschtype")
	private Character cropschtype;

	@Column(name = "cropschdesc")
	private String cropschdesc;

	@Column(name = "ftype_short")
	private String ftype_short;

	public Character getCropschtype() {
		return cropschtype;
	}

	public void setCropschtype(Character cropschtype) {
		this.cropschtype = cropschtype;
	}

	public String getCropschdesc() {
		return cropschdesc;
	}

	public void setCropschdesc(String cropschdesc) {
		this.cropschdesc = cropschdesc;
	}

	public String getFtype_short() {
		return ftype_short;
	}

	public void setFtype_short(String ftype_short) {
		this.ftype_short = ftype_short;
	}

	@Override
	public String toString() {
		return "CropSeedSchemeEntity [cropschtype=" + cropschtype + ", cropschdesc=" + cropschdesc + ", ftype_short="
				+ ftype_short + "]";
	}

}
