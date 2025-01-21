package com.eseed.controller;

import java.util.HashMap;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eseed.dto.IndentEntryDto;
import com.eseed.dto.IndentEntryRequest;
import com.eseed.entity.ActiveSeason;
import com.eseed.entity.District;
import com.eseed.entity.IndentEntity;
import com.eseed.projection.ActiveSeasonProjection;
import com.eseed.repo.IndentEntryRepo;
import com.eseed.service.ActiveSeasonService;

@Controller
public class IndentsEntryDistrictWiseController {

	@Autowired
	IndentEntryRepo repo;

	@Autowired
	private ActiveSeasonService activeSeasonService;

	@PreAuthorize("hasAuthority('17') || hasAuthority('11') ")
	@GetMapping("/indentsEntry")
	public String indentsEntry(Model model) {
		List<ActiveSeasonProjection> cropYearActiveSeasonList = activeSeasonService.getActiveSeason();
		model.addAttribute("cropYear", cropYearActiveSeasonList.get(0));
		List<IndentEntity> product = repo.indentProduct();

		model.addAttribute("product", product);
		return "ddap/indentsEntryPageForDisrict";

	}

	@ResponseBody
	@GetMapping("/getsubProduct")
	public List<IndentEntity> getCropGoupidd(String productCode) {
		List<IndentEntity> list = repo.indentSubProduct(productCode);

		return list;
	}

	@GetMapping("/getVarietyName")
	@ResponseBody
	public String getVarietyName(@RequestParam("varietyCode") String varietyCode, HttpSession session) {
		String varietyName = repo.getVarietyName(varietyCode);
		return varietyName;
	}

	@ResponseBody
	@GetMapping("/getSeedVariety")
	public List<IndentEntity> getSeedVariety(String subProductCode, HttpSession httpSession) {
		System.out.println("---->" + httpSession.getAttribute("ACTIVEYEAR"));
		System.out.println("---->" + httpSession.getAttribute("seasonActive"));
		System.out.println("subProductCode----------->" + subProductCode);
		List<IndentEntity> list = repo.indentSeedVariety(subProductCode,
				httpSession.getAttribute("ACTIVEYEAR").toString(), httpSession.getAttribute("seasonActive").toString());

		return list;
	}

	@PostMapping("/indentsEntryData")
	@ResponseBody
	public List<IndentEntity> getDistrictData(@RequestParam String variety, @RequestParam String cropYear,
			@RequestParam String productCode, @RequestParam String subProductCode,HttpSession httpSession) {

		List<IndentEntity> list = repo.getData(variety, httpSession.getAttribute("ACTIVEYEAR").toString(),
				httpSession.getAttribute("seasonActive").toString());
		return list;

	}

	@PostMapping("/indentsEntryDataSubmit")
	public ResponseEntity<?> indentsEntryDataSubmit(@RequestBody IndentEntryRequest request, HttpServletRequest httpRequest,
	        HttpSession httpSession) {

	    List<IndentEntryDto> districtData = request.getDistrictData();
	    String variety = request.getVariety();
	    String cropYear = request.getCropYear();
	    String productCode = request.getProductCode();
	    String subProductCode = request.getSubProductCode();

	    System.out.println("----------------");
	    int count = repo.submitData(districtData, httpSession.getAttribute("ACTIVEYEAR").toString(), httpSession.getAttribute("seasonActive").toString(),
	            httpSession.getAttribute("userid").toString(), httpRequest.getRemoteAddr(),variety,productCode,subProductCode);

	    return ResponseEntity.ok(districtData);
	}

}
