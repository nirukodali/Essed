package com.eseed.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.eseed.entity.ActiveSeasonFUC;


@Repository
public interface ActiveseasonFUCRepository extends JpaRepository<ActiveSeasonFUC,String>{

	@Query(value="select \r\n"
			+ "distinct on (a.cropyear,a.season) concat(a.season,'@',a.cropyear) as seasonvalue,\r\n"
			+ "concat(b.seasonname,' ',cropyear) as cropyear \r\n"
			+ "from activeseason a,season b  where  a.season=b.season and a.active='A' and a.current='Y' order by a.cropyear,a.season",nativeQuery=true)
	 List<ActiveSeasonFUC>  getCropyear();
	
	

	 @Query(value="select certificate from agencycertificates where season=:season and cropyear=:year",nativeQuery=true)
	 List<String>  getCertificates(@Param("season") String  grpcode,@Param("year") int  year );


}

