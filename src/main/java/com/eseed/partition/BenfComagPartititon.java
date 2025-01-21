package com.eseed.partition;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.eseed.entity.BenfComag;

@Component
public class BenfComagPartititon {
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Transactional
	public String getDates(String season, String dcode, String cropyear) {
	    JSONObject responseJson = new JSONObject();
	    JSONArray startDatesArray = new JSONArray();

	    try {
	        // Query without CAST using positional parameters
	        String query = "SELECT startdate " +
	                       "FROM seasonstartdate " +
	                       "WHERE cropyear = ? " +
	                       "  AND season = ? " +
	                       "  AND dcode = ? " +
	                       "ORDER BY startdate";

	        // Create and execute SELECT query using positional parameters
	        Query selectQuery = entityManager.createNativeQuery(query);
	        selectQuery.setParameter(1, Short.parseShort(cropyear)); // First parameter (cropyear)
	        selectQuery.setParameter(2, season); // Second parameter (season)
	        selectQuery.setParameter(3, Short.parseShort(dcode)); // Third parameter (dcode)

	        List<Object> results = selectQuery.getResultList();

	        // If no records found, insert new record
	        if (results.isEmpty()) {
	            String insertQuery = "INSERT INTO seasonstartdate " +
	                                 "SELECT dcode, cropyear, season, MIN(ts::::date) AS startdate " +
	                                 "FROM ben_distribution " +
	                                 "WHERE cropyear = ? " +
	                                 "  AND season = ? " +
	                                 "  AND dcode = ? " +
	                                 "GROUP BY dcode, cropyear, season";

	            // Execute INSERT query using positional parameters
	            Query insertQueryExec = entityManager.createNativeQuery(insertQuery);
	            insertQueryExec.setParameter(1, Short.parseShort(cropyear)); // First parameter (cropyear)
	            insertQueryExec.setParameter(2, season); // Second parameter (season)
	            insertQueryExec.setParameter(3, Short.parseShort(dcode)); // Third parameter (dcode)
	            insertQueryExec.executeUpdate();

	            // Re-fetch the records after insert
	            results = selectQuery.getResultList();
	        }

	        // Process results into JSON format
	        for (Object result : results) {
	            Map<String, String> dateMap = new HashMap<>();
	            dateMap.put("startdate", result.toString());
	            startDatesArray.put(dateMap);
	        }

	        responseJson.put("seasonstartdate", startDatesArray);
	    } catch (Exception e) {
	        throw new RuntimeException("Error fetching dates", e);
	    }

	    return responseJson.toString();
	}
//================================================================================================================//
	public List<BenfComag> benfcomag(String cropyear, String dcode, String mcode, String prdcode,
			String subcode, String varietyCode) {
		
		System.out.println("cropyear====>" + cropyear);
		System.out.println("dcode====>" + dcode);
		System.out.println("mcode====>" + mcode);
		System.out.println("prdcode====>" + prdcode);
		System.out.println("subcode====>" + subcode);
		System.out.println("varietyCode====>" + varietyCode);
		
		
		Query sql = null;
		List<BenfComag> data = null;
		List<Object> objects = null;
		
		String[] season = cropyear.split("@");
		String seasonType = season[0];                       System.out.println("seasonType====>" + seasonType);
		Integer seasonYear = Integer.parseInt(season[1]);    System.out.println("seasonYear====>" + seasonYear);

		String tableName;
		tableName = "all_farmers_list_v";
		System.out.println("tableName---------------->" + tableName);
		if (dcode != null) {
			if (mcode == null || mcode.isEmpty()) {
				if (!"".equals(varietyCode) && varietyCode != null) {

					String qry = " select dname,mname,vname,seedvariety,farmername,fathername,dcode,mcode,"
							+ "socialstatus,mobileno,vcode,varietycode,totextent,status,qty_recd,qty_kgs from"
							+ tableName + " where dcode=? and varietycode=? and cropyear=? "
							+ "and season=?  order by mname,vname,varietycode ";

					data = new ArrayList<>();
					sql = (Query) entityManager.createNativeQuery(qry);
					sql.setParameter(1, Integer.parseInt(dcode));
					sql.setParameter(2, varietyCode.trim());
					sql.setParameter(3, seasonYear);
					sql.setParameter(4, seasonType);

				} else {

					String qry = " select dname,mname,vname,seedvariety,farmername,fathername,dcode,mcode,"
							+ "socialstatus,mobileno,vcode,varietycode,totextent,status,qty_recd,qty_kgs from "
							+ tableName + " where dcode=?  and cropyear=? "
							+ "and season=?  order by mname,vname,varietycode ";

					data = new ArrayList<>();
					sql = (Query) entityManager.createNativeQuery(qry);
					sql.setParameter(1, Integer.parseInt(dcode));
					sql.setParameter(2, seasonYear);
					sql.setParameter(3, seasonType);
				}
			} else if (mcode != null && !mcode.isEmpty()) {
				if (!"".equals(varietyCode) && varietyCode != null) {
					String qry = " select dname,mname,vname,seedvariety,farmername,fathername,dcode,mcode,"
							+ "socialstatus,mobileno,vcode,varietycode,totextent,status,qty_recd,qty_kgs from "
							+ tableName + " where dcode=?  and mcode=? and varietycode=? and cropyear=? "
							+ "and season=?  order by mname,vname,varietycode ";

					data = new ArrayList<>();
					sql = (Query) entityManager.createNativeQuery(qry);
					sql.setParameter(1, Integer.parseInt(dcode));
					sql.setParameter(2, Integer.parseInt(mcode));
					sql.setParameter(3, varietyCode.trim());
					sql.setParameter(4, seasonYear);
					sql.setParameter(5, seasonType);//

				} else if ("".equals(varietyCode) && varietyCode == null) {
					String qry = " select dname,mname,vname,seedvariety,farmername,fathername,dcode,mcode,"
							+ "socialstatus,mobileno,vcode,varietycode,totextent,status,qty_recd,qty_kgs  from "
							+ tableName + " where dcode=? and mcode=?  and cropyear=? "
							+ "and season=?  order by mname,vname,varietycode ";

					data = new ArrayList<>();
					sql = (Query) entityManager.createNativeQuery(qry);
					sql.setParameter(1, Integer.parseInt(dcode));
					sql.setParameter(2, Integer.parseInt(mcode));
					sql.setParameter(3, seasonYear);
					sql.setParameter(4, seasonType);
					//
				}
			}
		} else if (season != null && dcode.isEmpty()) {
			if (!"".equals(varietyCode) && varietyCode != null && season != null) {
				String qry = " select dname,mname,vname,seedvariety,farmername,fathername,dcode,mcode,"
						+ "socialstatus,mobileno,vcode,varietycode,totextent,status,qty_recd,qty_kgs from "
						+ tableName + " where varietycode=?  and cropyear=? "
						+ "and season=?  order by mname,vname,varietycode ";

				data = new ArrayList<>();
				sql = (Query) entityManager.createNativeQuery(qry);
				sql.setParameter(1, varietyCode.trim());
				sql.setParameter(2, seasonYear);
				sql.setParameter(3, seasonType);
			} else {
				String qry = " select dname,mname,vname,seedvariety,farmername,fathername,dcode,mcode,"
						+ "socialstatus,mobileno,vcode,varietycode,totextent,status,qty_recd,qty_kgs from "
						+ tableName + " where  cropyear=? and season=?  order by mname,vname,varietycode ";

				data = new ArrayList<>();
				sql = (Query) entityManager.createNativeQuery(qry);
				sql.setParameter(1, seasonYear);
				sql.setParameter(2, seasonType);

			}

		}
		// qry.setParameter(4, seedvariety);
		objects = sql.getResultList();
		// System.out.println(qry);

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				BenfComag pojos = new BenfComag();

				pojos.setDname((String) row[0]);
				pojos.setMname((String) row[1]);
				pojos.setVname((String) row[2]);
				pojos.setSeedvariety((String) row[3]);
				pojos.setFarmername((String) row[4]);
				pojos.setFathername((String) row[5]);
				pojos.setDcode((Integer) row[6]);
				pojos.setMcode((Integer) row[7]);
				pojos.setSocialstatus((String) row[8]);
				pojos.setMobileno((String) row[9]);
				pojos.setVcode((Integer) row[10]);
				pojos.setVarietycode((String) row[11]);
				pojos.setTotextent(((BigDecimal) row[12]).intValue());
				pojos.setStatus((Character) row[13]);
				pojos.setQty_recd(Long.valueOf(row[14].toString()));
				pojos.setQty_kgs((Double) row[15]);
				data.add(pojos);
			}
		}
		return data;

	}
}
