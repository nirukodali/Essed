package com.eseed.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "cr_booking_partition_", schema = "ecrop2024")
public class Cr_BookingEntity {
	@Id
private int bookingid;
 private int   cr_dist_code ;
  private int  cr_mand_code ;
  private int  cr_vcode ;
  String  part_key;
  public String getPart_key() {
	return part_key;
}
public void setPart_key(String part_key) {
	this.part_key = part_key;
}
public int getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}
public int getCr_dist_code() {
	return cr_dist_code;
}
public void setCr_dist_code(int cr_dist_code) {
	this.cr_dist_code = cr_dist_code;
}
public int getCr_mand_code() {
	return cr_mand_code;
}
public void setCr_mand_code(int cr_mand_code) {
	this.cr_mand_code = cr_mand_code;
}
public int getCr_vcode() {
	return cr_vcode;
}
public void setCr_vcode(int cr_vcode) {
	this.cr_vcode = cr_vcode;
}
public int getCr_year() {
	return cr_year;
}
public void setCr_year(int cr_year) {
	this.cr_year = cr_year;
}
public String getDynamicTableNamePrefix() {
	return dynamicTableNamePrefix;
}
private int  cr_year;
  /*
    cr_season character(1) COLLATE pg_catalog."default" NOT NULL,
    cr_farmeruid character varying(12) COLLATE pg_catalog."default",
    owner_tenant character(1) COLLATE pg_catalog."default" NOT NULL,
    oc_name character varying(200) COLLATE pg_catalog."default",
    oc_fname character varying(200) COLLATE pg_catalog."default",
    email character varying(50) COLLATE pg_catalog."default",
    mobileno numeric(10,0),
    age numeric(3,0),
    kh_no numeric(10,0) NOT NULL,
    cr_sno character varying(100) COLLATE pg_catalog."default" NOT NULL,
    tot_extent numeric(20,4),
    cr_tr_d_ext numeric(10,4),
    cr_tr_i_ext numeric(10,4),
    entry_by character varying(15) COLLATE pg_catalog."default",
    entry_date timestamp(6) without time zone,
    longitude numeric(18,10),
    latitude numeric(18,10),
    imei character varying(50) COLLATE pg_catalog."default",
    updatedby character varying(50) COLLATE pg_catalog."default",
    updateon timestamp(6) without time zone,
    ipaddress character varying(50) COLLATE pg_catalog."default",
    uploaded character(1) COLLATE pg_catalog."default",
    data_src character(1) COLLATE pg_catalog."default",
    downloadtime character(30) COLLATE pg_catalog."default",
    ccrcid character varying(100) COLLATE pg_catalog."default",
    rid integer,
    crop_insured character(1) COLLATE pg_catalog."default",
    occupant_extent numeric(20,4),
    dcode integer,
    mcode integer,
    occupname character varying(200) COLLATE pg_catalog."default",
    occupfname character varying(200) COLLATE pg_catalog."default",
    regno integer,
    soc_category integer,
    gender character(1) COLLATE pg_catalog."default",
    sjointoccupant integer,
    ctype integer,
    variety integer,
    irrmethod integer,
    downloaded character(1) COLLATE pg_catalog."default",
    crt_user character varying(100) COLLATE pg_catalog."default",
    dwld_ver character varying COLLATE pg_catalog."default",
    upld_ver character varying COLLATE pg_catalog."default",
    ageflag character(1) COLLATE pg_catalog."default",
    mobileflag character(1) COLLATE pg_catalog."default",
    croptype integer,
    anubhavadar_name character varying(200) COLLATE pg_catalog."default",
    anubhavadar_extent numeric(10,4),
    cultivator_type character(1) COLLATE pg_catalog."default",
    oldbookingid numeric(20,0),
    dt_crt timestamp without time zone DEFAULT now(),
    landownership_type character(2) COLLATE pg_catalog."default",
    refbookingid integer,
    culti_ext_upd_flag character(1) COLLATE pg_catalog."default",
    old_cr_tr_i_ext numeric(10,4),
    old_cr_tr_d_ext numeric(10,4),
    forwarded_booking character(1) COLLATE pg_catalog."default",
    insertedby character(1) COLLATE pg_catalog."default",
    dataprep_bkid integer,
    ips_flag character(1) COLLATE pg_catalog."default",
    digitally_signed character varying COLLATE pg_catalog."default",
    cr_farmeruid_old character varying(12) COLLATE pg_catalog."default",
    vs_sel character(1) COLLATE pg_catalog."default",
    cult_updatedby character varying(50) COLLATE pg_catalog."default",
    cult_updateon timestamp without time zone,
    peri_status character varying COLLATE pg_catalog."default",
    old_extent numeric(20,4),
    mao_unlock_appr character(1) COLLATE pg_catalog."default",
    occup_change character(1) COLLATE pg_catalog."default",
    cr_wsno bigint,
    geo_reffered character(1) COLLATE pg_catalog."default",
    emp_code integer,
    srno_userid character varying COLLATE pg_catalog."default",
    peri_forward character(1) COLLATE pg_catalog."default",
    peri_remarks character varying(200) COLLATE pg_catalog."default",
    rec_id numeric,
	 */

    private String dynamicTableNamePrefix = "cr_booking_partition_"; 
    private String dynamicSchema = "ecrop2024"; 

    
    
    public String getDynamicTableName(String cr_season, Integer wbdcode2, Integer cropyear) {
//        String season = "r"; 
//        String wbdcode = "04"; 
//        String year = "2023";
    	 String season = cr_season; 
         int wbdcode = wbdcode2; 
         int year = cropyear; 
        return dynamicTableNamePrefix + season + wbdcode + year;
    }

    public String getDynamicSchema() {
        return dynamicSchema;
    }
    
    public void setDynamicTableNamePrefix(String dynamicTableNamePrefix) {
        this.dynamicTableNamePrefix = dynamicTableNamePrefix;
    }

    public void setDynamicSchema(String dynamicSchema) {
        this.dynamicSchema = dynamicSchema;
    }

    public void setDynamicTableName(String dynamicTableName) {
        this.dynamicTableNamePrefix = dynamicTableName;
    }
}
