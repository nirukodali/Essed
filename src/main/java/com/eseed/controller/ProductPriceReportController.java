package com.eseed.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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
import com.eseed.dto.AgencyStatusUpdateRequest;
import com.eseed.dto.ProductPriceDto;
import com.eseed.dto.ProductPriceUpdateDto;
import com.eseed.dto.ProductPriceUpdateDto.EditedRow;
import com.eseed.dto.SeasonDto;
import com.eseed.dto.VaritycodeDto;
import com.eseed.repo.AddSeedVarietyRepo;
import com.eseed.repo.ProductPriceRepo;

@Controller
public class ProductPriceReportController {
	
	@Autowired
	ProductPriceRepo productPriceRepo;	
	
	
	
	
	
	/*
	@GetMapping("/ProductPriceReport")
	public String seedvarietyPricesAddition(HttpSession httpSession,Model model) {
		

		
		List<SeasonDto> seasonValues=productPriceRepo.getSeasons();
		
		
		model.addAttribute("seasonValues",seasonValues);
	
		
		return "adaroles/productPrice";
	
	}
	@PostMapping("/varietyProduct")
	@ResponseBody
	public List<VaritycodeDto> getVarietyProduct(@RequestParam Map<String, String> formData, HttpServletRequest request, HttpSession session) {
	     
		List<VaritycodeDto> varityName=null;
	    try {
	       
	    	String seasons = formData.get("seasonname"); 
	    	String[] seasonValues = seasons.split("@");
	    	String	season=seasonValues[0];
	    	String cropYear=seasonValues[1];
	    	
	    	varityName=productPriceRepo.varietycode(season,cropYear);
	    	
	    	System.out.println("varityName==>"+varityName);
	    	
	        return varityName;  
	    } catch (Exception e) {
	        e.printStackTrace();  
	    }
	    return varityName;
	}
	*/
	@Autowired
	AddSeedVarietyRepo addSeedVarietyRepo;	

	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@GetMapping("/ProductPriceReport")
	public String seedvarietyPricesAddition(HttpSession httpSession,Model model) {
		
		List<AddSeedVarietyDto> productname=addSeedVarietyRepo.getaddSeedVariety();
		List<SeasonDto> seasonValues=addSeedVarietyRepo.getSeasonname();
		List<SeasonDto> cropYear=addSeedVarietyRepo.getcropYear();
		
		model.addAttribute("productname",productname);
		model.addAttribute("seasonValues",seasonValues);
		model.addAttribute("cropYear",cropYear);
		
		return "adaroles/productPrice";
	
	}
	
	
	
	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@GetMapping("/productPrice")
	@ResponseBody
	public List<ProductPriceDto> getproductPrice(@RequestParam Map<String, String> formData,HttpSession httpSession,Model model) {
		
/*
		String seasons = formData.get("seasonname"); 
    	String[] seasonValue = seasons.split("@");
    	String	season=seasonValue[0];
    	String cropYear=seasonValue[1];
    	*/
		
		String  season = formData.get("seasonname");
		String 	cropYear=formData.get("cropyear");
    	String seedvariety=formData.get("seedvariety");
    	
    	System.out.println("seasons "+season);
    	System.out.println("seedvariety "+seedvariety);
		
		List<ProductPriceDto> productPriceVaules=productPriceRepo.productPrice(season,Integer.parseInt(cropYear),seedvariety);
		
		System.out.println("productPriceVaules==>>"+productPriceVaules);
	
    	
		
		//model.addAttribute("productPriceVaules",productPriceVaules);
	
		
		return productPriceVaules;
	
	}
	@PostMapping("/UpdateProductPrice")
	@ResponseBody
	public  Integer  updateProductPrice(@RequestBody ProductPriceUpdateDto request) {
		
		 Map<String, Object> response = new HashMap<>();
	    try {
	    	SimpleDateFormat inputFormat = new SimpleDateFormat("dd/mm/yyyy");
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
	    	
	    	/*
	    	String seasons = request.getSeasonname();	    	
	    	String[] seasonValue = seasons.split("@");
	    	String	season=seasonValue[0];
	    	String cropYear=seasonValue[1];
	    	*/
            String season = request.getSeasonname();
            String cropYear=request.getCropYear();
	    	String varietycode=request.getSeedvariety();
	    	
	    	 for (EditedRow updatedData : request.getUpdatedData()) {
			String product_price = updatedData.getProduct_price();
			String SubsidyAmount = updatedData.getSubsidy_amt();
			String NonSubsidyAmount = updatedData.getNonsubsidy_amt();
			String fromDate = updatedData.getFromdate();			
			String fromDate2 = outputFormat.format(inputFormat.parse(fromDate));		
			String toDate = updatedData.getTodate();
			String toDate2 = outputFormat.format(inputFormat.parse(toDate));
			String quantityPerBag=updatedData.getQuantityperbag();			
			Integer dcode=updatedData.getDcode();			
			String psd = updatedData.getPayment_from_dt();
			String psd2 = outputFormat.format(inputFormat.parse(psd));
			String pcd = updatedData.getPayment_close_dt();
			String pcd2 = outputFormat.format(inputFormat.parse(pcd));
			String dsd = updatedData.getDist_from_dt();
			String dsd2 = outputFormat.format(inputFormat.parse(dsd));
			String dcd = updatedData.getDist_close_dt();
			String dcd2 = outputFormat.format(inputFormat.parse(dcd));
			
			
			/*
			System.out.println("Product Price: " + product_price);
			System.out.println("From Date: " + fromDate);
			System.out.println("dcode: " + dcode);
			System.out.println("Subsidy Amount: " + SubsidyAmount);
			System.out.println("Non-Subsidy Amount: " + NonSubsidyAmount);
			System.out.println("From Date: " + fromDate);
			System.out.println("To Date: " + toDate);
			System.out.println("Quantity per Bag: " + quantityPerBag);	
			System.out.println("paymentStartDate: " + paymentStartDate);
			System.out.println("paymentCloseDate: " + paymentCloseDate);
			System.out.println("distributionStartDate: " + distributionStartDate);
			System.out.println("distributionCloseDatee: " + distributionCloseDate);
			System.out.println("varietycode: " + varietycode);
									 */
		Integer	 productPriceUpdate= productPriceRepo.getUpdateProductPrice( season,Integer.parseInt(cropYear),product_price,SubsidyAmount,NonSubsidyAmount,fromDate2,
				toDate2,quantityPerBag,dcode,varietycode,psd2,pcd2,dsd2,dcd2);
	    

		if (productPriceUpdate <= 0) {
            return 1;  // If any update fails, return an error (or handle appropriately)
        }
    
	    	 }  return 0;
	    	 
		    } catch (Exception e) {
		    	e.printStackTrace();
		        
		        return 1;
		    }
	}
	


	@PostMapping("/updateAgencyStatus")
	@ResponseBody
	public String updateAgencyStatus(@RequestBody AgencyStatusUpdateRequest request) {
		
		/*String seasons = request.getSeasonname(); 
    	String[] seasonValue = seasons.split("@");
    	String	season=seasonValue[0];
    	String cropYear=seasonValue[1];*/
    	
    	String  season = request.getSeasonname();
		String 	cropYear=request.getCropyear();
		//System.out.println("cropYear==>"+cropYear);
    	
    	String seedvariety=request.getSeedvariety();
    	
    	String active=request.getStatus();
    	
    	String dcode=request.getDcode();
    	
		System.out.println("status"+	request.getStatus() );
		
		System.out.println("status"+	request.getSeedvariety() );
		System.out.println("dcode"+	dcode );
		productPriceRepo.getActiveandInactive(season,Integer.parseInt(cropYear),seedvariety,Integer.parseInt(dcode),active);
		
	    return "Status updated successfully";
	}

	
	
}
