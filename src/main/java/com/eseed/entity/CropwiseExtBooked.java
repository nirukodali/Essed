package com.eseed.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="rep_vill_wise_cropwise_ext_v_")
public class CropwiseExtBooked {

			@Id
			private int mcode;
			private String mname;
			private BigDecimal totextent;
			private String wbvname;
			public CropwiseExtBooked() {
				
			}

			public CropwiseExtBooked(int mcode, String mname, BigDecimal totextent) {
				super();
				this.mcode = mcode;
				this.mname = mname;
				this.totextent = totextent;
			}

			public int getMcode() {
				return mcode;
			}
			public void setMcode(int mcode) {
				this.mcode = mcode;
			}

			public String getMname() {
				return mname;
			}
			public void setMname(String mname) {
				this.mname = mname;
			}

			public BigDecimal getTotextent() {
				return totextent;
			}
			public void setTotextent(BigDecimal totextent) {
				this.totextent = totextent;
			}

			public String getWbvname() {
				return wbvname;
			}

			public void setWbvname(String wbvname) {
				this.wbvname = wbvname;
			}

			@Override
			public String toString() {
				return "CropwiseExtBooked [mcode=" + mcode + ", mname=" + mname + ", totextent=" + totextent + "]";
			}
			
}			