package com.eseed.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eseed.entity.User_registration;
import com.eseed.entity.VillageSecModel;


public 	interface VillageSecModelRepository extends JpaRepository<VillageSecModel, Integer> {
	
	
	@Query(value="select distinct(vcode),vname from vill_sec_det  where dcode=:dcode and mcode=:mcode order by vname",nativeQuery=true)
	List<VillageSecModel> findAll(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode);


}
