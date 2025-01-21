package com.eseed.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user_registration")
public class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String userid;

	private String encpassword;

	private String district;

	private String blockortehsil;

	private String village;

	private String type_user;
	
	@Transient
	private String question;
	@Transient
	//@NotNull(message = "answer is required")
	private int answer;
	@Transient
    private String operationType; 
	

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "id"))
	private Collection<Roles> roles;

	public AppUser() {
		super();
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEncpassword() {
		return encpassword;
	}

	public void setEncpassword(String encpassword) {
		this.encpassword = encpassword;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlockortehsil() {
		return blockortehsil;
	}

	public void setBlockortehsil(String blockortehsil) {
		this.blockortehsil = blockortehsil;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getType_user() {
		return type_user;
	}

	public void setType_user(String type_user) {
		this.type_user = type_user;
	}

	public Collection<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Roles> roles)
	{
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "AppUser [userid=" + userid + ", encpassword=" + encpassword + ", district=" + district
				+ ", blockortehsil=" + blockortehsil + ", village=" + village + ", type_user=" + type_user + ", roles="
				+ roles + ", getUserid()=" + getUserid() + ", getEncpassword()=" + getEncpassword() + ", getDistrict()="
				+ getDistrict() + ", getBlockortehsil()=" + getBlockortehsil() + ", getVillage()=" + getVillage()
				+ ", getType_user()=" + getType_user() + ", getRoles()=" + getRoles() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public AppUser(String userid, String encpassword, String district, String blockortehsil, String village,
			String type_user, Collection<Roles> roles) {
		super();
		this.userid = userid;
		this.encpassword = encpassword;
		this.district = district;
		this.blockortehsil = blockortehsil;
		this.village = village;
		this.type_user = type_user;
		this.roles = roles;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public AppUser(String question, int answer, String operationType) {
		super();
		this.question = question;
		this.answer = answer;
		this.operationType = operationType;
	}

	
}

//old code
/*package com.ecrops.entity;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user_registration")
public class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String userid;

	private String encpassword;

	private String district;

	private String blockortehsil;

	private String village;

	private String type_user;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "id"))
	private Collection<Roles> roles;

	public AppUser() {
		super();
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEncpassword() {
		return encpassword;
	}

	public void setEncpassword(String encpassword) {
		this.encpassword = encpassword;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlockortehsil() {
		return blockortehsil;
	}

	public void setBlockortehsil(String blockortehsil) {
		this.blockortehsil = blockortehsil;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getType_user() {
		return type_user;
	}

	public void setType_user(String type_user) {
		this.type_user = type_user;
	}

	public Collection<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Roles> roles)
	{
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "AppUser [userid=" + userid + ", encpassword=" + encpassword + ", district=" + district
				+ ", blockortehsil=" + blockortehsil + ", village=" + village + ", type_user=" + type_user + ", roles="
				+ roles + ", getUserid()=" + getUserid() + ", getEncpassword()=" + getEncpassword() + ", getDistrict()="
				+ getDistrict() + ", getBlockortehsil()=" + getBlockortehsil() + ", getVillage()=" + getVillage()
				+ ", getType_user()=" + getType_user() + ", getRoles()=" + getRoles() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public AppUser(String userid, String encpassword, String district, String blockortehsil, String village,
			String type_user, Collection<Roles> roles) {
		super();
		this.userid = userid;
		this.encpassword = encpassword;
		this.district = district;
		this.blockortehsil = blockortehsil;
		this.village = village;
		this.type_user = type_user;
		this.roles = roles;
	}

	
} */
