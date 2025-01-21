package com.eseed.partition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.eseed.entity.Otptransactions;

@Component
public class OtptransactionsPartition {
	@PersistenceContext
	
	private EntityManager entityManager;
	
	public List<Otptransactions> otp(String cropyear,String dcode){
		
		
		String[] season = cropyear.split("@");System.out.println("cropyear"+cropyear);
		String seasonType = season[0];System.out.println("seasonType===="+seasonType);
		Integer seasonYear = Integer.parseInt(season[1]);System.out.println("seasonYear"+seasonYear);

		String part_key = "",tab1,tab2,tab3,tab4;
		
		part_key = seasonType + seasonYear;
		
        	tab1 = "ben_distribution";
        	tab2 = "otpdetails";
        	tab3 = "varietymast";
        	tab4 = "vill_sec_det";
       

		String qry = " select v.vsdname,v.vsmname,v.vname,farmername,b.transactionid,o.otp_id,vm.name as variety,\r\n"
				+ "sum(qty_recd) as qtylifted,statusts,b.cropyear,b.season,v.dcode,v.mcode,v.vcode from "+ tab1 +" b,\r\n"
				+ " "+ tab2 +" o, "+ tab3 +" vm ,"+ tab4 +" v  where b.transactionid=o.transactionid and \r\n"
				+ "b.seedvariety=vm.varietycode and b.dcode=v.dcode  and b.mcode=v.mcode and b.vcode=v.vcode \r\n"
				+ "and b.status='1' and b.cropyear="+ seasonYear +" AND b.season='"+ seasonType +"' and b.dcode='"+ dcode +"' group by vsdname,\r\n"
				+ "vsmname,v.vname,v.dcode,v.mcode,v.vcode,b.transactionid,otp_id,farmername,statusts,\r\n"
				+ "vname,variety,b.cropyear,b.season order by vsdname,vsmname,vname ,variety  ";
		
		

		List<Otptransactions> data = new ArrayList<>();
		Query sql = (Query) entityManager.createNativeQuery(qry);

		List<Object> objects = sql.getResultList();
		System.out.println(qry);

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				Otptransactions pojos = new Otptransactions();

				pojos.setVsdname((String) row[0]);
				pojos.setVsmname((String) row[1]);
				pojos.setVname((String) row[2]);
				pojos.setFarmername( (String) row[3]);
				pojos.setTransactionid((Integer) row[4]);
				pojos.setOtp_id((Integer) row[5]);
				pojos.setVariety((String) row[6]);
				pojos.setQtylifted(Long.valueOf(row[7].toString()));
				pojos.setStatusts((Date) row[8]);
				data.add(pojos);
			}
		}
		return data;

	}

}
