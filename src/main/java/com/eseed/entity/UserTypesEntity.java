package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usertypes")
public class UserTypesEntity {

	@Id
	@Column(name = "usertype")
	public Integer userType;

	@Column(name = "name")
	public String typeName;

	
	@Column(name = "type_user")
	public String typeuserforroles;
	
	public UserTypesEntity() {
		// TODO Auto-generated constructor stub
	}
	

	public UserTypesEntity(Integer userType, String typeName, String typeuserforroles) {
		super();
		this.userType = userType;
		this.typeName = typeName;
		this.typeuserforroles = typeuserforroles;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeuserforroles() {
		return typeuserforroles;
	}

	public void setTypeuserforroles(String typeuserforroles) {
		this.typeuserforroles = typeuserforroles;
	}


	@Override
	public String toString() {
		return "UserTypesEntity [userType=" + userType + ", typeName=" + typeName + ", typeuserforroles="
				+ typeuserforroles + "]";
	}
}