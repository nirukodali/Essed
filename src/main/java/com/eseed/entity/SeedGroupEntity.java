package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cropgroups")
public class SeedGroupEntity {
	
	@Id
	@Column(name = "cropgrpid")
	private Integer cropGrpId;

	@Column(name = "grpname")
	private String grpName;

	public Integer getCropGrpId() {
		return cropGrpId;
	}

	public void setCropGrpId(Integer cropGrpId) {
		this.cropGrpId = cropGrpId;
	}

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	@Override
	public String toString() {
		return "VillSecRevVEntity [cropGrpId=" + cropGrpId + ", grpName=" + grpName + "]";
	}
	
	public SeedGroupEntity(Integer cropGrpId, String grpName) {
		super();
		this.cropGrpId = cropGrpId;
		this.grpName = grpName;
	}
	
	public SeedGroupEntity() {
		
	}
}


