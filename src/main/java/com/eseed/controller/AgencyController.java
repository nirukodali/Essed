package com.eseed.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eseed.dto.AddSeedVarietyDto;
import com.eseed.dto.Cluster;
import com.eseed.dto.MandalDto;
import com.eseed.dto.SeasonDto;
import com.eseed.dto.SubmitDataForStock;
import com.eseed.dto.VillageDto;
import com.eseed.repo.AddSeedVarietyRepo;

@Controller
public class AgencyController {
	
	@Autowired
	AddSeedVarietyRepo addSeedVarietyRepo;
	
	
	
	@PreAuthorize("hasAuthority('15')")
	@GetMapping("/getstock")

	public String getEntryStock(org.springframework.ui.Model model) {
		
		
		
		List<AddSeedVarietyDto> productname=addSeedVarietyRepo.getaddSeedVariety();
		List<SeasonDto> seasonValues=addSeedVarietyRepo.getSeasonname();
		List<SeasonDto> cropYear=addSeedVarietyRepo.getcropYear();
		
		model.addAttribute("seasonValues",seasonValues);
		model.addAttribute("cropYear",cropYear);
		
		
		model.addAttribute("productname",productname);

		return "apssdc/dmagencystockentry";
		
	}
	
	
	
	  @GetMapping("/getMandals")
	  @ResponseBody
	    public List<MandalDto> getMandalsByDcode(HttpSession session) {
	        // Call the service method and return the result
		  String dcode=  (String) session.getAttribute("dcode");
	        return addSeedVarietyRepo.getMandalsByDcode(dcode.toString());
	    }
	  
	  @GetMapping("/getVillages")
	  @ResponseBody
	    public List<VillageDto> getVillages( @RequestParam("mcode") String mcode,HttpSession session) {
		  String dcode= (String) session.getAttribute("dcode");
	        return addSeedVarietyRepo.getVillagesByDcodeAndMcode(dcode, mcode);
	    }
	  
	  
	  
	  @PostMapping("/submitstockentry")
	  
	    public String submitSeedVariety(@RequestParam String season, 
	                                    @RequestParam String cropYear, 
	                                    @RequestParam String mcode, 
	                                    @RequestParam String vcode, 
	                                    @RequestParam String pcode, 
	                                    @RequestParam String spcode,  HttpSession session ,Model model) {
	        // Process the form submission logic here
	        // Example: Save the seed variety or perform other necessary actions

	        // For now, just print the submitted values
	        System.out.println("Season: " + season);
	        System.out.println("Crop Year: " + cropYear);
	        System.out.println("Mandal Code: " + mcode);
	        System.out.println("Village Code: " + vcode);
	        System.out.println("Product Code: " + pcode);
	        System.out.println("Sub Product Code: " + spcode);
	        session.setAttribute("season", season);
	        session.setAttribute("cropYear", cropYear);
	        session.setAttribute("mcode", mcode);
	        session.setAttribute("vcode", vcode);
	        session.setAttribute("pcode", pcode);
	        session.setAttribute("spcode", spcode);
	       
	        // If everything is processed successfully, return a success message
	        return "redirect:/getstockentryintf";
	    }

	  
	  
	  @GetMapping("/getstockentryintf")
	  public String getStockEntryCheck(HttpSession session, Model model) {
		  
		  String season = (String) session.getAttribute("season");
	        String cropYear = (String) session.getAttribute("cropYear");
	        String mcode = (String) session.getAttribute("mcode");
	        String vcode = (String) session.getAttribute("vcode");
	        String pcode = (String) session.getAttribute("pcode");
	        String spcode = (String) session.getAttribute("spcode");
	        
	        System.out.println("Season1:--------------------> " + season);
	        System.out.println("Crop Year1: -------------------->" + cropYear);
	        System.out.println("Mandal Code1: -------------------->" + mcode);
	        System.out.println("Village Code1: -------------------->" + vcode);
	        System.out.println("Product Code1: -------------------->" + pcode);
	        System.out.println("Sub Product Code1: -------------------->" + spcode);
	        
	        
	        String dcode= (String) session.getAttribute("dcode");
	        System.out.println("dcode---------------->"+dcode);
	        String user= (String) session.getAttribute("userid");
	        System.out.println("user---------------->"+user);

	        System.out.println("1--------------------------------------------------->");
	        String agencyname = addSeedVarietyRepo.getAgencyName(user);
	        System.out.println("2------------------------------------------------->");
	        String agencycode = addSeedVarietyRepo.getAgencyCode(user);
	        System.out.println("3------------------------------------------------->");
	        
	        List<Cluster> clusters = addSeedVarietyRepo.getClusters(cropYear, season, dcode, mcode, vcode, pcode, spcode,agencycode);
	        
	        
	        model.addAttribute("agencyname", agencyname);
	        model.addAttribute("agencycode", agencycode);
	        model.addAttribute("clusters", clusters);
	        model.addAttribute("user", user);
	        model.addAttribute("cropyear", cropYear);
	        model.addAttribute("season", season);
	        model.addAttribute("dcode", dcode);
	        model.addAttribute("mcode", mcode);
	        model.addAttribute("vcode", vcode);
	        model.addAttribute("productcode", pcode);
	        model.addAttribute("subproductcode", spcode);

	    
		  
		  return "apssdc/getstockentryintf";
		  
	  }
	  
	  
	  
	  
	  
	  @PostMapping("/submitDataforstock")
	 // @ResponseBody
	    public String handleSubmitData(@RequestBody SubmitDataForStock submitData,HttpSession session,HttpServletResponse response) throws IOException {
		  
		  
		  String season = (String) session.getAttribute("season");
	        String cropYear = (String) session.getAttribute("cropYear");
	        
	        String pcode = (String) session.getAttribute("pcode");
	        String spcode = (String) session.getAttribute("spcode");
	        String userid=(String) session.getAttribute("userid");
	        String dcode=(String) session.getAttribute("dcode");
	        
	        System.out.println("userid---------------->"+userid);
	        System.out.println("Received data: " + submitData.toString());
	        
	       // List<Agency> agency=   addSeedVarietyRepo.getAllAgencies(userid);
	      
	          addSeedVarietyRepo.handleSubmitData(submitData,cropYear,season,pcode,spcode,userid,dcode);
	     
	        
	        
	        
	        

	          response.sendRedirect("/getstock");
	          return null; // Return null as we're handling the redirect directly
	    }
	  
	 
	  
	  
}
