package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Cdmg_SdrfDistwise_SandCasting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		
		private String district;
	    private BigDecimal sfmf_farmers;
	    private BigDecimal sfmf_ext;
	    private BigDecimal of_farmers;
	    private BigDecimal of_ext;
	    private BigDecimal sfmf_amt;
	    private BigDecimal of_amt;
	    
	    
		public Cdmg_SdrfDistwise_SandCasting() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Cdmg_SdrfDistwise_SandCasting(String district, BigDecimal sfmf_farmers, BigDecimal sfmf_ext, BigDecimal of_farmers,
				BigDecimal of_ext, BigDecimal sfmf_amt, BigDecimal of_amt) {
			super();
			this.district = district;
			this.sfmf_farmers = sfmf_farmers;
			this.sfmf_ext = sfmf_ext;
			this.of_farmers = of_farmers;
			this.of_ext = of_ext;
			this.sfmf_amt = sfmf_amt;
			this.of_amt = of_amt;
		}
		
		
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public BigDecimal getSfmf_farmers() {
			return sfmf_farmers;
		}
		public void setSfmf_farmers(BigDecimal sfmf_farmers) {
			this.sfmf_farmers = sfmf_farmers;
		}
		public BigDecimal getSfmf_ext() {
			return sfmf_ext;
		}
		public void setSfmf_ext(BigDecimal sfmf_ext) {
			this.sfmf_ext = sfmf_ext;
		}
		public BigDecimal getOf_farmers() {
			return of_farmers;
		}
		public void setOf_farmers(BigDecimal of_farmers) {
			this.of_farmers = of_farmers;
		}
		public BigDecimal getOf_ext() {
			return of_ext;
		}
		public void setOf_ext(BigDecimal of_ext) {
			this.of_ext = of_ext;
		}
		public BigDecimal getSfmf_amt() {
			return sfmf_amt;
		}
		public void setSfmf_amt(BigDecimal sfmf_amt) {
			this.sfmf_amt = sfmf_amt;
		}
		public BigDecimal getOf_amt() {
			return of_amt;
		}
		public void setOf_amt(BigDecimal of_amt) {
			this.of_amt = of_amt;
		}
		
		
		@Override
		public String toString() {
			return "Cdmg_SdrfDistwise [district=" + district + ", sfmf_farmers=" + sfmf_farmers + ", sfmf_ext=" + sfmf_ext
					+ ", of_farmers=" + of_farmers + ", of_ext=" + of_ext + ", sfmf_amt=" + sfmf_amt + ", of_amt=" + of_amt
					+ "]";
		}
	  

}
