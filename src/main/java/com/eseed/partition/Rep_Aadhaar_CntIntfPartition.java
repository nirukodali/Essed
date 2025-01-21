package com.eseed.partition;
import javax.persistence.Query;

import java.util.List;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.eseed.entity.Rep_Aadhaar_CntIntf;

@Repository
@Transactional

public class Rep_Aadhaar_CntIntfPartition {
	@PersistenceContext
	private EntityManager entityManager;

	public List<Rep_Aadhaar_CntIntf> getAadharCount( ) {
		
//		System.err.println("wbdcode===========>"+wbdcode);
//		String[] season = cropyear.split("@");
//		String cseason = season[0];
//		Integer Year = Integer.parseInt(season[1]);

		String part_key = "",part_key1="";
		
//		if (Integer.parseInt(wbdcode) > 9) {
//			part_key = cseason + wbdcode + Year;
//			System.out.println("part_key==========>"+part_key);
//		} else {
//			part_key = cseason + "0" + wbdcode + Year; 
//			System.out.println("part_key==========>"+part_key);
//		}
	       
//		String tableName="";
//		if (Year >= 2023) {   
//			   tableName ="ecrop" + Year + "." +"bookings"  ;
//		}else {
//			   tableName ="ecrop" + Year + "." +"bookings"  ;	
//		}
//		System.out.println("tableName---------------->" + tableName);
//        
     
		

		String Sql = "  SELECT b.dname, count(*) count from user_registration a,district_2011_cs b where   "
				+ "LENGTH(CAST(aadhaar_id AS TEXT)) = 12  and status='A'  and type_user='25' and dcode <> 999 \r\n"
				+ " and a.district = cast(b.dcode as varchar) group by dname order by dname ";

		Query insertQuery = (Query) entityManager.createNativeQuery(Sql);
		
		//insertQuery.setParameter(1, Integer.parseInt(wbdcode)); 
		//insertQuery.setParameter(2, Integer.parseInt(wbmcode)); 
		//insertQuery.setParameter(3, Integer.parseInt(wbvcode)); 
		
		
	
		List<Object[]> detailsEntities1 = insertQuery.getResultList();
		System.out.println("detailsEntities1=>"+detailsEntities1.size());
		//System.out.println("detailsEntities1=>"+detailsEntities1.toString());
		List<Rep_Aadhaar_CntIntf> detailsEntities = new ArrayList<Rep_Aadhaar_CntIntf>();
		

		for (Object[] row : detailsEntities1) {

			Rep_Aadhaar_CntIntf entity = new Rep_Aadhaar_CntIntf();
			
			
			entity.setDname((String) row[0]);
			entity.setCount(new BigDecimal((BigInteger) row[1]));

			
			detailsEntities.add(entity);
	
		}
		
		return detailsEntities;

	

	}

}
