package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rep_phy_ack_rbk {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String  rbkname;
	private Long  ekycfarmercount;
	private Long  ackcount; 
	private String  wbdcode;
	private String wbmcode;
	private String wbdname;
	private String wbmname;
	private String  rbkcode;
	public Rep_phy_ack_rbk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rep_phy_ack_rbk(String rbkname, Long ekycfarmercount, Long ackcount, String wbdcode, String wbmcode,
			String wbdname, String wbmname, String rbkcode) {
		super();
		this.rbkname = rbkname;
		this.ekycfarmercount = ekycfarmercount;
		this.ackcount = ackcount;
		this.wbdcode = wbdcode;
		this.wbmcode = wbmcode;
		this.wbdname = wbdname;
		this.wbmname = wbmname;
		this.rbkcode = rbkcode;
	}
	public String getRbkname() {
		return rbkname;
	}
	public void setRbkname(String rbkname) {
		this.rbkname = rbkname;
	}
	public Long getEkycfarmercount() {
		return ekycfarmercount;
	}
	public void setEkycfarmercount(Long ekycfarmercount) {
		this.ekycfarmercount = ekycfarmercount;
	}
	public Long getAckcount() {
		return ackcount;
	}
	public void setAckcount(Long ackcount) {
		this.ackcount = ackcount;
	}
	public String getWbdcode() {
		return wbdcode;
	}
	public void setWbdcode(String wbdcode) {
		this.wbdcode = wbdcode;
	}
	public String getWbmcode() {
		return wbmcode;
	}
	public void setWbmcode(String wbmcode) {
		this.wbmcode = wbmcode;
	}
	public String getWbdname() {
		return wbdname;
	}
	public void setWbdname(String wbdname) {
		this.wbdname = wbdname;
	}
	public String getWbmname() {
		return wbmname;
	}
	public void setWbmname(String wbmname) {
		this.wbmname = wbmname;
	}
	public String getRbkcode() {
		return rbkcode;
	}
	public void setRbkcode(String rbkcode) {
		this.rbkcode = rbkcode;
	}
	@Override
	public String toString() {
		return "Rep_phy_ack_rbk [rbkname=" + rbkname + ", ekycfarmercount=" + ekycfarmercount + ", ackcount=" + ackcount
				+ ", wbdcode=" + wbdcode + ", wbmcode=" + wbmcode + ", wbdname=" + wbdname + ", wbmname=" + wbmname
				+ ", rbkcode=" + rbkcode + "]";
	}
	
	

}
