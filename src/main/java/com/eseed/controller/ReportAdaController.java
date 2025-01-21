package com.eseed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eseed.dto.AddSeedVarietyDto;
import com.eseed.dto.Districtdto;
import com.eseed.dto.SeasonDto;
import com.eseed.repo.AddSeedVarietyRepo;
import com.eseed.repo.ProductPriceRepo;

@Controller
public class ReportAdaController {

	
	
	@GetMapping("/Rep_urbanAbs_Intf")
	public String detailPer(Model model) {
		return "adaroles/Rep_urbanAbs_Intf";
	}
	
	@Autowired
	AddSeedVarietyRepo addSeedVarietyRepo;	
	
	
	@GetMapping("/Rep_SeedVarietyDetails")
	public String SeedVarietyDet(Model model) {
		
//		List<AddSeedVarietyDto> productname=addSeedVarietyRepo.getaddSeedVariety();
		List<SeasonDto> seasonValues=addSeedVarietyRepo.getSeasonname();
		List<SeasonDto> cropYear=addSeedVarietyRepo.getcropYear();
		List<Districtdto> district = addSeedVarietyRepo.getDistrict();

//		model.addAttribute("productname",productname);
		model.addAttribute("seasonValues",seasonValues);
		model.addAttribute("cropYear",cropYear);
		model.addAttribute("district", district);
		
		
		return "adaroles/Rep_SeedVarietyDetails";
	}
	
	
	
	
	@GetMapping("/Rep_UserRegDetailsIntf")
	public String UserRegDet(Model model) {
		
//		List<AddSeedVarietyDto> productname=addSeedVarietyRepo.getaddSeedVariety();
		List<SeasonDto> seasonValues=addSeedVarietyRepo.getSeasonname();
		List<SeasonDto> cropYear=addSeedVarietyRepo.getcropYear();
		List<Districtdto> district = addSeedVarietyRepo.getDistrict();

//		model.addAttribute("productname",productname);
		model.addAttribute("seasonValues",seasonValues);
		model.addAttribute("cropYear",cropYear);
		model.addAttribute("district", district);
		
		
		return "adaroles/Rep_UserRegDetailsIntf";
	}
	
	
	
	
	
	@Autowired
	ProductPriceRepo productPriceRepo;	
	
	@GetMapping("/VSDistrictCDRepIntf")
	public String VSDistrictCDDet(Model model) {
		
	List<SeasonDto> seasonValues=productPriceRepo.getSeasons();
		
		
		model.addAttribute("seasonValues",seasonValues);
		
		return "adaroles/Rep_VSDistrictCDIntf";
	}
	
	
}
