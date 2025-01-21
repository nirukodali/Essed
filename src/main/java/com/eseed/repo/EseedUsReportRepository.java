package com.eseed.repo;

import com.eseed.entity.WbVillageEntity;
import com.eseed.projection.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EseedUsReportRepository extends JpaRepository<WbVillageEntity, Integer> {

    @Query(value = "SELECT CONCAT(b.seasonname, ',', cropyear) AS rseason, " +
                   "CONCAT(a.season, '@', cropyear) AS rcropyear " +
                   "FROM activeseason a, season b " +
                   "WHERE distribution_initiated='Y' AND a.season=b.season " +
                   "ORDER BY a.cropyear, a.season", nativeQuery = true)
    List<ActiveSeasonProjection> findActiveSeasons();

    @Query(value = "SELECT dcode, dname FROM district_2011_cs WHERE dcode<>999 ORDER BY dcode", nativeQuery = true)
    List<DistrictCsProjection> findAllDistricts();

    @Query(value = "SELECT to_char(now(),'dd/mm/yyyy HH24:MI:SS') as reporttime", nativeQuery = true)
    String reportTime();

    @Query(value = "SELECT dname FROM district_2011_cs WHERE dcode = :dcode AND dcode<>999", nativeQuery = true)
    String getDistrictName(@Param("dcode") Integer dcode);

    @Query(value = "SELECT seasonname FROM season WHERE season= :season", nativeQuery = true)
    String getCurrentSeason(@Param("season") String season);
}


