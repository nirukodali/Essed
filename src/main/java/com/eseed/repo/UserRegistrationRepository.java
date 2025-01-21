package com.eseed.repo;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Component
public class UserRegistrationRepository {

	public UserRegistrationRepository() {

	}

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public int updateUserDetails(String incsts, Integer empcode, String emp_name, String email, String mobile,
			String aadhaar_id, String rbkuserid2) {
		String insertQry = "UPDATE user_registration set datetime=now(),regular_sts=?, emp_code=?, name=?, emailid=?, mobile_phone=?,aadhaar_id=?  WHERE userid=? ";
		Query sql = entityManager.createNativeQuery(insertQry);
		sql.setParameter(1, incsts);
		sql.setParameter(2, empcode);
		sql.setParameter(3, emp_name);
		sql.setParameter(4, email);
		sql.setParameter(5, mobile);
		sql.setParameter(6, aadhaar_id);
		sql.setParameter(7, rbkuserid2);
		int executeUpdate = sql.executeUpdate();
		return executeUpdate;

	}

	@Transactional
	public int updateUserDetails1(String incsts, Integer empcode, String emp_name, String email, String mobile,
			String aadhaar_id, String rbkuserid2) {
		String insertQry = "UPDATE user_registration set datetime=now(),regular_sts=?, emp_code=?, name=?, emailid=?, mobile_phone=?,aadhaar_id=?  WHERE userid=? ";
		Query sql = entityManager.createNativeQuery(insertQry);
		sql.setParameter(1, incsts);
		sql.setParameter(2, empcode);
		sql.setParameter(3, emp_name);
		sql.setParameter(4, email);
		sql.setParameter(5, mobile);
		sql.setParameter(6, aadhaar_id);
		sql.setParameter(7, rbkuserid2);
		int executeUpdate = sql.executeUpdate();
		return executeUpdate;

	}
	
	@Transactional
	public int UpdateUserDetails2(Integer empcode, String emp_name, String email, String mobile,
			String aadhaar_id, String rbkuserid2) {
		String insertQry = "UPDATE user_registration set datetime=now(), emp_code=?, name=?, emailid=?, mobile_phone=?,aadhaar_id=?  WHERE userid=? ";
		Query sql = entityManager.createNativeQuery(insertQry);
		sql.setParameter(1, empcode);
		sql.setParameter(2, emp_name);
		sql.setParameter(3, email);
		sql.setParameter(4, mobile);
		sql.setParameter(5, aadhaar_id);
		sql.setParameter(6, rbkuserid2);
		int executeUpdate = sql.executeUpdate();
		return executeUpdate;

	}

}
