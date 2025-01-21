package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TopSixCrops {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String Paddy;
	private String Cotton;
	private String RedChillies;
	private String Groundnut;
	private String Mango;
	private String Redgram;
	
	public TopSixCrops() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TopSixCrops(String dname, String paddy, String cotton, String redChillies, String groundnut, String mango,
			String redgram) {
		super();
		this.dname = dname;
		Paddy = paddy;
		Cotton = cotton;
		RedChillies = redChillies;
		Groundnut = groundnut;
		Mango = mango;
		Redgram = redgram;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getPaddy() {
		return Paddy;
	}

	public void setPaddy(String paddy) {
		Paddy = paddy;
	}

	public String getCotton() {
		return Cotton;
	}

	public void setCotton(String cotton) {
		Cotton = cotton;
	}

	public String getRedChillies() {
		return RedChillies;
	}

	public void setRedChillies(String redChillies) {
		RedChillies = redChillies;
	}

	public String getGroundnut() {
		return Groundnut;
	}

	public void setGroundnut(String groundnut) {
		Groundnut = groundnut;
	}

	public String getMango() {
		return Mango;
	}

	public void setMango(String mango) {
		Mango = mango;
	}

	public String getRedgram() {
		return Redgram;
	}

	public void setRedgram(String redgram) {
		Redgram = redgram;
	}

	@Override
	public String toString() {
		return "TopSixCrops [dname=" + dname + ", Paddy=" + Paddy + ", Cotton=" + Cotton + ", RedChillies="
				+ RedChillies + ", Groundnut=" + Groundnut + ", Mango=" + Mango + ", Redgram=" + Redgram + "]";
	}
	
	
}
