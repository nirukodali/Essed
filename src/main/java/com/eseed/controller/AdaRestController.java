package com.eseed.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eseed.config.RegularExpressionclassMethod;
import com.eseed.entity.Rep_UserRegDetModel;
import com.eseed.entity.Rep_VSDistrictCDIntfModel;
import com.eseed.entity.SeedVarietyDetModel;
import com.eseed.entity.VillageSecModel;
import com.eseed.repo.Rep_UserRegDetPartition;
import com.eseed.repo.Rep_VSDistrictCDIntfPartition;
import com.eseed.repo.SeedVarietyDetPartition;
import com.eseed.repo.VillageSecModelRepository;

@RestController
@RequestMapping("/utilADA")
public class AdaRestController {



	@Autowired
	private SeedVarietyDetPartition SeedVarietyDetPart;
	
	
	@PostMapping("/SeedVarietyDet")
	 List<SeedVarietyDetModel> RepSeedVarietyDet(Model model, HttpSession httpSession, HttpServletRequest request, String cropyear, String dcode, String season, String active ) {
		
		String  tname = "", partition = "",    vname="", year="";
		Integer vcode1=0, cropyear1=0;
		
		System.out.println("cropyear::" + cropyear);
         cropyear1= Integer.parseInt(cropyear);
		System.out.println("dcode::" + dcode);
		System.out.println("season===>" +season);
		
		RegularExpressionclassMethod regexpmethod = new RegularExpressionclassMethod();
		boolean val1 = regexpmethod.districtCode(dcode);
		System.out.println("val1---->" + val1);
		boolean val2 = regexpmethod.season(season);
		System.out.println("val2---->" + val2);
		boolean val3 = regexpmethod.year(cropyear);
		System.out.println("val3--->" + val3);
		
		List<SeedVarietyDetModel> list = null;
		
		if (val1 && val2 && val3 ) {
			try {
				list = SeedVarietyDetPart.getSeedVarietyDet(cropyear1, dcode, season, active );

			} catch (Exception e) {
				System.out.println(e);
			}
		}
//		}
		return list ;
	}

		@Autowired
		private Rep_UserRegDetPartition UserRegDetPart;
	
	@PostMapping("/UserRegDetails")
	List<Rep_UserRegDetModel> UserRegDet(Model model, HttpSession httpSession, HttpServletRequest request, String dcode, String mcode, String vcode ) {
		
		String  tname = "", partition = "",    vname="", year="";
		Integer dcode1=0, mcode1=0,vcode1=0;
		
	    System.out.println("mcode:::" + mcode);

		System.out.println("dcode:::" + dcode);

		System.out.println("vcode:::" + vcode);
		
//		dcode1 = Integer.parseInt(dcode);
//		mcode1 = Integer.parseInt(mcode);
//		vcode1 = Integer.parseInt(vcode);
		
	RegularExpressionclassMethod regexpmethod = new RegularExpressionclassMethod();
		boolean val1 = regexpmethod.districtCode(dcode);
		System.out.println("val1---->" + val1);
		boolean val2 = regexpmethod.mandalCode(mcode);
		System.out.println("val2---->" + val2);
		boolean val3 = regexpmethod.villageCode(vcode);
		System.out.println("val3--->" + val3);
	
	
		List<Rep_UserRegDetModel> list = null;
	
	if (val1 || val2 || val3 ) {

		try {
			list = UserRegDetPart.getUserRegDet(dcode, mcode, vcode);
	
			} catch (Exception e) {
				System.out.println(e);
		}
	}
//		}
		return list ;
	
}


	@Autowired
	private VillageSecModelRepository villageSecModelRepo;
	@GetMapping("/getVillageSecbymcodendcode")
	public List<VillageSecModel> getVillageSec(String dcode, String mcode) {
	    Integer dcodes = null;
	    Integer mcodes = null;
	    
	    try {
	        dcodes = Integer.parseInt(dcode);  // Attempt to parse dcode
	        mcodes = Integer.parseInt(mcode);  // Attempt to parse mcode
	    } catch (NumberFormatException e) {
	        // Handle invalid number format, e.g., log error, throw exception, etc.
	        throw new IllegalArgumentException("Invalid dcode or mcode value", e);
	    }
	    List<VillageSecModel> list = villageSecModelRepo.findAll(dcodes,mcodes);
	    // Call the repository method with Integer parameters
	    return list;
	}

	
	@Autowired
	private Rep_VSDistrictCDIntfPartition VSDistrictCDPart;
	
	@PostMapping("/VSDistrictCDRep")
	 List<Rep_VSDistrictCDIntfModel> RepVSDistrictCDDet(Model model, HttpSession httpSession, HttpServletRequest request, String cropyear ) {
		
		String  tname = "", year="", season="";
		Integer vcode1=0, cropyear1=0;
		
		System.out.println("cropyear::" + cropyear);
		
		if(cropyear != "" && cropyear != "") {
			season = cropyear.split("@")[0];
			}
			if(cropyear != "" && cropyear != "") {
			 year = cropyear.split("@")[1];
			}
		
			cropyear1=Integer.parseInt(year);
		RegularExpressionclassMethod regexpmethod = new RegularExpressionclassMethod();
		boolean val1 = regexpmethod.season(season);
		System.out.println("val1---->" + val1);
		boolean val2 = regexpmethod.year(year);
		System.out.println("val2--->" + val2);
		
		List<Rep_VSDistrictCDIntfModel> list = null;
		
		if (val1 && val2  ) {
			try {
				list = VSDistrictCDPart.VSDistrictCDDet(cropyear1,season);

			} catch (Exception e) {
				System.out.println(e);
			}
		}

		return list ;
	}


	
	}
	
	

