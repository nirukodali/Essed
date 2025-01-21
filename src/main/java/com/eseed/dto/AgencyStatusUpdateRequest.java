package com.eseed.dto;

import java.util.List;

public class AgencyStatusUpdateRequest {
    
    private String status; 
    private String seasonname;
    private String dcode;
   private String  seedvariety;
    private String cropyear;
    
    
    public AgencyStatusUpdateRequest() {
    }

    public AgencyStatusUpdateRequest(Long id, String status) {
       // this.id = id;
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public String getSeasonname() {
		return seasonname;
	}

	public void setSeasonname(String seasonname) {
		this.seasonname = seasonname;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	public String getSeedvariety() {
		return seedvariety;
	}

	public void setSeedvariety(String seedvariety) {
		this.seedvariety = seedvariety;
	}

	public String getCropyear() {
		return cropyear;
	}

	public void setCropyear(String cropyear) {
		this.cropyear = cropyear;
	}

	@Override
	public String toString() {
		return "AgencyStatusUpdateRequest [status=" + status + ", seasonname=" + seasonname + ", dcode=" + dcode
				+ ", seedvariety=" + seedvariety + ", cropyear=" + cropyear + ", getStatus()=" + getStatus()
				+ ", getSeasonname()=" + getSeasonname() + ", getDcode()=" + getDcode() + ", getSeedvariety()="
				+ getSeedvariety() + ", getCropyear()=" + getCropyear() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
    
    
    
    
    
}
