package com.eseed.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eseed.entity.ActiveSeasonEntity;
import com.eseed.projection.ActiveSeasonProjection;

public interface GetCropYearRepo extends JpaRepository<ActiveSeasonEntity, Integer> {
	
	@Query(value = "select distinct on (a.cropyear, a.season) concat(a.season,'@',cropyear) as seasonvalue, "
			+ "concat(b.seasonname,'',cropyear) "
			+ "as cropyear from activeseason a, season b where a.season=b.season and a.active='A' and a.season = 'K'" 
			+ " and a.current_season='T' "
			+ "order by a.cropyear, a.season", nativeQuery = true)
	public List<ActiveSeasonProjection> getActiveSeason();
	

	@Query(value="select distinct on (a.cropyear,a.season) concat(a.season,'@',cropyear) as seasonvalue,"
			+ "concat(b.seasonname,' ',cropyear)"
			+ "as cropyear from activeseason a,season b where a.season=b.season and a.active='A' and a.season = 'K'"
			+ "order by a.cropyear,a.season", nativeQuery = true)
	 public List<ActiveSeasonProjection> getAllSeason();


}

