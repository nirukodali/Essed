package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="waterresources")
public class WatersourcesRep {
	
		@Id
	    private int wsrcid;
	    private String wsrcdesc;

		public WatersourcesRep() {
			
		}
				
		public WatersourcesRep(int wsrcid, String wsrcdesc) {
			super();
			this.wsrcid = wsrcid;
			this.wsrcdesc = wsrcdesc;
		}


		public int getWsrcid() {
			return wsrcid;
		}
		public void setWsrcid(int wsrcid) {
			this.wsrcid = wsrcid;
		}

		public String getWsrcdesc() {
			return wsrcdesc;
		}
		public void setWsrcdesc(String wsrcdesc) {
			this.wsrcdesc = wsrcdesc;
		}

		@Override
		public String toString() {
			return "WatersourcesRep [wsrcid=" + wsrcid + ", wsrcdesc=" + wsrcdesc + "]";
		}
	       
	}