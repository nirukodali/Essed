package com.eseed.dto;

public class SeasonDto {
	
	private String season;
	private String seasonname;
	
	private String cropyear;
	
	
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getSeasonname() {
		return seasonname;
	}
	public void setSeasonname(String seasonname) {
		this.seasonname = seasonname;
	}
	public String getCropyear() {
		return cropyear;
	}
	public void setCropyear(String cropyear) {
		this.cropyear = cropyear;
	}
	@Override
	public String toString() {
		return "SeasonDto [season=" + season + ", seasonname=" + seasonname + ", cropyear=" + cropyear
				+ ", getSeason()=" + getSeason() + ", getSeasonname()=" + getSeasonname() + ", getCropyear()="
				+ getCropyear() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
