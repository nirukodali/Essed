


package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activeseason")
public class ActiveSeason {

	@Id
	@Column(name = "season")
	private String season;

	@Column(name = "cropyear")
	private Integer cropyear;

	@Column(name = "active")
	private String active;

	@Column(name = "distribution_initiated")
	private String distributionInitiated;

	@Column(name = "current")
	private String currentSeason;
	

	/*@Column(name = "seasonname")
	private String seasonname;

	 * @Column(name = "fassal_year") private Integer fassalYear;
	 * 
	 * @Column(name = "seasonvalue") private String seasonvalue;
	 */
	public ActiveSeason(String season, Integer cropyear, String active, String distributionInitiated,
			String currentSeason, Integer fassalYear, String seasonvalue) {
		super();
		this.season = season;
		this.cropyear = cropyear;
		this.active = active;
		this.distributionInitiated = distributionInitiated;
		this.currentSeason = currentSeason;
		//this.fassalYear = fassalYear;
		//this.seasonvalue = seasonvalue;
	}

	public ActiveSeason() {
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

	public String getDistributionInitiated() {
		return distributionInitiated;
	}

	public void setDistributionInitiated(String distributionInitiated) {
		this.distributionInitiated = distributionInitiated;
	}


	public String getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(String currentSeason) {
		this.currentSeason = currentSeason;
	}

	

	@Override
	public String toString() {
		return "ActiveSeason [season=" + season + ", cropyear=" + cropyear + ", active=" + active
				+ ", distributionInitiated=" + distributionInitiated + ", currentSeason=" + currentSeason
				 + "]";
	}

	
}
