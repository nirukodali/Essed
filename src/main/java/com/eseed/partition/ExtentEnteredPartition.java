package com.eseed.partition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.eseed.entity.ExtentEntered;

@Repository
@Transactional

public class ExtentEnteredPartition {
	@PersistenceContext
	private EntityManager entityManager;

	public List<ExtentEntered> getext( ) {

		String Sql = " select wbedname,context from contingency_distwise_v order by wbedname ";

		Query insertQuery = (Query) entityManager.createNativeQuery(Sql);
	
		List<Object[]> detailsEntities1 = insertQuery.getResultList();
		System.out.println("detailsEntities1=>"+detailsEntities1.size());
		List<ExtentEntered> detailsEntities = new ArrayList<ExtentEntered>();
		

		for (Object[] row : detailsEntities1) {

			ExtentEntered entity = new ExtentEntered();
			
			
			entity.setWbedname((String) row[0]);
			entity.setContext((Number) row[1]);

			
			detailsEntities.add(entity);
	
		}
		
		return detailsEntities;

	

	}
	}
