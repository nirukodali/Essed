package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "farmer_mobilenos", schema = "farmerdb")
public class CultivatorFarmerMobilenoEntity {

	    @Id
	    
	    @Column(name = "farmeruid")
	    private String farmeruid;

	    @Column(name = "rbkid")
	    private Integer rbkid;

	    @Column(name = "mobileno")
	    private String mobileno;

		

		public String getFarmeruid() {
			return farmeruid;
		}

		public void setFarmeruid(String farmeruid) {
			this.farmeruid = farmeruid;
		}

		public Integer getRbkid() {
			return rbkid;
		}

		public void setRbkid(Integer rbkid) {
			this.rbkid = rbkid;
		}

		public String getMobileno() {
			return mobileno;
		}

		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}

	 
	}



