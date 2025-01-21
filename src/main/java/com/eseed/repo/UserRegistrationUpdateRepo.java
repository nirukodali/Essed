package com.eseed.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

import com.eseed.entity.UserRegEntity; 

@Component
public class UserRegistrationUpdateRepo {
	
	@javax.persistence.PersistenceContext
	private javax.persistence.EntityManager entityManager;
	
	@javax.transaction.Transactional
	public int updateUserReg(String newpassword, String username, String dcode) {
		String qry="update user_registration set retype_password=?, encpassword=? ,last_pwdupd_dt=now() where district=?  and userid=?";
	     Query   query =   entityManager.createNativeQuery(qry);
		query.setParameter(1, newpassword);
		query.setParameter(2, newpassword);
		query.setParameter(3, dcode);
		query.setParameter(4, username);
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
	
	@javax.transaction.Transactional
	public int updateUserRegDao(String newpassword, String username, String dcode) {
		System.out.println("--------->"+newpassword);
		System.out.println("--------->"+username);
		System.out.println("--------->"+dcode);
		String qry="update user_registration set retype_password=?, encpassword=? ,last_pwdupd_dt=now() where district=?  and userid=? and blockortehsil=?";
	     Query   query =   entityManager.createNativeQuery(qry);
		query.setParameter(1, newpassword);
		query.setParameter(2, newpassword);
		query.setParameter(3, dcode);
		query.setParameter(4, username);
		int executeUpdate = query.executeUpdate();
		return executeUpdate;
	}
	
	
	@Transactional
	public int insertTracerDao(String userid, String username, String dcode) {
		String qry="insert into tracerweb(username,status,affecteduser) values(?,?,?)";
	    Query query = entityManager.createNativeQuery(qry);
		query.setParameter(1, userid);
		query.setParameter(2, "Password Reset by MAO");
		query.setParameter(3, username);
		int executeUpdate = query.executeUpdate();
		return executeUpdate;
	}
	
	
	@javax.transaction.Transactional
	public int updateUserRegMao(String newpassword, String username, String dcode,String mcode) {
		System.out.println("--------->"+newpassword);
		System.out.println("--------->"+username);
		System.out.println("--------->"+dcode);
		System.out.println("--------->"+mcode);
		String qry="update user_registration set retype_password=?, encpassword=? ,last_pwdupd_dt=now() where district=?  and userid=? and blockortehsil=?";
	     Query   query =   entityManager.createNativeQuery(qry);
		query.setParameter(1, newpassword);
		query.setParameter(2, newpassword);
		query.setParameter(3, dcode);
		query.setParameter(4, username);
		query.setParameter(5, mcode);
		int executeUpdate = query.executeUpdate();
		return executeUpdate;
	}
	
	
	@Transactional
	public int insertTracerMao(String userid, String username, String dcode,String mcode) {
		String qry="insert into tracerweb(username,status,affecteduser) values(?,?,?)";
	    Query query = entityManager.createNativeQuery(qry);
		query.setParameter(1, userid);
		query.setParameter(2, "Password Reset by MAO");
		query.setParameter(3, username);
		int executeUpdate = query.executeUpdate();
		return executeUpdate;
	}
	
	
	
	public List<Map<String, Object>> getUsersByDistrictCode(String dcode) {
        // Native SQL query
        String queryStr = "SELECT district, mandal, userid, type_user, aadhaar_id, mobile_phone, emailid,   TO_CHAR(regdate, 'DD-MM-YYYY')  AS regdate " +
                          "FROM user_registration_v WHERE dcode = :dcode";

        // Create the query and set the parameter
        Query query = entityManager.createNativeQuery(queryStr);
        query.setParameter("dcode", Integer.parseInt(dcode));

        // Execute the query and get the result
        List<Object[]> resultList = query.getResultList();

        // Create a list of maps to store the result in key-value pairs (column name -> value)
        List<Map<String, Object>> resultMaps = new ArrayList();

        // Column names to map result set
        String[] columnNames = {"district", "mandal", "userid", "type_user", "aadhaar_id", "mobile_phone", "emailid", "regdate"};

        // Convert each row into a map with column names as keys
        for (Object[] row : resultList) {
            Map<String, Object> rowMap = new HashMap();
            for (int i = 0; i < row.length; i++) {
                rowMap.put(columnNames[i], row[i]);
            }
            resultMaps.add(rowMap);
        }

        return resultMaps;
    }
}
