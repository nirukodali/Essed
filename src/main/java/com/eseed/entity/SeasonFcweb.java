package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="season")
public class SeasonFcweb {

			@Id
			private char season;
			private String seasonname;

			public SeasonFcweb() {
			}

			public SeasonFcweb(char season, String seasonname) {
				this.season = season;
				this.seasonname = seasonname;
			}

			public char getSeason() {
				return season;
			}
			public void setSeason(char season) {
				this.season = season;
			}

			public String getSeasonname() {
				return seasonname;
			}
			public void setSeasonname(String seasonname) {
				this.seasonname = seasonname;
			}

			@Override
			public String toString() {
				return "SeasonFcweb [season=" + season + ", seasonname=" + seasonname + "]";
			}

}
		   