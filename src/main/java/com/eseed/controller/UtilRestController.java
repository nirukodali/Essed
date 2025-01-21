package com.eseed.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eseed.entity.Authenticationabstract;
import com.eseed.entity.BenfComag;
import com.eseed.entity.ExtentEntered;
import com.eseed.entity.OfficerAuthenticatedFarmeList;
import com.eseed.entity.Otptransactions;
import com.eseed.entity.Pricesreport;
import com.eseed.entity.Rep_Aadhaar_CntIntf;
import com.eseed.entity.SeedNamesReport;
import com.eseed.entity.StateWiseIndent;
import com.eseed.entity.Subproductvariety;
import com.eseed.entity.VSDistricttarget;
import com.eseed.partition.AuthenticationabstractPartition;
import com.eseed.partition.BenfComagPartititon;
import com.eseed.partition.ExtentEnteredPartition;
import com.eseed.partition.OfficerAuthenticatedFarmeListPartition;
import com.eseed.partition.OtptransactionsPartition;
import com.eseed.partition.PricesreportPartition;
import com.eseed.partition.Rep_Aadhaar_CntIntfPartition;
import com.eseed.partition.SeedNamesReportPartition;
import com.eseed.partition.StateWiseIndentPartition;
import com.eseed.partition.SubproductvarietyPartition;
import com.eseed.partition.VSDistricttargetPartition;
import com.eseed.projection.MasterProjections;
import com.eseed.repo.DistrictMandalRepository;
import com.eseed.repo.DistrictMandalRepository.DistrictmandalView;
import com.eseed.repo.DistrictRepository;
import com.model.RequestModel;

@RestController
@RequestMapping("/util")

public class UtilRestController {
	@Autowired
	private DistrictMandalRepository distmandrepo;

	@GetMapping("/getdata")
	List<DistrictmandalView> getList(@RequestParam("dcode") String dcode) {
		System.out.println("dcode=>" + dcode);

		List<DistrictmandalView> list = distmandrepo.getListt(Integer.parseInt(dcode));
//		System.out.println("list size=>" + list.size());

		return list;
	}

	@Autowired
	private VSDistricttargetPartition vsdispartition;

	@GetMapping("/getvsdis")
	List<VSDistricttarget> getvsdis(String cropyear) {
		System.out.println("cropyear=>" + cropyear);

		List<VSDistricttarget> list1 = vsdispartition.vsdis(cropyear);
		System.out.println("details===================>" + list1.size());
		return list1;
	}

//	=================   cropyear =======================
	@Autowired
	private DistrictRepository distrepo;

	@GetMapping("/getAllSeason")
	public List<MasterProjections> getAllSeasonn() {
		List<MasterProjections> list = distrepo.getAllSeason();
		return list;
	}

//	===================  Mandals  ============================
	@GetMapping("/getAllmandal")
	public List<MasterProjections> getAllmandal(@RequestParam("dcode") String dcode) {
		List<MasterProjections> list = distrepo.getmandal(Integer.parseInt(dcode));
		return list;
	}

//	==================  Villages  =======================
	@GetMapping("/getAllVillages")
	public List<MasterProjections> getVillages(Integer dcode, Integer mcode) {
		System.out.println("dcode=>" + dcode);
		System.out.println("mcode=>" + mcode);
		List<MasterProjections> list = distrepo.getAllVillages(dcode, mcode);
		return list;
	}

//	==========================  Product code  =========================
	@GetMapping("/getprodcode")
	public List<MasterProjections> getprodcode() {
		List<MasterProjections> list = distrepo.getproductcode();
		return list;
	}

//	==========================  SUB Product code  =========================
	@GetMapping("/getsubprodcode")
	public List<MasterProjections> getsubprodcode() {
		List<MasterProjections> list = distrepo.getsubproductcode();
		return list;
	}

//	================  SUB PRODUCT CODE WITH PEODUCT CODE ===========================
	@GetMapping("/getcodesubproduct")
	public List<MasterProjections> getsubcodeproduct(@RequestParam("prdcode") String prdcode) {
		System.out.println("prdcode" + prdcode);
		List<MasterProjections> list = distrepo.getsubcodeproduct(prdcode);
		return list;
	}

//	================  SUB PRODUCT CODE WITH PEODUCT CODE ===========================
	@GetMapping("/getvarietycode")
	public List<MasterProjections> getvarietycode(@RequestParam("subcode") String subcode) {
		System.out.println("subcode" + subcode);
		List<MasterProjections> list = distrepo.getvarietycodeproduct(subcode);
		return list;
	}

//	================  SUB PRODUCT CODE  ===========================
	@GetMapping("/getvariety")
	public List<MasterProjections> getvariety() {
		List<MasterProjections> list = distrepo.getvarietycode();
		return list;
	}

//	================  Seed GRP  ===========================
	@GetMapping("/getseedgroup")
	public List<MasterProjections> getseedgroup() {
		List<MasterProjections> list = distrepo.getseedgrp();
		return list;
	}

//	================  PROD CODE WITH SEED GROUP  ===========================
	@GetMapping("/getprodseedcode")
	public List<MasterProjections> getprodseedcode(@RequestParam("seedgrp") String seedgrp) {
		List<MasterProjections> list = distrepo.getprodseedcode(Integer.parseInt(seedgrp));
		return list;
	}

	// ====================== District ======================getSeedVariety

	@GetMapping("/getAllDist")
	public List<MasterProjections> getAllDist() {
		List<MasterProjections> list = distrepo.getListDistrict();
		return list;
	}

//======================  SEED Variety  ======================getSeedVariety

	@GetMapping("/getSeedVarietyreport")
	public List<MasterProjections> getSeedVrty(@RequestParam("year") String year, @RequestParam("season") String season,
			@RequestParam("dcode") String dcode, @RequestParam("mcode") String mcode) {
		try {
			int parsedYear = Integer.parseInt(year);
//			        int parsedDcode = Integer.parseInt(dcode);
			String parsedDcode = dcode;

			int parsedMcode = Integer.parseInt(mcode);
			System.out.println(
					"parsedyear=========>" + parsedYear + "dcode=======>" + parsedDcode + "mcode====>" + parsedMcode);
			// Call the repository method with validated parameters
			return distrepo.getSeedVariety(parsedYear, season, parsedDcode, parsedMcode);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid numeric input.");
		}
	}

	// ====================== Start Date ======================

	@GetMapping("/getStartDate")
	
	public List<Date> getStartDate(@RequestParam("year") String year, @RequestParam("season") String season) {
		
		return distrepo.getStartDt(year, season);
	}

	@Autowired
	private SubproductvarietyPartition subproductpartition;

	@GetMapping("/getsubprod")
	List<Subproductvariety> getsubprod(@RequestParam("subcode") String subcode) {
		System.out.println("subcode=>" + subcode);

		List<Subproductvariety> list1 = subproductpartition.subproduct(subcode);
		System.out.println("details===================>" + list1.size());
		return list1;
	}

	@Autowired
	private SeedNamesReportPartition seedpartition;

	@GetMapping("/getseednames")

	List<SeedNamesReport> getseednames(@RequestParam("prdcode") String prdcode,
			@RequestParam("subcode") String subcode) {
		// ,@RequestParam("varietycode") String varietycode) {
//	Integer prdcodee = Integer.parseInt(prdcode);
//	Integer subcodee = Integer.parseInt(subcode);
//	Integer varietycodee = Integer.parseInt(varietycode);
		System.out.println("prdcode===================>" + prdcode);
		System.out.println("subcode===================>" + subcode);
//	System.out.println("vcode===================>" + varietycode);
		List<SeedNamesReport> seed = seedpartition.seedname(prdcode, subcode);
		// , varietycode);

		return seed;

	}

	@Autowired
	private PricesreportPartition pricepartition;

	@GetMapping("/getprice")
	List<Pricesreport> getprice(String cropyear, @RequestParam("variety") String variety,
			@RequestParam("dcode") String dcode) {
		System.out.println("cropyear=>" + cropyear);
		System.out.println("variety=>" + variety);
		System.out.println("dcode=>" + dcode);

		List<Pricesreport> list1 = pricepartition.price(cropyear, variety, dcode);
		System.out.println("details===================>" + list1.size());
		return list1;
	}
//================================Rep_Aadhaar_CntIntf========================================//

	@Autowired
	Rep_Aadhaar_CntIntfPartition rep_Aadhaar_CntIntfPartition;

	@PostMapping("aadharcount")
	List<Rep_Aadhaar_CntIntf> getAadharCount(@RequestBody RequestModel requestModel) {

//		String[] cseason = requestModel.getCropyear().split("@");
//		String season = cseason[0];
//		Integer Year = Integer.parseInt(cseason[1]);

		List<Rep_Aadhaar_CntIntf> aadharcount = rep_Aadhaar_CntIntfPartition.getAadharCount();

		System.out.println("details===================>" + aadharcount.size());
		return aadharcount;
	}

	// ================================OfficerAuthenticatedFarmeList========================================//

	@Autowired
	OfficerAuthenticatedFarmeListPartition officerAuthenticatedFarmeListPartition;

	@PostMapping("authfarmList")
	List<OfficerAuthenticatedFarmeList> getAuthenticatedFarm(@RequestBody RequestModel requestModel) {

//			String[] cseason = requestModel.getCropyear().split("@");
//			String season = cseason[0];
//			Integer Year = Integer.parseInt(cseason[1]);

		List<OfficerAuthenticatedFarmeList> aadharcount = officerAuthenticatedFarmeListPartition
				.getAuthenticationFarmList(requestModel.getCropyear(), requestModel.getMcode(),
						requestModel.getSeedVariety());

		System.out.println("details===================>" + aadharcount.size());
		return aadharcount;
	}

	// ================================Authenticationabstract========================================//
	@Autowired
	private AuthenticationabstractPartition authpartition;

	@GetMapping("/getauthdatails")
	List<Authenticationabstract> getauthdatails(String cropyear) {
		System.out.println("cropyear=>" + cropyear);

		List<Authenticationabstract> list1 = authpartition.getAuthReport(cropyear);
		System.out.println("details===================>" + list1.size());
		return list1;
	}

	@Autowired
	private OtptransactionsPartition otppartition;

	@GetMapping("/getotp")
	List<Otptransactions> getotp(String cropyear, @RequestParam("dcode") String dcode) {
		System.out.println("cropyear=>" + cropyear);

		List<Otptransactions> list1 = otppartition.otp(cropyear, dcode);
		System.out.println("details===================>" + list1.size());
		return list1;
	}

	@Autowired
	private StateWiseIndentPartition statindentpartition;

	@GetMapping("/getindent")
	List<StateWiseIndent> getindent(String cropyear, @RequestParam("subcode") String subcode) {
		System.out.println("cropyear=>" + cropyear);
//					System.out.println("prdcode=>" + prdcode);

		List<StateWiseIndent> list1 = statindentpartition.stateindent(cropyear, subcode);
		System.out.println("details===================>" + list1.size());
		return list1;
	}

	
	@Autowired
	private ExtentEnteredPartition extpartition;

	@PostMapping("getextentered")
	List<ExtentEntered> getextentered(@RequestBody RequestModel requestModel) {

//					String[] cseason = requestModel.getCropyear().split("@");
//					String season = cseason[0];
//					Integer Year = Integer.parseInt(cseason[1]);

		List<ExtentEntered> ext = extpartition.getext();

		System.out.println("details===================>" + ext.size());
		return ext;
	}
	
	// =============================================benfcomag=====================================================================//
	@Autowired
	private BenfComagPartititon benfpartition;

//	@GetMapping("/getbenf1")
//
//	List<BenfComag> getbenf1(String dcode, String mcode, String vcode, String cropyear,
//			@RequestParam("prdcode") String prdcode, @RequestParam("subcode") String subcode,
//			@RequestParam("varietycode") String varietycode, HttpSession session) {
//		String[] season = cropyear.split("@");
//		String seasonType = season[0];
//		String year = season[1];
//		Integer seasonYear = Integer.parseInt(season[1]);
//
//		Integer ddcode = Integer.parseInt(dcode);
//		Integer mmcode = Integer.parseInt(mcode);
//		Integer vvcode = Integer.parseInt(vcode);
//		System.out.println("dcode===================>" + dcode);
//		System.out.println("mcode===================>" + mcode);
//		System.out.println("vcode===================>" + vcode);
//		System.out.println("cropyear===================>" + cropyear);
//
//		List<BenfComag> userreg = benfpartition.benfcomag(cropyear, dcode, mcode, prdcode, subcode, varietycode);
//
//		return userreg;
//
//	}
	
	
	
//	@GetMapping("/getbenf2")
//	List<BenfComag> getbenf2(@RequestBody RequestModel requestModel) {
//	List<BenfComag> list = benfpartition.benfcomag(requestModel.getCropyear() ,
//				                                       requestModel.getDcode(), 
//				                                       requestModel.getMcode(), 
//				                                       requestModel.getPrdcode(), 
//				                                       requestModel.getSubcode(), 
//				                                       requestModel.getVarietyCode());
//
//
//		                    return list;
//	}

//==============================================Start Date=======================================================================//	
	
	@GetMapping("/date")
	public ResponseEntity<String> getDatesFromQueries(@RequestParam("cropyear") String cropyear,@RequestParam("dcode") String dcode, HttpSession session) {
	    System.out.println("Crop Year: " + cropyear);
	    System.out.println("dcode: " + dcode);

	    if (dcode == null || dcode.isEmpty()) {
	        return ResponseEntity.badRequest().body("{}");
	    }
	    
	    try {
	        String dateJson = benfpartition.getDates(cropyear.split("@")[0], dcode, cropyear.split("@")[1]);
	        System.out.println("dateJson----->"+dateJson);
	        return ResponseEntity.ok(dateJson);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{}");
	    }
	}
	//===============================================================================================//
	@PostMapping("/getbenf2")
	public List<BenfComag> getbenf2(@RequestBody RequestModel requestModel) {
	    List<BenfComag> list1 = benfpartition.benfcomag(
	            requestModel.getCropyear(),
	            requestModel.getDcode(),
	            requestModel.getMcode(),
	            requestModel.getPrdcode(),
	            requestModel.getSubcode(),
	            requestModel.getVarietyCode()
	    );
	    System.out.println("cropyear"+  requestModel.getCropyear());
	    return list1;
	}

}
