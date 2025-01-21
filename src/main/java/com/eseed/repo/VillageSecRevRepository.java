package com.eseed.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eseed.entity.VillageSecRevEntity;
import com.eseed.entity.WbMaster;
import com.eseed.projection.ActiveSeasonProjection;


public interface VillageSecRevRepository extends JpaRepository<VillageSecRevEntity, Integer> {
	

	@Query(value = "select  vcode, wbvname from ecrop2024.villsec_rev_v where vscode=:vscode", nativeQuery = true)
	public List<ActiveSeasonProjection> getVillageListByRbk(@Param("vscode") Integer vscode);
	
	@Query(value = "select  vcode, wbvname from ecrop2024.villsec_rev_v where vscode=:vscode  and vcode in (select distinct wbvcode from ecrop2024.allow_villages_addupload)", nativeQuery = true)
	public List<ActiveSeasonProjection> getAllowedVillageListByRbk(@Param("vscode") Integer vscode);
	
	@Query(value = "select  vcode, wbvname from ecrop2024.villsec_rev_v where vscode=:vscode and wbdcode in (24,21,10,4,17,6,26,8,9,25,23,11,5,12,14)", nativeQuery = true)
	public List<ActiveSeasonProjection> getVillageListByRbkForCropDamage(@Param("vscode") Integer vscode);
	
	
	
	@Query(value = "select  a.vcode, a.wbvname from ecrop2024.villsec_rev_v a where  vcode in \r\n"
			+ "(select   cr_vcode from ecrop2024.verify_datadownload b,ecrop2024.allow_villages_addupload  u where   b.cr_vcode=u.wbvcode and "
			+ "b.wbland='Y' and b.ccrc='Y' and b.efish='Y' and b.rofr='Y' and b.peri_data='Y') and vscode=:vscode", nativeQuery = true)
	public List<ActiveSeasonProjection> getVillageList(@Param("vscode") Integer vscode);
	
	
	@Query(value = "select  a.vcode, a.wbvname from ecrop2024.villsec_rev_v a,wbvillage_mst w where a.vcode in \r\n"
			+ "(select   cr_vcode from ecrop2024.verify_datadownload b where   \r\n"
			+ "b.wbland='Y')  and a.vscode=:vscode and w.wbvcode= a.vcode and w.resurveyed='Y'", nativeQuery = true)
			public List<ActiveSeasonProjection> getVillageListRes(@Param("vscode") Integer vscode);
	
	@Query(value = "select  wbvcode as vcode, wbvname from wbvillage_mst where mcode=:mcode and resurveyed='Y'", nativeQuery = true)
			public List<ActiveSeasonProjection> getVillageListResMao(@Param("mcode") Integer mcode);
	
	@Query(value = "select resurveyed from wbvillage_mst where  wbvcode = :villageCode", nativeQuery = true)
	public Character getVillageSurvey(@Param("villageCode") Integer villageCode);
	
	@Query(value = "select wb.wbvcode as vcode, wb.wbedname  as wbedname, wb.wbemname  as wbemname, wb.wbevname as wbvname, wb.wbdcode, wb.wbmcode, wb.rbkcode AS vscode  from villsec_rev_v wb where \n" + 
			"wb.wbdcode = :wbdcode and wb.wbmcode = :wbmcode and wb.rbkcode =:village", nativeQuery = true)

	public List<VillageSecRevEntity> getWbMasterDetailsForVillage(@Param("village") Integer village, @Param("wbmcode") Integer wbmcode,
			@Param("wbdcode") Integer wbdcode);
	
	
	@Query(value = "select wb.wbvcode as vcode, wb.wbedname  as wbedname, wb.wbemname  as wbemname, wb.vsname as wbvname, wb.wbdcode, wb.wbmcode, wb.rbkcode AS vscode  from villsec_rev_v wb where \n" + 
			"wb.wbdcode = :wbdcode and wb.wbmcode = :wbmcode and wb.rbkcode =:village", nativeQuery = true)

	public List<VillageSecRevEntity> getWbMasterDetailsForRBk(@Param("village") Integer village, @Param("wbmcode") Integer wbmcode,
			@Param("wbdcode") Integer wbdcode);
	
	@Query(value = "select wb.vcode as vcode, wb.wbedname, wb.wbemname, wb.vsname as wbvname, wb.wbdcode, wb.wbmcode, wb.vscode  from ecrop2024.villsec_rev_v wb where \n" + 
			"wb.wbdcode = :wbdcode and wb.wbmcode = :wbmcode and wb.vcode =:village", nativeQuery = true)
	public List<VillageSecRevEntity> getWbMasterDetailsForVillageVro(@Param("village") Integer village, @Param("wbmcode") Integer wbmcode,
			@Param("wbdcode") Integer wbdcode);
	
	@Query(value = "select  a.mcode,a.vcode, a.wbvname from ecrop2024.villsec_rev_v a,wbvillage_mst w where a.vcode in \r\n"
			+ "(select   cr_vcode from ecrop2024.verify_datadownload b where   \r\n"
			+ "b.wbland='Y')  and a.mcode=:mcode and w.wbvcode= a.vcode and w.resurveyed='Y'", nativeQuery = true)
			public List<ActiveSeasonProjection> getMandalListRes(@Param("mcode") Integer mcode);
	
	
	
	@Query(value = "select  mcode,mname from mandal_2011_cs  where dcode =:dcode", nativeQuery = true)
			public List<ActiveSeasonProjection> getMandalsByDist(@Param("dcode") Integer dcode);
	
	
	@Query(value = "select  wbvcode as vcode, wbvname from wbvillage_mst where mcode=:mcode", nativeQuery = true)
	public List<ActiveSeasonProjection> getVillageListResMaoDept(@Param("mcode") Integer mcode);
	
	@Query(value = "select  wbvcode as vcode, wbvname from wbvillage_mst  where wbvcode=:wbvcode", nativeQuery = true)
	public List<ActiveSeasonProjection> getVillageListResDeptVRO(@Param("wbvcode") Integer wbvcode);

	@Query(value = "select  wbvcode as vcode, wbvname from villsec_rev_v  where rbkcode=:wbvcode", nativeQuery = true)
	public List<ActiveSeasonProjection> getVillForcseed(@Param("wbvcode") Integer wbvcode);
	
	
}
