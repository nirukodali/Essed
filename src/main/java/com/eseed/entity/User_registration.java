package com.eseed.entity;

import java.time.LocalDateTime; 

@javax.persistence.Entity
public class User_registration {
	
	@javax.persistence.Id
    private String userid;
    private String encpassword;
    private LocalDateTime last_pwdpd_dt;
    private String retype_password;

	public User_registration() {
		
	}

	public User_registration(String userid, String encpassword, LocalDateTime last_pwdpd_dt, String retype_password) {
		this.userid = userid;
		this.encpassword = encpassword;
		this.last_pwdpd_dt = last_pwdpd_dt;
		this.retype_password = retype_password;
	}
	  
    public String getRetype_password() {
		return retype_password;
	}
	public void setRetype_password(String retype_password) {
		this.retype_password = retype_password;
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

	public LocalDateTime getLast_pwdpd_dt() {
		return last_pwdpd_dt;
	}
	public void setLast_pwdpd_dt(LocalDateTime last_pwdpd_dt) {
		this.last_pwdpd_dt = last_pwdpd_dt;
	}

	public String toString() {
		return "User_registration [userid=" + userid + ", encpassword=" + encpassword + ", last_pwdpd_dt="
				+ last_pwdpd_dt + ", retype_password=" + retype_password + "]";
	}
}
