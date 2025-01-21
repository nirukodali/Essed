package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activeseason")
public class ActiveSeasonEntity {
	
	@Column(name="season")
	private String season;
	
	@Id
	@Column(name="cropyear")
	private Integer cropyear;
	
	@Column(name="active")
	private String active;
	
	@Column(name="current_season")
	private String currentSeason;
	
	

	public ActiveSeasonEntity() {
		// TODO Auto-generated constructor stub
	}



	public String getSeason() {
		return season;
	}



	public void setSeason(String season) {
		this.season = season;
	}



	public Integer getCropyear() {
		return cropyear;
	}



	public void setCropyear(Integer cropyear) {
		this.cropyear = cropyear;
	}



	public String getActive() {
		return active;
	}



	public void setActive(String active) {
		this.active = active;
	}



	public String getCurrentSeason() {
		return currentSeason;
	}



	public void setCurrentSeason(String currentSeason) {
		this.currentSeason = currentSeason;
	}



	@Override
	public String toString() {
		return "ActiveSeasonEntity [season=" + season + ", cropyear=" + cropyear + ", active=" + active
				+ ", currentSeason=" + currentSeason + ", getSeason()=" + getSeason() + ", getCropyear()="
				+ getCropyear() + ", getActive()=" + getActive() + ", getCurrentSeason()=" + getCurrentSeason()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
