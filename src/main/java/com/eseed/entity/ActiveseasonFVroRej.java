package com.eseed.entity;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="activeseason")
public class ActiveseasonFVroRej {

			@Id
			private String cropyear;
			private String seasonvalue;
			@OneToOne(cascade = CascadeType.ALL)
		    @JoinColumn(name = "season")
			private Season season;
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
			public Season getSeason() {
				return season;
			}
			public void setSeason(Season season) {
				this.season = season;
			}
			
}			
			
			
			
		    
