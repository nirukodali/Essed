package com.eseed.repo;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eseed.entity.WbMaster;

@Repository
public interface WbMasterRepo extends JpaRepository<WbMaster, Integer>  {

	@Query(value = "select wb.wbvname, wb.wbdname, wb.wbmname, wb.wbvname, wb.wbdcode, wb.wbmcode, wb.wbvcode from wbvillage_mst wb where wb.wbdcode = :wbdcode and wb.wbmcode = :wbmcode limit 1", nativeQuery = true)

	public WbMaster getWbMasterDetailsForMandal(@Param("wbmcode") Integer wbmcode, @Param("wbdcode") Integer wbdcode);

	@Query(value = "select wb.wbvname, wb.wbedname, wb.wbemname, wb.wbevname, wb.wbdcode, wb.wbmcode, wb.wbvcode from wbvillage_mst wb where  wb.wbdcode = :wbdcode and wb.wbmcode = :wbmcode and wb.wbvcode = :wbvcode", nativeQuery = true)

	public WbMaster getWbMasterDetailsForVillage(@Param("wbvcode") Integer wbvcode, @Param("wbmcode") Integer wbmcode,
			@Param("wbdcode") Integer wbdcode); 
	@Query(value="select distinct(wbvcode),wbvname,wbdcode,wbedname,wbemname,wbevname,wbmcode from wbvillage_mst where dcode=:dcode and mcode=:mcode order by wbvname",nativeQuery=true)
	List<WbMaster> findWebVcodeAndVname(@Param("dcode")Integer dcode,@Param("mcode") Integer mcode);
	
	@Query(value="select wbvname,wbvcode,wbdcode,wbedname,wbemname,wbevname,wbmcode from wbvillage_mst where dcode=:dcode and mcode=:mcode and wbvcode=:vcode order by wbvname",nativeQuery=true)
	List<WbMaster> findVillageName(Integer dcode, Integer mcode, Integer vcode);
	
	@Query(value="select distinct wbdcode,wbvcode,wbvname,wbedname,wbemname,wbevname,wbmcode from wbvillage_mst where wbvcode in (select wbvcode from unsettled_villages where dcode=:dcode  and mcode=:mcode)",nativeQuery=true)
	List<WbMaster> findUnsurveyedVilageList(Integer dcode, Integer mcode);
	
	@Query(value="select wbvname from wbvillage_mst where  wbvcode=:vcode ",nativeQuery=true)
	public String getVillageName(Integer vcode);
	
	@Query(value="select wbedname from wbvillage_mst where  wbdcode=:dcode ",nativeQuery=true)
	List<String> findDistByCode(Integer dcode);
	
	@Query(value="select distinct wbdname from wbvillage_mst where dcode=:dcode ",nativeQuery=true)
	String findDCode(Integer dcode);
	
	@Query(value=" select distinct wbdcode from wbvillage_mst where  dcode=( select cast(district as numeric) from user_registration where userid=:userid)", nativeQuery = true)
	String findDCodeJc(String userid);

}
