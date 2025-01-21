package com.eseed.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
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
public class IndentsUpdationRskWiseController {
	
	@Autowired
	IndentEntryRepo repo;

	@Autowired
	private ActiveSeasonService activeSeasonService;

	@PreAuthorize("hasAuthority('5')")
	@GetMapping("/indentsupdationRsk")
	public String indentsEntry(Model model) {
		List<ActiveSeasonProjection> cropYearActiveSeasonList = activeSeasonService.getActiveSeason();
		model.addAttribute("cropYear", cropYearActiveSeasonList.get(0));
		List<IndentEntity> product = repo.indentProduct();
		model.addAttribute("product", product);
		return "maoroles/indentsUpdate1ForRsk";

	}
	
	@PostMapping("/indentsUpdateDataRsk")
	public String indentsEntryData(HttpServletRequest request, HttpSession httpSession, Model model) {
		System.out.println(request.getParameter("cropyear").split("@")[0].toString());
		System.out.println(request.getParameter("cropyear").split("@")[1].toString());

		int dcode = Integer.parseInt(httpSession.getAttribute("dcode").toString());
		int mcode = Integer.parseInt(httpSession.getAttribute("mcode").toString());

		System.out.println("dcode------>" + dcode);
		model.addAttribute("season", request.getParameter("cropyear").split("@")[0].toString());
		model.addAttribute("cropYear", request.getParameter("cropyear").split("@")[1].toString());

		List<IndentEntity> list = repo.getDataForUpdationForRsk(request.getParameter("variety"),
				httpSession.getAttribute("ACTIVEYEAR").toString(), httpSession.getAttribute("seasonActive").toString(),
				dcode,mcode);
		BigDecimal mandalQuant = repo.getQuantityOfMandal(request.getParameter("variety"),
				httpSession.getAttribute("ACTIVEYEAR").toString(), httpSession.getAttribute("seasonActive").toString(),
				dcode);
		
		
		Double quant = repo.getQuantity(request.getParameter("variety"),
				httpSession.getAttribute("ACTIVEYEAR").toString(), httpSession.getAttribute("seasonActive").toString(),
				dcode);
		BigDecimal kg = repo.getFactor(request.getParameter("variety"));
		BigInteger qtyrec = new BigInteger("0");
//				repo.getQtyallocatedForRsk(request.getParameter("variety"),
//				httpSession.getAttribute("ACTIVEYEAR").toString(), httpSession.getAttribute("seasonActive").toString(),
//				dcode);
		BigDecimal targetOfRsk  = repo.getTargetOfRsk(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode,mcode);
		BigDecimal getTargetOfRskFromMao  = repo.getTargetOfRskFromMao(request.getParameter("variety"),httpSession.getAttribute("ACTIVEYEAR").toString(),httpSession.getAttribute("seasonActive").toString(),dcode,mcode);
		BigDecimal upTotal = getTargetOfRskFromMao.subtract(targetOfRsk) ;
		String seed = repo.indentSeedVariety(request.getParameter("subProduct"),
				httpSession.getAttribute("ACTIVEYEAR").toString(), httpSession.getAttribute("seasonActive").toString())
				.get(0).getVarietyname();
		System.out.println("quant------->" + quant);
		System.out.println("kg------->" + kg);
		System.out.println("qtyrec------->" + qtyrec);
		if (quant == null || kg == null || qtyrec == null) {
			quant = 0.00;
			kg = BigDecimal.valueOf(0.00);
			qtyrec = new BigInteger("0");
		}
		double product = quant * (kg.intValue()) * qtyrec.intValue();
		System.out.println("product------" + product);

		System.out.println("sedd--" + seed);
		model.addAttribute("districtQuant", mandalQuant);
		model.addAttribute("list", list);
		model.addAttribute("upTotal",upTotal);
		model.addAttribute("product", product);
		model.addAttribute("varietycode", request.getParameter("variety"));
		model.addAttribute("seed", seed);
		return "maoroles/indentsUpdate2ForRsk";
	}
	@PostMapping("/indentsUpdationDataSubmitRsk")
	public String indentsEntryDataSubmit(@RequestBody List<IndentEntryDto> list, HttpServletRequest request,
			HttpSession httpSession) {
		System.out.println("----------------");
		int dcode = Integer.parseInt(httpSession.getAttribute("dcode").toString());
		int mcode = Integer.parseInt(httpSession.getAttribute("mcode").toString());
		int count = repo.updateDataForRsk(list, httpSession.getAttribute("ACTIVEYEAR").toString(),
				httpSession.getAttribute("seasonActive").toString(),dcode,mcode);

		if (count > 0)
			return "rbkroles/indentsEntryData";
		else
			return "rbkroles/indentsEntryDataForFail";

	}
	
	

}
