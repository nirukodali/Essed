package com.eseed.partition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.eseed.entity.StateWiseIndent;

@Component
public class StateWiseIndentPartition {
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<StateWiseIndent> stateindent(String cropyear,String subproductCode){
		String[] season = cropyear.split("@");System.out.println("cropyear"+cropyear);
		String seasonType = season[0];System.out.println("seasonType===="+seasonType);
		Integer seasonYear = Integer.parseInt(season[1]);System.out.println("seasonYear"+seasonYear);

		String tableName;
		tableName = "ben_distribution";
		System.out.println("tableName---------------->" + tableName);
		String qry = " SELECT  x1.dname, x1.name,COALESCE(x1.quantity,0) AS quantity,x1.allocatedfarmers,\r\n"
				+ "COALESCE(x1.qtyallocated,0) AS qtyallocated,x1.paidfarmers,COALESCE(x1.qtylifted,0) AS qtylifted,\r\n"
				+ "COALESCE(x1.nonsubsidyamt,0) AS nonsubsidyamt,x1.farmerslifted,\r\n"
				+ "COALESCE(x1.paidfarmersqty,0) AS paidfarmersqty,COALESCE(x1.subsidyamt,0) AS subsidyamt,\r\n"
				+ "COALESCE(x1.amountpaid,0) AS amountpaid,x1.season, x1.cropyear,x1.dcode,x1.subproductcode,\r\n"
				+ "x1.productcode  FROM (SELECT a.cropyear, a.season, v.dcode, v.dname,s.name, t.quantity,\r\n"
				+ "a.allocatedfarmers, a.qtyallocated,a.paidfarmers,a.farmerslifted,a.qtylifted,a.nonsubsidyamt,\r\n"
				+ "a.subsidyamt, a.amountpaid,a.paidfarmersqty,s.subproductcode,s.productcode FROM \r\n"
				+ "(SELECT ben_distribution.dcode, ben_distribution.seedname,count(ben_distribution.transactionid) AS allocatedfarmers,\r\n"
				+ "sum(ben_distribution.qty_recd) AS qtyallocated, count(ben_distribution.transactionid) FILTER \r\n"
				+ "(WHERE ben_distribution.status='R' OR ben_distribution.status = 'N' OR \r\n"
				+ "ben_distribution.status = '1') AS paidfarmers,  sum(ben_distribution.qty_recd)FILTER \r\n"
				+ "(WHERE ben_distribution.status = 'R' OR ben_distribution.status = 'N' OR\r\n"
				+ "ben_distribution.status = '1') AS paidfarmersqty, count(ben_distribution.transactionid) \r\n"
				+ "FILTER (WHERE ben_distribution.status = '1') AS farmerslifted,sum(ben_distribution.qty_recd) \r\n"
				+ "FILTER (WHERE ben_distribution.status = '1') AS qtylifted, sum(ben_distribution.payableamt) \r\n"
				+ "FILTER (WHERE ben_distribution.status = '1' OR ben_distribution.status = 'N' OR \r\n"
				+ "ben_distribution.status = 'R') AS nonsubsidyamt,  sum(ben_distribution.subsidyamt) FILTER \r\n"
				+ "(WHERE ben_distribution.status = '1') AS subsidyamt,sum(ben_distribution.collectedamount) \r\n"
				+ "FILTER (WHERE ben_distribution.status = '1' OR ben_distribution.status = 'R' OR \r\n"
				+ "ben_distribution.status = 'N') AS amountpaid,ben_distribution.cropyear, ben_distribution.season  \r\n"
				+ "FROM "+ tableName +" GROUP BY ben_distribution.dcode,  ben_distribution.seedname,ben_distribution.cropyear, \r\n"
				+ "ben_distribution.season order by ben_distribution.dcode) a, district_2011_cs v,  subproductmast s,(SELECT \r\n"
				+ "left(seedvariety,5),cropyear,season,dcode,sum(coalesce(quantity,0)) as quantity from district_indents \r\n"
				+ "where cropyear="+ seasonYear +" and season='"+ seasonType +"' and left(seedvariety,5)='"+ subproductCode+"' group by left(seedvariety,5),cropyear,\r\n"
				+ "season,dcode order by dcode)t WHERE a.dcode = v.dcode  AND a.dcode <> 999 AND \r\n"
				+ "a.seedname = s.subproductcode AND a.dcode = t.dcode  AND a.cropyear = t.cropyear \r\n"
				+ "AND a.season = t.season  and a.cropyear="+ seasonYear +" and a.season='"+ seasonType +"' and a.seedname='"+ subproductCode +"'   ORDER BY v.dname) x1   ";

		List<StateWiseIndent> data = new ArrayList<>();
		Query sql = (Query) entityManager.createNativeQuery(qry);

		List<Object> objects = sql.getResultList();
		System.out.println(qry);

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				StateWiseIndent pojos = new StateWiseIndent();

				pojos.setDname((String) row[0]);
				pojos.setName((String) row[1]);
				pojos.setQuantity((Number) row[2]);
				pojos.setAllocatedfarmers(Long.valueOf(row[3].toString()));
				pojos.setQtyallocated(Long.valueOf(row[4].toString()));
				
				pojos.setPaidfarmers(Long.valueOf(row[5].toString()));
				pojos.setQtylifted(Long.valueOf(row[6].toString()));
				pojos.setNonsubsidyamt((Double) row[7]);
				pojos.setFarmerslifted(Long.valueOf(row[8].toString()));
				pojos.setPaidfarmersqty(Long.valueOf(row[9].toString()));
				pojos.setSubsidyamt((Double) row[10]);
				pojos.setAmountpaid((Double) row[11]);
				pojos.setSeason((Character) row[12]);
				pojos.setCropyear((Integer) row[13]);
				pojos.setDcode((Integer) row[14]);
				pojos.setSubproductcode((String) row[15]);
				pojos.setProductcode((String) row[16]);
				data.add(pojos);
			}
		}
		return data;

	}

}
