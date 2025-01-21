package com.eseed.controller;

import org.springframework.stereotype.Controller;

@Controller
public class CropinsCertDetailsRepController {
	
//	 @Autowired
//	    private CropinsCertDetailsRepository cropinsCertDetailsRepository;
//
//	    // Endpoint to load the page with districts
//	    @GetMapping("/getcropinscertdetails")
//	    public String getDistricts(Model theModel) {
//	        System.out.println("Hitting endpoint: /getcropinscertdetails");
//	        List<DistrictCount> districts = null;
//	        try {
//	            districts = cropinsCertDetailsRepository.getDistrictsCount();
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	        System.out.println("Districts list: " + districts);
//	        theModel.addAttribute("district", districts);
//	        return "cropins/getcropinscertdetails"; // Thymeleaf page name
//	    }
//
//	    // Endpoint to fetch mandals by district code
//	    @GetMapping("/getmandals/{dcode}")
//	    @ResponseBody
//	    public List<MandalCount> getMandals(@PathVariable("dcode") int dcode) {
//	        System.out.println("Hitting endpoint: /getmandals/" + dcode);
//	        List<MandalCount> mandals = null;
//	        try {
//	            mandals = cropinsCertDetailsRepository.getMandalsCount(dcode);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	        System.out.println("Mandals list: " + mandals);
//	        return mandals;
//	    }
//
//	
//	    @GetMapping("/getvillages/{wbvcode}")
//	    @ResponseBody
//	    public List<VillageCount> getVillages(@PathVariable("wbvcode") int wbvcode) {
//	        List<VillageCount> villages = null;
//	        try {
//	            villages = cropinsCertDetailsRepository.getVillagesCount(wbvcode);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	        return villages;
//	    }


}
