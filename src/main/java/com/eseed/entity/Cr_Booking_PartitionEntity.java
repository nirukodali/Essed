package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cr_booking_partition_r042024",schema="ecrop2024")
public class Cr_Booking_PartitionEntity {
@Id
	private String cr_sno;

	public String getCr_sno() {
		return cr_sno;
	}

	public void setCr_sno(String cr_sno) {
		this.cr_sno = cr_sno;
	}
}
