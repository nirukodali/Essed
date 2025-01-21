package com.eseed.partition;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Query;

import java.util.List;

import java.util.ArrayList;
import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.eseed.entity.OfficerAuthenticatedFarmeList;

@Repository
@Transactional
public class OfficerAuthenticatedFarmeListPartition {
	@PersistenceContext
	private EntityManager entityManager;

	public List<OfficerAuthenticatedFarmeList> getAuthenticationFarmList(String cropyear, String mcode,
			String seedvariety) {
		System.err.println("mcode===========>" + mcode + "seedvariety" + seedvariety);

		// Split cropyear into season and year
		String[] season = cropyear.split("@");
		String cseason = season[0];
		Integer year = Integer.parseInt(season[1]);

		// Construct table name
		// String tableName = cseason + "_" + year + "_ben_distribution";
		String tableName = "ben_distribution";
		System.out.println("tableName---------------->" + tableName);

		// SQL query with placeholders
		String sql = "SELECT subsidyamt, collectedamount, seedvariety, transactionid, farmername, issueduserid, "
				+ "qty_recd AS issuedbags,TO_CHAR(dt_issue, 'DD/MM/YYYY') AS dt_issue, status, socialstatus, mobileno, username, authenticated_code, ts, "
				+ "cropyear, season, dcode, mcode " + "FROM " + tableName + " "
				+ "WHERE cropyear = ? AND season = ? AND CAST(mcode AS int) = ? "
				+ "AND status = '1' AND seedvariety = ? " + "AND CAST(authenticated_code AS int) IN (3, 4) "
				+ "ORDER BY username, seedvariety, ts";
		
		// Create and set query parameters
		Query query = entityManager.createNativeQuery(sql);
		query.setParameter(1, year);
		query.setParameter(2, cseason);
		query.setParameter(3, Integer.parseInt(mcode));
		query.setParameter(4, seedvariety);
		System.err.println("sql====>" + sql);

		// Execute query and process results
		List<Object[]> detailsEntities1 = query.getResultList();

		System.out.println("detailsEntities1=>" + detailsEntities1.size());

		List<OfficerAuthenticatedFarmeList> detailsEntities = new ArrayList<>();

		for (Object[] row : detailsEntities1) {
			OfficerAuthenticatedFarmeList entity = new OfficerAuthenticatedFarmeList();

//            <th> <b> S.No. </b> </th>
//            <th> <b> Crop Name </b> </th>
//            <th> <b> Seed Name </b> </th>
//            <th> <b> Name of the Farmer </b> </th>  ----------- setFarmername
//            <th> <b> Dt.of Allocation </b> </th> -------- setDt_issue
//            <th> <b> Quantity Issued<br/>(in Bags) </b> </th>   ----------- issued bags 
//            <th> <b> Full Cost </b> </th>  ------------ setSubsidyamt + setCollectedamount
//            <th> <b> Subsidy<br> Amount</b> </th>  ---------- setSubsidyamt
//            <th> <b> Allocated Userid<br>Issued Userid</b> </th>  ---------- setUsername
//            <th> <b> Authentication Type</b> </th> 
//            <th> <b> OTP Mobile No.</b> </th> ---------- setMobileno
//            <th><b>Time Stamp</b></th> ---------- setTs

			entity.setSubsidyamt((Double) row[0]);
			entity.setCollectedamount((Double) row[1]);
			entity.setTransactionid(((Number) row[3]).intValue());
			entity.setFarmername((String) row[4]);
			entity.setIssueduserid((String) row[5]);
			entity.setIssuedbags(((Number) row[6]).intValue());
			entity.setDt_issue(((String) row[7]).toString());
			entity.setStatus(((Character) row[8]).toString());
			entity.setSocialstatus((String) row[9]);
			entity.setMobileno((String) row[10]);
			entity.setUsername((String) row[11]);
			entity.setAuthenticated_code(((Character) row[12]).toString());
			entity.setTs((Timestamp) row[13]);
			entity.setCropyear(((Number) row[14]).intValue());
			entity.setSeason(((Character) row[15]).toString());
			entity.setDcode(((Number) row[16]).intValue());
			entity.setMcode(((Number) row[17]).intValue());

			
			if (row[2] != null) {
			    String sql1 = "SELECT name AS seedname FROM varietymast WHERE varietycode = ?";
			    Query qry = entityManager.createNativeQuery(sql1);//System.err.println("qry====>"+qry);
			    qry.setParameter(1, row[2].toString());

			    List<String> results = qry.getResultList();
			    if (results != null && !results.isEmpty()) {
			        // Use the first result or process all
			        String varietyName = results.get(0); // Assuming the first match is acceptable
			       // System.err.println("varietyName ========= >"+varietyName);
			        entity.setSeedvariety(varietyName);
			    } else {
			        // No results found
			        entity.setSeedvariety("");
			    }
			} else {
			    entity.setSeedvariety("");
			}
			
			if (row[2] != null) {
			    String sql1 = "SELECT substr(varietycode,1,5) as spcode FROM varietymast WHERE varietycode = ?";
			    Query qry = entityManager.createNativeQuery(sql1);System.err.println("qry====>"+qry);
			    qry.setParameter(1, row[2].toString());

			    List<String> results = qry.getResultList();
			    if (results != null && !results.isEmpty()) {
			        // Use the first result or process all
			        String spCode = results.get(0);
			        
			        String sql2 = "SELECT name FROM subproductmast  WHERE subproductcode=?";
				    Query qry1 = entityManager.createNativeQuery(sql2);
				   // System.err.println("qry1====>"+qry1);
				    qry1.setParameter(1, spCode);
				    
				    List<String> results1 = qry1.getResultList();
				    
				    if (results != null && !results.isEmpty()) {
				        // Use the first result or process all
				        String cropName = results1.get(0); // Assuming the first match is acceptable
				       // System.err.println("cropName ========= >"+cropName);
				        entity.setCropName(cropName);
				    } else {
				        // No results found
				    	entity.setCropName("");
				    }
			        
			        
			    } else {
			    	entity.setCropName("");
			    }
			} else {
				entity.setCropName("");
			}
			
			if (row[12] != null) {
			    String sql3 = "select description from authmast where authenticated_code=?";
			    Query qry3 = entityManager.createNativeQuery(sql3);
			    //System.err.println("qry====>"+qry3);
			    qry3.setParameter(1, ((Character) row[12]).toString());

			    List<String> results3 = qry3.getResultList();
			    if (results3 != null && !results3.isEmpty()) {
			        // Use the first result or process all
			        String authType = results3.get(0); // Assuming the first match is acceptable
			        //System.err.println("authType ========= >"+authType);
			        entity.setAuthType(authType);
			    } else {
			        // No results found
			        entity.setSeedvariety("");
			    }
			} else {
			    entity.setSeedvariety("");
			}
			
			

//
//            spname = util.MasterFunctions.MasterFunction(spcode, "subproductcode");

			detailsEntities.add(entity);
		}

		for (OfficerAuthenticatedFarmeList list : detailsEntities) {
			//System.out.println("seedvarietty" + list.getSeedvariety());
			// function
		}

		return detailsEntities;
	}
}
