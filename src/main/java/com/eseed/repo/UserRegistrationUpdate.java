package com.eseed.repo;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;


@Component
public class UserRegistrationUpdate {
	
	@javax.persistence.PersistenceContext
	private javax.persistence.EntityManager entityManager;
	
	
	
	@Transactional
	public int updateUserReg(String newpassword, String username, String dcode) {
		String qry="update user_registration set retype_password=?, encpassword=? ,last_pwdupd_dt=now() where userid=?";
	     Query   query =   entityManager.createNativeQuery(qry);
		query.setParameter(1, newpassword);
		query.setParameter(2, newpassword);
		query.setParameter(3, username);
		int executeUpdate = query.executeUpdate();
		return executeUpdate;
	}
	
	@Transactional
	public int insertTracer(String userid, String username, String dcode) {
		String qry="insert into tracerweb(username,status,affecteduser) values(?,?,?)";
	    Query query = entityManager.createNativeQuery(qry);
		query.setParameter(1, userid);
		query.setParameter(2, "Password Reset by Admin");
		query.setParameter(3, username);
		int executeUpdate = query.executeUpdate();
		return executeUpdate;
	}
	

//	public String getDcodeByUserId(String userId) {
//	    // Print the user ID for debugging
//	    System.out.println("Looking up user ID: " + userId);
//
//	    // SQL query to fetch the district code
//	    String sql = " SELECT district FROM user_registration WHERE userid = ? ";
//
//	    try {
//	        // Execute the query and get the result
//	        String districtCode = (String) entityManager.createNativeQuery(sql)
//	                                                   .setParameter(1, userId)
//	                                                   .getSingleResult();
//
//	        // Return the district code
//	        System.out.println("District Code: " + districtCode);
//	        return districtCode;
//
//	    } catch (NoResultException e) {
//	        // Handle case when no result is found
//	        System.out.println("No district code found for user ID: " + userId);
//	        return null;  // or return some default value
//	    } catch (Exception e) {
//	        // Handle any other exceptions
//	        System.out.println("Error executing query: " + e.getMessage());
//	        e.printStackTrace();
//	        return null;
//	    }
	
}
