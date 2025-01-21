package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DkrishiEcrop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private Number nof;
	private Number qty;
	private Number no_same;
	private Number no_others;
	private Number no_noecrop;
	private Number qty_nocrop;
	private Integer wbdcode;
	
	
	public DkrishiEcrop() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DkrishiEcrop(String dname, Number nof, Number qty, Number no_same, Number no_others, Number no_noecrop,
			Number qty_nocrop, Integer wbdcode) {
		super();
		this.dname = dname;
		this.nof = nof;
		this.qty = qty;
		this.no_same = no_same;
		this.no_others = no_others;
		this.no_noecrop = no_noecrop;
		this.qty_nocrop = qty_nocrop;
		this.wbdcode = wbdcode;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Number getNof() {
		return nof;
	}


	public void setNof(Number nof) {
		this.nof = nof;
	}


	public Number getQty() {
		return qty;
	}


	public void setQty(Number qty) {
		this.qty = qty;
	}


	public Number getNo_same() {
		return no_same;
	}


	public void setNo_same(Number no_same) {
		this.no_same = no_same;
	}


	public Number getNo_others() {
		return no_others;
	}


	public void setNo_others(Number no_others) {
		this.no_others = no_others;
	}


	public Number getNo_noecrop() {
		return no_noecrop;
	}


	public void setNo_noecrop(Number no_noecrop) {
		this.no_noecrop = no_noecrop;
	}


	public Number getQty_nocrop() {
		return qty_nocrop;
	}


	public void setQty_nocrop(Number qty_nocrop) {
		this.qty_nocrop = qty_nocrop;
	}


	public Integer getWbdcode() {
		return wbdcode;
	}


	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}


	@Override
	public String toString() {
		return "DkrishiEcrop [dname=" + dname + ", nof=" + nof + ", qty=" + qty + ", no_same=" + no_same
				+ ", no_others=" + no_others + ", no_noecrop=" + no_noecrop + ", qty_nocrop=" + qty_nocrop
				+ ", wbdcode=" + wbdcode + "]";
	}

	

	
}
