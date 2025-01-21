package com.eseed.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="activeseason")
public class ActiveseasonFcweb {

			@Id
			private String cropyear;
			private String seasonvalue;
			@OneToOne(cascade = CascadeType.ALL)
		    @JoinColumn(name = "season")
			private SeasonFcweb seasonFcweb;
			
			public ActiveseasonFcweb() {
				
			}

			public ActiveseasonFcweb(String cropyear, String seasonvalue, SeasonFcweb seasonFcweb) {
				this.cropyear = cropyear;
				this.seasonvalue = seasonvalue;
				this.seasonFcweb = seasonFcweb;
			}

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

			public SeasonFcweb getSeasonFcweb() {
				return seasonFcweb;
			}
			public void SeasonFcweb(SeasonFcweb seasonFcweb) {
				this.seasonFcweb = seasonFcweb;
			}

			@Override
			public String toString() {
				return "ActiveseasonFcweb [cropyear=" + cropyear + ", seasonvalue=" + seasonvalue + ", seasonFcweb=" + seasonFcweb
						+ "]";
			}

}			
			
			
			
		    
