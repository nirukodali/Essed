package com.eseed.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eseed.entity.Employeename;
import com.eseed.projection.EmployeeName;

public interface EmpRepo extends JpaRepository<Employeename, String> {

	@Query(value = "select emp_code,emp_name,aadhaar_id from ecrop2024.cr_emp_profile where mcode=:mandal", nativeQuery = true)
	public List<EmployeeName> findEmpName(@Param("mandal") Integer mandal);

	@Query(value = "INSERT INTO ecrop2024.cr_emp_profile (dcode, mcode, vcode, aadhaar_id, emp_code, emp_name, email, mobile) VALUES (:district, :mandal, :village, :aadharId, :empCode, :empName, :email, :mobileNo)", nativeQuery = true)
	public List<Employeename> saveEmployeeRegistration(@Param("district") Integer district,
			@Param("mandal") Integer mandal, @Param("village") Integer village, @Param("aadharId") String aadharId,
			@Param("empCode") Integer empCode, @Param("empName") String empName, @Param("email") String email,
			@Param("mobileNo") Long mobileNo);

	@Query(value = "SELECT * FROM ecrop2024.cr_emp_profile  WHERE  aadhaar_id=:aadharId", nativeQuery = true)
	public List<Employeename> getAadharExits(@Param("aadharId") String aadharId);

//    @Query(value="SELECT * FROM ecrop2024.cr_emp_profile  WHERE  mobile=:mobile",nativeQuery=true)
//	public List<Employeename> getMobileExists(@Param("mobile") Long mobile);
//      
	@Query(value = "select emp_code, emp_name from ecrop2024.cr_emp_profile a, ecrop2024.emp_rbk_map b where a.dcode=b.dcode and a.mcode=b.mcode and a.emp_code=b.empcode and b.rbkcode=:rbkcode and a.cr_dist_code=:wbdcode2 and a.cr_mand_code=:wbmcode2", nativeQuery = true)
	public List<EmployeeName> getEmpByRevenue(@Param("rbkcode") Integer rbkcode, @Param("wbdcode2") Integer wbdcode2,
			@Param("wbmcode2") Integer wbmcode2);
	
	@Query(value = "SELECT aadhaar_id, email, mobile, emp_code, emp_name FROM ecrop2024.cr_emp_profile WHERE dcode = :dcode AND mcode = :mcode AND emp_code =:empcode", nativeQuery = true)
	public List<EmployeeName> getEmpProfile(@Param("dcode") Integer dcode, @Param("mcode") Integer mcode, @Param("empcode") Integer empcode);
	
	 
			 @Query(value = "select coalesce (emp_name,' ') as emp_name  from ecrop2024.cr_emp_profile a, ecrop2024.emp_rbk_map b where a.emp_code=b.empcode and b.rbkcode=:rbkcode  and a.mcode=b.mcode and status='A' and b.mcode=:mcode", nativeQuery = true)
			 public String  getEmpName(int rbkcode,int mcode);

}