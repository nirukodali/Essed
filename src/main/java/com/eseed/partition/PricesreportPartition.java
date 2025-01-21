package com.eseed.partition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.eseed.entity.Pricesreport;

@Component
public class PricesreportPartition {
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Pricesreport> price(String cropyear,String varietyCode,String dcode){
System.out.println("cropyear==========="+cropyear);
		
		String[] season = cropyear.split("@");System.out.println("cropyear"+cropyear);
		String seasonType = season[0];System.out.println("seasonType===="+seasonType);
		Integer seasonYear = Integer.parseInt(season[1]);System.out.println("seasonYear"+seasonYear);

		String part_key = "",tableName;
		
		part_key = seasonType + seasonYear;
		
        	tableName = "product_price";
       

		System.out.println("tableName---------------->" + tableName);
		String qry = " SELECT product_price,subsidy_amt,nonsubsidy_amt,fromdate,todate,active,dcode,varietycode,\r\n"
				+ " productid,quantityperbag FROM "+ tableName +" WHERE cropyear="+ seasonYear +" \r\n"
				+ "and season='"+ seasonType +"' and varietycode='"+ varietyCode +"' and dcode='"+ dcode +"' ";
		
		

		List<Pricesreport> data = new ArrayList<>();
		Query sql = (Query) entityManager.createNativeQuery(qry);

		List<Object> objects = sql.getResultList();
		System.out.println(qry);

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				Pricesreport pojos = new Pricesreport();

				pojos.setProduct_price((Double) row[0]);
				pojos.setSubsidy_amt((Double) row[1]);
				pojos.setNonsubsidy_amt((Double) row[2]);
				pojos.setFromdate((Date) row[3]);
				pojos.setTodate((Date) row[4]);
				pojos.setActive((Character) row[5]);
//				pojos.setProductid((Integer) row[6]);
//				pojos.setQuantityperbag((Double) row[7]);
//				pojos.setDcode((Integer) row[8]);
//				pojos.setVarietycode((String) row[9]);
				data.add(pojos);
			}
		}
		return data;

	}
	}

