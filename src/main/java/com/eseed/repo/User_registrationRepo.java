package com.eseed.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eseed.entity.UpdateProfileEntity;

@Repository
public interface User_registrationRepo extends JpaRepository<com.eseed.entity.User_registration, String> {

	@Query(value="select userid from user_registration where userid=:userId",nativeQuery=true)
	public String getUserId(@Param("userId") String userId);
	
	@Query(value="select name,aadhaar_id as aadhaar,mobile_phone as mobile,emailid from user_registration where userid=:userId",nativeQuery=true)
	public List<UpdateProfileEntity> getUserDetails(@Param("userId") String userId);
	
	@Query(value = "SELECT v.vsdname, v.vsmname, v.vname, u.userid, u.village FROM user_registration u JOIN vill_sec_det v ON CAST(u.district AS INTEGER) = v.dcode AND \r\n"
			+ "CAST(u.blockortehsil AS INTEGER) = v.mcode AND CAST(u.village AS INTEGER) = v.vcode \r\n"
			+ "WHERE u.type_user = '25' AND u.district =:dcode AND u.status =:status ORDER BY v.vsdname, v.vsmname, v.vname", nativeQuery = true)
List<Object[]> findByDistrictAndStatus(@Param("dcode") String dcode, @Param("status") String status);


@Query(value = "SELECT v.vsdname as vsdname, v.vsmname as vsmname, v.vname as vname, u.userid as userid, u.village as village,dcode,mcode,vcode,status " +
        "FROM user_registration u " +
        "JOIN vill_sec_det v ON CAST(u.district AS INTEGER) = v.dcode " +
        "AND CAST(u.blockortehsil AS INTEGER) = v.mcode " +
        "AND CAST(u.village AS INTEGER) = v.vcode " +
        "WHERE u.type_user = '25' " +
        "AND u.district = :dcode " +
        "AND u.blockortehsil = :mcode " +
        "AND u.status = :status " +
        "ORDER BY v.vsdname, v.vsmname, v.vname", 
nativeQuery = true)
List<Object[]> findByDistrictAndBlockAndStatus(@Param("dcode") String dcode, 
                                        @Param("mcode") String mcode, 
                                        @Param("status") String status);

@Query(value = "SELECT district FROM user_registration WHERE userid = :userId", nativeQuery = true)
Object findDistrictByUserId(@Param("userId") String userId);



}
