package com.eseed.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.eseed.dto.AddSeedVarietyDto;
import com.eseed.dto.AgencyDetailsDto;
import com.eseed.dto.AgencyDto;
import com.eseed.dto.Cluster;
import com.eseed.dto.Districtdto;
import com.eseed.dto.MandalDto;
import com.eseed.dto.ProductPricesBDto;
import com.eseed.dto.SeasonDto;
import com.eseed.dto.SeedVarietyCodeDto;
import com.eseed.dto.SeedVarietyNameDto;
import com.eseed.dto.StandardsQtyDto;
import com.eseed.dto.SubmitDataForStock;
import com.eseed.dto.VillageDto;

@Component
public class AddSeedVarietyRepo {

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public List<AddSeedVarietyDto> getaddSeedVariety() {

		String qry = "select productcode,name AS productname from productmast order by productname ";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();
		if (objects != null && objects.size() > 0) {
			for (Object patta : objects) {
				Object[] row = (Object[]) patta;
				AddSeedVarietyDto addSeedVarietyDto = new AddSeedVarietyDto();
				addSeedVarietyDto.setProductcode(((String) row[0]));
				addSeedVarietyDto.setProductname(((String) row[1]));
				data.add(addSeedVarietyDto);
			}
		}

		return data;

	}

	@Transactional
	public List<AddSeedVarietyDto> getaddSeedVarietysubproductcode(String productcode) {
		String qry = "select subproductcode,name as subproductname from subproductmast where productcode='"
				+ productcode + "' order by subproductname ";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();
		if (objects != null && objects.size() > 0) {
			for (Object patta : objects) {
				Object[] row = (Object[]) patta;
				AddSeedVarietyDto addSeedVarietyDto = new AddSeedVarietyDto();
				addSeedVarietyDto.setSubproductcode(((String) row[0]));
				addSeedVarietyDto.setSubproductname(((String) row[1]));
				data.add(addSeedVarietyDto);
			}
		}
		return data;
	}

	@Transactional
	public List<AddSeedVarietyDto> getunits() {
		String qry = "select units from units";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();
		if (objects != null && !objects.isEmpty()) {
			for (Object patta : objects) {
				String unit = (String) patta;

				AddSeedVarietyDto addSeedVarietyDto = new AddSeedVarietyDto();
				addSeedVarietyDto.setUnits(unit);

				data.add(addSeedVarietyDto);
			}
		}

		return data;
	}
//

	@Transactional
	public List<AddSeedVarietyDto> getfarmertype() {

		String qry = "select farmertype,farmer_desc from farmertype_mst ";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				AddSeedVarietyDto addSeedVarietyDto = new AddSeedVarietyDto();

				addSeedVarietyDto.setFarmertype(((Integer) row[0]).toString());
				addSeedVarietyDto.setFarmer_desc(((String) row[1]));
				data.add(addSeedVarietyDto);
			}
		}

		return data;

	}

	@Transactional
	public List<AddSeedVarietyDto> getseedgroup() {

		String qry = "select * from seedgroup_mst where active='A' ";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				AddSeedVarietyDto addSeedVarietyDto = new AddSeedVarietyDto();

				addSeedVarietyDto.setGroupcode(((Integer) row[0]).toString());
				addSeedVarietyDto.setGroupname(((String) row[1]));
				addSeedVarietyDto.setActive(((Character) row[2]).toString());
				addSeedVarietyDto.setRepgrpcode(((Integer) row[3]).toString());

				data.add(addSeedVarietyDto);
			}
		}

		return data;

	}

	@Transactional
	public List<AddSeedVarietyDto> getsubproduct(String subproductcode) {
		String qry = "select max(substr(varietycode, 6, 3)) from varietymast where subproductcode = :subproductcode";
		List<AddSeedVarietyDto> data = new ArrayList<>();

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter("subproductcode", subproductcode);

		List<Object> objects = sql.getResultList();

		if (objects != null && !objects.isEmpty()) {
			String maxVarietyCode = (String) objects.get(0);

			if (maxVarietyCode != null) {
				AddSeedVarietyDto addSeedVarietyDto = new AddSeedVarietyDto();
				addSeedVarietyDto.setVarietycode(maxVarietyCode.toString());
				data.add(addSeedVarietyDto);
			}
		}

		return data;
	}

	@Transactional
	public int insertSeedVariety(String productCode, String subProductCode, String varietyName, String units,
			Integer farmertype, String groupcode, String userid, String clientip, String varitycodes) {

		String qry = "insert into varietymast (productcode,subproductcode,name,units,crt_usr,clientip,groupcode,farmertype,varietycode) values (?,?,?,?,?,?,?,?,?)";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, productCode);
		sql.setParameter(2, subProductCode);

		sql.setParameter(3, varietyName);
		sql.setParameter(4, units);
		sql.setParameter(5, userid);
		sql.setParameter(6, clientip);
		sql.setParameter(7, Integer.parseInt(groupcode));
		sql.setParameter(8, farmertype);
		sql.setParameter(9, varitycodes);

		return sql.executeUpdate();

	}

	@Transactional
	public List<Districtdto> getDistrict() {

		String qry = "select dcode, dname from district_2011_cs order by dname ";
		List<Districtdto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				Districtdto districtdto = new Districtdto();

				districtdto.setDcode(((Integer) row[0]).toString());
				districtdto.setDname(((String) row[1]));
				data.add(districtdto);
			}
		}

		return data;

	}

	@Transactional
	public List<Districtdto> getMandalsByDistrict(String dcode) {

		String qry = "select mcode,mname from mandal_2011_cs where dcode='" + dcode + "' order by mname ";
		List<Districtdto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				Districtdto mandals = new Districtdto();

				mandals.setMcode(((Integer) row[0]).toString());
				mandals.setMname(((String) row[1]));

				data.add(mandals);
			}
		}

		return data;

	}

	@Transactional
	public List<AgencyDetailsDto> getAgencyDetails(String mcode) {
		String qry = "SELECT a.cropyear, " + " a.season,    " + " a.agencycode,    " + " a.sid,    " + " c.mname,    "
				+ " TO_CHAR(a.inserteddate, 'DD-MM-YYYY') AS idate," + " a.seedvariety,    " + " a.vehicaleno,    "
				+ " a.quantity,    " + " a.userid,    " + " TO_CHAR(a.receiveddate, 'DD-MM-YYYY') AS recddate,    "
				+ " a.batchno,    " + " a.mandal,    " + " a.dist,   "
				+ " vm.name,  vm.productcode,spm.name as seedname,ags.agencyname FROM    stock_entry a  JOIN   mandal_2011_cs c  ON a.mandal = CAST(c.mcode AS VARCHAR)   "
				+ "	    	JOIN  varietymast vm  ON a.seedvariety = vm.varietycode JOIN subproductmast spm on vm.subproductcode=spm.subproductcode join agency_mst ags on ags.agencycode=a.agencycode  WHERE   a.mandal = ?";

		List<AgencyDetailsDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, mcode); // Set the mcode as a parameter to prevent SQL injection

		List<Object[]> objects = sql.getResultList(); // Notice here: Use Object[] as result

		if (objects != null && !objects.isEmpty()) {
			for (Object[] row : objects) {
				AgencyDetailsDto agencyDetailsDto = new AgencyDetailsDto();

				agencyDetailsDto.setCropyear(((Integer) row[0]).toString());
				agencyDetailsDto.setSeason(((Character) row[1]).toString());
				agencyDetailsDto.setAgencycode(((Integer) row[2]).toString());
				agencyDetailsDto.setSid(((Integer) row[3]).toString());
				agencyDetailsDto.setMname((String) row[4]);
				agencyDetailsDto.setIdate((String) row[5]);
				agencyDetailsDto.setSeedvariety((String) row[6]);
				agencyDetailsDto.setVehicaleno((String) row[7]);
				agencyDetailsDto.setQuantity((String) row[8]);
				agencyDetailsDto.setUserid((String) row[9]);
				agencyDetailsDto.setRecddate(((String) row[10]));
				agencyDetailsDto.setBatchno((String) row[11]);
				agencyDetailsDto.setMandal(((String) row[12]));
				agencyDetailsDto.setDist(((String) row[13]));
				agencyDetailsDto.setName((((String) row[14])));
				agencyDetailsDto.setProductcode((((String) row[15])));
				agencyDetailsDto.setSeedname((((String) row[16])));
				agencyDetailsDto.setAgencyname((((String) row[17])));

				data.add(agencyDetailsDto);
			}
		}

		return data;
	}

	@Transactional
	public List<SeedVarietyNameDto> getVarietyName(String subproductCode) {

		String qry = "SELECT varietycode, CONCAT(name, ' - ', b.groupname) AS varietyname " + "FROM varietymast a "
				+ "JOIN seedgroup_mst b ON a.groupcode = b.groupcode " + "WHERE subproductcode = '" + subproductCode
				+ "'" + "AND a.active = 'A' " + "ORDER BY a.name, a.groupcode";

		List<SeedVarietyNameDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				SeedVarietyNameDto seedVarietyNameDto = new SeedVarietyNameDto();

				seedVarietyNameDto.setVarietycode(((String) row[0]));
				seedVarietyNameDto.setVarietyname(((String) row[1]));

				data.add(seedVarietyNameDto);
			}
		}

		return data;

	}

	@Transactional
	public List<SeasonDto> getSeasonname() {
		String qry = "select season,seasonname from season  where season in(SELECT season FROM activeseason WHERE active in ('A','F'))";
		List<SeasonDto> data = new ArrayList<>();

		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && !objects.isEmpty()) {

			for (Object patta : objects) {
				Object[] row = (Object[]) patta;

				SeasonDto seasonDto = new SeasonDto();
				seasonDto.setSeason(((Character) row[0]).toString());
				seasonDto.setSeasonname(((String) row[1]));

				data.add(seasonDto);
			}
		}

		return data;
	}

	@Transactional
	public List<SeasonDto> getcropYear() {
		String qry = "SELECT distinct cropyear FROM activeseason WHERE active in ('A','F')";
		List<SeasonDto> data = new ArrayList<>();

		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && !objects.isEmpty()) {

			for (Object patta : objects) {
				if (patta instanceof Integer) {
					Integer cropyearInt = (Integer) patta;

					String cropyear = Integer.toString(cropyearInt); // or String.valueOf(cropyearInt)

					SeasonDto cropYear = new SeasonDto();
					cropYear.setCropyear(cropyear);

					data.add(cropYear);
				}
			}
		}
		return data;
	}

	@Transactional
	public List<Districtdto> getvariteyDistricts(Integer cropYear, Character season, String variety) {
		String qry = "SELECT d.dcode, d.dname FROM district_2011_cs d LEFT JOIN product_price p  ON d.dcode = p.dcode   AND p.cropyear = ? AND p.season =? AND p.varietycode =  ? AND p.active = 'A'"
				+ " WHERE  d.dcode <> 999 ";
		List<Districtdto> data = new ArrayList<>();

		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, cropYear);
		sql.setParameter(2, season);
		sql.setParameter(3, variety);
		List<Object> objects = sql.getResultList();

		if (objects != null && !objects.isEmpty()) {

			for (Object patta : objects) {
				Object[] row = (Object[]) patta;

				Districtdto districtdto = new Districtdto();
				districtdto.setDcode(((Integer) row[0]).toString());
				districtdto.setDname(((String) row[1]));

				data.add(districtdto);
			}
		}

		return data;
	}

	@Transactional
	public int insertProductPrices(String cropYear, Character seas, String variety, Integer pid, Date ftime, Date ttime,
			Date pstime, Date pctime, Date dstime, Date dctime, String product_price, String subsidy_amout,
			String nonsubsidy_amt, String quantityperbag, String dcode, String userid, String clientip) {

		String qry = "insert into product_price (productid,varietycode,product_price,subsidy_amt,nonsubsidy_amt,fromdate,todate,active,dcode,season,entereduserid,clientip,cropyear,quantityperbag,"
				+ "                   payment_from_dt,payment_close_dt,dist_from_dt,dist_close_dt) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Query sql = entityManager.createNativeQuery(qry);

		sql.setParameter(1, pid);
		sql.setParameter(2, variety);
		sql.setParameter(3, Double.parseDouble(product_price));
		sql.setParameter(4, Double.parseDouble(subsidy_amout));
		sql.setParameter(5, Double.parseDouble(nonsubsidy_amt));
		sql.setParameter(6, ftime);
		sql.setParameter(7, ttime);
		sql.setParameter(8, 'A');
		sql.setParameter(9, Integer.parseInt(dcode));
		sql.setParameter(10, seas);
		sql.setParameter(11, userid);
		sql.setParameter(12, clientip);
		sql.setParameter(13, Integer.parseInt(cropYear));
		sql.setParameter(14, Double.parseDouble(quantityperbag));
		sql.setParameter(15, pstime);
		sql.setParameter(16, pctime);
		sql.setParameter(17, dstime);
		sql.setParameter(18, dctime);

		return sql.executeUpdate();

	}

	@Transactional
	public List<SeedVarietyCodeDto> getVarietycode(String variety) {
		String qry = "select productid from varietymast where varietycode =?";
		List<SeedVarietyCodeDto> data = new ArrayList<>();

		Query sql = entityManager.createNativeQuery(qry);

		sql.setParameter(1, variety);

		List<Object> objects = sql.getResultList();

		if (objects != null && !objects.isEmpty()) {

			for (Object patta : objects) {
				Integer productid = (Integer) patta;

				SeedVarietyCodeDto seedVarietycode = new SeedVarietyCodeDto();
				seedVarietycode.setProductid(productid);

				data.add(seedVarietycode);
			}
		}

		return data;
	}

	@Transactional
	public List<AgencyDto> getagency() {
//		String qry = "SELECT distinct agencyname,agencycode FROM agency_mst order by agencyname ";
		String qry="SELECT distinct agencyname,agencycode FROM agency_mst  where agencycode in (select agencycode from stock_entry) order by agencyname";
		List<AgencyDto> data = new ArrayList<>();

		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && !objects.isEmpty()) {

			for (Object patta : objects) {
				Object[] row = (Object[]) patta;

				AgencyDto agencyName = new AgencyDto();
				agencyName.setAgencyname(((String) row[0]));
				agencyName.setAgencycode(((Integer) row[1]));

				data.add(agencyName);
			}
		}

		return data;
	}

	@Transactional
	public int insertSeedAgency(Integer dcode, String agency_code, String productcode, String subproductcode,
			String varietycode) {
		String qry = "insert into eseed2025.seed_agency (dcode,agency_code,productcode,subproductcode,varietycode) values (?,?,?,?,?)";
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, dcode);
		sql.setParameter(2, agency_code);
		sql.setParameter(3, productcode);
		sql.setParameter(4, subproductcode);
		sql.setParameter(5, varietycode);
		return sql.executeUpdate();
	}

	// update stock_entry set agencycode=? where cropyear=? and season=? and
	// mandal::int=? and seedvariety=? and agencycode=?

	@Transactional
	public int updateSeedAgency(Integer dcode, String agency_code, String productcode, String subproductcode,
			String varietycode) {
		String qry = "update stock_entry set agencycode=? where cropyear=? and season=? and mandal::int=? and seedvariety=? and agencycode=?";
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, dcode);
		sql.setParameter(2, agency_code);
		sql.setParameter(3, productcode);
		sql.setParameter(4, subproductcode);
		sql.setParameter(5, varietycode);
		return sql.executeUpdate();
	}

	@Transactional
	public int updateSeedAgencyDetails(String agency_code, String productcode, String subproductcode,
			String varietycode, String mcode, String seedVariety, Integer cropYear, String season,
			Integer agencyCodeold) {
		// String qry = "update stock_entry set agencycode=? where cropyear=? and
		// season=? and mandal::int=? and seedvariety=? and agencycode=?";
		String qry = "update stock_entry set agencycode=? where  agencycode=? and mandal=? and seedvariety=? and cropyear=? and season=?";
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, Integer.parseInt(agency_code));
		sql.setParameter(2, agencyCodeold);
		sql.setParameter(3, mcode);
		sql.setParameter(4, seedVariety);
		sql.setParameter(5, 2023);
		sql.setParameter(6, 'S');

		Integer status = sql.executeUpdate();
		System.out.println("status " + status);

		return status;
	}

	@Transactional
	public List<AddSeedVarietyDto> getseedGroup() {

		String qry = "SELECT groupcode,groupname FROM seedgroup_mst ORDER BY groupname";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				AddSeedVarietyDto addSeedVarietyDto = new AddSeedVarietyDto();

				addSeedVarietyDto.setGroupcode(((Integer) row[0]).toString());
				addSeedVarietyDto.setGroupname(((String) row[1]));
				data.add(addSeedVarietyDto);
			}
		}

		return data;

	}

	@Transactional
	public List<AddSeedVarietyDto> getseedVariety(Integer groupcode, Integer dcode) {

		String qry = "SELECT b.varietycode,concat(a.name,' ',b.name) as seed FROM varietymast b left join  subproductmast a"
				+ " on (a.subproductcode=b.subproductcode) WHERE b.groupcode=? and b.varietycode in "
				+ "(select distinct varietycode from product_price where  dcode=?  and active='A' ) "
				+ "ORDER BY b.subproductcode,b.name";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, groupcode);
		sql.setParameter(2, dcode);

		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				AddSeedVarietyDto addSeedVarietyDto = new AddSeedVarietyDto();

				addSeedVarietyDto.setVarietycode((row[0]).toString());
				addSeedVarietyDto.setSeed(((String) row[1]));
				data.add(addSeedVarietyDto);
			}
		}

		return data;

	}

	@Transactional
	public List<ProductPricesBDto> getProductPrices(Integer dcode, String svcode) {
		String qry = "SELECT dname,seedname,season,cropyear,product_price,subsidy_amt,nonsubsidy_amt,subsidy_percent,fromdate,"
				+ "todate,quantityperbag,varietycode,dcode from productprice_upd_v where dcode=? and varietycode=? and CURRENT_DATE <= todate order "
				+ "by dname,seedname,todate desc limit 1 ";

		List<ProductPricesBDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, dcode);
		sql.setParameter(2, svcode);

		List<Object[]> results = sql.getResultList();

		for (Object[] row : results) {
			ProductPricesBDto productPriceDto = new ProductPricesBDto();
			productPriceDto.setDname((String) row[0]);
			productPriceDto.setSeedname((String) row[1]);
			productPriceDto.setSeason((Character) row[2]);
			productPriceDto.setCropyear((Integer) row[3]);
			productPriceDto.setProduct_price((Double) row[4]);
			productPriceDto.setSubsidy_amt((Double) row[5]);
			productPriceDto.setNonSubsidy_amt((Double) row[6]);
			productPriceDto.setSubsidy_percent((Double) row[7]);
			productPriceDto.setFromdate((Date) row[8]);
			productPriceDto.setTodate((Date) row[9]);
			productPriceDto.setQuantityperbag((Double) row[10]);
			productPriceDto.setVarietycode((String) row[11]);
			productPriceDto.setDcode((Integer) row[12]);
			data.add(productPriceDto);
		}

		return data;
	}

	@Transactional
	public List<StandardsQtyDto> getStandardsQtyList(String varietycode, Integer cropyear, String season,
			Integer dcode) {
		String qry = "select fromdate,todate,from_extent,to_extent,no_bags_allowed,quantityperbag,stdid,varietycode,season,cropyear,dcode from standards_qty "
				+ "where varietycode ='" + varietycode + "' and cropyear =" + cropyear + " and season ='" + season
				+ "'  and dcode=" + dcode + " order by " + "fromdate,todate,from_extent";

		List<StandardsQtyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);

		List<Object[]> results = sql.getResultList();

		for (Object[] row : results) {
			StandardsQtyDto StandardsQtyDto = new StandardsQtyDto();
			StandardsQtyDto.setFromdate((Date) row[0]);
			StandardsQtyDto.setTodate((Date) row[1]);
			StandardsQtyDto.setFrom_extent((Double) row[2]);
			StandardsQtyDto.setTo_extent((Double) row[3]);
			StandardsQtyDto.setNo_bags_allowed((Integer) row[4]);
			StandardsQtyDto.setQuantityperbag((Integer) row[5]);
			StandardsQtyDto.setStdid((Integer) row[6]);
			StandardsQtyDto.setVarietycode((String) row[7]);
			StandardsQtyDto.setSeason((Character) row[8]);
			StandardsQtyDto.setCropyear((Integer) row[9]);
			StandardsQtyDto.setDcode((Integer) row[10]);

			data.add(StandardsQtyDto);
		}

		return data;
	}

	@Transactional
	public List<ProductPricesBDto> getProductPriceByDetails(String varietycode, Integer cropyear, String season,
			Integer dcode) {
		String qry = "SELECT varietycode,season,cropyear,dname,fromdate,todate,quantityperbag,dcode from productprice_upd_v where "
				+ " varietycode ='" + varietycode + "' and cropyear =" + cropyear + " and season ='" + season
				+ "' and dcode=" + dcode + " order by " + "fromdate,todate";

		List<ProductPricesBDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);

		List<Object[]> results = sql.getResultList();

		for (Object[] row : results) {
			ProductPricesBDto ProductPriceDto = new ProductPricesBDto();
			ProductPriceDto.setVarietycode((String) row[0]);
			ProductPriceDto.setSeason((Character) row[1]);
			ProductPriceDto.setCropyear((Integer) row[2]);
			ProductPriceDto.setDname((String) row[3]);
			ProductPriceDto.setFromdate((Date) row[4]);
			ProductPriceDto.setTodate((Date) row[5]);
			ProductPriceDto.setQuantityperbag((Double) row[6]);
			ProductPriceDto.setDcode((Integer) row[7]);

			data.add(ProductPriceDto);
		}

		return data;
	}

	@Transactional
	public int deletePriceByDetails(Integer stdid) {
		String qry = "delete  FROM standards_qty where stdid=" + stdid + "";
		Query sql = entityManager.createNativeQuery(qry);
		return sql.executeUpdate();
	}

	@Transactional
	public int getTransactionDetails(String varietycode, Integer cropyear, String season, Integer dcode) {
		String qry = "select transactionid from ben_distribution where seedvariety='" + varietycode + "' and cropyear ="
				+ cropyear + " and season ='" + season + "' " + "and dcode=" + dcode + "";
		Query sql = entityManager.createNativeQuery(qry);
		List<?> resultList = sql.getResultList();
		return resultList.size();
	}

	@Transactional
	public int insertSeedEntitlement(String varietycode, String quantityperbag, Date fromdate, Date todate,
			Character season, Integer cropyear, Integer dcode, List<Double> fromExtents, List<Double> toExtents,
			List<Integer> noBagsAllowed) {

		StringBuilder qry = new StringBuilder(
				"INSERT INTO standards_qty (varietycode, quantityperbag, fromdate, todate, season, cropyear, dcode, from_extent, to_extent, no_bags_allowed) VALUES ");

		List<Object> params = new ArrayList<>();
		for (int i = 0; i < fromExtents.size(); i++) {
			qry.append("(?, ?, ?, ?, ?, ?, ?, ?, ?, ?), ");

			params.add(varietycode);
			params.add(Double.parseDouble(quantityperbag));
			params.add(fromdate);
			params.add(todate);
			params.add(season);
			params.add(cropyear);
			params.add(dcode);
			params.add(fromExtents.get(i));
			params.add(toExtents.get(i));
			params.add(noBagsAllowed.get(i));
		}

		qry.setLength(qry.length() - 2);
		Query sql = entityManager.createNativeQuery(qry.toString());
		for (int i = 0; i < params.size(); i++) {
			sql.setParameter(i + 1, params.get(i));
		}
		System.out.println("Query: " + qry.toString());
		System.out.println("Parameters: " + params);

		return sql.executeUpdate();
	}

	// Veeru

	@Transactional
	public List<MandalDto> getMandalsByDcode(String dcode) {
		// SQL query to fetch mcode and mname based on the dcode
		String qry = "select mcode, mname from mandal_2011_cs where dcode = ? order by mname";

		// List to hold the results
		List<MandalDto> data = new ArrayList<>();

		// Creating the query using the EntityManager
		Query sql = entityManager.createNativeQuery(qry);

		// Setting the parameter for dcode
		sql.setParameter(1, Integer.parseInt(dcode)); // dcode is passed as the parameter

		// Executing the query
		List<Object> objects = sql.getResultList();

		// Processing the results
		if (objects != null && !objects.isEmpty()) {
			for (Object result : objects) {
				Object[] row = (Object[]) result;

				// Creating a new MandalDto object
				MandalDto mandalDto = new MandalDto();
				mandalDto.setMcode((Integer) row[0]); // mcode
				mandalDto.setMname((String) row[1]); // mname

				// Adding the MandalDto to the result list
				data.add(mandalDto);
			}
		}

		// Returning the list of MandalDto objects
		return data;
	}

	public List<VillageDto> getVillagesByDcodeAndMcode(String dcode, String mcode) {
		// The query to fetch distinct villages based on district code and mandal code
		String qry = "select distinct(vcode), vname from vill_sec_det where dcode = ? and mcode = ? order by vname";
		List<VillageDto> data = new ArrayList<>();

		// Create the native query
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, Integer.parseInt(dcode)); // Set the dcode parameter
		sql.setParameter(2, Integer.parseInt(mcode)); // Set the mcode parameter

		// Execute the query
		List<Object> objects = sql.getResultList();

		// Process the result
		if (objects != null && !objects.isEmpty()) {
			for (Object result : objects) {
				Object[] row = (Object[]) result;

				// Map the result to VillageDto
				VillageDto villageDto = new VillageDto();
				villageDto.setVcode((Integer) row[0]); // vcode
				villageDto.setVname((String) row[1]); // vname

				data.add(villageDto);
			}
		}

		return data;
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String getAgencyName(String user) {
		String sql = "SELECT name FROM user_registration WHERE userid = ?";
		try {
			return jdbcTemplate.queryForObject(sql, new Object[] { user }, String.class);
		} catch (EmptyResultDataAccessException e) {
			// Handle the case where no result is found, returning null or default value
			return null; // or return a default value like "Unknown"
		}
	}

	public String getAgencyCode(String user) {
		String sql = "SELECT agencycode FROM user_agency WHERE userid = ?";
		try {
			return jdbcTemplate.queryForObject(sql, new Object[] { user }, String.class);
		} catch (EmptyResultDataAccessException e) {
			// Handle the case where no result is found, returning null or default value
			return null; // or return a default value like "Unknown"
		}
	}

	public List<Cluster> getClusters(String cropyear, String season, String dcode, String mcode, String vcode,
			String productcode, String subproductcode, String agencycode) {

		// Start with the base query that includes mandatory filters
		StringBuilder sql = new StringBuilder(
				"SELECT cid, cname, tottarget, seedvariety, mcode, mname, vcode, qtytobepositioned ");
		sql.append("FROM cluster_vill_targets_v_pay WHERE cropyear = ? AND season = ? AND dcode = ? AND mcode = ? ");
		// List to hold query parameters
		List<Object> params = new ArrayList<>();
		params.add(Integer.parseInt(cropyear));
		params.add(season);
		params.add(Integer.parseInt(dcode));
		params.add(Integer.parseInt(mcode));

		// Adding optional filters based on conditions
		if (vcode != null && !vcode.isEmpty()) {
			// vcode is provided, add vcode filter
			sql.append("AND vcode = ? ");
			params.add(Integer.parseInt(vcode));
		}

		if (productcode != null && !productcode.isEmpty()) {
			// Product code provided, apply filter on substr(seedvariety, 1, 3)
			sql.append("AND substr(seedvariety, 1, 3) = ? ");
			params.add(productcode);

			if (subproductcode != null && !subproductcode.isEmpty()) {
				// Subproduct code provided, apply filter on substr(seedvariety, 1, 5)
				sql.append("AND substr(seedvariety, 1, 5) = ? ");
				params.add(subproductcode);
			}
		} else if (subproductcode != null && !subproductcode.isEmpty()) {
			// Only subproduct code provided, apply filter on substr(seedvariety, 1, 5)
			sql.append("AND substr(seedvariety, 1, 5) = ? ");
			params.add(subproductcode);
		}

		// Ensuring qtytobepositioned is not null and greater than 0
		sql.append("AND qtytobepositioned IS NOT NULL AND qtytobepositioned > 0 ");

		// Adding final ordering clause
		sql.append("ORDER BY vcode, seedvariety");

		// Log the final SQL query and parameters for debugging
		System.out.println("Final SQL query: " + sql.toString());
		System.out.println("Parameters: " + params);

		// Perform the query
		List<Cluster> clusters = jdbcTemplate.query(sql.toString(), params.toArray(), new RowMapper<Cluster>() {
			@Override
			public Cluster mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cluster cluster = new Cluster();
				cluster.setCid(rs.getString("cid"));
				cluster.setCname(rs.getString("cname"));
				cluster.setSeedvariety(rs.getString("seedvariety"));
				cluster.setMcode(rs.getInt("mcode"));
				cluster.setMname(rs.getString("mname"));
				cluster.setQtyBags(rs.getInt("tottarget"));
				cluster.setQtyAmtPaidFor(rs.getLong("qtytobepositioned"));
				cluster.setVcode(rs.getString("vcode"));
				return cluster;
			}
		});

		// For each cluster, we need to calculate the quantities already issued (self
		// and others)
		for (Cluster cluster : clusters) {
			// Fetch already issued quantity for self (from stock_entry table)
			String querySelf = "SELECT COALESCE(SUM(quantity::int), 0) AS qty FROM stock_entry WHERE dist = ? AND seedvariety = ? AND cropyear = ? AND season = ? AND agencycode = ? AND cid = ?";
			int qtySelf = jdbcTemplate
					.queryForObject(
							querySelf, new Object[] { dcode, cluster.getSeedvariety(), Integer.parseInt(cropyear),
									season, Integer.parseInt(agencycode), Integer.parseInt(cluster.getCid()) },
							Integer.class);

			cluster.setPrevQtySelf(qtySelf);

			// Fetch already issued quantity for others (excluding self)
			String queryOthers = "SELECT COALESCE(SUM(quantity::int), 0) AS qty FROM stock_entry WHERE dist = ? AND seedvariety = ? AND cropyear = ? AND season = ? AND agencycode <> ? AND cid = ?";
			int qtyOthers = jdbcTemplate
					.queryForObject(
							queryOthers, new Object[] { dcode, cluster.getSeedvariety(), Integer.parseInt(cropyear),
									season, Integer.parseInt(agencycode), Integer.parseInt(cluster.getCid()) },
							Integer.class);

			cluster.setPrevQtyOther(qtyOthers);

			// Calculate the remaining allocated quantity
			cluster.setQtyAlloc(cluster.getQtyAmtPaidFor() - cluster.getPrevQtySelf() - cluster.getPrevQtyOther());
		}

		return clusters;
	}

	@Transactional
	public String handleSubmitData(SubmitDataForStock submitData, String cropyear, String season, String pcode,
			String spcode, String userid ,String dcode) {
		// You can now access the data submitted via AJAX
		System.out.println("Received data: " + submitData.toString());

		// Initialize required variables
		String agencycode = "", agencyname = "", godown = "", measuringunits = "";
		List<Integer> sids = new ArrayList<>();
		List<Integer> benUpdateList = new ArrayList<>();
		boolean stockMismatchFlag = false;

		// Newly added variables for stock validation
		String qtytot = "0"; // Used to accumulate received quantities

		// Get the arrays from SubmitDataForStock object
		String[] cids = submitData.getTotcid().toArray(new String[0]);
		String[] totqtyallocs = submitData.getTotqtyalloc().toArray(new String[0]);
		String[] totqtyreq = submitData.getTotqtyreq().toArray(new String[0]);
		String[] totlotnos = submitData.getTotlotno().toArray(new String[0]);
		String[] totvehiclenos = submitData.getTotVehicles().toArray(new String[0]);
		String[] vcodes = submitData.getVillages().toArray(new String[0]);
		String[] mcodes = submitData.getMcodes().toArray(new String[0]);
		String[] postdts = submitData.getTotPosDts().toArray(new String[0]);
		String[] totqtypaidfor = submitData.getTotQtyPaidFor().toArray(new String[0]);
		String[] totvarietycodes = submitData.getTotVarietyCodes().toArray(new String[0]);
		String[] mobileNos = submitData.getTotMobileNos().toArray(new String[0]);

		// For storing timestamps after converting postdts
		Timestamp[] timestamps = new Timestamp[postdts.length];
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Match the format of your date string

		try {
			// Query to fetch agency code and name
			String query = "SELECT a.agencycode, b.agencyname FROM user_agency a, agency_mst b WHERE a.agencycode = b.agencycode AND a.userid = ?";
			List<Map<String, Object>> agencyDetails = jdbcTemplate.queryForList(query, userid);

			if (!agencyDetails.isEmpty()) {
				Map<String, Object> row = agencyDetails.get(0);
				agencycode = row.get("agencycode").toString();
				agencyname = (String) row.get("agencyname");
			}

			// Loop through cids and insert data into stock_entry
			String query1 = "SELECT COALESCE(SUM(quantity::int), 0) AS qty FROM stock_entry WHERE CAST(dist AS TEXT) LIKE ? AND CAST(seedvariety AS TEXT) LIKE ? AND CAST(cropyear AS TEXT) LIKE ? AND CAST(season AS TEXT) LIKE ? AND CAST(cid AS TEXT) LIKE ?";
			String insertQuery = "INSERT INTO stock_entry(dist, mandal, vscode, seedVariety, seedName, crop_sub_variety, vehicaleNo, supplyAgency, godownName, userid, imeno, quantity, typeoftransaction, batchno, measuringunits, season, cropyear, agencycode, cid, partial_complete, receivedDate, dr_mobile) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			for (int i = 0; i < cids.length; i++) {
				// Get godown value using JdbcTemplate
				String godownQuery = "SELECT gid FROM godown WHERE mandal=?";
				List<Map<String, Object>> godownList = jdbcTemplate.queryForList(godownQuery, mcodes[i]);
				if (!godownList.isEmpty()) {
					godown = godownList.get(0).get("gid").toString();
				}

				// Get current qty from stock_entry using JdbcTemplate with LIKE query
				String pcodeWithWildcards = "%" + pcode + "%";
				String totvarietycodeWithWildcards = "%" + totvarietycodes[i] + "%";
				String cidWithWildcards = "%" + cids[i] + "%";

				List<Map<String, Object>> currentQtyList = jdbcTemplate.queryForList(query1, pcodeWithWildcards,
						totvarietycodeWithWildcards, "%" + cropyear + "%", "%" + season + "%", cidWithWildcards);
				long qty = 0;
				if (!currentQtyList.isEmpty()) {
					qty = (Long) currentQtyList.get(0).get("qty");
				}

				// Insert into stock_entry
				Date parsedDate = dateFormat.parse(postdts[i]); // Convert String to Date
				timestamps[i] = new Timestamp(parsedDate.getTime());

				// Perform the stock mismatch validation logic before inserting
				qtytot = "0"; // Reset total received quantity
				String qry2 = "SELECT transactionid, qty_recd, vcode, ben_transid FROM ben_pay_details_v WHERE vcode=? AND seedvariety=? AND cropyear=? AND season=? AND dist_status IS NULL ORDER BY ts";
				List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(qry2, Integer.parseInt(vcodes[i]),
						totvarietycodes[i], Integer.parseInt(cropyear), season);

				for (Map<String, Object> row : resultSet) {
					qtytot = Integer.toString(Integer.parseInt(qtytot) + (Integer) row.get("qty_recd"));
					if (Integer.parseInt(qtytot) <= Integer.parseInt(totqtyallocs[i])) {
						String qry3 = "UPDATE ben_distribution SET sid=? WHERE vcode=? AND transactionid=? AND cropyear=? AND season=?";
						jdbcTemplate.update(qry3, sids.get(i), Integer.parseInt(vcodes[i]), row.get("ben_transid"),
								Integer.parseInt(cropyear), season);
						benUpdateList.add(1); // add success indicator
						stockMismatchFlag = false;
						if (Integer.parseInt(qtytot) == Integer.parseInt(totqtyallocs[i])) {
							break;
						}
					} else {
						if (Integer.parseInt(qtytot) > Integer.parseInt(totqtyallocs[i])) {
							qtytot = Integer.toString(Integer.parseInt(qtytot) - (Integer) row.get("qty_recd"));
							stockMismatchFlag = true;
							String qry3 = "UPDATE ben_distribution SET sid=? WHERE vcode=? AND transactionid=? AND cropyear=? AND season=?";
							jdbcTemplate.update(qry3, 88888888, Integer.parseInt(vcodes[i]), row.get("ben_transid"),
									Integer.parseInt(cropyear), season);
							benUpdateList.add(1); // add success indicator
						}
					}
				}

				// Insert into stock_entry after checking stock mismatch
				jdbcTemplate.update(insertQuery, dcode, mcodes[i], Integer.parseInt(vcodes[i]), totvarietycodes[i],
						totvarietycodes[i].substring(0, 5), totvarietycodes[i].substring(0, 3), totvehiclenos[i],
						agencyname, godown, userid, "remoteAddr", totqtyallocs[i], "15", totlotnos[i], measuringunits,
						season, Integer.parseInt(cropyear), Integer.parseInt(agencycode), Integer.parseInt(cids[i]),
						qty + Integer.parseInt(totqtyallocs[i]) <= Integer.parseInt(totqtypaidfor[i]) ? "C" : "P",
						timestamps[i], mobileNos[i]);

				// Get the sid for batch insert using JdbcTemplate
				String sidQuery = "SELECT sid FROM stock_entry WHERE dist::text LIKE ? AND mandal::text LIKE ? AND cropyear::text LIKE ?";
				List<Map<String, Object>> sidList = jdbcTemplate.queryForList(sidQuery, pcodeWithWildcards,
						"%" + mcodes[i] + "%", "%" + cropyear + "%");
				if (!sidList.isEmpty()) {
					sids.add((Integer) sidList.get(0).get("sid"));
				}
			}

			// Insert stock_appr_cd_mao data using JdbcTemplate batch update
			String stockApprQuery = "INSERT INTO stock_appr_cd_mao(cid, allocated_date, cropyear, season, seedvariety, qty_issued, agencycode, allocateduser_userid, allocateduser_ip, vehicleno, dr_mobile, sid, dt_delivery, vscode) VALUES(?, now(), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			List<Object[]> batchArgs = new ArrayList<>();
			for (int i = 0; i < cids.length; i++) {
				batchArgs.add(new Object[] { Integer.parseInt(cids[i]), Integer.parseInt(cropyear), season,
						totvarietycodes[i], Integer.parseInt(totqtyallocs[i]), Integer.parseInt(agencycode), userid,
						"remoteAddr", totvehiclenos[i], mobileNos[i], sids.get(i), postdts[i],
						Integer.parseInt(vcodes[i]) });
			}

			jdbcTemplate.batchUpdate(stockApprQuery, batchArgs);

			// Return success message
			return "Data submitted successfully";

		} catch (Exception e) {
			e.printStackTrace();
			return "Error in data submission";
		}
	}

//		 public String handleSubmitData(SubmitDataForStock submitData,String cropyear,String season,String  pcode,String spcode,String userid) {
//		     // You can now access the data submitted via AJAX
//		     System.out.println("Received data: " + submitData.toString());
//
//		     // Initialize required variables
//		     String agencycode = "", agencyname = "", godown = "", measuringunits = "";
//		  //    userid = "USER";  // Retrieve from session (hardcoded for example)
////		      pcode = submitData.getPcode();
////		      spcode = submitData.getSpcode();
////		      season = submitData.getSeason();
////		      cropyear = submitData.getCropyear();
//
//		     // Get the arrays from SubmitDataForStock object
//		     String[] cids = submitData.getTotcid().toArray(new String[0]);
//		     String[] totqtyallocs = submitData.getTotqtyalloc().toArray(new String[0]);
//		     String[] totqtyreq = submitData.getTotqtyreq().toArray(new String[0]);
//		     String[] totlotnos = submitData.getTotlotno().toArray(new String[0]);
//		     String[] totvehiclenos = submitData.getTotVehicles().toArray(new String[0]);
//		     String[] vcodes = submitData.getVillages().toArray(new String[0]);
//		     
//		     System.out.println("hrgfhgsjgj--------------------->" + Arrays.toString(vcodes));
//
//			   String[] mcodes = submitData.getMcodes().toArray(new String[0]);
//		     String[] postdts = submitData.getTotPosDts().toArray(new String[0]);
//		     Timestamp[] timestamps = new Timestamp[postdts.length];
//		     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Match the format of your date string
//		     String[] totqtypaidfor = submitData.getTotQtyPaidFor().toArray(new String[0]);
//		     String[] totvarietycodes = submitData.getTotVarietyCodes().toArray(new String[0]);
//		     String[] mobileNos = submitData.getTotMobileNos().toArray(new String[0]);
//
//		     List<Integer> sids = new ArrayList<>();
//
//		     try {
//		         // Query to fetch agency code and name
//		         String query = "SELECT a.agencycode, b.agencyname FROM user_agency a, agency_mst b WHERE a.agencycode = b.agencycode AND a.userid = ?";
//		         List<Map<String, Object>> agencyDetails = jdbcTemplate.queryForList(query, userid);
//
//		         if (!agencyDetails.isEmpty()) {
//		             Map<String, Object> row = agencyDetails.get(0);
//		             agencycode = row.get("agencycode").toString();
//		             agencyname = (String) row.get("agencyname");
//		         }
//
//		         System.out.println("agencycode------------>"+agencycode);
//		         System.out.println("agencyname------------>"+agencyname);
//		         // Loop through cids and insert data into stock_entry
//		         String query1 = "SELECT COALESCE(SUM(quantity::int), 0) AS qty \r\n"
//		         		+ "FROM stock_entry \r\n"
//		         		+ "WHERE CAST(dist AS TEXT) LIKE ? \r\n"
//		         		+ "AND CAST(seedvariety AS TEXT) LIKE ? \r\n"
//		         		+ "AND CAST(cropyear AS TEXT) LIKE ? \r\n"
//		         		+ "AND CAST(season AS TEXT) LIKE ? \r\n"
//		         		+ "AND CAST(cid AS TEXT) LIKE ?";
//		         String insertQuery = "INSERT INTO stock_entry(dist, mandal, vscode, seedVariety, seedName, crop_sub_variety, vehicaleNo, supplyAgency, godownName, userid, imeno, quantity, typeoftransaction, batchno, measuringunits, season, cropyear, agencycode, cid, partial_complete, receivedDate, dr_mobile) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//
//		         for (int i = 0; i < cids.length; i++) {
//		             // Get godown value
//		             String godownQuery = "SELECT gid FROM godown WHERE mandal=?";
//		             List<Map<String, Object>> godownList = jdbcTemplate.queryForList(godownQuery, mcodes[i]);
//		             if (!godownList.isEmpty()) {
//		                 godown = godownList.get(0).get("gid").toString();
//		             }
//
//		             // Get current qty from stock_entry with LIKE query
//		             String pcodeWithWildcards = "%" + pcode + "%";
//		             String totvarietycodeWithWildcards = "%" + totvarietycodes[i] + "%";
//		             String cidWithWildcards = "%" + cids[i] + "%";  
//		             //cropyear
//		             
//		             List<Map<String, Object>> currentQtyList = jdbcTemplate.queryForList(query1, pcodeWithWildcards, totvarietycodeWithWildcards, "%" + cropyear + "%", "%" + season + "%", cidWithWildcards);
//		             long qty = 0;
//		             if (!currentQtyList.isEmpty()) {
//		                 qty = (Long) currentQtyList.get(0).get("qty");
//		             }
//
//		             // Insert into stock_entry
//		             
//		             
//		             Date parsedDate = dateFormat.parse(postdts[i]);  // Convert String to Date
//		             timestamps[i] = new Timestamp(parsedDate.getTime()); 
//		             
//		             
//		             
//		             jdbcTemplate.update(insertQuery, pcode, mcodes[i], Integer.parseInt(vcodes[i]), totvarietycodes[i], totvarietycodes[i].substring(0, 5), totvarietycodes[i].substring(0, 3), totvehiclenos[i], agencyname, godown, userid, "remoteAddr", totqtyallocs[i], "15", totlotnos[i], measuringunits, season, Integer.parseInt(cropyear), Integer.parseInt(agencycode), Integer.parseInt(cids[i]), qty + Integer.parseInt(totqtyallocs[i]) <= Integer.parseInt(totqtypaidfor[i]) ? "C" : "P", timestamps[i], mobileNos[i]);
//
//		             // Get the sid for batch insert
//		             String sidQuery = "SELECT sid "
//		                     + "FROM stock_entry "
//		                     + "WHERE dist::text LIKE ? "
//		                     + "  AND mandal::text LIKE ? "
//		                     + "  AND cropyear::text LIKE ?";
//
//		             List<Map<String, Object>> sidList = jdbcTemplate.queryForList(sidQuery, pcodeWithWildcards, "%" + mcodes[i] + "%", "%" + cropyear + "%");
//		             if (!sidList.isEmpty()) {
//		                 sids.add((Integer) sidList.get(0).get("sid"));
//		             }
//		         }
//
//		         // Insert stock_appr_cd_mao data using batch update
//		         String stockApprQuery = "INSERT INTO stock_appr_cd_mao(cid, allocated_date, cropyear, season, seedvariety, qty_issued, agencycode, allocateduser_userid, allocateduser_ip, vehicleno, dr_mobile, sid, dt_delivery, vscode) VALUES(?, now(), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//		         List<Object[]> batchArgs = new ArrayList<>();
//		         for (int i = 0; i < cids.length; i++) {
//		             batchArgs.add(new Object[]{
//		                Integer.parseInt(cids[i]) , Integer.parseInt(cropyear), season, totvarietycodes[i], Integer.parseInt(totqtyallocs[i]), Integer.parseInt(agencycode), userid, "remoteAddr", totvehiclenos[i], mobileNos[i], sids.get(i), postdts[i], Integer.parseInt(vcodes[i])  
//		             });
//		         }
//
//		         jdbcTemplate.batchUpdate(stockApprQuery, batchArgs);
//		         
//		         
//		         
//		         
//		         
//		         
//		         
//		         
//
//		         // Return success message
//		         return "Data submitted successfully";
//
//		     } catch (Exception e) {
//		         e.printStackTrace();
//		         return "Error in data submission";
//		     }
//		 }

}
