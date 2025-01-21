package com.eseed.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eseed.dto.AddSeedVarietyDto;
import com.eseed.dto.FarmerDto;
import com.eseed.dto.InsertFarmerDto;
import com.eseed.dto.SeasonDto;
import com.eseed.projection.ActiveSeasonProjection;
import com.eseed.repo.AddSeedVarietyRepo;
import com.eseed.repo.FarmerEntryRepo;
import com.eseed.repo.ProductPriceRepo;
import com.eseed.repo.VillageSecRevRepository;

@Controller
public class FarmerDetailsController {

	@Autowired
	AddSeedVarietyRepo addSeedVarietyRepo;

	@Autowired
	FarmerEntryRepo farmerEntryRepo;

	@Autowired
	VillageSecRevRepository villageSecRevRepository;

	@Autowired
	ProductPriceRepo productPriceRepo;

	@GetMapping("/FarmerDetailsEntry")
	public String mandalTargets(Model model, HttpSession httpsession) {

		//int dcode = Integer.parseInt(httpsession.getAttribute("dcode").toString());
		//int mcode = Integer.parseInt(httpsession.getAttribute("mcode").toString());
		int vcode = Integer.parseInt(httpsession.getAttribute("vscode").toString());
		List<AddSeedVarietyDto> productname = addSeedVarietyRepo.getaddSeedVariety();
		List<SeasonDto> seasonValues = productPriceRepo.getSeasons();

		model.addAttribute("seasonValues", seasonValues);

		List<ActiveSeasonProjection> vill = villageSecRevRepository.getVillForcseed(vcode);

		model.addAttribute("productname", productname);
		model.addAttribute("seasonValues", seasonValues);
		model.addAttribute("vill", vill);
		return "rbkroles/FarmerDetailsEntry";
	}

	@GetMapping("/getSurveyNo")
	@ResponseBody
	public List<FarmerDto> getSurveyNo(Model model, HttpSession httpsession, @RequestParam("vscode") int vcode) {

	//	int dcode = Integer.parseInt(httpsession.getAttribute("dcode").toString());
	//	int mcode = Integer.parseInt(httpsession.getAttribute("mcode").toString());
		List<FarmerDto> data = farmerEntryRepo.getaddSeedVariety(vcode);
		return data;
	}

	@GetMapping("/getTotalExtent")
	@ResponseBody
	public List<FarmerDto> getTotalExtent(Model model, HttpSession httpsession, @RequestParam("cr_sno") String cr_sno) {

		int dcode = Integer.parseInt(httpsession.getAttribute("dcode").toString());
		int mcode = Integer.parseInt(httpsession.getAttribute("mcode").toString());
		List<FarmerDto> data = farmerEntryRepo.gettotalExtent(cr_sno);

		return data;
	}

	@PostMapping("/insertFarmerDetails")
	@ResponseBody
	public String insertFarmerDetails(Model model, HttpSession httpsession, @RequestBody InsertFarmerDto farmerDto,
			HttpServletRequest request) {
		try {
			String ip = request.getRemoteAddr();
			String userid = httpsession.getAttribute("userid").toString();
			int dcode = Integer.parseInt(httpsession.getAttribute("dcode").toString());
			int mcode = Integer.parseInt(httpsession.getAttribute("mcode").toString());
			int wbdcode = Integer.parseInt(httpsession.getAttribute("wbdcode").toString());
			int wbmcode = Integer.parseInt(httpsession.getAttribute("wbmcode").toString());

			String seasons = farmerDto.getSeason();
			String[] seasonValue = seasons.split("@");
			String season = seasonValue[0];
			String cropYear = seasonValue[1];

			String vcode = farmerDto.getVcode();

			String crSno = farmerDto.getCrSno();

			String totalExtent = farmerDto.getTotalExtent();

			String occupName = farmerDto.getOccupName();

			String occupFName = farmerDto.getOccupFName();
			String tenant = farmerDto.getTenant();
			String mobileNo = farmerDto.getMobileNo();
			String aadharNo = farmerDto.getAadharNo();
			String clamity = farmerDto.getClamity();
			String sownId = farmerDto.getSownId();
			String damagedCrop = farmerDto.getDamagedCrop();
			String conextent = farmerDto.getContingenextent();
			String areaExtent = farmerDto.getAreaExtent();

			int result = farmerEntryRepo.insertFarmerDetails(dcode, mcode, season, vcode, crSno, totalExtent, occupName,
					occupFName, tenant, mobileNo, aadharNo, clamity, sownId, damagedCrop, conextent, areaExtent,
					wbdcode, wbmcode, userid, ip, Integer.parseInt(cropYear));

			if (result > 0) {
				return "Farmer details inserted successfully !!.";
			} else {
				return "Failed to insert farmer details.";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "farmer details Already exists : ";
		}
	}
}
