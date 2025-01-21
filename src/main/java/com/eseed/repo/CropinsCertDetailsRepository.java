package com.eseed.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class CropinsCertDetailsRepository {

    @PersistenceContext
    private EntityManager entityManager;
    
   

//    public List<DistrictCount> getDistrictsCount() {
//        String qry = "select b.wbedname,count(*),a.dcode \r\n"
//        		+ "from ecrop2024.cropins_cert_details a,wbvillage_mst b \r\n"
//        		+ "where a.dcode=b.dcode and a.cr_vcode=b.wbvcode \r\n"
//        		+ "group by wbedname,a.dcode \r\n"
//        		+ "order by wbedname";
//
//        Query query = entityManager.createNativeQuery(qry);
//
//        List<Object[]> result = query.getResultList();
//        List<DistrictCount> list = new ArrayList<>();
//
//        for (Object[] bean : result) {
//            DistrictCount districtCount = new DistrictCount();
//            
//            districtCount.setWbedname((String) bean[0]);
//            districtCount.setCount(((BigInteger) bean[1]).intValue()); 
//            districtCount.setDcode(((Integer) bean[2]).intValue()); 
//            list.add(districtCount);
//        }
//
//        return list;
//    }
//   
//    public List<MandalCount> getMandalsCount(int dcode) {
//        String qry = "SELECT b.wbedname, b.wbemname, COUNT(*), b.wbvcode " +
//                     "FROM ecrop2024.cropins_cert_details a, wbvillage_mst b " +
//                     "WHERE a.dcode = :dcode AND a.cr_vcode = b.wbvcode " +
//                     "GROUP BY b.wbedname, b.wbemname, b.wbvcode " +
//                     "ORDER BY b.wbedname, b.wbemname";
//
//        Query query = entityManager.createNativeQuery(qry);
//        query.setParameter("dcode", dcode);
//
//        @SuppressWarnings("unchecked")
//        List<Object[]> results = query.getResultList();
//        List<MandalCount> mandals = new ArrayList<>();
//
//        for (Object[] result : results) {
//            MandalCount mandal = new MandalCount();
//            mandal.setWbedname((String) result[0]); // Set district name
//            mandal.setWbemname((String) result[1]); // Set mandal name
//            mandal.setCount(((BigInteger) result[2]).intValue()); // Set count
//            mandal.setWbvcode((int) result[3]); // Set village code (added)
//
//            mandals.add(mandal);
//        }
//
//        return mandals;
//    }
//
//
//
//    
//    public List<VillageCount> getVillagesCount(int wbvcode) {
//    	
//        String qry = "select b.wbedname,b.wbemname,b.wbevname,count(*) \r\n"
//        		+ "from ecrop2024.cropins_cert_details a,wbvillage_mst b \r\n"
//        		+ "where a.dcode=b.dcode and a.cr_vcode=:wbvcode \r\n"
//        		+ "group by wbedname,wbemname,wbevname \r\n"
//        		+ "order by wbedname,wbemname,wbevname";
//
//        Query query = entityManager.createNativeQuery(qry);
//        query.setParameter("wbvcode", wbvcode); // Using named parameter for clarity
//
//        List<Object[]> result = query.getResultList();
//        List<VillageCount> list = new ArrayList<>();
//
//        for (Object[] bean : result) {
//        	VillageCount villageCount = new VillageCount();
//
//        	villageCount.setWbedname((String) bean[0]);
//        	villageCount.setWbemname((String) bean[1]);
//        	villageCount.setWbevname((String) bean[2]);
//        	villageCount.setCount(((BigInteger) bean[3])); 
//        	
//            list.add(villageCount);
//        }
//
//        return list;
//    }
    
}

