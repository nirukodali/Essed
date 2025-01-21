package com.eseed.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.eseed.entity.MandalsFusersho;

@Repository
public interface MandalsFhorestpwdRepository extends JpaRepository<MandalsFusersho, String> {
	
	@Query(value="select userid from user_registration where  blockortehsil=:blockortehsil and type_user='5' and status='A'",nativeQuery=true)
	List<MandalsFusersho> getUsers(@Param("blockortehsil") String blockortehsil );
	
	@Query(value="select userid from user_registration where  village=:village and type_user='25' and status='A'",nativeQuery=true)
	List<MandalsFusersho> getUsersMao(@Param("village") String village );
	
	@Query(value="select userid from user_registration where  district=:district and type_user='9' and status='A'",nativeQuery=true)
	List<MandalsFusersho> getUsersDistricts(@Param("district") String district );
}
