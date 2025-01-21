package com.eseed.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class PartitoinsMethods {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	MasterFunctions masterFunctions;

	public List<WbVillageModel> getVillAndMandal(String distcode, String mandcode, String sescrpyear,Integer wbdcode) {
		String season = sescrpyear.split("@")[0];
		String cropyear = sescrpyear.split("@")[1];
//		String wbdist = masterFunctions.masterFunction(distcode, "wbdcode");
System.out.println("wbdcode-------------"+wbdcode);
String dcode=wbdcode.toString();
		if (wbdcode < 10) {
			dcode = "0" + wbdcode;
		}
		String t1 = "ecrop2024.cr_booking_partition_" + season + dcode + cropyear;
		String qry = "select wbvcode,wbvname from wbvillage_mst where dcode=? and mcode=?  and wbvcode in(select distinct cr_vcode from "
				+ t1 + "  where  cr_year=? and cr_season=?  and cultivator_type is not null ) ";
//		and downloaded='Y'
		Query query = entityManager.createNativeQuery(qry);
		query.setParameter(1, Integer.parseInt(distcode));
		query.setParameter(2, Integer.parseInt(mandcode));
		query.setParameter(3, Integer.parseInt(cropyear));
		query.setParameter(4, season);
		// Execute the query and get the result as List<Object[]>
		List<Object[]> result = query.getResultList();
		System.out.println("result");

		List<WbVillageModel> list = new ArrayList<WbVillageModel>();

		for (Object[] bean : result) {
			WbVillageModel wbVillageModel = new WbVillageModel();
			wbVillageModel.setWbvcode((Integer) bean[0]);
			wbVillageModel.setWbvname((String) bean[1]);
			list.add(wbVillageModel);
		}
		System.out.println("list size=>" + list.size());
		return list;
	}

	public List<MaoUnlockModel> getCrop(HttpSession session, HttpServletRequest request,String cropyear,String season) {

		System.out.println("t1-------fxfdgdgdg");
		String mcode = (String) session.getAttribute("mcode");


		String dcode = session.getAttribute("dcode").toString();
		String wbdcode = MasterFunctions.masterFunction(dcode, "wbdcode");

		System.out.println("mcode_______" + mcode);
		
		System.out.println("cropyearrr_______" + cropyear);
		System.out.println("dcodee_______" + dcode);
		System.out.println("wbdcodeee_______" + wbdcode);

		String t1 = "", t2 = "", pattern = "yyyy-MM-dd" ;
		if (Integer.parseInt(wbdcode) <= 9) {
			t1 = "ecrop2024.cr_details_" + season + "0" + wbdcode + cropyear;
			System.out.println("t1-------" + t1);
		} else {
			t1 = "ecrop2024.cr_details_" + season + wbdcode + cropyear;
		}

		System.out.println("t1-------" + t1);

		String qry = " select a.cr_no,ct.cultdesc_loclang,cultdesc,ftype_short,variety,v.varietyname,occupname,occupfname,to_char(cr_sow_date, 'DD-MM-YYYY') as sdate,"
				+ " b.wbdname,b.wbmname,b.wbvname,a.kh_no,a.bookingid,a.vaaauth,a.vroauth,a.ekyc,cn.naturedesc,cr_farmeruid as uid,updatedby,"
				+ " a.cr_sno,a.cr_mix_unmix_ext,a.cr_crop,c.cropname,w.wsrcdesc,a.smsmobileno,a.unlock_reason,a.unlockedext"
				+ " from " + t1
				+ " a,wbvillage_mst_v b,waterresources w ,cropnames c,cr_variety_master v,cultivator_types ct,cropnature cn,cropseed_scheme cs "
				+ " where a.cr_dist_code=b.wbdcode and a.cr_mand_code=b.wbmcode and a.cr_vcode=b.wbvcode and cr_season=? and a.mcode=? and a.cultivator_type=ct.culttype and a.cr_sow_type=cn.id and"
				+ " a.variety=v.varietycode and a.cr_crop=c.cropid and a.cr_w_draw=w.wsrcid and cr_year=? and (a.mismatch not in('D') or a.mismatch is null) and c.cropnature in ('A','S') and "
				+ " c.active='A' and w.active='A' and a.cropseed_scheme=cs.cropschtype and unlockedext is not null and mao_unlock_appr is null order by wbvname,updatedby,bookingid";
		Query query = entityManager.createNativeQuery(qry);
		query.setParameter(1, season);
		query.setParameter(2, Integer.parseInt(mcode));
		query.setParameter(3, Integer.parseInt(cropyear));

		List<Object[]> result = query.getResultList();
		System.out.println("result______________"+result);

		List<MaoUnlockModel> list = new ArrayList<MaoUnlockModel>();
		Integer count = 0;
		for (Object[] bean : result) {
			MaoUnlockModel maoUnlockModel = new MaoUnlockModel();
			count = count + 1;
			maoUnlockModel.setCount(String.valueOf(count));
			maoUnlockModel.setCr_no((String) bean[0].toString());
			maoUnlockModel.setCultdesc_loclang((String) bean[1].toString());
			maoUnlockModel.setCultdesc((String) bean[2].toString());
			maoUnlockModel.setFtype_short((String) bean[3].toString());
			maoUnlockModel.setVariety((String) bean[4].toString());
			maoUnlockModel.setVarietyname((String) bean[5].toString());
			maoUnlockModel.setOccupname((String) bean[6].toString());
			maoUnlockModel.setOccupfname((String) bean[7].toString());
			maoUnlockModel.setCr_sow_date((String) bean[8].toString());
			maoUnlockModel.setWbdname((String) bean[9].toString());
			maoUnlockModel.setWbmname((String) bean[10].toString());
			maoUnlockModel.setWbvname((String) bean[11].toString());
			maoUnlockModel.setKh_no((String) bean[12].toString());
			maoUnlockModel.setBookingid((String) bean[13].toString());
			maoUnlockModel.setVaaauth((String) bean[14].toString());
			maoUnlockModel.setVroauth((String) bean[15].toString());
			
			try {
				maoUnlockModel.setEkyc((String) bean[16].toString());
			}catch(Exception e) {
				e.printStackTrace();
				maoUnlockModel.setEkyc("");
			}
			
			maoUnlockModel.setNaturedesc((String) bean[17].toString());
			maoUnlockModel.setUid((String) bean[18].toString());
			maoUnlockModel.setUpdateby((String) bean[19].toString());
			maoUnlockModel.setCr_sno((String) bean[20].toString());
			maoUnlockModel.setCr_mix_unmix_ext((String) bean[21].toString());
			maoUnlockModel.setCr_crop((String) bean[22].toString());
//			maoUnlockModel.setCropins((String) bean[23].toString());
			maoUnlockModel.setCropname((String) bean[23].toString());
			maoUnlockModel.setWsrcdesc((String) bean[24].toString());
//			maoUnlockModel.setIns_scheme((String) bean[25].toString());
			
			try {
			maoUnlockModel.setSmsmobileno((String) bean[25].toString());
			}catch(Exception e) {
				e.printStackTrace();
				maoUnlockModel.setSmsmobileno("");
			}
			
			maoUnlockModel.setUnlock_reason((String) bean[26].toString());
			maoUnlockModel.setUnlockedext((String) bean[27].toString());

			
			  String table1;
			String table2;
			if (Integer.parseInt(wbdcode) <= 9) {
		             table1= "cr_details_" + season + "0" + wbdcode + cropyear;
		             table2= "cr_booking_partition_" + season + "0" + wbdcode + cropyear;
		         } else {
		             table1 = "cr_details_" + season + wbdcode + cropyear;
		             table2 = "cr_booking_partition_" + season + wbdcode + cropyear;
		         }
			  
			  
			  
			list.add(maoUnlockModel);
		}

		return list;
	}

	public List<UnlockModel> getDetails(HttpSession session, HttpServletRequest request, String cropyear) {
		String secondqry = "select code,concat(code,'. ',reason),group_reason from lock_unlock_reasons where group_reason='U' and active='A' order by code";

		return null;
	}


}
