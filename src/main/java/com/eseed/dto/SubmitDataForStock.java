package com.eseed.dto;

import java.util.List;

public class SubmitDataForStock {
	
	private List<String> totcid;
    private List<String> totqtyalloc;
    private List<String> totlotno;
    private List<String> totVehicles;
    private List<String> totMobileNos;
    private List<String> villages;
    private List<String> totqtyreq;
    private List<String> mcodes;
    private List<String> totPosDts;
    private List<String> totQtyPaidFor;
    private List<String> totVarietyCodes;
    
    public SubmitDataForStock() {
		// TODO Auto-generated constructor stub
	}




	public List<String> getTotcid() {
		return totcid;
	}




	public void setTotcid(List<String> totcid) {
		this.totcid = totcid;
	}




	public List<String> getTotqtyalloc() {
		return totqtyalloc;
	}




	public void setTotqtyalloc(List<String> totqtyalloc) {
		this.totqtyalloc = totqtyalloc;
	}




	public List<String> getTotlotno() {
		return totlotno;
	}




	public void setTotlotno(List<String> totlotno) {
		this.totlotno = totlotno;
	}




	public List<String> getTotVehicles() {
		return totVehicles;
	}




	public void setTotVehicles(List<String> totVehicles) {
		this.totVehicles = totVehicles;
	}




	public List<String> getTotMobileNos() {
		return totMobileNos;
	}




	public void setTotMobileNos(List<String> totMobileNos) {
		this.totMobileNos = totMobileNos;
	}




	public List<String> getVillages() {
		return villages;
	}




	public void setVillages(List<String> villages) {
		this.villages = villages;
	}




	public List<String> getTotqtyreq() {
		return totqtyreq;
	}




	public void setTotqtyreq(List<String> totqtyreq) {
		this.totqtyreq = totqtyreq;
	}




	public List<String> getMcodes() {
		return mcodes;
	}




	public void setMcodes(List<String> mcodes) {
		this.mcodes = mcodes;
	}




	public List<String> getTotPosDts() {
		return totPosDts;
	}




	public void setTotPosDts(List<String> totPosDts) {
		this.totPosDts = totPosDts;
	}




	public List<String> getTotQtyPaidFor() {
		return totQtyPaidFor;
	}




	public void setTotQtyPaidFor(List<String> totQtyPaidFor) {
		this.totQtyPaidFor = totQtyPaidFor;
	}




	public List<String> getTotVarietyCodes() {
		return totVarietyCodes;
	}




	public void setTotVarietyCodes(List<String> totVarietyCodes) {
		this.totVarietyCodes = totVarietyCodes;
	}




	@Override
	public String toString() {
		return "SubmitDataForStock [totcid=" + totcid + ", totqtyalloc=" + totqtyalloc + ", totlotno=" + totlotno
				+ ", totVehicles=" + totVehicles + ", totMobileNos=" + totMobileNos + ", villages=" + villages
				+ ", totqtyreq=" + totqtyreq + ", mcodes=" + mcodes + ", totPosDts=" + totPosDts + ", totQtyPaidFor="
				+ totQtyPaidFor + ", totVarietyCodes=" + totVarietyCodes + "]";
	}
    
    

}
