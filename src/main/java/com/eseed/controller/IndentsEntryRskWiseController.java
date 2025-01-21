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
public class IndentsEntryRskWiseController {
	
	
	@Autowired
	IndentEntryRepo repo;
	
	@Autowired
	private ActiveSeasonService activeSeasonService;
	
	@PreAuthorize("hasAuthority('5')")
	@GetMapping("/indentsEntryRsk")
	public  String indentsEntry(Model model) {
		List<ActiveSeasonProjection> cropYearActiveSeasonList = activeSeasonService.getActiveSeason();
		model.addAttribute("cropYear", cropYearActiveSeasonList.get(0));
		List<IndentEntity> product= repo.indentProduct();
		
		model.addAttribute("product",product);
		return "maoroles/indentsEntryPageForRsk";
		
	}
	
	
	
	
	
	
	@PostMapping("/indentsEntryDataRsk")
	public  String indentsEntryData(HttpServletRequest request,HttpSession httpSession,Model model) {
		
		model.addAttribute("season",request.getParameter("cropyear").split("@")[0].toString());
		model.addAttribute("cropYear",request.getParameter("cropyear").split("@")[1].toString());
		System.out.println(request.getParameter("cropyear").split("@")[0].toString());
		System.out.println(request.getParameter("cropyear").split("@")[1].toString());
		int dcode= Integer.parseInt(httpSession.getAttribute("dcode").toString());
		int mcode= Integer.parseInt(httpSession.getAttribute("mcode").toString());
		System.out.println("--------->"+dcode);
List<IndentEntity> list = repo.getDataForRsk(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode,mcode);
BigDecimal targetOfRsk  = repo.getTargetOfRsk(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode,mcode);
BigDecimal getTargetOfRskFromMao  = repo.getTargetOfRskFromMao(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode,mcode);
String seed = repo.indentSeedVariety(request.getParameter("subProduct"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString()).get(0).getVarietyname();
System.out.println("getTargetOfRskFromMao--------->"+getTargetOfRskFromMao);
System.out.println("targetOfRsk--------->"+targetOfRsk);
BigDecimal upTotal = getTargetOfRskFromMao.subtract(targetOfRsk) ;

if(upTotal == null)
	upTotal = new BigDecimal(0.00);
System.out.println("sedd--"+seed);		
model.addAttribute("list",list);
model.addAttribute("upTotal",upTotal);
model.addAttribute("varietycode",request.getParameter("variety"));
		model.addAttribute("seed",seed);
		return "maoroles/indentsEntryDataForRsk";
	}
	
	@PostMapping("/indentsEntryDataSubmitRsk")
	public  String indentsEntryDataSubmit(@RequestBody List<IndentEntryDto> list,HttpServletRequest request,HttpSession httpSession) {
		System.out.println("----------------");
		int dcode= Integer.parseInt(httpSession.getAttribute("dcode").toString());
		int mcode= Integer.parseInt(httpSession.getAttribute("mcode").toString());
int count = repo.submitDataForRsk(list,httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),httpSession.getAttribute("userid").toString(),request.getRemoteAddr(),dcode,mcode);

	if(count > 0) 
	return "rbkroles/indentsEntryData";
	else
	return "rbkroles/indentsEntryDataForFail";
		
		
	}
	
	
	


}
