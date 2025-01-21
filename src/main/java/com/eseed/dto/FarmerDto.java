package com.eseed.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FarmerDto {
	
	private String cr_sno;
	private BigDecimal tot_extent;

	public String getCr_sno() {
		return cr_sno;
	}

	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}

	public BigDecimal getTot_extent() {
		return tot_extent;
	}

	public void setTot_extent(BigDecimal tot_extent) {
		this.tot_extent = tot_extent;
	}

	@Override
	public String toString() {
		return "FarmerDto [cr_sno=" + cr_sno + "]";
	}



	
	
	
	
	
}
