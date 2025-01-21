package com.eseed.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public class EseedusReportServiceImpl {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Transactional
	public String getDates(String season, String dcode, String cropyear) {
		JSONObject responseJson = new JSONObject();
		JSONArray startDatesArray = new JSONArray();

		try {
			// Query without CAST using positional parameters
			String query = "SELECT startdate " + "FROM seasonstartdate " + "WHERE cropyear = ? " + "  AND season = ? "
					+ "  AND dcode = ? " + "ORDER BY startdate";

			// Create and execute SELECT query using positional parameters
			Query selectQuery = entityManager.createNativeQuery(query);
			selectQuery.setParameter(1, Short.parseShort(cropyear)); // First parameter (cropyear)
			selectQuery.setParameter(2, season); // Second parameter (season)
			selectQuery.setParameter(3, Short.parseShort(dcode)); // Third parameter (dcode)

			List<Object> results = selectQuery.getResultList();

			// If no records found, insert new record
			if (results.isEmpty()) {
				String insertQuery = "INSERT INTO seasonstartdate "
						+ "SELECT dcode, cropyear, season, MIN(ts::::date) AS startdate " + "FROM ben_distribution "
						+ "WHERE cropyear = ? " + "  AND season = ? " + "  AND dcode = ? "
						+ "GROUP BY dcode, cropyear, season";

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

}
