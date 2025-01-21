package com.eseed.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.eseed.entity.VillageForHO;

@Repository
public interface VillageRepositoryFhorestpwd extends JpaRepository<VillageForHO, Integer> {
	
	@Query(value = "select distinct vscode,vsname from ecrop2024.villsec_rev_v where mcode=? order by vsname", nativeQuery = true)
	List<VillageForHO> getRbk(@Param("mcode") Integer mcode);
}
