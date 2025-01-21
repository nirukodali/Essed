package com.eseed.controller;

import java.util.List;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

import com.eseed.repo.AddSeedVarietyRepo;



@Controller
public class AddSeedVariety {
	
	@Autowired
	AddSeedVarietyRepo addSeedVarietyRepo;
	
	@PreAuthorize("hasAuthority('11')")
	@GetMapping("/addseedvariety")
	public String addSeedVarietyproduct(HttpSession httpSession,Model model) {
		String dcode = (String) httpSession.getAttribute("dcode");
		
		
		List<AddSeedVarietyDto> productname=addSeedVarietyRepo.getaddSeedVariety();
		
		List<AddSeedVarietyDto> units=addSeedVarietyRepo.getunits();
		
		List<AddSeedVarietyDto> farmertype=addSeedVarietyRepo.getfarmertype();
		List<AddSeedVarietyDto> getseedgroup=addSeedVarietyRepo.getseedgroup();
		
		model.addAttribute("productname",productname);
		model.addAttribute("units",units);
		model.addAttribute("farmertype",farmertype);
		model.addAttribute("getseedgroup",getseedgroup);
				
		return "adaroles/addSeedVariety";
	
	}
	
	@PreAuthorize("hasAuthority('11') || hasAuthority('15')")
	@GetMapping("/getSubProducts")
	@ResponseBody
	public List<AddSeedVarietyDto> getSubProducts(@RequestParam("productCode") String productCode) {
		
	System.out.println("productcode=="+productCode);
		
	List<AddSeedVarietyDto> subproductname=addSeedVarietyRepo.getaddSeedVarietysubproductcode(productCode);
	
	System.out.println("subproductname " +subproductname);
	
	    return subproductname;
	}
	
	
	@PostMapping("/submitSeedVariety")
	@ResponseBody
	public String submitSeedVariety(@RequestParam Map<String, String> formData, HttpServletRequest request, HttpSession session) {
	    try {
	        // Log the incoming form data
	        System.out.println("Received form data: " + formData);

	        // Extract form data
	        String productCode = formData.get("pcode");  
	        String subProductCode = formData.get("spcode");
	        String varietyName = formData.get("varietyname");
	        String units = formData.get("units");
	        Integer farmertype = Integer.parseInt( formData.get("farmertype"));
	        
	        String groupcode = formData.get("groupcode");
	        
	       List<AddSeedVarietyDto> varitycode= addSeedVarietyRepo.getsubproduct(subProductCode);
	       
	       String varitycodes=varitycode.get(0).getVarietycode();
	       
	       Integer psdcode=Integer.parseInt( varitycodes)+1;
	       
	       String newvarietycode;
	       
		if(psdcode<10)
               newvarietycode = subProductCode +"00"+ psdcode;
           else
                              {
               if(psdcode<100)
            	   newvarietycode = subProductCode +"0"+ psdcode;
               else
            	   newvarietycode=subProductCode+psdcode;
           }
	       
	      
	        if (productCode == null || subProductCode == null || varietyName == null || units == null || farmertype == null || groupcode == null) {
	            return "Missing required form data";
	        }

	        String userid = (String) session.getAttribute("userid");  
	        String clientip = request.getRemoteAddr();  

	        addSeedVarietyRepo.insertSeedVariety(productCode, subProductCode, varietyName, units, farmertype, groupcode, userid, clientip,newvarietycode);

	        return "Data added successfully";  
	    } catch (Exception e) {
	        e.printStackTrace();  
	        return "Data not inserted due to error: " + e.getMessage();
	    }
	}


	
}
