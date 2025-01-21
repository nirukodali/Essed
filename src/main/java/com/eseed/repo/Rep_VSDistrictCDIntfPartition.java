package com.eseed.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.eseed.entity.Rep_VSDistrictCDIntfModel;
import com.eseed.entity.SeedVarietyDetModel;

@Repository

public class Rep_VSDistrictCDIntfPartition {

	@PersistenceContext
	private EntityManager entityManager;	
	
	public List<Rep_VSDistrictCDIntfModel> VSDistrictCDDet(Integer cropyear1, String season ) {
		// TODO Auto-generated method stub
		
		 System.out.println("cropyear: " + cropyear1);
		 System.out.println("season: " + season);

		   
		 
        String sql = "select dcode,mcode,vcode,dname,mname,vname,cname,coalesce(address,'') as address from cluster_details_v "
        		+ "where cropyear=? and season=? order by dname,mname,cname";
     
		System.out.println("qry---------> "+sql);

		Query insertQuery = (Query) entityManager.createNativeQuery(sql);
		insertQuery.setParameter(1, cropyear1);
		insertQuery.setParameter(2, season);
		

		System.out.println("insertQuery=>"+insertQuery);
		List<Object[]> detailsEntities1 = insertQuery.getResultList();
		System.out.println("detailsEntities=>"+detailsEntities1.size());
		
		List<Rep_VSDistrictCDIntfModel> list = new ArrayList<Rep_VSDistrictCDIntfModel>();
		
		for(Object[] row: detailsEntities1) {
			Rep_VSDistrictCDIntfModel vsdistrictCDmodel = new Rep_VSDistrictCDIntfModel();
			vsdistrictCDmodel.setDcode((String)row[0].toString());
			vsdistrictCDmodel.setMcode((String)row[1].toString());
			vsdistrictCDmodel.setVcode((String)row[2].toString());
			vsdistrictCDmodel.setDname((String)row[3].toString());
			vsdistrictCDmodel.setMname((String)row[4].toString());
			vsdistrictCDmodel.setVname((String)row[5].toString());
			vsdistrictCDmodel.setCname((String)row[6].toString());
			vsdistrictCDmodel.setAddress((String)row[7].toString());
			
			list.add(vsdistrictCDmodel);
		}

	    		return list;
	
	}
	
	
	
	
}
