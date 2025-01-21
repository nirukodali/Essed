package com.eseed.repo;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eseed.entity.ActiveSeason;
import com.eseed.projection.ActiveSeasonProjection;

@Repository
public interface ActiveSeasonRepository extends JpaRepository<ActiveSeason, String> {

	@Query(value = "select distinct on (a.cropyear, a.season)concat(a.season,'@',cropyear) as seasonvalue, a.*, b.* from activeseason a, season b where a.season=b.season and a.active='A' and  a.current='Y' order by a.cropyear, a.season", nativeQuery = true)
	List<ActiveSeason> findByActiveAndCurrentSeason();

//	 and a.current_season='T'

	
	@Query(value = "select distinct on (a.cropyear, a.season) concat(a.season,'@',cropyear) as seasonvalue, concat(b.seasonname,'',cropyear) as cropyear from activeseason a, season b where a.season=b.season and a.active='A' and  a.current='Y'  order by a.cropyear, a.season", nativeQuery = true)
	public List<ActiveSeasonProjection> getActiveSeason();
	
	
	@Query(value = "select  vr.dcode,vr.mcode,r.dname,r.mname,vr.vscode,v.vname,r.wbvname  from vs_rev_villages vr \n"
			+ "inner join vill_sec_det v on  vr.vscode=v.vcode inner join\n"
			+ "rev_villagenames_v r on   vr.vcode=r.wbvcode   where   \n"
			+ "vr.dcode=:dcode and vr.mcode=:mcode group by  vr.dcode,vr.mcode,r.dname,r.mname,vr.vscode,v.vname,r.wbvname  \n"
			+ "order by r.mname,v.vname,r.wbvname", nativeQuery = true)

	public List<RepVillSecRevenueDistProj> getRevvillagesMandals(Integer dcode, Integer mcode);


	@Query(value = "select  vr.dcode,vr.mcode,r.dname,r.mname,vr.vscode,v.vname,r.wbvname  from vs_rev_villages vr \n"
			+ "inner join vill_sec_det v on  vr.vscode=v.vcode inner join\n"
			+ "rev_villagenames_v r on   vr.vcode=r.wbvcode   where   vr.dcode=:dcode  group by  \n"
			+ "vr.dcode,vr.mcode,r.dname,r.mname,vr.vscode,v.vname,r.wbvname  order by r.mname,v.vname,r.wbvname", nativeQuery = true)


	public List<RepVillSecRevenueDistProj> getVillagesDist(Integer dcode);

	public interface RepVillSecRevenueDistProj {

		Integer getDcode();

		Integer getMcode();

		String getDname();

		String getMname();

		Integer getVscode();

		String getVname();

		String getVbvname();
	}


}
