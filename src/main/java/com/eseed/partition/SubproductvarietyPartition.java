package com.eseed.partition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.eseed.entity.Subproductvariety;

@Component
public class SubproductvarietyPartition {
	@PersistenceContext
	private EntityManager entityManager;

	public List<Subproductvariety> subproduct(String subProductCode) {

		String tableName;
		tableName = "varietymast";
		System.out.println("tableName---------------->" + tableName);
		String qry = " SELECT name,varietycode,units,active FROM "+ tableName +"  WHERE subproductcode='" + subProductCode + "' ";

		List<Subproductvariety> data = new ArrayList<>();
		Query sql = (Query) entityManager.createNativeQuery(qry);

		List<Object> objects = sql.getResultList();
		System.out.println(qry);

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				Subproductvariety pojos = new Subproductvariety();

				pojos.setName((String) row[0]);
				pojos.setVarietycode((String) row[1]);
				pojos.setUnits((String) row[2]);
				pojos.setActive(((Character) row[3]).toString());
				data.add(pojos);
			}
		}
		return data;

	}

}
