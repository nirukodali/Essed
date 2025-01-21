package com.eseed.partition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.eseed.entity.SeedNamesReport;

@Component
public class SeedNamesReportPartition {
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<SeedNamesReport> seedname(String productCode,String subproductCode){
			//,String varietyCode){
		
		String tableName;
		tableName = "varietymast_v";
		System.out.println("tableName---------------->" + tableName);
		String qry = " select productcode,productname,subproductname,varietyname,units,farmertype,\r\n"
				+ " active,groupcode,subproductcode,varietycode from "+ tableName +" where \r\n"
				+ " productcode='"+ productCode +"' and subproductcode='"+ subproductCode+"' and active='A'";
		//and varietycode='"+ varietyCode +"' ";

		List<SeedNamesReport> data = new ArrayList<>();
		Query sql = (Query) entityManager.createNativeQuery(qry);

		List<Object> objects = sql.getResultList();
		System.out.println(qry);

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				SeedNamesReport pojos = new SeedNamesReport();

				pojos.setProductcode((String) row[0]);
				pojos.setProductname((String) row[1]);
				pojos.setSubproductname((String) row[2]);
				pojos.setVarietyname((String) row[3]);
				pojos.setUnits((String) row[4]);
				pojos.setFarmertype(((Short) row[5]));
				pojos.setActive((Character) row[6]);
				pojos.setGroupcode((Integer) row[7]);
				pojos.setSubproductcode((String) row[8]);
				pojos.setVarietycode((String) row[9]);

				data.add(pojos);
			}
		}
		return data;

	}

}
