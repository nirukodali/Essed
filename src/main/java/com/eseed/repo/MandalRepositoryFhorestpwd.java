package com.eseed.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eseed.entity.DistrictCsEntity;
import com.eseed.entity.Districts;
import com.eseed.entity.MandalFhorestpwd;
import com.eseed.projection.DistrictCsProjection;

@Repository
public interface MandalRepositoryFhorestpwd extends JpaRepository<MandalFhorestpwd, Integer> {

	@Query(value = "select * from mandal_2011_cs  order by mname", nativeQuery = true)
	List<MandalFhorestpwd> getMandals(@Param("dcode") Integer dcode);
	
	
	
	
	@Query(value = "select dcode,dname from district_2011_cs  order by dname",nativeQuery = true)
	List<DistrictCsProjection>   getDistricts();
	
	
	
}
