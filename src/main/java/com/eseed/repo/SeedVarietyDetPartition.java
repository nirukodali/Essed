package com.eseed.repo;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.eseed.entity.SeedVarietyDetModel;

@Repository
public class SeedVarietyDetPartition {

	@PersistenceContext
	private EntityManager entityManager;

	
	public List<SeedVarietyDetModel> getSeedVarietyDet(Integer cropyear1, String dcode, String season, String active ) {
		// TODO Auto-generated method stub
		
		 System.out.println("cropyear: " + cropyear1);
		    System.out.println("dcode: " + dcode);
		    System.out.println("season: " + season);
		    System.out.println("active: " + active);

        String    sql = "select distinct p.name as Productname,sub.name as subproductname,v.varietycode as  varietycode,v.name as varietyname from product_price pp inner join varietymast v on "
        		+ " pp.varietycode=v.varietycode inner join "
        		+ "subproductmast sub on v.subproductcode=sub.subproductcode inner join productmast p on v.productcode=p.productcode  where p.active= ?"
        		+ "and cropyear=? and season= ?  group by p.name,sub.name,v.varietycode,v.name order by p.name,sub.name,v.varietycode,v.name";
     
		System.out.println("qry---------> "+sql);

		Query insertQuery = (Query) entityManager.createNativeQuery(sql);
		insertQuery.setParameter(1, active);
		insertQuery.setParameter(2, cropyear1);
		insertQuery.setParameter(3, season);

		
		System.out.println("insertQuery=>"+insertQuery);
		List<Object[]> detailsEntities1 = insertQuery.getResultList();
		System.out.println("detailsEntities=>"+detailsEntities1.size());
		
		List<SeedVarietyDetModel> list = new ArrayList<SeedVarietyDetModel>();
		
		for(Object[] row: detailsEntities1) {
			SeedVarietyDetModel seedVarietyDetmodel = new SeedVarietyDetModel();
			seedVarietyDetmodel.setProductname((String)row[0].toString());
			seedVarietyDetmodel.setSubproductname((String)row[1].toString());
			seedVarietyDetmodel.setVarietycode((String)row[2].toString());
			seedVarietyDetmodel.setVarietyname((String)row[3].toString());
			
			list.add(seedVarietyDetmodel);
		}

	    		return list;
	
	}

	

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
