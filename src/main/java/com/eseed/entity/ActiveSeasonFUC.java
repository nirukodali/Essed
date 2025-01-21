package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activeseason")
public class ActiveSeasonFUC {

				@Id
				private String cropyear;
				private String seasonvalue;
				ActiveSeasonFUC(){}
				
				
				public String getCropyear() {
					return cropyear;
				}
				public void setCropyear(String cropyear) {
					this.cropyear = cropyear;
				}
				public String getSeasonvalue() {
					return seasonvalue;
				}
				public void setSeasonvalue(String seasonvalue) {
					this.seasonvalue = seasonvalue;
				}

				@Override
				public String toString() {
					return "ActiveSeasonFUC [cropyear=" + cropyear + ", seasonvalue=" + seasonvalue + ", getCropyear()="
							+ getCropyear() + ", getSeasonvalue()=" + getSeasonvalue() + ", getClass()=" + getClass()
							+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
				}

				
	}				
			