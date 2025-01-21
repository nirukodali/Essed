package com.eseed.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.eseed.entity.ActiveSeasonFUC;
import com.eseed.repo.ActiveseasonFUCRepository;

@Controller
public class UploadedCertificatesRepController {
	
	@Autowired 
    private ActiveseasonFUCRepository  activeseasonRepositoryFUC;
	
	
	@GetMapping("/uploadedcertificates")
	public String getCropyear(Model theModel)
	{
	System.out.println("Hitting the api:/uploadedcertificates");
	
	List<ActiveSeasonFUC> cropyears=new ArrayList<ActiveSeasonFUC>();
	
	try {
		cropyears=activeseasonRepositoryFUC.getCropyear();        //get the dropdown with cropyear
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println("The cropyear dropdown:----------> "+cropyears.size());
	
	theModel.addAttribute("cropyears",cropyears);  	
	
    return "agency/uploadedcertificates";   
	
	}
	
	
	@PostMapping("/getCertificates")
	public String findAllV(HttpSession httpSession, @RequestParam("cropyear") String sescrpyear, Model model) 
	{
		// Check if sescrpyear is null or empty
	    if (sescrpyear == null || sescrpyear.isEmpty()) {
	        // If cropyear is not provided, prepare the model with the dropdown data
	        List<ActiveSeasonFUC> cropyears = new ArrayList<ActiveSeasonFUC>();
	        
	        try {
	            // Call the repository method to get the crop years for the dropdown
	            cropyears = activeseasonRepositoryFUC.getCropyear();
	        } catch (Exception e) {
	            // Handle the exception and log it
	            e.printStackTrace();
	        }
	        
	        // Add the crop years to the model so they can be accessed in the view
	        model.addAttribute("cropyears", cropyears);
	        
	        // Return to the "agency/uploadedcertificates" view with the model
	        return "agency/uploadedcertificates";
	    }
	    
		System.out.println("cr_year-------->" + sescrpyear);
		String season = sescrpyear.split("@")[0];
		int year = Integer.parseInt(sescrpyear.split("@")[1]);
		
		List<String> certificatesFUL = null;
		
		try {
			System.out.println("season-------->" + season+" year "+year);
			
			certificatesFUL = activeseasonRepositoryFUC.getCertificates(season,year);
			System.out.println("season- size------->" + certificatesFUL.size());
		} catch (Exception e) {
			model.addAttribute("bind","No data");
			e.printStackTrace();
		}
		
		if (certificatesFUL == null || certificatesFUL.isEmpty()) {
	        model.addAttribute("bind", "No Records Found12213321");
	    } else {
	        model.addAttribute("bind", "Data available");
	    }
		System.out.println("cropreport--------"+certificatesFUL);
		System.out.println("Hitting the api:/getCertificates");
		System.out.println("cr_year-------->" + sescrpyear);
		System.out.println("season-------->" + season);
		System.out.println("year-------->" + year);
		System.out.println("season- size------->" + certificatesFUL.size());
		model.addAttribute("certificates", certificatesFUL);
		
		model.addAttribute("cropyears",activeseasonRepositoryFUC.getCropyear());
		
		return "agency/uploadedcertificates"; 
		

	}


}
