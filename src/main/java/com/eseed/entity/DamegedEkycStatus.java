package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class DamegedEkycStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		
		private String wbemname;
	    private String wbevname;
	    private BigDecimal ekycdone;
	    private BigDecimal ekycnotdone;
		public DamegedEkycStatus() {
			super();
			// TODO Auto-generated constructor stub
		}
		public DamegedEkycStatus(String wbemname, String wbevname, BigDecimal ekycdone, BigDecimal ekycnotdone) {
			super();
			this.wbemname = wbemname;
			this.wbevname = wbevname;
			this.ekycdone = ekycdone;
			this.ekycnotdone = ekycnotdone;
		}
		public String getWbemname() {
			return wbemname;
		}
		public void setWbemname(String wbemname) {
			this.wbemname = wbemname;
		}
		public String getWbevname() {
			return wbevname;
		}
		public void setWbevname(String wbevname) {
			this.wbevname = wbevname;
		}
		public BigDecimal getEkycdone() {
			return ekycdone;
		}
		public void setEkycdone(BigDecimal ekycdone) {
			this.ekycdone = ekycdone;
		}
		public BigDecimal getEkycnotdone() {
			return ekycnotdone;
		}
		public void setEkycnotdone(BigDecimal ekycnotdone) {
			this.ekycnotdone = ekycnotdone;
		}
		@Override
		public String toString() {
			return "DamegedEkycStatus [wbemname=" + wbemname + ", wbevname=" + wbevname + ", ekycdone=" + ekycdone
					+ ", ekycnotdone=" + ekycnotdone + "]";
		}
	    
	   
}
