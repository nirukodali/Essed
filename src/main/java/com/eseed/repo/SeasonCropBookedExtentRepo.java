package com.eseed.repo;

import java.math.BigInteger; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eseed.entity.SeasonCropBookedExtent;
import com.eseed.projection.MasterProjections;


public interface SeasonCropBookedExtentRepo extends JpaRepository<SeasonCropBookedExtent, String> {

	@Query(value = "select distinct on (a.cropyear,a.season) concat(a.season,'@',cropyear) as col1,concat(b.seasonname,' ',cropyear) as col2 \r\n"
			+ " from activeseason a,season b  where   a.season=b.season and a.active='A' order by a.cropyear,a.season", nativeQuery = true)
	public List<com.eseed.projection.MasterProjections> getAllSeason();
	
	@Query(value = "select wbvname as col1,vcode as col2 from ecrop2024.villsec_rev_v where vscode=:vscode", nativeQuery = true)
	public List<MasterProjections> getVillageListByRbk(@Param("vscode") Integer vscode);

	@Query(value = "select mcode as col1,mname as col2 from mandal_2011_cs where dcode=:dcode order by mname ", nativeQuery = true)
	public List<MasterProjections> getAllMandals(@Param("dcode") Integer dcode);
	
	@Query(value = "select distinct mcode as col1,wbmname as col2 from wbvillage_mst where dcode=:dcode and mcode in (select mcode from adamandals_v where divcode=:mcode) order by wbmname ", nativeQuery = true)
	public List<MasterProjections> getAllMandalsForAdaApproval(@Param("dcode") Integer dcode,@Param("mcode") Integer mcode);

	@Query(value = "select distinct(wbvcode) as col1,wbvname as col2 from wbvillage_mst "
			+ "where dcode=:dcode and mcode=:mcode order by wbvname", nativeQuery = true)
	public List<MasterProjections> getAllVillages(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode);
	
	@Query(value = "select distinct(wbvcode) as col1,wbevname as col2 from wbvillage_mst "
			+ "where dcode=:dcode and mcode=:mcode order by wbevname", nativeQuery = true)
	public List<MasterProjections> getAllVillagesEng(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode);
	
	@Query(value = "select distinct(wbvcode) as col1,wbevname as col2 from wbvillage_mst "
			+ "where dcode=:dcode order by wbevname", nativeQuery = true)
	public List<MasterProjections> getAllVillages(@Param("dcode") Integer dcode);

	
	@Query(value = "select distinct(wbvcode) as col1,wbvname as col2,wbdcode,mcode from wbvillage_mst "
			+ "where dcode=:dcode and mcode in (select mcode from adamandals_v where divcode=:mcode) order by wbvname", nativeQuery = true)
	public List<MasterProjections> getAllVillagesForAda(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode);
	
	@Query(value = "select distinct(wbvcode) as col1,wbevname as col2 from wbvillage_mst "
			+ "where wbdcode=:dcode and wbmcode=:mcode order by wbevname", nativeQuery = true)
	public List<MasterProjections> getAllWBVillages(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode);
	
	@Query(value = "select distinct(wbvcode) as col1,wbevname as col2,wbevname as vname,wbedname,wbemname from wbvillage_mst "
			+ "where dcode=:dcode and mcode=:mcode and wbvcode=:crVcode order by wbevname", nativeQuery = true)
	public List<MasterProjections> getAllWBVillages(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode,@Param("crVcode") Integer crVcode);

	@Query(value = " select cropgrpid as col1,grpnameeng as col2 from cropgroups where active='A' order by grpnameeng ", nativeQuery = true)
	public List<MasterProjections> getAllCropGrp();
	
	@Query(value = " select wbvname from wbvillage_mst where wbvcode=:vcode ", nativeQuery = true)
	public String  getVname(Integer vcode);

	@Query(value = "select cropid  as col1,coalesce(cropnameeng,'NA') as col2 from cropnames  "
			+ "where grpcode=:grpcode order by cropnameeng ", nativeQuery = true)
	public List<MasterProjections> getAllCrpGrpid(@Param("grpcode") Integer grpcode);

	@Query(value = "select mapped_extent,( cast(occupant_extent as numeric)-cast(mapped_extent as numeric) ) as avail_ext, b.dcode,b.mcode,\r\n"
			+ "b.wbvcode,village_name as wbvname,pattadar_name as ocname,pattadar_father_name as ocfname,booking_available,allowable_ext,\r\n"
			+ "occupant_name  as farmer_name,occupant_father_name  as father_name, cr_sno  as survey_no, kh_no, occupant_extent, total_extent as \r\n"
			+ "tot_extent from ecrop2024.cr_details_efish_2023 a, wbvillage_mst b where booking_available is null and  \r\n"
			+ "a.cr_vcode=cast(b.wbvcode as character varying)  and  b.dcode=:dcode and b.mcode=:mcode \r\n"
			+ "and b.wbvcode=:wbvcode order by wbvname", nativeQuery = true)
	public List<BlockedEfishExtent> findByExtent(@Param("dcode") Integer dcode,

			@Param("mcode") Integer mcode, @Param("wbvcode") Integer wbvcode);

	@Query(value = "select  mcode as col1,mname as col2 from homandalsnew_v where hqcode=:mcode order by mname", nativeQuery = true)
	public List<MasterProjections> getHoMandals(@Param("mcode") Integer mcode);

	@Query(value = "select wsrcid as col1,wsrcdesc as col2 from waterresources where active='A'", nativeQuery = true)
	public List<MasterProjections> getirrigationsource();
	
	@Query(value = "select dcode as col1,dname as col2  from district_2011_cs  order by dname", nativeQuery = true)
	public List<MasterProjections> getDistrict();

	@Query(value = "select wbdname,wbmname,wbvname,claimid,claim_type,gri_type,old_cropname,new_cropname,old_varietyname,new_varietyname,old_extent,new_extent,old_name,new_name,old_uid,concat('********',substr(new_uid,8,4)) as newuid,remarks from rep_cropins_gri_v where dcode=:dcode", nativeQuery = true)
	public List<DataCropGr> getdataCropGr(@Param("dcode") Integer dcode);

	interface DataCropGr {
		String getWbdname();
		String getWbmname();
		String getWbvname();
		String getClaimid();
		String getClaim_type();
		String getGri_type();
		String getOld_cropname();
		String getNew_cropname();
		String getOld_varietyname();
		String getNew_varietyname();
		String getOld_extent();
		String getNew_extent();
		String getOld_name();
		String getNew_name();
		String getOld_uid();
		String getNewuid();
		String getRemarks();
	}


	interface BlockedEfishExtent {
		String getMapped_extent();

		String getAvail_ext();

		String getDcode();

		String getMcode();

		String getWbvcode();

		String getwbvname();

		String getOcname();

		String getOcfname();

		String getBooking_available();

		String getAllowable_ext();

		String getFarmer_name();

		String getFather_name();

		String getSurvey_no();

		String getKh_no();

		String getOccupant_extent();

		String getTot_extent();
	}

	@Query(value = "select cast(code as character varying) as code ,category,remarks,crb_remarks "
			+ "from obj_unobj order by crb_remarks ", nativeQuery = true)
	List<ObjUnobj> getObjObj();

	interface ObjUnobj {
		String getCode();

		String getCategory();

		String getRemarks();

		String getCrb_remarks();
	}

	@Query(value = "select c.vname, a.emp_code,emp_name,rbkuserid,mobile,email,'xxxxxxxx'||right(aadhaar_id,4) as aadhaar_id,case when designation='1'\r\n"
			+ " then 'VAA' when designation='2'  then 'VHA' when designation='3' then 'VSA' end as designation from ecrop2024.cr_emp_profile a , \r\n"
			+ " ecrop2024.emp_rbk_map b,vill_sec_det c where  a.dcode=b.dcode and a.mcode=b.mcode and b.dcode=c.dcode and b.mcode=c.mcode and \r\n"
			+ " b.rbkcode=c.vcode and  a.emp_code=b.empcode and a.dcode=:dcode and a.mcode=:mcode order by vname\r\n"
			+ "", nativeQuery = true)
	List<EmployeeList> getEmpList(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode);

	interface EmployeeList {
		String getVname();

		String getEmp_code();

		String getEmp_name();

		String getRbkuserid();

		String getMobile();

		String getEmail();

		String getAadhaar_id();

		String getDesignation();

	}

	@Query(value = "SELECT userid,districtname,mandalname,villagename,name,mobile_phone,emailid,to_char(regdate,'dd-MM-yyyy') as regdate,status  from user_registration_vs_v  where  status='A' and  CAST(dcode AS character varying)=:dcode and  type_user='25' order by mandalname,villagename", nativeQuery = true)

	List<RepVaaDetails> getVaaDet(@Param("dcode") String dcode);

	interface RepVaaDetails {
		String getUserid();

		String getDistrictname();

		String getMandalname();

		String getVillagename();

		String getName();

		String getMobile_phone();

		String getEmailid();

		String getRegdate();

		String getStatus();

	}
	
	@Query(value="select cropid as col1,cropname as col2 from cropnames  where active='A' order by cropname",nativeQuery = true)
	public List<MasterProjections> getAllCrops();

	@Query(value = "SELECT DISTINCT district, mname, vname, blockortehsil, village, userid,mobile_phone, emailid, dt.status, dt_crt, imei1, imei2 FROM user_registration ur "
			+ "INNER JOIN devicedet dt ON CAST(ur.village as text) = CAST(dt.vcode as text) INNER JOIN mandal_2011_cs m ON CAST(ur.blockortehsil as int) = m.mcode LEFT JOIN "
			+ "vill_sec_det v ON CAST (ur.village as text) = CAST(v.vcode as text) WHERE ur.district =:dcode AND ur. type_user = '25'ORDER BY "
			+ "blockortehsil,village,dt_crt", nativeQuery = true)

	List<DeviceRegDetails> getDevRegDet(@Param("dcode") String dcode);

	interface DeviceRegDetails {
		String getBlockortehsil();

		String getMname();

		String getVname();

		String getVillage();

		String getUserid();

		String getMobile_phone();

		String getEmailid();

		String getStatus();

		String getDt_crt();

		String getImei1();

		String getImei2();
	}


	@Query(value = "select wbdname,wbmname, wbvname,claimid,claim_type,gri_type, old_extent, new_extent,old_cropname,new_cropname,old_varietyname,new_varietyname,\r\n"
			+ "old_name,new_name,old_uid,concat('********',substr(new_uid,8,4)) as newuid ,remarks from rep_cropins_gri_v "
			+ "where dcode=:dcode and mcode=:mcode and cropyear=:cropyear and season=:season \r\n"
			+ "  ", nativeQuery = true)
	List<CropInsGrievance> getCropIns(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode,
			@Param("cropyear") Integer cropyear, @Param("season") String season);

	interface CropInsGrievance {
		String getWbdname();

		String getWbmname();

		String getWbvname();

		String getClaimid();

		String getClaim_type();

		String getGri_type();

		String getOld_extent();

		String getNew_extent();

		String getOld_cropname();

		String getNew_cropname();

		String getOld_varietyname();

		String getNew_varietyname();

		String getOld_name();

		String getNew_name();

		String getOld_uid();

		String getNewuid();

		String getRemarks();
	}

	@Query(value = "select cast(kh_no as character varying) as kh_no,cr_sno,oc_name,oc_fname,occupname,occupfname,cast(tot_extent as character varying)\r\n"
			+ "as tot_extent, cast(occupant_extent as character varying) ,cr_farmeruid, cast(mobileno as varchar), cast(gender as varchar),\r\n"
			+ "wbdname,wbmname,wbvname from pattmast_nonwebland a,wbvillage_mst b where a.cr_dist_code=b.wbdcode and a.cr_mand_code=b.wbmcode\r\n"
			+ "and a.cr_vcode=b.wbvcode  and a.dcode=:dcode and a.mcode=:mcode  and cr_season=:season and cr_year=:cropyear"
			+ " order by wbdname,wbmname,wbvname", nativeQuery = true)
	List<NonWebView> getNonwebView(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode,
			@Param("season") String season, @Param("cropyear") Integer cropyear);

	interface NonWebView {
		String getKh_no();

		String getCr_sno();

		String getOc_name();

		String getOc_fname();

		String getOccupname();

		String getOccupfname();

		String getTot_extent();

		String getOccupant_extent();

		String getCr_farmeruid();

		String getMobileno();

		String getGender();
	}

	@Query(value = "select vsdname,vsmname,vcode,vname from Vill_sec_det WHERE dcode=:dcode and mcode=:mcode order by vsdname,vname ", nativeQuery = true)
	public List<RbkList> getVillages(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode);

	interface RbkList {
		String getVsmname();

		String getVname();
	}


	@Query(value = "select  vr.dcode,vr.mcode,r.dname,r.mname,vr.vscode,v.vname,r.wbvname  from vs_rev_villages vr inner join vill_sec_det v on  vr.vscode=v.vcode \r\n"
			+ "inner join  rev_villagenames_v r on  vr.vcode=r.wbvcode where vr.dcode=:dcode and vr.mcode=:mcode group by  vr.dcode,vr.mcode,r.dname,r.mname,\r\n"
			+ "vr.vscode,v.vname,r.wbvname  order by r.mname,v.vname,r.wbvname", nativeQuery = true)
	public List<Revenue> getRbkVsRevenue(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode);

	interface Revenue {
		String getDname();

		String getMname();

		String getVname();

		String getWbvname();

	}
	@Query(value = "select count(*) as deletedCnt from ecrop2023.supercheck_deleted where coalesce(cr_dist_code, 0) = :dist_code and coalesce(cr_mand_code, 0) = :mand_code", nativeQuery = true)
	public DeletedCount getDeleteCount(@Param("dist_code") int dist_code,@Param("mand_code") int mand_code);

	public interface DeletedCount {
		BigInteger getDeletedCnt();
	
	}

	@Query(value = "select cropid as col1,cropname as col2 from cropnames where  cropnature in('A','H','S','R') and active='A' order by cropname ", nativeQuery = true)
	public List<MasterProjections> getCrpName();

	@Query(value = "select dcode as col1,dname as col2  from district_2011_cs where dcode=:dcode and dcode!=999 order by dcode", nativeQuery = true)
	public List<MasterProjections> getDistrict(@Param("dcode") Integer dcode);

}
