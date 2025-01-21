package com.eseed.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class RofrBookedExtentPartitions {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<RofrBookedExtent> rofrbext(String wbdcode, String wbmcode,String cropyear) {
		String[] season = cropyear.split("@");
		String seasonType = season[0];
		Integer seasonYear = Integer.parseInt(season[1]);
		
		String part_key = "";
		
			part_key = seasonType + seasonYear;
		
		String tableName = "";

		System.out.println("tableName---------------->" + tableName);
		
		
		if(seasonYear>=2023 && !(seasonYear==2023 && seasonType.equalsIgnoreCase("S"))) {
			tableName = "ecrop" + seasonYear + "." + "cr_data_src_det_mv_" + part_key;
		}
		else {
			tableName = "cr_data_src_det_mv_" + part_key;
		}
		
		

//		String Sql = " select bookingid,occupname as oc_name,occupfname as oc_fname,cr_sno,kh_no,tot_extent,"
//				+ "occupant_extent,COALESCE(mobileno, 0) as mobileno,cr_mand_code,mcode from " + tableName + "  where dcode=? and "
//				+ " mcode=?  and cr_year=? and cr_season=?  ";
		
		String sql="   SELECT wbevname, sum(web_farmers) as web_farmers,  sum(booked_web_ext)  as booked_web_ext,sum(web_ext)\r\n"
				+ "  as web_ext, sum(nweb_farmers) as nweb_farmers , sum(booked_nweb_ext)  as booked_nweb_ext,sum(nweb_ext) as nweb_ext ,\r\n"
				+ "  sum(ccrc_farmers) as ccrc_farmers, sum(booked_ccrc_ext)  as booked_ccrc_ext,sum(ccrc_ext)as ccrc_ext, sum(rofr_farmers)\r\n"
				+ "  as rofr_farmers, sum(booked_rofr_ext)  as booked_rofr_ext,sum(rofr_ext) as rofr_ext, sum(usus_farmers) as usus_farmers,\r\n"
				+ "  sum(booked_usus_ext)  as booked_usus_ext,sum(usus_ext) as usus_ext, wbdcode, wbedname,wbmcode,wbemname,wbvcode FROM "+tableName+"  where wbdcode=?\r\n"
				+ "  and wbmcode= ?  group by wbdcode, wbedname,wbmcode,wbemname,wbvcode,wbevname ORDER BY wbevname  ";

		Query sesnyr = (Query) entityManager.createNativeQuery(sql);
		sesnyr.setParameter(1, Integer.parseInt(wbdcode));
		sesnyr.setParameter(2, Integer.parseInt(wbmcode));
//		sesnyr.setParameter(3,  seasonYear);
//		sesnyr.setParameter(4, seasonType);
		System.out.println(sesnyr);
		
		//System.out.println("insertQuery=>"+insertQuery);
		List<Object[]> rofrData = sesnyr.getResultList();
		//System.out.println("detailsEntities1=>"+detailsEntities1.size());
		//System.out.println("detailsEntities1=>"+detailsEntities1.toString());
		List<RofrBookedExtent> entityDetails = new ArrayList<RofrBookedExtent>();
		

		for (Object[] row : rofrData) {

			RofrBookedExtent entity = new RofrBookedExtent();
			entity.setWbevname((String) row[0]);
			entity.setWeb_farmers(Long.valueOf(row[1].toString()));
			entity.setBooked_web_ext(((BigDecimal) row[2]));
			entity.setWeb_ext(((BigDecimal) row[3]));
			entity.setNweb_farmers(Long.valueOf(row[4].toString()));
			entity.setBooked_nweb_ext(((BigDecimal) row[5]));
			entity.setNweb_ext(((BigDecimal) row[6]));
			entity.setCcrc_farmers(Long.valueOf(row[7].toString()));
			entity.setBooked_ccrc_ext(((BigDecimal) row[8]));
			entity.setCcrc_ext(((BigDecimal) row[9]));
			entity.setRofr_farmers(Long.valueOf(row[10].toString()));
			entity.setBooked_rofr_ext(((BigDecimal) row[11]));
			entity.setRofr_ext(((BigDecimal) row[12]));
			entity.setUsus_farmers(Long.valueOf(row[13].toString()));
			entity.setBooked_usus_ext(((BigDecimal) row[14]));
			entity.setUsus_ext(((BigDecimal) row[15]));
			entityDetails.add(entity);

		}
		
		return entityDetails;

	}


	
	
	

}
