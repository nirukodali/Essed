package com.eseed.controller;

import java.text.SimpleDateFormat;
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
import com.eseed.dto.AgencyDetailsDto;
import com.eseed.dto.AgencyDto;
import com.eseed.dto.Districtdto;
import com.eseed.dto.SeasonDto;
import com.eseed.dto.SeedAgencyDto;
import com.eseed.dto.SeedVarietyCodeDto;
import com.eseed.dto.SeedVarietyNameDto;
import com.eseed.repo.AddSeedVarietyRepo;

@Controller
public class UpdateAgencyNameNew {

	@Autowired
	AddSeedVarietyRepo addSeedVarietyRepo;

	@GetMapping("/updateAgencyNameNew")
	public String seedvarietyPricesAddition(HttpSession httpSession, Model model) {

		List<AddSeedVarietyDto> productname = addSeedVarietyRepo.getaddSeedVariety();

		List<SeasonDto> seasonValues = addSeedVarietyRepo.getSeasonname();

		List<SeasonDto> cropYear = addSeedVarietyRepo.getcropYear();

		List<Districtdto> district = addSeedVarietyRepo.getDistrict();

		List<AgencyDto> agencyName = addSeedVarietyRepo.getagency();

		model.addAttribute("agencyName", agencyName);
		model.addAttribute("district", district);

		model.addAttribute("productname", productname);

		model.addAttribute("seasonValues", seasonValues);
		model.addAttribute("cropYear", cropYear);

		return "adaroles/updateAgencyNameNew";

	}

	@PreAuthorize("hasAuthority('17')")
	@GetMapping("/getSubProductPricesAdditionNew")
	@ResponseBody
	public List<AddSeedVarietyDto> getSubProducts(@RequestParam("productCode") String productCode) {

		System.out.println("productcode==" + productCode);

		List<AddSeedVarietyDto> subproductname = addSeedVarietyRepo.getaddSeedVarietysubproductcode(productCode);

		System.out.println("subproductname " + subproductname);

		return subproductname;
	}

	@PreAuthorize("hasAuthority('17')")
	@GetMapping("/getVatietyNameNew")
	@ResponseBody
	public List<SeedVarietyNameDto> getVarity(@RequestParam("subproductCode") String subproductCode) {

		System.out.println("subproductCode==" + subproductCode);

		List<SeedVarietyNameDto> subproductname = addSeedVarietyRepo.getVarietyName(subproductCode);

		System.out.println("subproductname " + subproductname);

		return subproductname;
	}
	// getvariteyDistricts

	@PostMapping("/submitVarietyDistrictsNew")
	@ResponseBody
	public List<Districtdto> submitvarietyDistricts(@RequestParam Map<String, String> formData,
			HttpServletRequest request, HttpSession session) {

		List<Districtdto> varitycode = null;
		try {

			// Log the incoming form data
			System.out.println("Received form data: " + formData);

			// Extract form data
			String cropYear = formData.get("cropYear");
			String season = formData.get("season");
			Character seas = season.charAt(0);
			String variety = formData.get("variety");

			varitycode = addSeedVarietyRepo.getvariteyDistricts(Integer.parseInt(cropYear), seas, variety);

			System.out.println("varitycode" + varitycode.toString());

			return varitycode;
		} catch (Exception e) {
			e.printStackTrace();

		}

		return varitycode;
	}
	//

	@PreAuthorize("hasAuthority('17')")
	@GetMapping("/getMandalsByDistrictNew")
	@ResponseBody
	public List<Districtdto> getMandals(@RequestParam("dcode") String districtCode) {

		List<Districtdto> mandals = addSeedVarietyRepo.getMandalsByDistrict(districtCode);

		return mandals;
	}

	@PreAuthorize("hasAuthority('17')")
	@GetMapping("/getAgencyDetailsNew")
	@ResponseBody
	public List<AgencyDetailsDto> getagencydetails(@RequestParam("mcode") String mcode) {

		List<AgencyDetailsDto> agencyDetails = addSeedVarietyRepo.getAgencyDetails(mcode);

		return agencyDetails;
	}

	//
	@PostMapping("/submitProductPricesNew")
	@ResponseBody
	public int submitProductPrices(@RequestParam Map<String, String> productPricesData, HttpServletRequest request,
			HttpSession session) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		int status = 0;
		try {

			// Log the incoming form data
			System.out.println("Received form data: " + productPricesData);

			// Extract form data
			String cropYear = productPricesData.get("cropYear");
			String season = productPricesData.get("season");
			Character seas = season.charAt(0);
			String variety = productPricesData.get("variety");
			String pcode = productPricesData.get("pcode");

			String ftimes = productPricesData.get("ftime");

			java.util.Date parsedDate = format.parse(ftimes);
			java.sql.Date ftime = new java.sql.Date(parsedDate.getTime());

			String ttimes = productPricesData.get("ttime");
			java.util.Date parsedDate1 = format.parse(ttimes);
			java.sql.Date ttime = new java.sql.Date(parsedDate1.getTime());

			String pstimes = productPricesData.get("pstime");
			java.util.Date parsedDate2 = format.parse(pstimes);
			java.sql.Date pstime = new java.sql.Date(parsedDate2.getTime());

			String pctimes = productPricesData.get("pctime");
			java.util.Date parsedDate3 = format.parse(pctimes);
			java.sql.Date pctime = new java.sql.Date(parsedDate3.getTime());

			String dstimes = productPricesData.get("dstime");
			java.util.Date parsedDate4 = format.parse(dstimes);
			java.sql.Date dstime = new java.sql.Date(parsedDate4.getTime());
			String dctimes = productPricesData.get("dctime");
			java.util.Date parsedDate5 = format.parse(dctimes);
			java.sql.Date dctime = new java.sql.Date(parsedDate5.getTime());

			String product_price = productPricesData.get("product_price");
			String subsidy_amout = productPricesData.get("subsidy_amout");

			String nonsubsidy_amt = productPricesData.get("nonsubsidy_amt");
			String quantityperbag = productPricesData.get("quantityperbag");
		//	String SubsidyPercent = productPricesData.get("SubsidyPercent");
			String Dcode = productPricesData.get("Dcode");

			String userid = (String) session.getAttribute("userid");
			String clientip = request.getRemoteAddr();

			// variety
			List<SeedVarietyCodeDto> seedVarietyCodeDtos = addSeedVarietyRepo.getVarietycode(variety);
			Integer pid = seedVarietyCodeDtos.get(0).getProductid();

			status = addSeedVarietyRepo.insertProductPrices(cropYear, seas, variety, pid, ftime, ttime, pstime, pctime,
					dstime, dctime, product_price, subsidy_amout, nonsubsidy_amt, quantityperbag,  Dcode,
					userid, clientip);

			return status;
		} catch (Exception e) {
			e.printStackTrace();
			return status;
		}

	}

//	@PostMapping("/submitSeedAgency")
//	@ResponseBody
//	public int submitSeedAgency(@RequestParam Map<String, String> productPricesData, HttpServletRequest request,
//			HttpSession session) {
//Integer status = null;
//		Integer dcode=0;
//		String agency_code=null;
//		String productcode=null;
//		String subproductcode=null;
//		String varietycode=null;
//		try {
//
//				status = addSeedVarietyRepo.insertSeedAgency(dcode, agency_code,  productcode,  subproductcode,  varietycode);
//
//			return status;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return status;
//		}
//
//	}
	
	@PostMapping("/submitSeedAgency")
	@ResponseBody
	public int submitSeedAgency(@RequestBody SeedAgencyDto seedAgencyDTO, HttpServletRequest request, HttpSession session) {
	    Integer status = null;

	    try {
	        Integer dcode = seedAgencyDTO.getDcode();
	        String agency_code = seedAgencyDTO.getAgency_code();
	        String productcode = seedAgencyDTO.getProductcode();
	        String subproductcode = seedAgencyDTO.getSubproductcode();
	        String varietycode = seedAgencyDTO.getVarietycode();
System.out.println("dcode"+dcode);
System.out.println("agency_code"+agency_code);
System.out.println("productcode"+productcode);
System.out.println("subproductcode"+subproductcode);
System.out.println("varietycode"+varietycode);
	        status = addSeedVarietyRepo.insertSeedAgency(dcode, agency_code, productcode, subproductcode, varietycode);
	        return status;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return status;
	    }
	}
	
	
}
