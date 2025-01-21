package com.eseed.partition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.eseed.entity.Authenticationabstract;
import com.eseed.entity.Pricesreport;

@Component
public class AuthenticationabstractPartition {
	@PersistenceContext
	private EntityManager entityManager;

	public List<Authenticationabstract> getAuthReport(String cropyear ) {
		
System.out.println("cropyear==========="+cropyear);
		
		String[] season = cropyear.split("@");System.out.println("cropyear"+cropyear);
		String seasonType = season[0];System.out.println("seasonType===="+seasonType);
		Integer seasonYear = Integer.parseInt(season[1]);System.out.println("seasonYear"+seasonYear);

		String part_key = "",tab1,tab2;
		
		part_key = seasonType + seasonYear;
		
        	tab1 = "ben_distribution";
        	tab2 = "district_2011_cs";
       

		String qry = " select b.dname, count(*) filter ( where  CAST(authenticated_code AS int) in (1,2)) as  benf_auth, \r\n"
				+ " count(*) filter ( where  CAST(authenticated_code AS int) in (5,6)) as  family_auth, \r\n"
				+ " count(*) filter ( where   CAST(authenticated_code AS int) in (3,4)) as  vaa_auth,cropyear,season,b.dcode,status \r\n"
				+ " FROM "+ tab1 +" a, "+ tab2 +" b where cropyear="+ seasonYear +" and season='"+ seasonType +"'  and status='1' \r\n"
				+ " and b.dcode=a.dcode group by b.dname,cropyear,season,b.dcode,status order by b.dname  ";
		
		

		List<Authenticationabstract> data = new ArrayList<>();
		Query sql = (Query) entityManager.createNativeQuery(qry);

		List<Object> objects = sql.getResultList();
		System.out.println(qry);

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				Authenticationabstract pojos = new Authenticationabstract();

				pojos.setDname((String) row[0]);
				pojos.setBenf_auth(Long.valueOf(row[1].toString()));
				pojos.setFamily_auth(Long.valueOf(row[2].toString()));
				pojos.setVaa_auth(Long.valueOf(row[3].toString()));
				pojos.setCropyear((Integer) row[4]);
				pojos.setSeason((Character) row[5]);
				pojos.setDcode((Integer) row[6]);
				data.add(pojos);
			}
		}
		return data;

	}

}
