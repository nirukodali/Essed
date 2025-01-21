package com.eseed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eseed.repo.User_registrationRepo;

import java.util.Collections;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private User_registrationRepo userRegistrationRepository;

    public List<Object[]> getUserDetails(String dcode, String mcode, String actId) {
        String status = actId.equals("A") ? "D" : "A"; // Logic for setting status based on actId

        if (dcode != null && (mcode == null || mcode.isEmpty())) {
            // Case when mcode is empty or null
            return userRegistrationRepository.findByDistrictAndStatus(dcode, status);
        } else if (dcode != null && mcode != null && !mcode.isEmpty()) {
            // Case when mcode is not empty
        	System.out.println("IS CALLED0----------------->");
        	System.out.println("dcode: " + dcode + ", mcode: " + mcode + ", status: " + status);
            return userRegistrationRepository.findByDistrictAndBlockAndStatus(dcode, mcode, status);
        }

        // Return empty list if no condition matches
        return Collections.emptyList();
    }
    
    
    
    
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void updateStatus(String activestatus, String dcode, String mcode, String vcodes, String crop) {
    	
    	
//    	 String[] parts = crop.split("_");
//    	  String presentyear ="";
//         // Check if the string has been split correctly
//         if (parts.length == 2) {
//             String prefix = parts[0]; // "RBK"
//             presentyear = parts[1];   // "10690624"
//             
//             System.out.println("Prefix: " + prefix);
//             System.out.println("Code: " + presentyear);
//         } 
    	
    	int cropyear=Integer.parseInt( crop.split("@")[1]);
        String season=crop.split("@")[0];
        
        System.out.println("activestatus: " + activestatus);
        System.out.println("dcode: " + dcode);
        System.out.println("mcode: " + mcode);
        System.out.println("vcodes: " + vcodes);
        System.out.println("cropyear: " + cropyear);
        // Update vill_sec_det
        String villSecQuery = "UPDATE vill_sec_det SET active = ? WHERE dcode = ? AND mcode = ? AND vcode = ?";
        javax.persistence.Query villSecUpdateQuery = entityManager.createNativeQuery(villSecQuery)
            .setParameter(1, activestatus)          // First positional parameter (active)
            .setParameter(2, Integer.parseInt(dcode))  // Second positional parameter (dcode)
            .setParameter(3, Integer.parseInt(mcode))  // Third positional parameter (mcode)
            .setParameter(4, Integer.parseInt(vcodes)); // Fourth positional parameter (vcode)
        villSecUpdateQuery.executeUpdate();

        // Update cluster_master
        String clusterMasterQuery = "update cluster_master set status=? where dcode=? and mcode=? and vcode=? and cropyear=? and season=?";
        javax.persistence.Query clusterMasterUpdateQuery = entityManager.createNativeQuery(clusterMasterQuery)
                .setParameter(1, activestatus)
                .setParameter(2, Integer.parseInt(dcode))
                .setParameter(3, Integer.parseInt(mcode))
                .setParameter(4, Integer.parseInt(vcodes))
                .setParameter(5, (cropyear))
                .setParameter(6, season);
        clusterMasterUpdateQuery.executeUpdate();

        // Update cluster_villages
        String clusterVillagesQuery = "update cluster_villages set status=? where dcode=? and mcode=? and vcode=? and cropyear=? and season=? ";
        javax.persistence.Query clusterVillagesUpdateQuery = entityManager.createNativeQuery(clusterVillagesQuery)
                .setParameter(1, activestatus)
                .setParameter(2, Integer.parseInt(dcode))
                .setParameter(3, Integer.parseInt(mcode))
                .setParameter(4, Integer.parseInt(vcodes))
                .setParameter(5, (cropyear))
                .setParameter(6, season);
        clusterVillagesUpdateQuery.executeUpdate();

        // Update user_registration
        String userRegistrationQuery = "update user_registration set status=? where district=? and blockortehsil=? and village=?";
        javax.persistence.Query userRegistrationUpdateQuery = entityManager.createNativeQuery(userRegistrationQuery)
                .setParameter(1, activestatus)
                .setParameter(2, dcode)
                .setParameter(3, mcode)
                .setParameter(4,vcodes);
        userRegistrationUpdateQuery.executeUpdate();

}
    
}
