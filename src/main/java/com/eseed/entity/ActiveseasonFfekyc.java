package com.eseed.entity;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="activeseason")
public class ActiveseasonFfekyc {

			@Id
			private String cropyear;
			private String seasonvalue;
			@OneToOne(cascade = CascadeType.ALL)
		    @JoinColumn(name = "season")
			private SeasonFfekyc seasonFfekyc;
			
			
			
			public ActiveseasonFfekyc() {
				super();
				// TODO Auto-generated constructor stub
			}



			public ActiveseasonFfekyc(String cropyear, String seasonvalue, SeasonFfekyc seasonFfekyc) {
				super();
				this.cropyear = cropyear;
				this.seasonvalue = seasonvalue;
				this.seasonFfekyc = seasonFfekyc;
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



			public SeasonFfekyc getSeasonFfekyc() {
				return seasonFfekyc;
			}



			public void setSeasonFfekyc(SeasonFfekyc seasonFfekyc) {
				this.seasonFfekyc = seasonFfekyc;
			}



			@Override
			public String toString() {
				return "ActiveseasonFfekyc [cropyear=" + cropyear + ", seasonvalue=" + seasonvalue + ", seasonFfekyc="
						+ seasonFfekyc + "]";
			}
			
}			
			
			
			
		    
