package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StateWiseIndent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dname;
	private String name;
	private Number quantity;
	private Long allocatedfarmers;
	private Long qtyallocated;
	private Long paidfarmers;
	private Long qtylifted;
	private Double nonsubsidyamt;
	private Long farmerslifted;
	private Long paidfarmersqty;
	private Double subsidyamt;
	private Double amountpaid;
	private Character season;
	private Integer cropyear;
	private Integer dcode;
	private String subproductcode;
	private String productcode;
	private Long totqtyAllocBags;
	
	public StateWiseIndent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StateWiseIndent(String dname, String name, Number quantity, Long allocatedfarmers, Long qtyallocated,
			Long paidfarmers, Long qtylifted, Double nonsubsidyamt, Long farmerslifted, Long paidfarmersqty,
			Double subsidyamt, Double amountpaid, Character season, Integer cropyear, Integer dcode,
			String subproductcode, String productcode, Long totqtyAllocBags) {
		super();
		this.dname = dname;
		this.name = name;
		this.quantity = quantity;
		this.allocatedfarmers = allocatedfarmers;
		this.qtyallocated = qtyallocated;
		this.paidfarmers = paidfarmers;
		this.qtylifted = qtylifted;
		this.nonsubsidyamt = nonsubsidyamt;
		this.farmerslifted = farmerslifted;
		this.paidfarmersqty = paidfarmersqty;
		this.subsidyamt = subsidyamt;
		this.amountpaid = amountpaid;
		this.season = season;
		this.cropyear = cropyear;
		this.dcode = dcode;
		this.subproductcode = subproductcode;
		this.productcode = productcode;
		this.totqtyAllocBags = totqtyAllocBags;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Number getQuantity() {
		return quantity;
	}

	public void setQuantity(Number quantity) {
		this.quantity = quantity;
	}

	public Long getAllocatedfarmers() {
		return allocatedfarmers;
	}

	public void setAllocatedfarmers(Long allocatedfarmers) {
		this.allocatedfarmers = allocatedfarmers;
	}

	public Long getQtyallocated() {
		return qtyallocated;
	}

	public void setQtyallocated(Long qtyallocated) {
		this.qtyallocated = qtyallocated;
	}

	public Long getPaidfarmers() {
		return paidfarmers;
	}

	public void setPaidfarmers(Long paidfarmers) {
		this.paidfarmers = paidfarmers;
	}

	public Long getQtylifted() {
		return qtylifted;
	}

	public void setQtylifted(Long qtylifted) {
		this.qtylifted = qtylifted;
	}

	public Double getNonsubsidyamt() {
		return nonsubsidyamt;
	}

	public void setNonsubsidyamt(Double nonsubsidyamt) {
		this.nonsubsidyamt = nonsubsidyamt;
	}

	public Long getFarmerslifted() {
		return farmerslifted;
	}

	public void setFarmerslifted(Long farmerslifted) {
		this.farmerslifted = farmerslifted;
	}

	public Long getPaidfarmersqty() {
		return paidfarmersqty;
	}

	public void setPaidfarmersqty(Long paidfarmersqty) {
		this.paidfarmersqty = paidfarmersqty;
	}

	public Double getSubsidyamt() {
		return subsidyamt;
	}

	public void setSubsidyamt(Double subsidyamt) {
		this.subsidyamt = subsidyamt;
	}

	public Double getAmountpaid() {
		return amountpaid;
	}

	public void setAmountpaid(Double amountpaid) {
		this.amountpaid = amountpaid;
	}

	public Character getSeason() {
		return season;
	}

	public void setSeason(Character season) {
		this.season = season;
	}

	public Integer getCropyear() {
		return cropyear;
	}

	public void setCropyear(Integer cropyear) {
		this.cropyear = cropyear;
	}

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public String getSubproductcode() {
		return subproductcode;
	}

	public void setSubproductcode(String subproductcode) {
		this.subproductcode = subproductcode;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public Long getTotqtyAllocBags() {
		return totqtyAllocBags;
	}

	public void setTotqtyAllocBags(Long totqtyAllocBags) {
		this.totqtyAllocBags = totqtyAllocBags;
	}

	@Override
	public String toString() {
		return "StateWiseIndent [dname=" + dname + ", name=" + name + ", quantity=" + quantity + ", allocatedfarmers="
				+ allocatedfarmers + ", qtyallocated=" + qtyallocated + ", paidfarmers=" + paidfarmers + ", qtylifted="
				+ qtylifted + ", nonsubsidyamt=" + nonsubsidyamt + ", farmerslifted=" + farmerslifted
				+ ", paidfarmersqty=" + paidfarmersqty + ", subsidyamt=" + subsidyamt + ", amountpaid=" + amountpaid
				+ ", season=" + season + ", cropyear=" + cropyear + ", dcode=" + dcode + ", subproductcode="
				+ subproductcode + ", productcode=" + productcode + ", totqtyAllocBags=" + totqtyAllocBags + "]";
	}

	

}
