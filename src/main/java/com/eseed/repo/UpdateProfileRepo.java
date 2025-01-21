package com.eseed.repo;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.eseed.entity.UpdateProfileEntity;
import com.eseed.entity.UserRegEntity;
import com.eseed.entity.User_registration;

@Component
public class UpdateProfileRepo {


	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public List<UpdateProfileEntity> getData(String userid) {
		String qry="select name,aadhaar_id as aadhaar,mobile_phone as mobile,emailid from user_registration where userid=:userid";
		 Query query = entityManager.createNativeQuery(qry);
	        query.setParameter("userid", userid);

	        List<Object[]> resultList = query.getResultList();
	        List<UpdateProfileEntity> profileList = new ArrayList<>();

	        for (Object[] result : resultList) {
	            UpdateProfileEntity profile = new UpdateProfileEntity();
	            profile.setName( result[0].toString());
	            profile.setAadhaar( result[1].toString());
	            profile.setMobile( result[2].toString());
	            profile.setEmailid( result[3].toString());

	            profileList.add(profile);
	        }

	        return profileList;
	}
	
	
@Transactional
public int userUpdationForVro(String name, String mobile, String email, String aadhaar, String userid,Integer role) {
	int executeUpdate=0;
	String   query ="UPDATE user_registration SET aadhaar_id=?,name=?,mobile_phone=?,emailid=?   WHERE userid =? and status='A' and usertype=? ";
 Query insertQuery = entityManager.createNativeQuery(query);
 insertQuery.setParameter(1, aadhaar);
 insertQuery.setParameter(2, name);
 insertQuery.setParameter(3, mobile);
 insertQuery.setParameter(4, email);
 insertQuery.setParameter(5, userid);
 insertQuery.setParameter(6, role);

 
 executeUpdate = insertQuery.executeUpdate();
	return executeUpdate;
}

@Transactional
public int insertIntoTraceWeb(String name, String userid, String role,HttpServletRequest httpRequest) {
	int executeUpdate=0;
		
String query ="insert into tracerweb (username,affecteduser,status,clientip,role) values (?,?,?,?,?) ";
  
 Query insertQuery = entityManager.createNativeQuery(query);
 insertQuery.setParameter(1, name);
 insertQuery.setParameter(2, userid);
 insertQuery.setParameter(3, "updated by self");
 insertQuery.setParameter(4, httpRequest.getRemoteAddr());
 insertQuery.setParameter(5, role);
 
 executeUpdate = insertQuery.executeUpdate();
	return executeUpdate;
}




}
