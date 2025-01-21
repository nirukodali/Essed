package com.eseed.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.eseed.dto.IndentEntryDto;
import com.eseed.entity.IndentEntity;
import com.eseed.projection.ActiveSeasonProjection;
import com.eseed.projection.MasterProjections;
import com.eseed.repo.IndentEntryRepo;
import com.eseed.service.ActiveSeasonService;

@Controller
public class IndentUpdateDistrictWiseController {

	@Autowired
	IndentEntryRepo repo;
	
	@Autowired
	private ActiveSeasonService activeSeasonService;
	
	
	@GetMapping("/indentsupdation")
	public  String indentsEntry(Model model) {
		List<ActiveSeasonProjection> cropYearActiveSeasonList = activeSeasonService.getActiveSeason();
		model.addAttribute("cropYear", cropYearActiveSeasonList.get(0));
		List<IndentEntity> product= repo.indentProduct();
		List<IndentEntity> list = repo.getAllDistrict();
		model.addAttribute("product",product);
		model.addAttribute("district",list);
		return "ddap/indentsUpdate1ForDisrict";
		
	}
	
	
	@PostMapping("/indentsUpdateData")
	public  String indentsEntryData(HttpServletRequest request,HttpSession httpSession,Model model) {
		System.out.println(request.getParameter("cropyear").split("@")[0].toString());
		System.out.println(request.getParameter("cropyear").split("@")[1].toString());
		
		int dcode= Integer.parseInt(request.getParameter("district").toString());
		
		System.out.println("dcode------>"+dcode);
		model.addAttribute("season",request.getParameter("cropyear").split("@")[0].toString());
		model.addAttribute("cropYear",request.getParameter("cropyear").split("@")[1].toString());
		
		
List<IndentEntity> list = repo.getDataForUpdation(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode);
Double quant = repo.getQuantity(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode);
Double kg = repo.getKgConvertor(request.getParameter("variety"));
BigInteger qtyrec= repo.getQtyrecd(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode);
String seed = repo.indentSeedVariety(request.getParameter("subProduct"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString()).get(0).getVarietyname();
 System.out.println("quant------->"+quant);
 System.out.println("kg------->"+kg);
 System.out.println("qtyrec------->"+qtyrec);
 if(quant == null || kg == null || qtyrec == null) {
	 quant=0.00;
	 kg=0.00;
	 qtyrec=new BigInteger("0");
 }
double product = quant*(kg)*qtyrec.intValue();
System.out.println("product------"+product);

System.out.println("sedd--"+seed);		
model.addAttribute("list",list);
model.addAttribute("product",product);
model.addAttribute("varietycode",request.getParameter("variety"));
		model.addAttribute("seed",seed);
		return "ddap/indentsUpdate2ForDisrict";
	}
	
	
	@PostMapping("/indentsUpdationDataSubmit")
	public  String indentsEntryDataSubmit(@RequestBody List<IndentEntryDto> list,HttpServletRequest request,HttpSession httpSession) {
		System.out.println("----------------");
int count = repo.updateData(list,httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString());

	if(count > 0) 
	return "rbkroles/indentsEntryData";
	else
	return "rbkroles/indentsEntryDataForFail";
		
		
	}
	
}
