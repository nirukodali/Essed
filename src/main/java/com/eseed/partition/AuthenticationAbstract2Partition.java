package com.eseed.partition;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.eseed.entity.Authenticationabstract;

@Repository
@Transactional

public class AuthenticationAbstract2Partition {
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public List<Authenticationabstract> getAuthAbs2(String cropyear,String dcode,String status,String season) {
		
				String part_key = "",tab1,tab2;
				
				
		        	tab1 = "ben_distribution";
		        	tab2 = "mandal_2011_cs";
		       

				String qry = " select b.mname,  count(*) as count ,sum(qty_recd) as qty_recd,sum(subsidyamt) as ubsidyamt ,"
						+ "a.mcode FROM "+ tab1 +" a,  "+ tab2 +" b where "
						+ "cropyear=? and season=? and a.dcode=?"
								+ " and status=?  and a.mcode=b.mcode "
						+ "and authenticated_code :::: int in (?,?) group by a.mcode,b.mname order by a.mcode   ";
				
				

				List<Authenticationabstract> data = new ArrayList<>();
				Query sql = (Query) entityManager.createNativeQuery(qry);
				
				sql.setParameter(1, Integer.parseInt(cropyear)); 
				sql.setParameter(2, season); 
				sql.setParameter(3, Integer.parseInt(dcode)); 
				sql.setParameter(4,'1'); 
				
				
				if(status.equals("1")) {
					sql.setParameter(5,1);	
					sql.setParameter(6,2);	
				}if(status.equals("2")) {
					sql.setParameter(5,5);	
					sql.setParameter(6,6);	
				}if(status.equals("3")) {
					sql.setParameter(5,3);	
					sql.setParameter(6,4);	
				}
				List<Object> objects = sql.getResultList();
				System.out.println(qry);

				if (objects != null && objects.size() > 0) {

					for (Object patta : objects) {

						Object[] row = (Object[]) patta;

						Authenticationabstract pojos = new Authenticationabstract();

						pojos.setMname((String) row[0]);
						pojos.setCount((BigInteger)(row[1]));
						pojos.setQty_recd((BigInteger)(row[2]));
						pojos.setUbsidyamt((Double) (row[3]));
						pojos.setMcode((Integer)(row[4]));
						data.add(pojos);
					}
				}
				return data;

			}

	
public List<Authenticationabstract> getAuthAbs3(String cropyear,String mcode,String status,String season) {
		
		System.out.println("cropyearewrjfhjwefbewj====="+cropyear);
		System.out.println("status==========="+status);
		System.out.println("season==========="+season);
				

				String part_key = "",tab1,tab2;
				
				
		        	tab1 = "ben_distribution";
		        	tab2 = "varietymast";
		       

				String qry1 = " select b.name,count(*) as cnt ,sum(qty_recd) as qtyrecd,sum(subsidyamt) as subsidyamt,seedvariety FROM "+tab1+" a,"+tab2+" b \r\n"
						+ "where cropyear=? and season=? and mcode=? and a.seedvariety=b.varietycode\r\n"
						+ "and status=? and authenticated_code::::int in (?,?)   group by seedvariety, b.name order by seedvariety    ";
				
				

				List<Authenticationabstract> data = new ArrayList<>();
				Query sql1 = (Query) entityManager.createNativeQuery(qry1);
				
				sql1.setParameter(1, Integer.parseInt(cropyear)); 
				sql1.setParameter(2, season); 
				sql1.setParameter(3, Integer.parseInt(mcode)); 
				sql1.setParameter(4,'1'); 
				
				
				if(status.equals("1")) {
					sql1.setParameter(5,1);	
					sql1.setParameter(6,2);	
				}if(status.equals("2")) {
					sql1.setParameter(5,5);	
					sql1.setParameter(6,6);	
				}if(status.equals("3")) {
					sql1.setParameter(5,3);	
					sql1.setParameter(6,4);	
				}
				List<Object> objects = sql1.getResultList();
				System.out.println(qry1);

				if (objects != null && objects.size() > 0) {

					for (Object patta : objects) {

						Object[] row = (Object[]) patta;

						Authenticationabstract pojos = new Authenticationabstract();

						pojos.setName((String) row[0]);
						pojos.setCnt((BigInteger)(row[1]));
						pojos.setQtyrecd((BigInteger)(row[2]));
						pojos.setSubsidyamt((Double) (row[3]));
						//pojos.setMcode((Integer)(row[4]));
						data.add(pojos);
					}
				}
				return data;

			}

	
	
}
