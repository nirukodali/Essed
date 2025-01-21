package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cropnature")
public class CropNatureEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "naturedesc")
	private String naturedesc;

	@Column(name = "id")
	private Integer id;

	public String getNaturedesc() {
		return naturedesc;
	}

	public void setNaturedesc(String naturedesc) {
		this.naturedesc = naturedesc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CropNatureEntity [naturedesc=" + naturedesc + ", id=" + id + "]";
	}

}
