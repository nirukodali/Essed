package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rep_Aadhaar_CntIntf {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private String dname;
	    private BigDecimal count;
		public Rep_Aadhaar_CntIntf() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Rep_Aadhaar_CntIntf(String dname, BigDecimal count) {
			super();
			this.dname = dname;
			this.count = count;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public BigDecimal getCount() {
			return count;
		}
		public void setCount(BigDecimal count) {
			this.count = count;
		}
		@Override
		public String toString() {
			return "Rep_Aadhaar_CntIntf [dname=" + dname + ", count=" + count + "]";
		}
		
}
