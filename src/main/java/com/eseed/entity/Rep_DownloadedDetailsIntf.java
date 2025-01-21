package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rep_DownloadedDetailsIntf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer	cr_vcode; 
private Long weblandcnt;
private Long ccrccnt;
private Long totalcnt;
private String wbevname;
public Rep_DownloadedDetailsIntf() {
	super();
	// TODO Auto-generated constructor stub
}
public Rep_DownloadedDetailsIntf(Integer cr_vcode, Long weblandcnt, Long ccrccnt, Long totalcnt) {
	super();
	this.cr_vcode = cr_vcode;
	this.weblandcnt = weblandcnt;
	this.ccrccnt = ccrccnt;
	this.totalcnt = totalcnt;
}
public Integer getCr_vcode() {
	return cr_vcode;
}
public void setCr_vcode(Integer cr_vcode) {
	this.cr_vcode = cr_vcode;
}
public Long getWeblandcnt() {
	return weblandcnt;
}
public void setWeblandcnt(Long weblandcnt) {
	this.weblandcnt = weblandcnt;
}
public Long getCcrccnt() {
	return ccrccnt;
}
public void setCcrccnt(Long ccrccnt) {
	this.ccrccnt = ccrccnt;
}
public Long getTotalcnt() {
	return totalcnt;
}
public void setTotalcnt(Long totalcnt) {
	this.totalcnt = totalcnt;
}
public String getWbevname() {
	return wbevname;
}
public void setWbevname(String wbevname) {
	this.wbevname = wbevname;
}
@Override
public String toString() {
	return "Rep_DownloadedDetailsIntf [cr_vcode=" + cr_vcode + ", weblandcnt=" + weblandcnt + ", ccrccnt=" + ccrccnt
			+ ", totalcnt=" + totalcnt + "]";
}


}
