package com.eseed.entity;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "villcoords_exempted_villages",schema="masters")
public class Villcoords {

	

	@EmbeddedId
	 private EmbeddedVillcoords embeddedvillcoords;

	public EmbeddedVillcoords getEmbeddedvillcoords() {
		return embeddedvillcoords;
	}

	public void setEmbeddedvillcoords(EmbeddedVillcoords embeddedvillcoords) {
		this.embeddedvillcoords = embeddedvillcoords;
	}
}


