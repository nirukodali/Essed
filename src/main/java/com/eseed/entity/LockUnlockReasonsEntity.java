package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lock_unlock_reasons")
public class LockUnlockReasonsEntity {

@Id	
private int code;

private String reason;

public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}


}
