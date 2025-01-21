package com.eseed.entity;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="activeseason")
public class ActiveseasonFfekycm {

			@Id
			private String cropyear;
			private String seasonvalue;
			@OneToOne(cascade = CascadeType.ALL)
		    @JoinColumn(name = "season")
			private SeasonFfekycm seasonFfekycm;
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
			public SeasonFfekycm getSeasonFfekycm() {
				return seasonFfekycm;
			}
			public void setSeasonFfekycm(SeasonFfekycm seasonFfekycm) {
				this.seasonFfekycm = seasonFfekycm;
			}
			
			

}			
			
			
			
		    
