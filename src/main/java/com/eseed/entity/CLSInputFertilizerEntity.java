package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "input_fertilizer", schema = "cropimages")
public class CLSInputFertilizerEntity {
	
	
	private Integer id;
	
	private Integer input_id;
	
	private String input_name;
	
	@Id
	private String input_used_name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInput_id() {
		return input_id;
	}

	public void setInput_id(Integer input_id) {
		this.input_id = input_id;
	}

	public String getInput_name() {
		return input_name;
	}

	public void setInput_name(String input_name) {
		this.input_name = input_name;
	}

	public String getInput_used_name() {
		return input_used_name;
	}

	public void setInput_used_name(String input_used_name) {
		this.input_used_name = input_used_name;
	}
	
	
}
