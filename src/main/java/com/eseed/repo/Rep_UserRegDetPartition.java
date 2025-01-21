package com.eseed.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.eseed.entity.Rep_UserRegDetModel;
import com.eseed.entity.SeedVarietyDetModel;

@Repository
public class Rep_UserRegDetPartition {

	@PersistenceContext
	private EntityManager entityManager;	
	
	public List<Rep_UserRegDetModel> getUserRegDet(String dcode, String mcode, String vcode ) {
		// TODO Auto-generated method stub
		
		String sql="";
		 System.out.println("dcode: " + dcode);
		    System.out.println("mcode: " + mcode);
		    System.out.println("vcode: " + vcode);
		   

            if(mcode!="" && vcode!=""){
            	sql = "select mandalname,villagename,name,userid,mobile_phone,mcode,village,dcode,sec_type from user_registration_vs_v  where   dcode=? and mcode=? and village=? and type_user='25'  ";
            
            }
            else if(mcode!="" && vcode==""){
                
            	sql = "select mandalname,villagename,name,userid,mobile_phone,mcode,village,dcode,sec_type from user_registration_vs_v  where   dcode=? and mcode=? and type_user='25' order by villagename ";
            	   
            } else if(mcode=="" && vcode==""){
                 //qry = "select dcode,mcode,vcode,cropcode,dt_close from crop_reopen_requests where dcode=? and mcode=? order by vcode ";
            	  sql = "select mandalname,villagename,name,userid,mobile_phone,mcode,village,dcode,sec_type from user_registration_vs_v  where dcode=? and  type_user='25' order by  mandalname,villagename  ";
            	
              }
		    
            Query insertQuery = (Query) entityManager.createNativeQuery(sql);  
            
            if (mcode != "" && vcode != "") {
                // When both mcode1 and vcode1 are non-zero
                insertQuery.setParameter(1, dcode);
                insertQuery.setParameter(2, mcode);
                insertQuery.setParameter(3, vcode);
            } else if (mcode != "" && vcode == "") {
                // When mcode1 is non-zero and vcode1 is zero
                insertQuery.setParameter(1, dcode);
                insertQuery.setParameter(2, mcode);
            } else if (mcode == "" && vcode == "") {
                // When both mcode1 and vcode1 are zero
                insertQuery.setParameter(1, dcode);
            }

		System.out.println("qry---------> "+sql);
		System.out.println("insertQuery=>"+insertQuery);
		List<Object[]> detailsEntities1 = insertQuery.getResultList();
		System.out.println("detailsEntities=>"+detailsEntities1.size());
		List<Rep_UserRegDetModel> list = new ArrayList<Rep_UserRegDetModel>();
		
		for(Object[] row: detailsEntities1) {
			Rep_UserRegDetModel userRegDet = new Rep_UserRegDetModel();
			userRegDet.setMandalname((String)row[0].toString());
			userRegDet.setVillagename((String)row[1].toString());
			userRegDet.setName((String)row[2].toString());
			userRegDet.setUserid((String)row[3].toString());
			userRegDet.setMobile_phone((String)row[4].toString());
//			System.out.println("mobileno:::" +userRegDet.setMobile_phone(String)row[4].toString());
			// Assuming row[4] contains the mobile number as an object
//			String mobilePhone = row[4].toString(); // Convert row[4] to String
//			userRegDet.setMobile_phone(mobilePhone); // Set the mobile phone using the setter
			// Print the value using System.out.println()
//			System.out.println("mobileno:::" + userRegDet.getMobile_phone()); // Assuming you have a getter for the mobile_phone field
			userRegDet.setMcode((String)row[5].toString());
			userRegDet.setVillage((String)row[6].toString());
			userRegDet.setDcode((String)row[7].toString());
			userRegDet.setSec_type((String)row[8].toString());
//			System.out.println("Sec_type:::" + userRegDet.getSec_type());

			list.add(userRegDet);
		}

	    		return list;
	
	}

	

}
