package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DkrishiMand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String mname;
	private String cropnameeng;
	private Number nof;
	private Number qty;
	private Number no_same;
	private Number no_others;
	private Number no_noecrop;
	private Number qty_nocrop;
	
	
	public DkrishiMand() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DkrishiMand(String dname, String mname, String cropnameeng, Number nof, Number qty, Number no_same,
			Number no_others, Number no_noecrop, Number qty_nocrop) {
		super();
		this.dname = dname;
		this.mname = mname;
		this.cropnameeng = cropnameeng;
		this.nof = nof;
		this.qty = qty;
		this.no_same = no_same;
		this.no_others = no_others;
		this.no_noecrop = no_noecrop;
		this.qty_nocrop = qty_nocrop;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getCropnameeng() {
		return cropnameeng;
	}


	public void setCropnameeng(String cropnameeng) {
		this.cropnameeng = cropnameeng;
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


	@Override
	public String toString() {
		return "DkrishiMand [dname=" + dname + ", mname=" + mname + ", cropnameeng=" + cropnameeng + ", nof=" + nof
				+ ", qty=" + qty + ", no_same=" + no_same + ", no_others=" + no_others + ", no_noecrop=" + no_noecrop
				+ ", qty_nocrop=" + qty_nocrop + "]";
	}
	
}
