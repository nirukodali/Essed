package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wbvillage_mst")
public class WbvillageMstEntity {
	
	@Id
	private Integer wbvcode;
	private Integer wbdcode;
    private String  wbdname; 
    private Integer wbmcode;
    private String wbmname;  
    private String wbvname ;
    private Integer dcode;
    private Integer mcode;
    private Integer vcode;
    private Integer lgddcode;
    private String lgddname;
    private Integer lgdmcode ;
    private String lgdmname ;
    private Integer lgdvcode;
    private String lgdvname;
    private Integer vscode;
    private String submerged;
    private String wbedname;
    private String wbemname;
    private String wbevname;
    private Integer lgdvcode_new;
    private Integer lgdvcode_old;
    private String newupd;
    private Integer newwbdcode;
    private Integer newwbmcode;
    private Integer  newwbvcode;
    private Integer oldwbdcode;
    private Integer oldwbmcode;
    private Integer oldwbvcode;
    private String  ecrop_dwn;
    private String  dname ;
    private String mname;
    private String dnameeng;
    private String booking_completed;
    private String jioreference;
    
	public WbvillageMstEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WbvillageMstEntity(Integer wbvcode, Integer wbdcode, String wbdname, Integer wbmcode, String wbmname,
			String wbvname, Integer dcode, Integer mcode, Integer vcode, Integer lgddcode, String lgddname,
			Integer lgdmcode, String lgdmname, Integer lgdvcode, String lgdvname, Integer vscode, String submerged,
			String wbedname, String wbemname, String wbevname, Integer lgdvcode_new, Integer lgdvcode_old,
			String newupd, Integer newwbdcode, Integer newwbmcode, Integer newwbvcode, Integer oldwbdcode,
			Integer oldwbmcode, Integer oldwbvcode, String ecrop_dwn, String dname, String mname, String dnameeng,
			String booking_completed, String jioreference) {
		super();
		this.wbvcode = wbvcode;
		this.wbdcode = wbdcode;
		this.wbdname = wbdname;
		this.wbmcode = wbmcode;
		this.wbmname = wbmname;
		this.wbvname = wbvname;
		this.dcode = dcode;
		this.mcode = mcode;
		this.vcode = vcode;
		this.lgddcode = lgddcode;
		this.lgddname = lgddname;
		this.lgdmcode = lgdmcode;
		this.lgdmname = lgdmname;
		this.lgdvcode = lgdvcode;
		this.lgdvname = lgdvname;
		this.vscode = vscode;
		this.submerged = submerged;
		this.wbedname = wbedname;
		this.wbemname = wbemname;
		this.wbevname = wbevname;
		this.lgdvcode_new = lgdvcode_new;
		this.lgdvcode_old = lgdvcode_old;
		this.newupd = newupd;
		this.newwbdcode = newwbdcode;
		this.newwbmcode = newwbmcode;
		this.newwbvcode = newwbvcode;
		this.oldwbdcode = oldwbdcode;
		this.oldwbmcode = oldwbmcode;
		this.oldwbvcode = oldwbvcode;
		this.ecrop_dwn = ecrop_dwn;
		this.dname = dname;
		this.mname = mname;
		this.dnameeng = dnameeng;
		this.booking_completed = booking_completed;
		this.jioreference = jioreference;
	}

	public Integer getWbvcode() {
		return wbvcode;
	}

	public void setWbvcode(Integer wbvcode) {
		this.wbvcode = wbvcode;
	}

	public Integer getWbdcode() {
		return wbdcode;
	}

	public void setWbdcode(Integer wbdcode) {
		this.wbdcode = wbdcode;
	}

	public String getWbdname() {
		return wbdname;
	}

	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}

	public Integer getWbmcode() {
		return wbmcode;
	}

	public void setWbmcode(Integer wbmcode) {
		this.wbmcode = wbmcode;
	}

	public String getWbmname() {
		return wbmname;
	}

	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}

	public String getWbvname() {
		return wbvname;
	}

	public void setWbvname(String wbvname) {
		this.wbvname = wbvname;
	}

	public Integer getDcode() {
		return dcode;
	}

	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}

	public Integer getMcode() {
		return mcode;
	}

	public void setMcode(Integer mcode) {
		this.mcode = mcode;
	}

	public Integer getVcode() {
		return vcode;
	}

	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}

	public Integer getLgddcode() {
		return lgddcode;
	}

	public void setLgddcode(Integer lgddcode) {
		this.lgddcode = lgddcode;
	}

	public String getLgddname() {
		return lgddname;
	}

	public void setLgddname(String lgddname) {
		this.lgddname = lgddname;
	}

	public Integer getLgdmcode() {
		return lgdmcode;
	}

	public void setLgdmcode(Integer lgdmcode) {
		this.lgdmcode = lgdmcode;
	}

	public String getLgdmname() {
		return lgdmname;
	}

	public void setLgdmname(String lgdmname) {
		this.lgdmname = lgdmname;
	}

	public Integer getLgdvcode() {
		return lgdvcode;
	}

	public void setLgdvcode(Integer lgdvcode) {
		this.lgdvcode = lgdvcode;
	}

	public String getLgdvname() {
		return lgdvname;
	}

	public void setLgdvname(String lgdvname) {
		this.lgdvname = lgdvname;
	}

	public Integer getVscode() {
		return vscode;
	}

	public void setVscode(Integer vscode) {
		this.vscode = vscode;
	}

	public String getSubmerged() {
		return submerged;
	}

	public void setSubmerged(String submerged) {
		this.submerged = submerged;
	}

	public String getWbedname() {
		return wbedname;
	}

	public void setWbedname(String wbedname) {
		this.wbedname = wbedname;
	}

	public String getWbemname() {
		return wbemname;
	}

	public void setWbemname(String wbemname) {
		this.wbemname = wbemname;
	}

	public String getWbevname() {
		return wbevname;
	}

	public void setWbevname(String wbevname) {
		this.wbevname = wbevname;
	}

	public Integer getLgdvcode_new() {
		return lgdvcode_new;
	}

	public void setLgdvcode_new(Integer lgdvcode_new) {
		this.lgdvcode_new = lgdvcode_new;
	}

	public Integer getLgdvcode_old() {
		return lgdvcode_old;
	}

	public void setLgdvcode_old(Integer lgdvcode_old) {
		this.lgdvcode_old = lgdvcode_old;
	}

	public String getNewupd() {
		return newupd;
	}

	public void setNewupd(String newupd) {
		this.newupd = newupd;
	}

	public Integer getNewwbdcode() {
		return newwbdcode;
	}

	public void setNewwbdcode(Integer newwbdcode) {
		this.newwbdcode = newwbdcode;
	}

	public Integer getNewwbmcode() {
		return newwbmcode;
	}

	public void setNewwbmcode(Integer newwbmcode) {
		this.newwbmcode = newwbmcode;
	}

	public Integer getNewwbvcode() {
		return newwbvcode;
	}

	public void setNewwbvcode(Integer newwbvcode) {
		this.newwbvcode = newwbvcode;
	}

	public Integer getOldwbdcode() {
		return oldwbdcode;
	}

	public void setOldwbdcode(Integer oldwbdcode) {
		this.oldwbdcode = oldwbdcode;
	}

	public Integer getOldwbmcode() {
		return oldwbmcode;
	}

	public void setOldwbmcode(Integer oldwbmcode) {
		this.oldwbmcode = oldwbmcode;
	}

	public Integer getOldwbvcode() {
		return oldwbvcode;
	}

	public void setOldwbvcode(Integer oldwbvcode) {
		this.oldwbvcode = oldwbvcode;
	}

	public String getEcrop_dwn() {
		return ecrop_dwn;
	}

	public void setEcrop_dwn(String ecrop_dwn) {
		this.ecrop_dwn = ecrop_dwn;
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

	public String getDnameeng() {
		return dnameeng;
	}

	public void setDnameeng(String dnameeng) {
		this.dnameeng = dnameeng;
	}

	public String getbooking_completed() {
		return booking_completed;
	}

	public void setbooking_completed(String booking_completed) {
		this.booking_completed = booking_completed;
	}

	public String getJioreference() {
		return jioreference;
	}

	public void setJioreference(String jioreference) {
		this.jioreference = jioreference;
	}

	@Override
	public String toString() {
		return "WbvillageMstEntity [wbvcode=" + wbvcode + ", wbdcode=" + wbdcode + ", wbdname=" + wbdname + ", wbmcode="
				+ wbmcode + ", wbmname=" + wbmname + ", wbvname=" + wbvname + ", dcode=" + dcode + ", mcode=" + mcode
				+ ", vcode=" + vcode + ", lgddcode=" + lgddcode + ", lgddname=" + lgddname + ", lgdmcode=" + lgdmcode
				+ ", lgdmname=" + lgdmname + ", lgdvcode=" + lgdvcode + ", lgdvname=" + lgdvname + ", vscode=" + vscode
				+ ", submerged=" + submerged + ", wbedname=" + wbedname + ", wbemname=" + wbemname + ", wbevname="
				+ wbevname + ", lgdvcode_new=" + lgdvcode_new + ", lgdvcode_old=" + lgdvcode_old + ", newupd=" + newupd
				+ ", newwbdcode=" + newwbdcode + ", newwbmcode=" + newwbmcode + ", newwbvcode=" + newwbvcode
				+ ", oldwbdcode=" + oldwbdcode + ", oldwbmcode=" + oldwbmcode + ", oldwbvcode=" + oldwbvcode
				+ ", ecrop_dwn=" + ecrop_dwn + ", dname=" + dname + ", mname=" + mname + ", dnameeng=" + dnameeng
				+ ", booking_completed=" + booking_completed + ", jioreference=" + jioreference + "]";
	}
    
    
}
