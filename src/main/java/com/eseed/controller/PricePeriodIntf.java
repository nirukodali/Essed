package com.eseed.controller;

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
import com.eseed.dto.NewProductPriceDto;
import com.eseed.dto.SeasonDto;
import com.eseed.repo.AddSeedVarietyRepo;
import com.eseed.repo.ProductPriceRepo;


@Controller
public class PricePeriodIntf {
	
	@Autowired
	ProductPriceRepo productPriceRepo;
	
	@Autowired
	AddSeedVarietyRepo addSeedVarietyRepo;
	
	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@GetMapping("/pricePeriodNew")
	public String PriceProduct(Model model) {
		
		List<SeasonDto> activeSeason = productPriceRepo.getSeasonsValues();
		List<AddSeedVarietyDto> seedVariety = productPriceRepo.getSeedVariety();
		
		model.addAttribute("activeSeason",activeSeason);
		model.addAttribute("seedVariety",seedVariety);
		
		return "adaroles/newPricePeriodIntf";
	}
	
	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@GetMapping("/pricePeriodDetails")
	@ResponseBody
	public List<NewProductPriceDto> getnewProductprice(@RequestParam("cropYear") String cropYear,@RequestParam("seasonCode") String seasonCode,@RequestParam("seedCode") String seedCode) {

		List<NewProductPriceDto> newProductpriceDto = productPriceRepo.getDataForNewPrice( Integer.parseInt(cropYear),seedCode,seasonCode);
	
	    return newProductpriceDto;
	}
	
	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@GetMapping("/pricePeriodUpdateDetails")
	public String getProductpriceUpdate(			
			@RequestParam("distname") String distName,  // Ensure the name matches
		    @RequestParam("varietyName") String varietyName,
		    @RequestParam("productPrice") Double productPrice,
		    @RequestParam("subsidyAmt") Double subsidyAmt,
		    @RequestParam("nonsubsidyAmt") Double nonsubsidyAmt,
		    @RequestParam("fromDate") String fromDate,
		    @RequestParam("toDate") String toDate,
		    @RequestParam("quantityPerBag") Integer quantityPerBag,
		    @RequestParam("seedCode") String seedCode, @RequestParam("cropYear") Integer cropYear, 
		    @RequestParam("seasonCode") String seasonCode,
		    
		    @RequestParam("active") Character active,
		    @RequestParam("dCode") Integer distCode,
		    @RequestParam("varietyCode") String varietyCode,Model model){
		
		model.addAttribute("distName",distName);
		model.addAttribute("varietyName",varietyName);
		model.addAttribute("productPrice",productPrice);
		model.addAttribute("productPrice",productPrice);
		model.addAttribute("subsidyAmt",subsidyAmt);
		model.addAttribute("fromDate",fromDate);
		model.addAttribute("toDate",toDate);
		model.addAttribute("quantityPerBag",quantityPerBag);
																
		model.addAttribute("seedCode",seedCode);
		model.addAttribute("cropYear",cropYear);
		model.addAttribute("seasonCode",seasonCode);
		model.addAttribute("distCode",distCode);
		model.addAttribute("varietyCode",varietyCode);
		
	    return "adaroles/NewPricePeriodView";
	}
	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@ResponseBody
	@PostMapping("/pricePeriodUpdate")
	public String updatePricePeriod(@RequestBody Map<String, String> request, HttpSession session, HttpServletRequest httpServletRequest) {
		
		String status = "";
		
		String varietyCode = request.get("varietycode");
		String dCode = request.get("distCode");
		String seasonCode = request.get("seasonCode");
		String cropyear = request.get("cropyear");
		String fromDate = request.get("fromDate");
		String toDate = request.get("toDate");
		String prdPrice = request.get("prdPrice");
		String subSidyAmount = request.get("subSidyAmount");
		String quantityPerBag = request.get("quantityPerBag");
		String subSidyPercent = request.get("subSidyPercent");
		
		status = productPriceRepo.updateNewProductPrice(session, httpServletRequest, varietyCode, dCode, seasonCode, cropyear, fromDate, toDate, prdPrice, subSidyAmount, quantityPerBag, subSidyPercent);
		
        System.out.println("status===>>   "+status);
        
	    return status;
	}
	
}
