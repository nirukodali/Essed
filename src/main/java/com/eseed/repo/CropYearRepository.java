package com.eseed.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.eseed.entity.WbVillageMastEntity;
import com.eseed.projection.CropYearProjection;

public interface CropYearRepository extends JpaRepository<WbVillageMastEntity, Integer> {

	@Query(value = "select distinct on (a.cropyear,a.season) concat(a.season,'@',cropyear) as seasonvalue,concat(b.seasonname,' ',cropyear) as cropyear "
			+ "from activeseason a, season b where a.season = b.season and a.active = 'A' and current = 'Y' order by a.cropyear, a.season", nativeQuery = true)
	List<CropYearProjection> getCropYear();

	@Query(value = "select wbdcode, dname from district_2011_cs order by dname", nativeQuery = true)
	List<Object[]> getWbvcodeWbvname();

}
