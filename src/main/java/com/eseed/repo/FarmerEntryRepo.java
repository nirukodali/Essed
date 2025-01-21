package com.eseed.repo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.xml.crypto.Data;
import javax.persistence.Query;
import org.springframework.stereotype.Component;

import com.eseed.dto.AddSeedVarietyDto;
import com.eseed.dto.AgencyDetailsDto;
import com.eseed.dto.AgencyDto;
import com.eseed.dto.Districtdto;
import com.eseed.dto.FarmerDto;
import com.eseed.dto.ProductPricesDto;
import com.eseed.dto.SeasonDto;
import com.eseed.dto.SeedVarietyCodeDto;
import com.eseed.dto.SeedVarietyNameDto;

@Component
public class FarmerEntryRepo {

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public List<FarmerDto> getaddSeedVariety(Integer vcode) {

		String qry = "select cr_sno,tot_extent from totextents_v_wise where cr_vcode=? ";
		List<FarmerDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, vcode);
		List<Object> objects = sql.getResultList();
		if (objects != null && objects.size() > 0) {
			for (Object patta : objects) {
				Object[] row = (Object[]) patta;
				FarmerDto farmerDto = new FarmerDto();
				farmerDto.setCr_sno(row[0].toString());
				farmerDto.setTot_extent((BigDecimal) row[01]);
				data.add(farmerDto);
			}
		}

		return data;

	}

	@Transactional
	public List<FarmerDto> gettotalExtent(String cr_sno) {

		String qry = "select cr_sno,tot_extent from totextents_v_wise where cr_sno=? ";
		List<FarmerDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, cr_sno);
		List<Object> objects = sql.getResultList();
		if (objects != null && objects.size() > 0) {
			for (Object patta : objects) {
				Object[] row = (Object[]) patta;
				FarmerDto farmerDto = new FarmerDto();
				farmerDto.setCr_sno(row[0].toString());
				farmerDto.setTot_extent((BigDecimal) row[01]);
				data.add(farmerDto);
			}
		}

		return data;

	}

	@Transactional
	public int insertFarmerDetails(Integer dcode, Integer mcode, String season, String vcode, String crSno,
			String totalExtent, String occupName, String occupFName, String tenant, String mobileNo, String aadharNo,
			String calamity, String sownId, String damagedCrop, String conextent, String areaExtent, Integer wbdcode,
			Integer wbmcode,String userid,String ip,Integer cropYear) {

		String qry = " INSERT INTO other_farmerdetails(dcode, mcode, vcode, occupname, occupfname, "
				+ " farmer_uid, cr_sno, extent,season,crop_sown ,damaged_crop,"
				+ "contingency_ext,damaged_ext,mobileno,calamity,owner_tenant,wbdcode,wbmcode,created_by,ipaddress,created_dt,cropyear)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  ?,  ?,?,?,?,?,?,?,?,?,now(),?)";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		sql.setParameter(1, dcode);
		sql.setParameter(2, mcode);
		sql.setParameter(3, Integer.parseInt(vcode));
		sql.setParameter(4, occupName);
		sql.setParameter(5, occupFName);
		sql.setParameter(6, aadharNo);
		sql.setParameter(7, crSno);
		sql.setParameter(8, new BigDecimal(totalExtent));
		sql.setParameter(9, season);
		sql.setParameter(10, sownId);
		sql.setParameter(11, damagedCrop);
		sql.setParameter(12, new BigDecimal(conextent));
		sql.setParameter(13, new BigDecimal(areaExtent));
		sql.setParameter(14, new BigDecimal(mobileNo));
		sql.setParameter(15, calamity);
		sql.setParameter(16, tenant);
		sql.setParameter(17, wbdcode);
		sql.setParameter(18, wbmcode);
		sql.setParameter(19, userid);
		sql.setParameter(20, ip);
		sql.setParameter(21, cropYear);
		return sql.executeUpdate();

	}

}
