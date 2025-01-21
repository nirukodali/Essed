package com.eseed.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eseed.entity.DistrictMandal;

public interface DistrictMandalRepository extends JpaRepository<DistrictMandal, String>{
	@Query(value="SELECT mname,mcode FROM mandal_2011_cs WHERE dcode=:dcode ORDER BY mname",nativeQuery=true)
	List<DistrictmandalView> getListt(@Param("dcode") Integer dcode);
	
	interface DistrictmandalView{
		String getMname();
		Integer getMcode();
	}

}
