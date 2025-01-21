package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class CultivatorEmbedable {

	@NotNull
	@Column(name = "bookingId")
	private Integer bookingId;

	@NotNull
	@Column(name = "part_key")
	private String part_key;

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getPart_key() {
		return part_key;
	}

	public void setPart_key(String part_key) {
		this.part_key = part_key;
	}

}
