package com.eseed.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.eseed.dto.IndentEntryDto;
import com.eseed.entity.IndentEntity;
import com.eseed.projection.ActiveSeasonProjection;
import com.eseed.repo.IndentEntryRepo;
import com.eseed.service.ActiveSeasonService;

@Controller
public class IndentsEntryMandalWiseController {
	
	
	@Autowired
	IndentEntryRepo repo;
	
	@Autowired
	private ActiveSeasonService activeSeasonService;
	
	@PreAuthorize("hasAuthority('9')")
	@GetMapping("/indentsEntryMandal")
	public  String indentsEntry(Model model) {
		List<ActiveSeasonProjection> cropYearActiveSeasonList = activeSeasonService.getActiveSeason();
		model.addAttribute("cropYear", cropYearActiveSeasonList.get(0));
		List<IndentEntity> product= repo.indentProduct();
		
		model.addAttribute("product",product);
		return "dao/indentsEntryPageForMandal";
		
	}
	
	
	
	
	
	
	@PostMapping("/indentsEntryDataMandal")
	public  String indentsEntryData(HttpServletRequest request,HttpSession httpSession,Model model) {
		
		model.addAttribute("season",request.getParameter("cropyear").split("@")[0].toString());
		model.addAttribute("cropYear",request.getParameter("cropyear").split("@")[1].toString());
		System.out.println(request.getParameter("cropyear").split("@")[0].toString());
		System.out.println(request.getParameter("cropyear").split("@")[1].toString());
		int dcode= Integer.parseInt(httpSession.getAttribute("dcode").toString());
		System.out.println("--------->"+dcode);
List<IndentEntity> list = repo.getDataForMandal(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode);
BigDecimal upTotal  = repo.getTargetsFromMandal(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode);
BigDecimal quant = repo.getQuantityOfDistrict(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode);
String seed = repo.indentSeedVariety(request.getParameter("subProduct"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString()).get(0).getVarietyname();

if(quant == null)
	quant = new BigDecimal(0.00);

if(upTotal == null)
	upTotal = new BigDecimal(0.00);
System.out.println("sedd--"+seed);		
model.addAttribute("list",list);
model.addAttribute("quant",quant);
model.addAttribute("upTotal",upTotal);
model.addAttribute("varietycode",request.getParameter("variety"));
		model.addAttribute("seed",seed);
		return "dao/indentsEntryDataForMandal";
		
		
	}
	
	@PostMapping("/indentsEntryDataSubmitMandal")
	public  String indentsEntryDataSubmit(@RequestBody List<IndentEntryDto> list,HttpServletRequest request,HttpSession httpSession) {
		System.out.println("----------------");
		int dcode= Integer.parseInt(httpSession.getAttribute("dcode").toString());
int count = repo.submitDataForMandal(list,httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),httpSession.getAttribute("userid").toString(),request.getRemoteAddr(),dcode);

	if(count > 0) 
	return "rbkroles/indentsEntryData";
	else
	return "rbkroles/indentsEntryDataForFail";
		
		
	}
	
	
	


}
