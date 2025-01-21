package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropgroups")
public class CrAddGroupNameEntity {
	
	
	@Column(name="cropgrpid")
	private Integer cropgrpid;
	
	@Id
	@Column(name="grpname")
	private String grpname;
	
	@Column(name="crt_user")
	private String crt_user;
	
	@Column(name="grpnameeng")
	private String grpnameeng;
	
	
	public CrAddGroupNameEntity() {
		// TODO Auto-generated constructor stub
	}


	public CrAddGroupNameEntity(Integer cropgrpid, String grpname, String crt_user, String grpnameeng) {
		super();
		this.cropgrpid = cropgrpid;
		this.grpname = grpname;
		this.crt_user = crt_user;
		this.grpnameeng = grpnameeng;
	}


	public Integer getCropgrpid() {
		return cropgrpid;
	}


	public void setCropgrpid(Integer cropgrpid) {
		this.cropgrpid = cropgrpid;
	}


	public String getGrpname() {
		return grpname;
	}


	public void setGrpname(String grpname) {
		this.grpname = grpname;
	}

	
	public String getCrt_user() {
		return crt_user;
	}


	public void setCrt_user(String crt_user) {
		this.crt_user = crt_user;
	}


	public String getGrpnameeng() {
		return grpnameeng;
	}


	public void setGrpnameeng(String grpnameeng) {
		this.grpnameeng = grpnameeng;
	}

	
	@Override
	public String toString() {
		return "CrAddGroupNameEntity [cropgrpid=" + cropgrpid + ", grpname=" + grpname + ", crt_user=" + crt_user
				+ ", grpnameeng=" + grpnameeng + "]";
	}



	
}

