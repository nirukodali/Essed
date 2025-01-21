package com.eseed.partition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.eseed.entity.VSDistricttarget;

@Component
public class VSDistricttargetPartition {
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<VSDistricttarget> vsdis(String cropyear){
		System.out.println("cropyear==========="+cropyear);
		
		String[] season = cropyear.split("@");System.out.println("cropyear"+cropyear);
		String seasonType = season[0];System.out.println("seasonType===="+seasonType);
		Integer seasonYear = Integer.parseInt(season[1]);System.out.println("seasonYear"+seasonYear);

		String part_key = "",tableName;
		
		part_key = seasonType + seasonYear;
		
        	tableName = "targets_mao_dist_v";
       

		System.out.println("tableName---------------->" + tableName);
		String qry = " select dname,seedvarietyname,COALESCE(NULLIF(tottarget, 'NaN'), 0) AS tottarget,seedvariety,dcode from \r\n"
				+ " " + tableName +" where cropyear="+ seasonYear +" and season='"+ seasonType +"' order by dname,seedvariety ";
		
		

		List<VSDistricttarget> data = new ArrayList<>();
		Query sql = (Query) entityManager.createNativeQuery(qry);

		List<Object> objects = sql.getResultList();
		System.out.println(qry);

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				VSDistricttarget pojos = new VSDistricttarget();

				pojos.setDname( (String) row[0]);
				pojos.setSeedvarietyname((String) row[1]);
//				pojos.setTottarget(((BigDecimal) row[2]).intValue());

				pojos.setTottarget((Number) row[2]);
				data.add(pojos);
			}
		}
		return data;

	}

}
