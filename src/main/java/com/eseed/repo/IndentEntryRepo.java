package com.eseed.repo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.eseed.dto.IndentEntryDto;
import com.eseed.entity.IndentEntity;

@Component
public class IndentEntryRepo {

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public String getLastLogin(String userid) {
		String qry = "select lastlogin_ts  from user_registration   where userid= :userid";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("userid", userid);

		List<Timestamp> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			Timestamp lastLoginTimestamp = results.get(0);

			// Format the Timestamp into a String (adjust the pattern as needed)
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.format(lastLoginTimestamp);
		}

		return null;
	}

	@Transactional
	public void updateLastLogin(String userid) {
		String qry = "update user_registration set LASTLOGIN_TS=now() where userid=:userid";

		int sql = entityManager.createNativeQuery(qry).setParameter("userid", userid).executeUpdate();

	}

	@Transactional
	public List<IndentEntity> indentProduct() {

		String qry = "select productcode,name from productmast order by name";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setProductcode((String) row[0]);
				pojos.setName((String) row[1]);

				data.add(pojos);
			}
		}
		return data;

	}

	@Transactional
	public List<IndentEntity> indentSubProduct(String productcode) {

		String qry = "		select subproductcode,name as subproductname from subproductmast where productcode='"
				+ productcode + "'";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setSubproductcode((String) row[0]);
				pojos.setSubproductname((String) row[1]);

				data.add(pojos);
			}
		}
		return data;

	}

	@Transactional
	public List<IndentEntity> indentSeedVariety(String subProductCode, String year, String season) {

		String qry = "select varietycode,concat(name,' - ',b.groupname) as varietyname from varietymast a\r\n"
				+ "     join seedgroup_mst b on a.groupcode=b.groupcode where subproductcode='" + subProductCode
				+ "' and a.active='A' \r\n"
				+ "   and varietycode in (select distinct varietycode from product_price where  cropyear="
				+ Integer.parseInt(year) + " and season='" + season + "' )  order by a.name,a.groupcode";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setVarietycode((String) row[0]);
				pojos.setVarietyname((String) row[1]);

				data.add(pojos);
			}
		}
		return data;

	}
	
	
  
		  @Transactional
			public String getVarietyName(String code) {
				String qry = "select concat(name,' - ',b.groupname) as varietyname from varietymast a\r\n"
						+ "    join seedgroup_mst b on a.groupcode=b.groupcode where a.active='A'  and varietycode =:code";

				Query sql = entityManager.createNativeQuery(qry);
				sql.setParameter("code", (code));

				List<String> results = sql.getResultList();

				if (results != null && !results.isEmpty()) {
					return results.get(0).toString();
				}

				return null;
			}

	@Transactional
	public List<IndentEntity> getData(String varietyCode, String year, String season) {

		String qry = "select dcode,dname from district_2011_cs  ,varietymast v  where v.varietycode='" + varietyCode
				+ "' and  (dcode,varietycode) not in \r\n"
				+ " (select dcode,seedvariety  from district_indents where cropyear=" + year + " and season= '" + season
				+ "' and seedvariety='" + varietyCode + "'  and quantity >0) and dcode<>999 order by dname";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setDcode(row[0].toString());
				pojos.setDname((String) row[1]);

				data.add(pojos);
			}
		}
		return data;

	}

	@Transactional
	public List<IndentEntity> getDataForMandal(String varietyCode, String year, String season, int dcode) {

		String qry = "select mcode,mname from mandal_2011_cs ,varietymast v  where v.varietycode='" + varietyCode
				+ "' and  (mcode,varietycode) not in \r\n"
				+ "  (select mcode,seedvariety  from targets_mao where cropyear=" + year + " and season='" + season
				+ "' and seedvariety='" + varietyCode + "' and  target>0) and dcode=" + dcode + " order by mname";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setDcode(row[0].toString());
				pojos.setDname((String) row[1]);

				data.add(pojos);
			}
		}
		return data;

	}

	@Transactional
	public List<IndentEntity> getDataForRsk(String varietyCode, String year, String season, int dcode,int mcode) {

		String qry = "select vcode,vname from vill_sec_det a,varietymast v  where v.varietycode='"+varietyCode+"' and a.active<>'N' and  (vcode,varietycode)"
				+ " not in (select vscode,seedvariety  from targets_mao_vs where cropyear=" + year + " and season='"+ season +"' and seedvariety='" + varietyCode + "' and target>0 ) "
						+ "and dcode="+dcode+" and mcode="+mcode+" order by vname";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setDcode(row[0].toString());
				pojos.setDname((String) row[1]);

				data.add(pojos);
			}
		}
		return data;

	}
	
	@Transactional
	public int submitData(List<IndentEntryDto> list, String year, String season, String userid, String ippr,String variety,String productCode,String subProductCode) {
		int count = 0;

		for (IndentEntryDto dto : list) {
		//	System.out.println(list.toString());
			if( dto.getQuantity() > 0) {
			String qry = "INSERT INTO district_indents( dcode,  cropyear, season, seedvariety, quantity, userid, ipaddr)  VALUES (?,  ?, ?, ?, ?, ?, ?)";

			count += entityManager.createNativeQuery(qry).setParameter(1, Integer.parseInt(dto.getDcode()))
					.setParameter(2, Integer.parseInt(year)).setParameter(3, season)
					.setParameter(4, variety).setParameter(5, dto.getQuantity()).setParameter(6, userid)
					.setParameter(7, ippr).executeUpdate();
			}
		}
		return count;

	}
	
	
	@Transactional
	public int submitDataForMandal(List<IndentEntryDto> list, String year, String season, String userid, String ippr,int dcode) {
		int count = 0;

		for (IndentEntryDto dto : list) {
			System.out.println(list.toString());
			if(dto.getQuantity() > 0) {
			String qry = "INSERT INTO targets_mao( dcode, cropyear, season, seedvariety, target, userid, ipaddr, mcode)  VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

			count += entityManager.createNativeQuery(qry).setParameter(1, (dcode))
					.setParameter(2, Integer.parseInt(year)).setParameter(3, season)
					.setParameter(4, dto.getVarietycode()).setParameter(5, dto.getQuantity()).setParameter(6, userid)
					.setParameter(7, ippr).setParameter(8, Integer.parseInt(dto.getMcode())).executeUpdate();
			}
		}
		return count;

	}
	
	
	@Transactional
	public int submitDataForRsk(List<IndentEntryDto> list, String year, String season, String userid, String ippr,int dcode,int mcode) {
		int count = 0;

		for (IndentEntryDto dto : list) {
			System.out.println(list.toString());
			if(dto.getQuantity() > 0) {
			String qry = "INSERT INTO targets_mao_vs( dcode,   cropyear, season, seedvariety, target, userid, ipaddr,mcode,vscode)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

			count += entityManager.createNativeQuery(qry).setParameter(1, (dcode))
					.setParameter(2, Integer.parseInt(year)).setParameter(3, season)
					.setParameter(4, dto.getVarietycode()).setParameter(5, dto.getQuantity()).setParameter(6, userid)
					.setParameter(7, ippr).setParameter(8, mcode).setParameter(9, dto.getVscode()).executeUpdate();
			}
		}
		return count;

	}

	@Transactional
	public List<IndentEntity> getAllDistrict() {

		String qry = "select dcode ,dname  from district_2011_cs where dcode!=999 order by dname";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setDcode(row[0].toString());
				pojos.setDname((String) row[1]);

				data.add(pojos);
			}
		}
		return data;

	}

	@Transactional
	public List<IndentEntity> getDataForUpdation(String variety, String year, String season, int dcode) {

		String qry = "select a.dcode, seedvariety, quantity,dname from district_indents a, district_2011_cs d  where cropyear="
				+ Integer.parseInt(year) + " and season='" + season + "'  " + "and seedvariety='" + variety + "' and quantity>0 ";

		if (dcode != 0)
			qry += " and a.dcode= " + dcode + " ";
		qry+=" and a.dcode=d.dcode order by dname";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setDcode(row[0].toString());
				pojos.setVarietyname((String) row[1]);
				pojos.setQuantity(row[2].toString());
				pojos.setDname(row[3].toString());

				data.add(pojos);
			}
		}
		return data;
	}
	
	@Transactional
	public List<IndentEntity> getDataForUpdationForMandal(String variety, String year, String season, int dcode) {

		String qry = "select mcode, seedvariety, target from targets_mao where  cropyear="+Integer.parseInt(year)+" and season='"+season+"' and dcode="+dcode+" and seedvariety='"+variety+"' and target >0";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setMcode(row[0].toString());
				pojos.setVarietyname((String) row[1]);
				pojos.setQuantity(row[2].toString());
				pojos.setMname(getMname(row[0].toString()));

				data.add(pojos);
			}
		}
		return data;
	}
	
	@Transactional
	public List<IndentEntity> getDataForUpdationForRsk(String variety, String year, String season, int dcode,int mcode) {

		String qry = "select vscode, seedvariety, target from targets_mao_vs where  cropyear="+Integer.parseInt(year)+" and season='"+season+"' and dcode="+dcode+" and mcode="+mcode+" and seedvariety='"+variety+"' and target >0";

		List<IndentEntity> data = new ArrayList<>();
		javax.persistence.Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = ((javax.persistence.Query) sql).getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				IndentEntity pojos = new IndentEntity();

				pojos.setMcode(row[0].toString());
				pojos.setVarietyname((String) row[1]);
				pojos.setQuantity(row[2].toString());
				pojos.setMname(getVsname(row[0].toString()));

				data.add(pojos);
			}
		}
		return data;
	}
	
	@Transactional
	public String getVsname(String vscode) {
		String qry = "select distinct vname from vill_sec_det   where vcode= :vscode";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("vscode", Integer.parseInt(vscode));

		List<String> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0).toString();
		}

		return null;
	}
	
	@Transactional
	public String getMname(String mcode) {
		String qry = "select distinct mname from mandal_2011_cs   where mcode= :mcode";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("mcode", Integer.parseInt(mcode));

		List<String> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0).toString();
		}

		return null;
	}


	@Transactional
	public String getDname(String dcode) {
		String qry = "select distinct dname from district_2011_cs   where dcode= :dcode";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("dcode", Integer.parseInt(dcode));

		List<String> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0).toString();
		}

		return null;
	}

	@Transactional
	public Double getQuantity(String varietycode, String cropyear, String season, int dcode) {
		String qry = "select COALESCE(quantityperbag,0.00) from product_price where varietycode=:varietycode and cropyear=:cropyear and season=:season";
		if (dcode != 0)
			qry += " and dcode=:dcode";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);
		sql.setParameter("cropyear", Integer.parseInt(cropyear));
		sql.setParameter("season", season);
		if (dcode != 0)
			sql.setParameter("dcode", (dcode));

		List<Double> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}
	
	
	@Transactional
	public BigDecimal getTargetOfRsk(String varietycode, String cropyear, String season, int dcode,int mcode) {
		String qry ="select coalesce(sum(coalesce(target,0.00)),0.00) as target_vs from targets_mao_vs where dcode=:dcode and mcode=:mcode and cropyear=:cropyear and season=:season and seedvariety=:varietycode";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);
		sql.setParameter("cropyear", Integer.parseInt(cropyear));
		sql.setParameter("season", season);
		sql.setParameter("dcode", dcode);
		sql.setParameter("mcode", mcode);

		List<BigDecimal> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}

	@Transactional
	public BigDecimal getTargetOfRskFromMao(String varietycode, String cropyear, String season, int dcode,int mcode) {
		String qry ="select target from targets_mao where  dcode=:dcode and mcode=:mcode and cropyear=:cropyear and season=:season and seedvariety=:varietycode";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);
		sql.setParameter("cropyear", Integer.parseInt(cropyear));
		sql.setParameter("season", season);
		sql.setParameter("dcode", dcode);
		sql.setParameter("mcode", mcode);

		List<BigDecimal> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}

	@Transactional
	public Double getKgConvertor(String varietycode) {
		String qry = "select COALESCE(kgconvertor,0) from units where units=(select units from varietymast where varietycode=:varietycode)";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);

		List<Double> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return (results.get(0));
		}

		return null;
	}
	
	@Transactional
	public BigDecimal getFactor(String varietycode) {
		String qry = "select COALESCE(factor,0) from units where units=(select units from varietymast where varietycode=:varietycode)";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);

		List<BigDecimal> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return (results.get(0));
		}

		return null;
	}
	
	@Transactional
	public BigInteger getQtyallocated(String varietycode, String cropyear, String season, int dcode) {
		String qry = "select coalesce(qtyallocated,0)    as allocatedqty from mand_abstract_new_v_k2023 where seedvariety=:varietycode and cropyear=:cropyear and season=:season";

		if (dcode != 0)
			qry += " and dcode=:dcode";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);
		sql.setParameter("cropyear", Integer.parseInt(cropyear));
		sql.setParameter("season", season);
		if (dcode != 0)
			sql.setParameter("dcode", (dcode));

		List<BigInteger> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}
	
	
			@Transactional
			public BigInteger getQtyallocatedForRsk(String varietycode, String cropyear, String season, int dcode) {
				String qry = "select coalesce(qtyallocated,0)  as qtyallocated from vill_abstract_v where  cropyear=:cropyear and season=:season and seedvariety=:varietycode and vcode=?";

				if (dcode != 0)
					qry += " and dcode=:dcode";

				Query sql = entityManager.createNativeQuery(qry);
				sql.setParameter("varietycode", varietycode);
				sql.setParameter("cropyear", Integer.parseInt(cropyear));
				sql.setParameter("season", season);
				sql.setParameter("dcode", (dcode));

				List<BigInteger> results = sql.getResultList();

				if (results != null && !results.isEmpty()) {
					return results.get(0);
				}

				return null;
			}

	@Transactional
	public BigInteger getQtyrecd(String varietycode, String cropyear, String season, int dcode) {
		String qry = "select coalesce(sum(qty_recd),0)    as allocatedqty from ben_distribution where seedvariety=:varietycode and cropyear=:cropyear and season=:season";

		if (dcode != 0)
			qry += " and dcode=:dcode";

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);
		sql.setParameter("cropyear", Integer.parseInt(cropyear));
		sql.setParameter("season", season);
		if (dcode != 0)
			sql.setParameter("dcode", (dcode));

		List<BigInteger> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}

	@Transactional
	public BigDecimal getQuantityOfDistrict(String varietycode, String cropyear, String season, int dcode) {
		String qry = "select coalesce(quantity,0.00) from district_indents   where seedvariety=:varietycode and cropyear=:cropyear and season=:season and dcode=:dcode";
		
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);
		sql.setParameter("cropyear", Integer.parseInt(cropyear));
		sql.setParameter("season", season);
		sql.setParameter("dcode", (dcode));

		List<BigDecimal> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}
	
	
	
	
	
	
	@Transactional
	public BigDecimal getTargetsFromMandal(String varietycode, String cropyear, String season, int dcode) {
		String qry = "select coalesce(sum(coalesce (target,0.00)),0.00) from targets_mao   where seedvariety=:varietycode and cropyear=:cropyear and season=:season and dcode=:dcode";
		
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);
		sql.setParameter("cropyear", Integer.parseInt(cropyear));
		sql.setParameter("season", season);
		sql.setParameter("dcode", (dcode));

		List<BigDecimal> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}
	
	@Transactional
	public int updateData(List<IndentEntryDto> list, String year, String season) {
		int count = 0;

		for (IndentEntryDto dto : list) {
			System.out.println(list.toString());
			String qry = "update district_indents set quantity=quantity+? where dcode=? and seedvariety=? and cropyear=? and season=?";

			count += entityManager.createNativeQuery(qry).setParameter(1, dto.getQuantity())
					.setParameter(2, Integer.parseInt(dto.getDcode())).setParameter(3, dto.getVarietycode())
					.setParameter(4, Integer.parseInt(year)).setParameter(5, season).executeUpdate();
		}
		return count;

	}
	
	@Transactional
	public BigDecimal getQuantityOfMandal(String varietycode, String cropyear, String season, int dcode) {
		String qry = "select coalesce(target,0.00) from targets_mao   where seedvariety=:varietycode and cropyear=:cropyear and season=:season and dcode=:dcode";
		
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("varietycode", varietycode);
		sql.setParameter("cropyear", Integer.parseInt(cropyear));
		sql.setParameter("season", season);
		sql.setParameter("dcode", (dcode));

		List<BigDecimal> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}
	
	@Transactional
	public int updateDataForMandal(List<IndentEntryDto> list, String year, String season,int dcode) {
		int count = 0;

		for (IndentEntryDto dto : list) {
			System.out.println(list.toString());
			String qry = "update targets_mao set target=target+? where mcode=? and seedvariety=? and cropyear=? and season=? and dcode=?";

			count += entityManager.createNativeQuery(qry).setParameter(1, dto.getQuantity())
					.setParameter(2, Integer.parseInt(dto.getMcode())).setParameter(3, dto.getVarietycode())
					.setParameter(4, Integer.parseInt(year)).setParameter(5, season).setParameter(6, dcode).executeUpdate();
			
			String qry2 = "update stock_entry set partial_complete='P' where cid=?";

			count += entityManager.createNativeQuery(qry2).setParameter(1, getCids(dcode,Integer.parseInt(dto.getMcode()))).executeUpdate();
		}
		return count;

	}
	
	@Transactional
	public int updateDataForRsk(List<IndentEntryDto> list, String year, String season,int dcode,int mcode) {
		int count = 0;

		for (IndentEntryDto dto : list) {
			System.out.println(list.toString());
			System.out.println(dcode);
			System.out.println(mcode);
			System.out.println(year);
			System.out.println(season);
			String qry = "update targets_mao_vs set target=target+? where mcode=? and seedvariety=? and cropyear=? and season=? and dcode=? and vscode=?";

			count += entityManager.createNativeQuery(qry).setParameter(1, dto.getQuantity())
					.setParameter(2, mcode).setParameter(3, dto.getVarietycode())
					.setParameter(4, Integer.parseInt(year)).setParameter(5, season).setParameter(6, dcode).setParameter(7, dto.getVscode()).executeUpdate();
			for(Integer a :  getCidsForRsk(dcode,mcode,dto.getVscode())) {
				String qry2 = "update stock_entry set partial_complete='P' where cid=?";
				count += entityManager.createNativeQuery(qry2).setParameter(1, a).executeUpdate();
			}
			
//			String qry2 = "update stock_entry set partial_complete='P' where cid=?";
//
//			count += entityManager.createNativeQuery(qry2).setParameter(1, getCidsForRsk(dcode,Integer.parseInt(dto.getMcode()),dto.getVscode())).executeUpdate();
		}
		return count;

	}
	
	
	
	
	@Transactional
	public Integer  getCids(int dcode,int mcode) {
		String qry = "select cid from cluster_villages where dcode=:dcode and mcode=:mcode";
		
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("dcode", dcode);
		sql.setParameter("mcode", mcode);

		List<Integer> results = sql.getResultList();

		if (results != null && !results.isEmpty()) {
			return results.get(0);
		}

		return null;
	}
	
	@Transactional
	public List<Integer> getCidsForRsk(int dcode, int mcode, int vscode) {
	    String qry = "select cid from cluster_villages where dcode=:dcode and mcode=:mcode and vscode=:vscode";
	    
	    Query sql = entityManager.createNativeQuery(qry);
	    sql.setParameter("dcode", dcode);
	    sql.setParameter("mcode", mcode);
	    sql.setParameter("vscode", vscode);

	    return sql.getResultList();
	}
	
	
	

}
