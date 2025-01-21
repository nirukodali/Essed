package com.eseed.repo;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.eseed.entity.District;
import com.eseed.projection.DistrictProjections;
import com.eseed.projection.MasterProjections;

public interface DistrictRepository extends JpaRepository<District, Integer>{
	@Query(value = "select * from district_2011_cs where dcode!=999 order by dname",nativeQuery=true)
	List<DistrictProjections> getList();
	
//	=================  cropyear  ====================
	@Query(value="select distinct on (a.cropyear,a.season) concat(a.season,'@',cropyear) as col1,concat(b.seasonname,' ',cropyear) as col2 \r\n"
			+ "       from activeseason a,season b  where   a.season=b.season and a.cropyear>=2020 order by a.cropyear,a.season",nativeQuery = true)
	public List<MasterProjections> getAllSeason();
	
	// ================== Mandal ==============
		@Query(value = "select mcode as col1,mname as col2 from mandal_2011_cs where dcode=:dcode order by mname", nativeQuery = true)
		List<MasterProjections> getmandal(@Param("dcode") Integer dcode);
		
//		============== Villages  =====================
		@Query(value = "select distinct(wbvcode) as col1,wbvname as col2 from wbvillage_mst "
				+ "where dcode=:dcode and mcode=:mcode order by wbvname", nativeQuery = true)
		public List<MasterProjections> getAllVillages(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode);
		
		@Query(value = "select distinct (wbdcode) from district_2011_cs where dcode = :dcode",nativeQuery=true)
		int getWbdcode(int dcode);
		

		
//		======================  SUB PRODUCT  CODE  =======================
		@Query(value = "SELECT subproductcode as col1,name as col2 FROM subproductmast ORDER by name",nativeQuery=true)
		List<MasterProjections> getsubproductcode();
		
//		======================  PRODUCT  CODE  =======================
		@Query(value = "select productcode as col1,name as col2 from productmast order by name",nativeQuery=true)
		List<MasterProjections> getproductcode();
		
//		======================  SUB PRODUCT  CODE WITH PRODUCT =======================
		@Query(value = "select subproductcode as col1,name as col2 from subproductmast where productcode=:prdcode order by name",nativeQuery=true)
		List<MasterProjections> getsubcodeproduct(@RequestParam("prdcode") String prdcode);
		
		
		
//		=====================   SEED VARIETY  ==========================
		@Query(value = "select varietycode as col1,concat(name,' - ',b.groupname) as col2 from varietymast a \r\n"
				+ "	join seedgroup_mst b on a.groupcode=b.groupcode where subproductcode=:subcode \r\n"
				+ "	and a.active='A' order by a.name,a.groupcode ",nativeQuery=true)
		List<MasterProjections> getvarietycodeproduct(@RequestParam("subcode") String subcode);
		
//		=====================   SEED VARIETY  ==========================
		@Query(value = "select varietycode as col1,concat(name,'-',units) as col2 from varietymast where active='A' \r\n"
				+ " and varietycode in (select distinct varietycode from product_price) order by varietycode,name",nativeQuery=true)
		List<MasterProjections> getvarietycode();
		
		//===================SEED VARIETY nireesha======================
		
		@Query(value = "select varietycode as col1,concat(name,' - ',b.groupname) as col2 from varietymast a join seedgroup_mst b on a.groupcode=b.groupcode \r\n"
				+ "WHERE a.varietycode IN ( SELECT DISTINCT  seedvariety  FROM  stock_entry  WHERE  CAST(cropyear AS int) = :year AND season =:season \r\n"
				+ "AND dist  = :dcode AND CAST(mandal AS int) = :mcode)ORDER BY  a.name, a.groupcode;",
	      nativeQuery = true)
	List<MasterProjections> getSeedVariety(@Param("year") Integer year,
	                                      @Param("season") String season,
	                                      @Param("dcode") String dcode,
	                                      @Param("mcode") Integer mcode);
		
		@Query(value = "select dcode as col1,dname as col2,* from district_2011_cs where dcode!=999 order by dname",nativeQuery=true)
		List<MasterProjections> getListDistrict();
		
//		=====================   SEED GROUP  ==========================
		@Query(value = "select groupcode as col1,groupname as col2 from seedgroup_mst where active='A' order by groupname",nativeQuery=true)
		List<MasterProjections> getseedgrp();
		
		
		//		=====================  PROD CODE WITH SEED GROUP  ==========================
		@Query(value = "Select b.productcode as col1, b.name as col2 from varietymast a, productmast b where a.productcode=b.productcode \r\n"
				+ "and a.groupcode=:seedgrp group by b.productcode order by col2 ",nativeQuery=true)
		List<MasterProjections> getprodseedcode(@RequestParam("seedgrp") Integer seedgrp);
		
		//=========================================From Date============================//	
		
			/*	@Query(value = "select startdate  from seasonstartdate where cropyear::text=? and season=?",nativeQuery = true)
			List<Date> getStartDt(@Param("cropyear") String cropyear,
			                                   @Param("season") String season); */
				
											//   =========================================================================	


		@Query(value = "select startdate from seasonstartdate where cast(cropyear as text) = :cropyear and season = :season", nativeQuery = true)
		List<Date> getStartDt(@Param("cropyear") String cropyear, @Param("season") String season);

}