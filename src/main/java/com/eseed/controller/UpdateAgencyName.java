package com.eseed.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eseed.dto.AddSeedVarietyDto;
import com.eseed.dto.AgencyDetailsDto;
import com.eseed.dto.AgencyDto;
import com.eseed.dto.Districtdto;
import com.eseed.repo.AddSeedVarietyRepo;

@Controller
public class UpdateAgencyName {
	//
	
	
	@Autowired
	AddSeedVarietyRepo addSeedVarietyRepo;
	
	@PreAuthorize("hasAuthority('11')")
	@GetMapping("/updateAgencyName")
	public String getDistrict(HttpSession httpSession,Model model) {
		
		
		List<Districtdto> district=addSeedVarietyRepo.getDistrict();
		
		
		
		model.addAttribute("district",district);
		
				
		return "adaroles/updateAgencyName";
	
	}
	
	
	@PreAuthorize("hasAuthority('11')")
	@GetMapping("/getMandalsByDistrict")
	@ResponseBody
	public List<Districtdto> getMandals(@RequestParam("dcode") String districtCode) {
		

	 List<Districtdto> mandals = addSeedVarietyRepo.getMandalsByDistrict(districtCode);
	 
	
	    return mandals;
	}
	
	
	@PreAuthorize("hasAuthority('11')")
	@GetMapping("/getAgencyDetails")
	@ResponseBody
	public Map<String, Object> getAgencyDetails(@RequestParam("mcode") String mcode, Model model) {
	    // Fetch agency details and agency names from the repository
	    List<AgencyDetailsDto> agencyDetails = addSeedVarietyRepo.getAgencyDetails(mcode);
	    List<AgencyDto> agencyName = addSeedVarietyRepo.getagency();
	    
	    // Prepare the response map
	    Map<String, Object> response = new HashMap<>();
	    response.put("agencyDetails", agencyDetails);
	    response.put("agencyNames", agencyName);  // List of agency names
	    
	    // Return the response as a JSON object
	    return response;
	}
	@PostMapping("/updateAgency")
	@ResponseBody
    public String updateAgency(@RequestParam Map<String, String> params,HttpSession session) {
        try {
        Integer cropYear= Integer.parseInt(session.getAttribute("ACTIVEYEAR").toString());
        String season=	session.getAttribute("seasonActive").toString();
        	
            String agencyCode = params.get("agencycode");
            int quantity = Integer.parseInt(params.get("quantity"));
            String seedVariety = params.get("seedvariety");
            Integer dcode=Integer.parseInt(params.get("dcode"));
            String mcode=params.get("mCode");
            Integer agencyCodeold=Integer.parseInt(params.get("agencycodeold"));
  
System.out.println("agencyCodeold==>"+agencyCodeold);

           
addSeedVarietyRepo.updateSeedAgencyDetails( agencyCode, seedVariety, agencyCode, seedVariety,mcode,seedVariety,cropYear,season,agencyCodeold);
            
            return "Agency updated successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error updating agency!";
        }
    }
	
	

}
