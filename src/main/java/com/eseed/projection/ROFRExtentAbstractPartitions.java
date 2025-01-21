package com.eseed.projection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.eseed.entity.DeptWise;
import com.eseed.entity.ROFRExtentAbstract;

@Repository
@Transactional
public class ROFRExtentAbstractPartitions {
	@PersistenceContext
	private EntityManager entityManager;

	public List<ROFRExtentAbstract> rofrextabstract(String cropyear) {

		String[] season = cropyear.split("@");
		String seasonType = season[0];
		Integer seasonYear = Integer.parseInt(season[1]);
		String part_key = "", sql = "", tab1 = "", tab2 = "";

		part_key = seasonType + seasonYear;

		if (seasonYear >= 2023 && !(seasonYear == 2023 && seasonType.equalsIgnoreCase("S"))) {
			tab1 = "ecrop" + seasonYear + "." + "cr_booking_nwb";
			tab2 = "ecrop" + seasonYear + "." + "rofr_"+seasonYear+"_new";
		} else {
			tab1 = "cr_booking_nwb";
			tab2 = "rofr_2023_new";
		}

		System.out.println("tab1---------------->" + tab1);
		System.out.println("tab2---------------->" + tab2);

		sql = " select wbedname,wbemname,cast(given as varchar),cast(round(ported,2) as varchar)as ported from (select cr_dist_code,cr_mand_code,\r\n"
				+ "sum(occupant_extent) as ported from " + tab1
				+ " where data_src='R' and cr_year=? and cr_season=? \r\n"
				+ "group by cr_dist_code,cr_mand_code) a, (select wbdcode,wbmcode,sum(extent) as given \r\n" + "from "
				+ tab2 + " group by wbdcode,wbmcode) b,(select distinct wbdcode,wbmcode,\r\n"
				+ "wbedname,wbemname from wbvillage_mst) c where cr_dist_code=b.wbdcode and cr_mand_code=b.wbmcode\r\n"
				+ "and c.wbdcode=b.wbdcode and c.wbmcode=b.wbmcode order by wbedname,wbemname ";

		Query sesnyr = (Query) entityManager.createNativeQuery(sql);
		sesnyr.setParameter(1, seasonYear);
		sesnyr.setParameter(2, seasonType);

		System.out.println("sesnyr=>" + sesnyr);
		List<Object[]> rofr = sesnyr.getResultList();

		List<ROFRExtentAbstract> entityDetails = new ArrayList<ROFRExtentAbstract>();

		for (Object[] row : rofr) {

			ROFRExtentAbstract entity = new ROFRExtentAbstract();

			entity.setWbedname((String) row[0]);
			entity.setWbemname((String) row[1]);
//			entity.setGiven((String) row[1]);
			entity.setPorted((String) row[2]);
			entityDetails.add(entity);
		}
		return entityDetails;
	}

}
