package com.eseed.repo;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eseed.entity.User_registration;

@Repository
public interface User_registrationRepository extends JpaRepository<User_registration, String> {

	@Query(value="select userid from user_registration where userid=:userId",nativeQuery=true)
	public String getUserId(@Param("userId") String userId);
}
