package com.eseed.repo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.eseed.dto.StandardsQty;
import com.eseed.entity.ReplicationEntity;

@Component
public class replicationrepo {
	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public List<ReplicationEntity> Replicationseed(int dcode) {
		System.out.println("dcode: " + dcode);

		String qry = "select concat(a.name,' ',b.name)as varietyname ,season,cropyear,product_price,subsidy_amt,nonsubsidy_amt,fromdate,todate,p.active,p.varietycode,dcode from \r\n"
				+ "product_price p join varietymast b on p.varietycode=b.varietycode join subproductmast a on a.subproductcode=b.subproductcode\r\n"
				+ "where p.active='A' and dcode=" + dcode + "";

		List<ReplicationEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				ReplicationEntity pojos = new ReplicationEntity();
				pojos.setVarietyname((String) row[0]);
				pojos.setSeason((Character) row[1]);
				pojos.setCropyear((Integer) row[2]);
				pojos.setProductprice((Double) row[3]);
				pojos.setSubsidy_amt((Double) row[4]);
				pojos.setNonsubsidy_amt((Double) row[5]);
				pojos.setFromdate((Date) row[6]);
				pojos.setTodate((Date) row[7]);
				pojos.setActive((Character) row[8]);
				pojos.setVarietycode((String) row[9]);
				pojos.setDcode((Integer) row[10]);
				data.add(pojos);
			}
		}
		return data;
	}

	@Transactional
	public List<StandardsQty> getStandardsQtyData(Integer dcode, String varietycode, Character season,
			Integer cropyear) {

		String qry = "SELECT from_extent, to_extent, no_bags_allowed, fromdate, todate, dcode, varietycode, season, cropyear "
				+ "FROM standards_qty WHERE dcode = ?1 AND varietycode = ?2 AND season = ?3 AND cropyear = ?4";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, dcode);
		sql.setParameter(2, varietycode);
		sql.setParameter(3, season);
		sql.setParameter(4, cropyear);
		List<StandardsQty> data = new ArrayList<>();

		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {
			for (Object patta : objects) {
				Object[] row = (Object[]) patta;

				StandardsQty pojos = new StandardsQty();
				pojos.setFrom_extent((Double) row[0]);
				pojos.setTo_extent((Double) row[1]);
				pojos.setNo_bags_allowed((Integer) row[2]);
				pojos.setFromdate((Date) row[3]);
				pojos.setTodate((Date) row[4]);
				pojos.setDcode((Integer) row[5]);
				pojos.setVarietycode((String) row[6]);
				pojos.setSeason((Character) row[7]);
				pojos.setCropyear((Integer) row[8]);
				data.add(pojos);
			}
		}
		return data;

	}

	@Transactional
	public List<StandardsQty> getDistrictsData(Integer dcode, String varietycode, Character season, Integer cropyear) {

		String qry = "select dname,dcode from district_2011_cs where dcode !=? and  dcode not in \r\n"
				+ "(select distinct dcode from standards_qty where varietycode=? and cropyear=? and season=? and  \r\n"
				+ "(varietycode,cropyear,season) in (select varietycode,cropyear,season from product_price where active='A')) ";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, dcode);
		sql.setParameter(2, varietycode);
		sql.setParameter(4, season);
		sql.setParameter(3, cropyear);
		List<StandardsQty> data = new ArrayList<>();

		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {
			for (Object patta : objects) {
				Object[] row = (Object[]) patta;

				StandardsQty pojos = new StandardsQty();
				pojos.setDname(row[0].toString());
				pojos.setDcode((Integer) row[1]);
				data.add(pojos);
			}
		}
		return data;

	}

	@Transactional
	public int insertStandardsQty(List<Integer> dcode, String varietycode, Integer cropyear, String season,
			Integer repdcode) {

		String qry = "INSERT INTO standards_qty (varietycode, from_extent, to_extent, no_bags_allowed, quantityperbag, fromdate, todate, "
				+ "season, cropyear, dcode) SELECT varietycode, from_extent, to_extent, no_bags_allowed, quantityperbag, fromdate, todate, "
				+ "season, cropyear, ? FROM standards_qty WHERE varietycode=? AND dcode=? AND season=? AND cropyear=?";

		for (int i = 0; i < dcode.size(); i++) {
			Query sql = entityManager.createNativeQuery(qry);
			sql.setParameter(1, dcode.get(i));
			sql.setParameter(2, varietycode);
			sql.setParameter(3, repdcode);
			sql.setParameter(4, season);
			sql.setParameter(5, cropyear);
			sql.executeUpdate();
		}

		return 1;
	}

	@Transactional
	public int replicatedStandards(String user, List<Integer> dcode, String status, String ipAddress, String role) {

		String qry = "insert into tracerweb (username,affecteduser,status,clientip,role) values (?,?,?,?,?)";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, user);
		sql.setParameter(2, dcode + "");
		sql.setParameter(3, status);
		sql.setParameter(4, ipAddress);
		sql.setParameter(5, role);
		sql.executeUpdate();

		return 1;
	}

}
